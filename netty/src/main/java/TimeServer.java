import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;

import org.agrona.concurrent.UnsafeBuffer;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by Administrator on 2017-06-07.
 */
public class TimeServer {
    static List<Map<String,List<Map<String,List<Map<String,String>>>>>> ss=new ArrayList<Map<String, List<Map<String, List<Map<String, String>>>>>>();
    int SequenceNo=0;
    int LastSn=-1;
    public void bind(int port) throws Exception{
        EventLoopGroup bossGroup=new NioEventLoopGroup();
        EventLoopGroup workerGroup=new NioEventLoopGroup();

        try{
            ServerBootstrap b=new ServerBootstrap();
            b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(/*new ServerMessageEncoder(), */new ClientMessageDecoder(),
                                    new TimeServerHandler());
                        }
                    }).option(ChannelOption.SO_BACKLOG, 1024).childOption(ChannelOption.SO_KEEPALIVE, true);

//            b.group(bossGroup,workerGroup).channel(NioServerSocketChannel.class).option(ChannelOption.SO_BACKLOG,1024).childHandler(new ChildChannelHandler());
            ChannelFuture f=b.bind(port).sync();
            f.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
//    private class ChildChannelHandler extends ChannelInitializer<SocketChannel>{
//        @Override
//        protected  void initChannel(SocketChannel arg0) throws  Exception{
//            arg0.pipeline().addLast(new ServerMessageEncoder(), new ClientMessageDecoder(),new TimeServerHandler());
//        }
//    }
    private class TimeServerHandler extends ChannelInboundHandlerAdapter{
           @Override
        public  void channelRead(ChannelHandlerContext ctx,Object msg) throws Exception{
               if(msg instanceof LoginReq_InDecoder ) {
//                   ByteBuf buf = (ByteBuf) msg;
//                   byte[] req = new byte[buf.readableBytes()];
//                   buf.readBytes(req);
////               String body=new String(req,"UTF-8");
//                   System.out.println("The time server receive order :" + req);
//                   String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(req.toString()) ? new java.util.Date(System.currentTimeMillis()).toString() : "bad order";
//                   ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
//                   ctx.write(resp);
                   LoginReq_InDecoder request=(LoginReq_InDecoder) msg;
                   System.out.println("aaaaaaaaaaaaaa"+request.brokerID());
                   RspLogin_InEncoder rspLogin_inEncoder=new RspLogin_InEncoder();
                   ByteBuf buf = ctx.alloc().buffer(2048);
                   MsgHeader header=new MsgHeader();
                   header.setVersion((byte)65);
                   header.setPackageType((byte)50);
                   header.setChain((byte)76);
                   header.set__padding((byte) 0);
                   header.setTopicID(0);
                   header.settID(20482);
                   header.setRequestID(0);
                   header.setBodyLen(158);
                   header.setFieldCount(2);
                   header.setSequenceNo(-1);
                   header.setLastSn(0);
                   header.writeToBuf(buf);
                   fieldHeader fieldHeader=new fieldHeader();
                   fieldHeader.setFieldID(8202);
                   fieldHeader.setFieldLenth(56);
                   fieldHeader.writeToBuf(buf);
//                   final ByteBuffer byteBuffer = buf.nioBuffer();
                   final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(56);
                   final UnsafeBuffer directBuffer = new UnsafeBuffer(byteBuffer);
                   SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                   SimpleDateFormat sdf1 = new SimpleDateFormat("HHmmss");
                   String dateNowStr = sdf.format(new Date());
                   String dateNowStr1 = sdf1.format(new Date());
                   int i=0;
                   rspLogin_inEncoder.wrap(directBuffer,0).tradingDay(dateNowStr).loginTime(dateNowStr1).brokerID("2016").userID(request.userID()).frontID(i++).sessionID(i++).maxOrderRef(i++);

                   buf.writeBytes(directBuffer.byteBuffer());
                   fieldHeader fieldHeader1=new fieldHeader();
                   fieldHeader1.setFieldID(8199);
                   fieldHeader1.setFieldLenth(86);
                   fieldHeader1.writeToBuf(buf);
                   final ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(86);
                   final UnsafeBuffer directBuffer1= new UnsafeBuffer(byteBuffer1);
                   RspInfo_InEncoder rspInfo_inEncoder=new RspInfo_InEncoder();
                   rspInfo_inEncoder.wrap(directBuffer1,0).errorID(0).isLast((short)0).errorMsg("success");
                   buf.writeBytes(directBuffer1.byteBuffer());


                   ctx.writeAndFlush(buf);

               }
               if(msg instanceof  heartBeat){
                   ByteBuf buf = ctx.alloc().buffer(2048);
                   MsgHeader header=new MsgHeader();
                   header.setVersion((byte)65);
                   header.setPackageType((byte)50);
                   header.setChain((byte)76);
                   header.set__padding((byte) 0);
                   header.setTopicID(0);
                   header.settID(20484);
                   header.setRequestID(0);
                   header.setBodyLen(0);
                   header.setFieldCount(2);
                   header.setSequenceNo(-1);
                   header.setLastSn(0);
                   header.writeToBuf(buf);
                   ctx.writeAndFlush(buf);
               }
               if(msg instanceof OrderReq_InDecoder){
                   boolean flag=false;
                   OrderReq_InDecoder request=(OrderReq_InDecoder) msg;
                   for(Map<String,List<Map<String,List<Map<String,String>>>>> m:ss){
                       Set<String> keySet = m.keySet();
                       for(String key : keySet) {
                           List<Map<String,List<Map<String,String>>>> tt=m.get(request.instrumentID());
                           if(tt!=null) {
                               flag=true;
                               for (Map<String, List<Map<String, String>>> cc : tt) {
                                   Set<String> keySet1 = cc.keySet();
                                   for (String key1 : keySet1) {

                                       if (key1.contains("0001")) {
                                           orderRtn(ctx, request,cc.get(key1));
                                       } else if (key1.contains("0002")) {
                                           Trade(ctx, request);
                                       } else {
                                           repInfo(ctx, request);
                                       }

                                   }
                               }
                           }
                       }
                   }
                   if(!flag){
                       orderRtn(ctx, request,null);
                       Trade(ctx, request);
                   }
//                   switch ((int)request.limitPrice()){
//                       case 1:
//                           //订单回报
//                           orderRtn(ctx,request);
//                           //成交回报
//                           Trade(ctx,request);
//                           break;
//                       case 2:
//                          //订单回报
//                           orderRtn(ctx,request);
//                           //orderrepinfo
//                           repInfo(ctx,request);
//
//                   }
               }
           }
        @Override
        public void channelReadComplete(ChannelHandlerContext ctx) throws  Exception{
               ctx.flush();
        }
        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
               ctx.close();
        }
        public void  Trade(ChannelHandlerContext ctx,OrderReq_InDecoder request){
            Trade_InEncoder trade_inEncoder=new Trade_InEncoder();
            ByteBuf buf1 = ctx.alloc().buffer(2048);
            MsgHeader header1=new MsgHeader();
            header1.setVersion((byte)65);
            header1.setPackageType((byte)50);
            header1.setChain((byte)76);
            header1.set__padding((byte) 0);
            header1.setTopicID(1);
            header1.settID(20494);
            header1.setRequestID(0);
            header1.setBodyLen(233);
            header1.setFieldCount(1);
            header1.setSequenceNo(SequenceNo);
            header1.setLastSn(SequenceNo-1);
            SequenceNo++;
            header1.writeToBuf(buf1);
            fieldHeader fieldHeader1=new fieldHeader();
            fieldHeader1.setFieldID(8196);
            fieldHeader1.setFieldLenth(225);
            fieldHeader1.writeToBuf(buf1);

            final ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(225);
            final UnsafeBuffer directBuffer1 = new UnsafeBuffer(byteBuffer1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat sdf1 = new SimpleDateFormat("HHmmss");
            String dateNowStr = sdf.format(new Date());
            String dateNowStr1 = sdf1.format(new Date());
            trade_inEncoder.wrap(directBuffer1,0).investorID(request.investorID()).optSubInvestorID("888").businessUnit("25744").branchID("00000").instrumentID(request.instrumentID()).tradeID("257441").requestID(request.requestID()).orderSysID("000001200011").orderRef(request.orderRef()).offsetFlag(request.combOffsetFlag().getBytes()[0]).coveredFlag(request.coveredFlag()).ownerType(request.ownerType()).direction(request.direction()).price(request.limitPrice()).volume(request.volumeCondition()).tradeAmount(request.limitPrice()).tradeDate(dateNowStr).tradeTime(dateNowStr1).sequenceNo(0);
            buf1.writeBytes(directBuffer1.byteBuffer());
            ctx.writeAndFlush(buf1);
        }
        public void repInfo(ChannelHandlerContext ctx,OrderReq_InDecoder request){
            OrderReq_InEncoder orderReq_inEncoder=new OrderReq_InEncoder();
            ByteBuf buf = ctx.alloc().buffer(2048);
            MsgHeader header=new MsgHeader();
            header.setVersion((byte)65);
            header.setPackageType((byte)50);
            header.setChain((byte)76);
            header.set__padding((byte) 0);
            header.setTopicID(1);
            header.settID(20495);
            header.setRequestID(0);
            header.setBodyLen(238);
            header.setFieldCount(2);
            header.setSequenceNo(SequenceNo);
            header.setLastSn(SequenceNo-1);
            SequenceNo++;
            header.writeToBuf(buf);
            fieldHeader fieldHeader=new fieldHeader();
            fieldHeader.setFieldID(8203);
            fieldHeader.setFieldLenth(136);
            fieldHeader.writeToBuf(buf);
            final ByteBuffer byteBuffer3= ByteBuffer.allocateDirect(136);
            final UnsafeBuffer directBuffer3= new UnsafeBuffer(byteBuffer3);
            char a='a';
            orderReq_inEncoder.wrap(directBuffer3,0).investorID(request.investorID()).optSubInvestorID(request.optSubInvestorID()).businessUnit(request.businessUnit()).branchID(request.branchID()).instrumentID(request.investorID()).orderRef(request.orderRef()).exchangeID(request.exchangeID()).orderPriceType(request.orderPriceType()).direction(request.direction()).coveredFlag(request.coveredFlag()).ownerType(request.ownerType()).combOffsetFlag(request.combOffsetFlag()).combHedgeFlag(request.combHedgeFlag()).limitPrice(request.limitPrice()).volumeTotalOriginal(request.volumeTotalOriginal()).timeCondition(request.timeCondition()).volumeCondition(request.volumeCondition()).minVolume(request.minVolume()).contingentCondition(request.contingentCondition()).stopPrice(request.stopPrice()).requestID(request.requestID()).thirdReff(request.thirdReff());
            buf.writeBytes(directBuffer3.byteBuffer());
            fieldHeader fieldHeader4=new fieldHeader();
            fieldHeader4.setFieldID(8199);
            fieldHeader4.setFieldLenth(86);
            fieldHeader4.writeToBuf(buf);
            final ByteBuffer byteBuffer4 = ByteBuffer.allocateDirect(86);
            final UnsafeBuffer directBuffer4= new UnsafeBuffer(byteBuffer4);
            RspInfo_InEncoder rspInfo_inEncoder=new RspInfo_InEncoder();
            rspInfo_inEncoder.wrap(directBuffer4,0).errorID(0).isLast((short)0).errorMsg("put order fail");
            buf.writeBytes(directBuffer4.byteBuffer());
            ctx.writeAndFlush(buf);

        }
        public void orderRtn(ChannelHandlerContext ctx,OrderReq_InDecoder request,List<Map<String,String>> ss){
            String optSubInvestorID=null;
            for(Map<String,String> map: ss){
                Set<String> keySet1 = map.keySet();
                for (String key1 : keySet1) {
                    if (key1.equals("optSubInvestorID")) {
                        optSubInvestorID = map.get("optSubInvestorID");
                    }
                    if (key1.equals("optSubInvestorID")) {
                        optSubInvestorID = map.get("optSubInvestorID");
                    }
                }
            }
            Order_InEncoder  order_inEncoder=new Order_InEncoder();
            ByteBuf buf = ctx.alloc().buffer(2048);
            MsgHeader header=new MsgHeader();
            header.setVersion((byte)65);
            header.setPackageType((byte)50);
            header.setChain((byte)76);
            header.set__padding((byte) 0);
            header.setTopicID(1);
            header.settID(20493);
            header.setRequestID(0);
            header.setBodyLen(338);
            header.setFieldCount(1);
            header.setSequenceNo(SequenceNo);
            header.setLastSn(SequenceNo-1);
            SequenceNo++;
            header.writeToBuf(buf);
            fieldHeader fieldHeader=new fieldHeader();
            fieldHeader.setFieldID(8197);
            fieldHeader.setFieldLenth(330);
            fieldHeader.writeToBuf(buf);
//                   final ByteBuffer byteBuffer = buf.nioBuffer();
            final ByteBuffer byteBuffer2= ByteBuffer.allocateDirect(330);
            final UnsafeBuffer directBuffer2= new UnsafeBuffer(byteBuffer2);
            char a='a';
            order_inEncoder.wrap(directBuffer2,0).investorID("D890798528").optSubInvestorID(optSubInvestorID).businessUnit("25744").branchID("00000").instrumentID("10000802").orderRef(request.orderRef()).exchangeID("SH").orderPriceType(request.orderPriceType()).direction(request.direction()).combOffsetFlag(request.combOffsetFlag()).combHedgeFlag(request.combHedgeFlag()).coveredFlag(request.coveredFlag()).ownerType(request.ownerType()).limitPrice(request.limitPrice()).volumeTotalOriginal(request.volumeTotalOriginal()).timeCondition(request.timeCondition()).volumeCondition(request.volumeCondition()).minVolume(request.minVolume()).contingentCondition(request.contingentCondition()).stopPrice(request.stopPrice()).requestID(request.requestID()).orderSubmitStatus((byte)0).orderStatus((byte) ( a& 0xFF)).volumeRemain(0).frontID(0).sessionID(0).thirdReff(2042);
//                           order_inEncoder.wrap(directBuffer,0).tradingDay(dateNowStr).loginTime(dateNowStr1).brokerID("2016").userID(request.userID()).frontID(i++).sessionID(i++).maxOrderRef(i++);


            buf.writeBytes(directBuffer2.byteBuffer());

            ctx.writeAndFlush(buf);

        }
    }

    public  static void main(String[] args) throws  Exception{
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("HHmmss");
//        String dateNowStr = sdf.format(new Date());
//        String dateNowStr1 = sdf1.format(new Date());
//        System.out.println("aaaaaa"+ dateNowStr);
//        System.out.println("bbbbbbbb"+ dateNowStr1);
        int port=8765;
        xmlParse xmlParse=new xmlParse();
        ss=xmlParse.readxmlData();

        if(args!=null&&args.length>0){
            try{
             port= Integer.valueOf(args[0]);

        }catch(NumberFormatException e) {
            }
        }
        new TimeServer().bind(port);
    }
}

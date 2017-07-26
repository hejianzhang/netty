package com.lyncc.netty.codec.protobuf.demo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.List;

//import com.lyncc.netty.codec.protobuf.demo.RichManProto.RichMan.Car;

public class ProtoBufServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        RichManProto.RichMan req = (RichManProto.RichMan) msg;
//        System.out.println(req.getName()+"����"+req.getCarsCount()+"����");
//        List<Car> lists = req.getCarsList();
//        if(null != lists) {
//
//            for(Car car : lists){
//                System.out.println(car.getName());
//            }
//        }
        sendProto.send req=(sendProto.send) msg;
        System.out.println("aaaaaa"+req.getVersion());
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}
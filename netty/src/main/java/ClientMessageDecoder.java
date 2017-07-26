import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by Administrator on 2017-06-12.
 */
public class ClientMessageDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        int index = in.readerIndex();
        MsgHeader header = MsgHeader.readFromBuf(in);
        if (header == null) {
            in.readerIndex(index);
            return;
        }
        if (header.getBodyLen() == 0) {
            out.add(new heartBeat());
        } else {
            fieldHeader fieldheader = fieldHeader.readFromBuf(in);
            if (fieldheader == null) {
                in.readerIndex(index);
                return;
            }


            ByteBuf body = null;
            body = in.readBytes(header.getBodyLen() - 8);


            final ByteBuffer byteBuffer = body.nioBuffer();
            final UnsafeBuffer directBuffer = new UnsafeBuffer(byteBuffer);
            switch (header.gettID()) {
                case 20481:
                    LoginReq_InDecoder loginReq = new LoginReq_InDecoder();
                    loginReq.wrap(directBuffer, 0, LoginReq_InDecoder.BLOCK_LENGTH, LoginReq_InDecoder.SCHEMA_VERSION);
                    System.out.println("BrokerID-------------------------" + loginReq.brokerID());
                    System.out.println("UserID-------------------------" + loginReq.userID());
                    System.out.println("password-------------------------" + loginReq.password());
                    out.add(loginReq);
                    break;

                case 20487:
                    OrderReq_InDecoder orderReq_inDecoder = new OrderReq_InDecoder();
                    orderReq_inDecoder.wrap(directBuffer, 0, Order_InDecoder.BLOCK_LENGTH, Order_InDecoder.SCHEMA_VERSION);
                    System.out.println("branchID-------------------------" + orderReq_inDecoder.branchID());
                    System.out.println("investorID-------------------------" + orderReq_inDecoder.investorID());
                    System.out.println("investorID-------------------------" + orderReq_inDecoder.instrumentID());

                    out.add(orderReq_inDecoder);
            }

        }
    }
}

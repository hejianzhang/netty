import io.netty.buffer.ByteBuf;

/**
 * Created by Administrator on 2017-06-12.
 */
public class MsgHeader {
    private byte version;
    private byte packageType;
    private byte chain;
    private byte __padding;
    private int topicID;
    private int tID;
    private int requestID;
    private int bodyLen;

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public byte getPackageType() {
        return packageType;
    }

    public void setPackageType(byte packageType) {
        this.packageType = packageType;
    }

    public byte getChain() {
        return chain;
    }

    public void setChain(byte chain) {
        this.chain = chain;
    }

    public byte get__padding() {
        return __padding;
    }

    public void set__padding(byte __padding) {
        this.__padding = __padding;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
        this.tID = tID;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getBodyLen() {
        return bodyLen;
    }

    public void setBodyLen(int bodyLen) {
        this.bodyLen = bodyLen;
    }

    public int getFieldCount() {
        return fieldCount;
    }

    public void setFieldCount(int fieldCount) {
        this.fieldCount = fieldCount;
    }

    public long getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(long sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public long getLastSn() {
        return lastSn;
    }

    public void setLastSn(long lastSn) {
        this.lastSn = lastSn;
    }
    public static int sizeof() {
        return StringEncodeHelper.INT_SIZE * 4;
    }
    private int fieldCount;
    private long sequenceNo;
    private long lastSn;
    public static MsgHeader readFromBuf(ByteBuf buf) {
        if (!buf.isReadable(sizeof()))
            return null;

        MsgHeader header = new MsgHeader();
        header.setVersion(buf.readByte());
        header.setPackageType(buf.readByte());
        header.setChain(buf.readByte());
        header.set__padding(buf.readByte());
        header.setTopicID(StringEncodeHelper.ctoji(buf.readInt()));
        header.settID(StringEncodeHelper.ctoji(buf.readInt()));
        header.setRequestID(StringEncodeHelper.ctoji(buf.readInt()));
        header.setBodyLen(StringEncodeHelper.ctoji(buf.readInt()));
        header.setFieldCount(StringEncodeHelper.ctoji(buf.readInt()));
        header.setSequenceNo(StringEncodeHelper.ctojl(buf.readLong()));
        header.setLastSn(StringEncodeHelper.ctojl(buf.readLong()));

        return header;
    }
    public void writeToBuf(ByteBuf buf) {
        buf.writeByte(this.version);
        buf.writeByte(this.packageType);
        buf.writeByte(this.chain);
        buf.writeByte(this.__padding);
        buf.writeInt(StringEncodeHelper.ctoji(this.topicID));
        buf.writeInt(StringEncodeHelper.ctoji(this.tID));
        buf.writeInt(StringEncodeHelper.ctoji(this.requestID));
        buf.writeInt(StringEncodeHelper.ctoji(this.bodyLen));
        buf.writeInt(StringEncodeHelper.ctoji(this.fieldCount));
        buf.writeLong(StringEncodeHelper.ctojl(this.sequenceNo));
        buf.writeLong(StringEncodeHelper.ctojl(this.lastSn));

    }

}

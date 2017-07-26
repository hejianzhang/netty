import io.netty.buffer.ByteBuf;

/**
 * Created by Administrator on 2017-06-12.
 */
public class fieldHeader {
    private int fieldID;

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public int getFieldLenth() {
        return fieldLenth;
    }

    public void setFieldLenth(int fieldLenth) {
        this.fieldLenth = fieldLenth;
    }

    private int fieldLenth;
    public static int sizeof() {
        return StringEncodeHelper.INT_SIZE * 4;
    }
    public static fieldHeader readFromBuf(ByteBuf buf) {
        if (!buf.isReadable(sizeof()))
            return null;

        fieldHeader header = new fieldHeader();

        header.setFieldID(StringEncodeHelper.ctoji(buf.readInt()));
        header.setFieldLenth(StringEncodeHelper.ctoji(buf.readInt()));


        return header;
    }
    public void writeToBuf(ByteBuf buf) {
        buf.writeInt(StringEncodeHelper.ctoji(this.fieldID));
        buf.writeInt(StringEncodeHelper.ctoji(this.fieldLenth));

    }
}

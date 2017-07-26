/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.RspInfo_InEncoder"})
@SuppressWarnings("all")
public class RspInfo_InEncoder
{
    public static final int BLOCK_LENGTH = 86;
    public static final int TEMPLATE_ID = 7;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final RspInfo_InEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    protected int offset;
    protected int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public RspInfo_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int errorIDEncodingOffset()
    {
        return 0;
    }

    public static int errorIDEncodingLength()
    {
        return 4;
    }

    public static long errorIDNullValue()
    {
        return 4294967294L;
    }

    public static long errorIDMinValue()
    {
        return 0L;
    }

    public static long errorIDMaxValue()
    {
        return 4294967293L;
    }

    public RspInfo_InEncoder errorID(final long value)
    {
        buffer.putInt(offset + 0, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int isLastEncodingOffset()
    {
        return 4;
    }

    public static int isLastEncodingLength()
    {
        return 1;
    }

    public static short isLastNullValue()
    {
        return (short)255;
    }

    public static short isLastMinValue()
    {
        return (short)0;
    }

    public static short isLastMaxValue()
    {
        return (short)254;
    }

    public RspInfo_InEncoder isLast(final short value)
    {
        buffer.putByte(offset + 4, (byte)value);
        return this;
    }


    public static int errorMsgEncodingOffset()
    {
        return 5;
    }

    public static int errorMsgEncodingLength()
    {
        return 81;
    }

    public static byte errorMsgNullValue()
    {
        return (byte)0;
    }

    public static byte errorMsgMinValue()
    {
        return (byte)32;
    }

    public static byte errorMsgMaxValue()
    {
        return (byte)126;
    }

    public static int errorMsgLength()
    {
        return 81;
    }

    public void errorMsg(final int index, final byte value)
    {
        if (index < 0 || index >= 81)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 5 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String errorMsgCharacterEncoding()
    {
        return "ASCII";
    }

    public RspInfo_InEncoder putErrorMsg(final byte[] src, final int srcOffset)
    {
        final int length = 81;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 5, src, srcOffset, length);

        return this;
    }

    public RspInfo_InEncoder errorMsg(final String src)
    {
        final int length = 81;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 5, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 5 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        RspInfo_InDecoder writer = new RspInfo_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

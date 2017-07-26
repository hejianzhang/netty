/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.RspLogin_InEncoder"})
@SuppressWarnings("all")
public class RspLogin_InEncoder
{
    public static final int BLOCK_LENGTH = 56;
    public static final int TEMPLATE_ID = 10;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final RspLogin_InEncoder parentMessage = this;
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

    public RspLogin_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int tradingDayEncodingOffset()
    {
        return 0;
    }

    public static int tradingDayEncodingLength()
    {
        return 9;
    }

    public static byte tradingDayNullValue()
    {
        return (byte)0;
    }

    public static byte tradingDayMinValue()
    {
        return (byte)32;
    }

    public static byte tradingDayMaxValue()
    {
        return (byte)126;
    }

    public static int tradingDayLength()
    {
        return 9;
    }

    public void tradingDay(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public RspLogin_InEncoder putTradingDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public RspLogin_InEncoder tradingDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 0, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 0 + start, (byte)0);
        }

        return this;
    }

    public static int loginTimeEncodingOffset()
    {
        return 9;
    }

    public static int loginTimeEncodingLength()
    {
        return 9;
    }

    public static byte loginTimeNullValue()
    {
        return (byte)0;
    }

    public static byte loginTimeMinValue()
    {
        return (byte)32;
    }

    public static byte loginTimeMaxValue()
    {
        return (byte)126;
    }

    public static int loginTimeLength()
    {
        return 9;
    }

    public void loginTime(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 9 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String loginTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public RspLogin_InEncoder putLoginTime(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 9, src, srcOffset, length);

        return this;
    }

    public RspLogin_InEncoder loginTime(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 9, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 9 + start, (byte)0);
        }

        return this;
    }

    public static int brokerIDEncodingOffset()
    {
        return 18;
    }

    public static int brokerIDEncodingLength()
    {
        return 11;
    }

    public static byte brokerIDNullValue()
    {
        return (byte)0;
    }

    public static byte brokerIDMinValue()
    {
        return (byte)32;
    }

    public static byte brokerIDMaxValue()
    {
        return (byte)126;
    }

    public static int brokerIDLength()
    {
        return 11;
    }

    public void brokerID(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 18 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String brokerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public RspLogin_InEncoder putBrokerID(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 18, src, srcOffset, length);

        return this;
    }

    public RspLogin_InEncoder brokerID(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 18, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 18 + start, (byte)0);
        }

        return this;
    }

    public static int userIDEncodingOffset()
    {
        return 29;
    }

    public static int userIDEncodingLength()
    {
        return 15;
    }

    public static byte userIDNullValue()
    {
        return (byte)0;
    }

    public static byte userIDMinValue()
    {
        return (byte)32;
    }

    public static byte userIDMaxValue()
    {
        return (byte)126;
    }

    public static int userIDLength()
    {
        return 15;
    }

    public void userID(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 29 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String userIDCharacterEncoding()
    {
        return "ASCII";
    }

    public RspLogin_InEncoder putUserID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 29, src, srcOffset, length);

        return this;
    }

    public RspLogin_InEncoder userID(final String src)
    {
        final int length = 15;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 29, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 29 + start, (byte)0);
        }

        return this;
    }

    public static int frontIDEncodingOffset()
    {
        return 44;
    }

    public static int frontIDEncodingLength()
    {
        return 4;
    }

    public static long frontIDNullValue()
    {
        return 4294967294L;
    }

    public static long frontIDMinValue()
    {
        return 0L;
    }

    public static long frontIDMaxValue()
    {
        return 4294967293L;
    }

    public RspLogin_InEncoder frontID(final long value)
    {
        buffer.putInt(offset + 44, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int sessionIDEncodingOffset()
    {
        return 48;
    }

    public static int sessionIDEncodingLength()
    {
        return 4;
    }

    public static long sessionIDNullValue()
    {
        return 4294967294L;
    }

    public static long sessionIDMinValue()
    {
        return 0L;
    }

    public static long sessionIDMaxValue()
    {
        return 4294967293L;
    }

    public RspLogin_InEncoder sessionID(final long value)
    {
        buffer.putInt(offset + 48, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int maxOrderRefEncodingOffset()
    {
        return 52;
    }

    public static int maxOrderRefEncodingLength()
    {
        return 4;
    }

    public static long maxOrderRefNullValue()
    {
        return 4294967294L;
    }

    public static long maxOrderRefMinValue()
    {
        return 0L;
    }

    public static long maxOrderRefMaxValue()
    {
        return 4294967293L;
    }

    public RspLogin_InEncoder maxOrderRef(final long value)
    {
        buffer.putInt(offset + 52, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        RspLogin_InDecoder writer = new RspLogin_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.QryOrder_InEncoder"})
@SuppressWarnings("all")
public class QryOrder_InEncoder
{
    public static final int BLOCK_LENGTH = 96;
    public static final int TEMPLATE_ID = 13;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final QryOrder_InEncoder parentMessage = this;
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

    public QryOrder_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int investorIDEncodingOffset()
    {
        return 0;
    }

    public static int investorIDEncodingLength()
    {
        return 15;
    }

    public static byte investorIDNullValue()
    {
        return (byte)0;
    }

    public static byte investorIDMinValue()
    {
        return (byte)32;
    }

    public static byte investorIDMaxValue()
    {
        return (byte)126;
    }

    public static int investorIDLength()
    {
        return 15;
    }

    public void investorID(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String investorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder investorID(final String src)
    {
        final int length = 15;
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

    public static int exchangeIDEncodingOffset()
    {
        return 15;
    }

    public static int exchangeIDEncodingLength()
    {
        return 9;
    }

    public static byte exchangeIDNullValue()
    {
        return (byte)0;
    }

    public static byte exchangeIDMinValue()
    {
        return (byte)32;
    }

    public static byte exchangeIDMaxValue()
    {
        return (byte)126;
    }

    public static int exchangeIDLength()
    {
        return 9;
    }

    public void exchangeID(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 15 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 15, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder exchangeID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 15, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 15 + start, (byte)0);
        }

        return this;
    }

    public static int instrumentIDEncodingOffset()
    {
        return 24;
    }

    public static int instrumentIDEncodingLength()
    {
        return 31;
    }

    public static byte instrumentIDNullValue()
    {
        return (byte)0;
    }

    public static byte instrumentIDMinValue()
    {
        return (byte)32;
    }

    public static byte instrumentIDMaxValue()
    {
        return (byte)126;
    }

    public static int instrumentIDLength()
    {
        return 31;
    }

    public void instrumentID(final int index, final byte value)
    {
        if (index < 0 || index >= 31)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 24 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String instrumentIDCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 24, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder instrumentID(final String src)
    {
        final int length = 31;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 24, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 24 + start, (byte)0);
        }

        return this;
    }

    public static int orderRefEncodingOffset()
    {
        return 55;
    }

    public static int orderRefEncodingLength()
    {
        return 11;
    }

    public static byte orderRefNullValue()
    {
        return (byte)0;
    }

    public static byte orderRefMinValue()
    {
        return (byte)32;
    }

    public static byte orderRefMaxValue()
    {
        return (byte)126;
    }

    public static int orderRefLength()
    {
        return 11;
    }

    public void orderRef(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 55 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderRefCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putOrderRef(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 55, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder orderRef(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 55, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 55 + start, (byte)0);
        }

        return this;
    }

    public static int orderSysIDEncodingOffset()
    {
        return 66;
    }

    public static int orderSysIDEncodingLength()
    {
        return 17;
    }

    public static byte orderSysIDNullValue()
    {
        return (byte)0;
    }

    public static byte orderSysIDMinValue()
    {
        return (byte)32;
    }

    public static byte orderSysIDMaxValue()
    {
        return (byte)126;
    }

    public static int orderSysIDLength()
    {
        return 17;
    }

    public void orderSysID(final int index, final byte value)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 66 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderSysIDCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putOrderSysID(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 66, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder orderSysID(final String src)
    {
        final int length = 17;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 66, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 66 + start, (byte)0);
        }

        return this;
    }

    public static int orderLocalIDEncodingOffset()
    {
        return 83;
    }

    public static int orderLocalIDEncodingLength()
    {
        return 13;
    }

    public static byte orderLocalIDNullValue()
    {
        return (byte)0;
    }

    public static byte orderLocalIDMinValue()
    {
        return (byte)32;
    }

    public static byte orderLocalIDMaxValue()
    {
        return (byte)126;
    }

    public static int orderLocalIDLength()
    {
        return 13;
    }

    public void orderLocalID(final int index, final byte value)
    {
        if (index < 0 || index >= 13)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 83 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderLocalIDCharacterEncoding()
    {
        return "ASCII";
    }

    public QryOrder_InEncoder putOrderLocalID(final byte[] src, final int srcOffset)
    {
        final int length = 13;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 83, src, srcOffset, length);

        return this;
    }

    public QryOrder_InEncoder orderLocalID(final String src)
    {
        final int length = 13;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 83, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 83 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        QryOrder_InDecoder writer = new QryOrder_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

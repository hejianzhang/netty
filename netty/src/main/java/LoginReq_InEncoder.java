/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.LoginReq_InEncoder"})
@SuppressWarnings("all")
public class LoginReq_InEncoder
{
    public static final int BLOCK_LENGTH = 76;
    public static final int TEMPLATE_ID = 8;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final LoginReq_InEncoder parentMessage = this;
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

    public LoginReq_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int brokerIDEncodingOffset()
    {
        return 0;
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

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String brokerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public LoginReq_InEncoder putBrokerID(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public LoginReq_InEncoder brokerID(final String src)
    {
        final int length = 11;
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

    public static int userIDEncodingOffset()
    {
        return 11;
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

        final int pos = this.offset + 11 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String userIDCharacterEncoding()
    {
        return "ASCII";
    }

    public LoginReq_InEncoder putUserID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 11, src, srcOffset, length);

        return this;
    }

    public LoginReq_InEncoder userID(final String src)
    {
        final int length = 15;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 11, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 11 + start, (byte)0);
        }

        return this;
    }

    public static int passwordEncodingOffset()
    {
        return 26;
    }

    public static int passwordEncodingLength()
    {
        return 41;
    }

    public static byte passwordNullValue()
    {
        return (byte)0;
    }

    public static byte passwordMinValue()
    {
        return (byte)32;
    }

    public static byte passwordMaxValue()
    {
        return (byte)126;
    }

    public static int passwordLength()
    {
        return 41;
    }

    public void password(final int index, final byte value)
    {
        if (index < 0 || index >= 41)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 26 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String passwordCharacterEncoding()
    {
        return "ASCII";
    }

    public LoginReq_InEncoder putPassword(final byte[] src, final int srcOffset)
    {
        final int length = 41;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 26, src, srcOffset, length);

        return this;
    }

    public LoginReq_InEncoder password(final String src)
    {
        final int length = 41;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 26, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 26 + start, (byte)0);
        }

        return this;
    }

    public static int comboIDEncodingOffset()
    {
        return 67;
    }

    public static int comboIDEncodingLength()
    {
        return 9;
    }

    public static byte comboIDNullValue()
    {
        return (byte)0;
    }

    public static byte comboIDMinValue()
    {
        return (byte)32;
    }

    public static byte comboIDMaxValue()
    {
        return (byte)126;
    }

    public static int comboIDLength()
    {
        return 9;
    }

    public void comboID(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String comboIDCharacterEncoding()
    {
        return "ASCII";
    }

    public LoginReq_InEncoder putComboID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 67, src, srcOffset, length);

        return this;
    }

    public LoginReq_InEncoder comboID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 67, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 67 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        LoginReq_InDecoder writer = new LoginReq_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

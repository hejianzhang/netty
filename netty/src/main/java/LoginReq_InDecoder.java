/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.LoginReq_InDecoder"})
@SuppressWarnings("all")
public class LoginReq_InDecoder
{
    public static final int BLOCK_LENGTH = 76;
    public static final int TEMPLATE_ID = 8;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final LoginReq_InDecoder parentMessage = this;
    private DirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

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

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public LoginReq_InDecoder wrap(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

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

    public static int brokerIDId()
    {
        return 1;
    }

    public static int brokerIDSinceVersion()
    {
        return 0;
    }

    public static int brokerIDEncodingOffset()
    {
        return 0;
    }

    public static int brokerIDEncodingLength()
    {
        return 11;
    }

    public static String brokerIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte brokerID(final int index)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String brokerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getBrokerID(final byte[] dst, final int dstOffset)
    {
        final int length = 11;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String brokerID()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 0, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int userIDId()
    {
        return 2;
    }

    public static int userIDSinceVersion()
    {
        return 0;
    }

    public static int userIDEncodingOffset()
    {
        return 11;
    }

    public static int userIDEncodingLength()
    {
        return 15;
    }

    public static String userIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte userID(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 11 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String userIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getUserID(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 11, dst, dstOffset, length);

        return length;
    }

    public String userID()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 11, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int passwordId()
    {
        return 3;
    }

    public static int passwordSinceVersion()
    {
        return 0;
    }

    public static int passwordEncodingOffset()
    {
        return 26;
    }

    public static int passwordEncodingLength()
    {
        return 41;
    }

    public static String passwordMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte password(final int index)
    {
        if (index < 0 || index >= 41)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 26 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String passwordCharacterEncoding()
    {
        return "ASCII";
    }

    public int getPassword(final byte[] dst, final int dstOffset)
    {
        final int length = 41;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 26, dst, dstOffset, length);

        return length;
    }

    public String password()
    {
        final byte[] dst = new byte[41];
        buffer.getBytes(this.offset + 26, dst, 0, 41);

        int end = 0;
        for (; end < 41 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int comboIDId()
    {
        return 4;
    }

    public static int comboIDSinceVersion()
    {
        return 0;
    }

    public static int comboIDEncodingOffset()
    {
        return 67;
    }

    public static int comboIDEncodingLength()
    {
        return 9;
    }

    public static String comboIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte comboID(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String comboIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getComboID(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 67, dst, dstOffset, length);

        return length;
    }

    public String comboID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 67, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[LoginReq_In](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        //Token{signal=BEGIN_FIELD, name='BrokerID', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BROKERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("brokerID=");
        for (int i = 0; i < brokerIDLength() && brokerID(i) > 0; i++)
        {
            builder.append((char)brokerID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UserID', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=11, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='USERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=11, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("userID=");
        for (int i = 0; i < userIDLength() && userID(i) > 0; i++)
        {
            builder.append((char)userID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Password', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=26, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='PASSWORD_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=41, offset=26, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("password=");
        for (int i = 0; i < passwordLength() && password(i) > 0; i++)
        {
            builder.append((char)password(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ComboID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=67, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='COMBOID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=67, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("comboID=");
        for (int i = 0; i < comboIDLength() && comboID(i) > 0; i++)
        {
            builder.append((char)comboID(i));
        }

        limit(originalLimit);

        return builder;
    }
}

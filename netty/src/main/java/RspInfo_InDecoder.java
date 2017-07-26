/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.RspInfo_InDecoder"})
@SuppressWarnings("all")
public class RspInfo_InDecoder
{
    public static final int BLOCK_LENGTH = 86;
    public static final int TEMPLATE_ID = 7;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final RspInfo_InDecoder parentMessage = this;
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

    public RspInfo_InDecoder wrap(
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

    public static int errorIDId()
    {
        return 1;
    }

    public static int errorIDSinceVersion()
    {
        return 0;
    }

    public static int errorIDEncodingOffset()
    {
        return 0;
    }

    public static int errorIDEncodingLength()
    {
        return 4;
    }

    public static String errorIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long errorID()
    {
        return (buffer.getInt(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int isLastId()
    {
        return 2;
    }

    public static int isLastSinceVersion()
    {
        return 0;
    }

    public static int isLastEncodingOffset()
    {
        return 4;
    }

    public static int isLastEncodingLength()
    {
        return 1;
    }

    public static String isLastMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public short isLast()
    {
        return ((short)(buffer.getByte(offset + 4) & 0xFF));
    }


    public static int errorMsgId()
    {
        return 3;
    }

    public static int errorMsgSinceVersion()
    {
        return 0;
    }

    public static int errorMsgEncodingOffset()
    {
        return 5;
    }

    public static int errorMsgEncodingLength()
    {
        return 81;
    }

    public static String errorMsgMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte errorMsg(final int index)
    {
        if (index < 0 || index >= 81)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 5 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String errorMsgCharacterEncoding()
    {
        return "ASCII";
    }

    public int getErrorMsg(final byte[] dst, final int dstOffset)
    {
        final int length = 81;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 5, dst, dstOffset, length);

        return length;
    }

    public String errorMsg()
    {
        final byte[] dst = new byte[81];
        buffer.getBytes(this.offset + 5, dst, 0, 81);

        int end = 0;
        for (; end < 81 && dst[end] != 0; ++end);

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
        builder.append("[RspInfo_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='ErrorID', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("errorID=");
        builder.append(errorID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='IsLast', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=4, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=4, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("isLast=");
        builder.append(isLast());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ErrorMsg', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=5, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ERRORMSG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=81, offset=5, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("errorMsg=");
        for (int i = 0; i < errorMsgLength() && errorMsg(i) > 0; i++)
        {
            builder.append((char)errorMsg(i));
        }

        limit(originalLimit);

        return builder;
    }
}

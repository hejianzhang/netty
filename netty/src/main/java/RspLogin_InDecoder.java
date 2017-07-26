/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.RspLogin_InDecoder"})
@SuppressWarnings("all")
public class RspLogin_InDecoder
{
    public static final int BLOCK_LENGTH = 56;
    public static final int TEMPLATE_ID = 10;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final RspLogin_InDecoder parentMessage = this;
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

    public RspLogin_InDecoder wrap(
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

    public static int tradingDayId()
    {
        return 1;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 0;
    }

    public static int tradingDayEncodingLength()
    {
        return 9;
    }

    public static String tradingDayMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte tradingDay(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public int getTradingDay(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 0, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int loginTimeId()
    {
        return 2;
    }

    public static int loginTimeSinceVersion()
    {
        return 0;
    }

    public static int loginTimeEncodingOffset()
    {
        return 9;
    }

    public static int loginTimeEncodingLength()
    {
        return 9;
    }

    public static String loginTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte loginTime(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 9 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String loginTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public int getLoginTime(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 9, dst, dstOffset, length);

        return length;
    }

    public String loginTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 9, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int brokerIDId()
    {
        return 3;
    }

    public static int brokerIDSinceVersion()
    {
        return 0;
    }

    public static int brokerIDEncodingOffset()
    {
        return 18;
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

        final int pos = this.offset + 18 + (index * 1);

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

        buffer.getBytes(this.offset + 18, dst, dstOffset, length);

        return length;
    }

    public String brokerID()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 18, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int userIDId()
    {
        return 4;
    }

    public static int userIDSinceVersion()
    {
        return 0;
    }

    public static int userIDEncodingOffset()
    {
        return 29;
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

        final int pos = this.offset + 29 + (index * 1);

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

        buffer.getBytes(this.offset + 29, dst, dstOffset, length);

        return length;
    }

    public String userID()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 29, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int frontIDId()
    {
        return 5;
    }

    public static int frontIDSinceVersion()
    {
        return 0;
    }

    public static int frontIDEncodingOffset()
    {
        return 44;
    }

    public static int frontIDEncodingLength()
    {
        return 4;
    }

    public static String frontIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long frontID()
    {
        return (buffer.getInt(offset + 44, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int sessionIDId()
    {
        return 6;
    }

    public static int sessionIDSinceVersion()
    {
        return 0;
    }

    public static int sessionIDEncodingOffset()
    {
        return 48;
    }

    public static int sessionIDEncodingLength()
    {
        return 4;
    }

    public static String sessionIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long sessionID()
    {
        return (buffer.getInt(offset + 48, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int maxOrderRefId()
    {
        return 7;
    }

    public static int maxOrderRefSinceVersion()
    {
        return 0;
    }

    public static int maxOrderRefEncodingOffset()
    {
        return 52;
    }

    public static int maxOrderRefEncodingLength()
    {
        return 4;
    }

    public static String maxOrderRefMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long maxOrderRef()
    {
        return (buffer.getInt(offset + 52, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[RspLogin_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LoginTime', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=9, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=9, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("loginTime=");
        for (int i = 0; i < loginTimeLength() && loginTime(i) > 0; i++)
        {
            builder.append((char)loginTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BrokerID', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=18, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BROKERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=18, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("brokerID=");
        for (int i = 0; i < brokerIDLength() && brokerID(i) > 0; i++)
        {
            builder.append((char)brokerID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UserID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=29, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='USERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=29, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("userID=");
        for (int i = 0; i < userIDLength() && userID(i) > 0; i++)
        {
            builder.append((char)userID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='FrontID', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=0, offset=44, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=44, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("frontID=");
        builder.append(frontID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SessionID', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=48, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=48, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("sessionID=");
        builder.append(sessionID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaxOrderRef', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=52, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=52, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("maxOrderRef=");
        builder.append(maxOrderRef());

        limit(originalLimit);

        return builder;
    }
}

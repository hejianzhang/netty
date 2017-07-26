/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.Instrument_InDecoder"})
@SuppressWarnings("all")
public class Instrument_InDecoder
{
    public static final int BLOCK_LENGTH = 149;
    public static final int TEMPLATE_ID = 2;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final Instrument_InDecoder parentMessage = this;
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

    public Instrument_InDecoder wrap(
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

    public static int instrumentIDId()
    {
        return 1;
    }

    public static int instrumentIDSinceVersion()
    {
        return 0;
    }

    public static int instrumentIDEncodingOffset()
    {
        return 0;
    }

    public static int instrumentIDEncodingLength()
    {
        return 31;
    }

    public static String instrumentIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte instrumentID(final int index)
    {
        if (index < 0 || index >= 31)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getInstrumentID(final byte[] dst, final int dstOffset)
    {
        final int length = 31;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String instrumentID()
    {
        final byte[] dst = new byte[31];
        buffer.getBytes(this.offset + 0, dst, 0, 31);

        int end = 0;
        for (; end < 31 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int exchangeIDId()
    {
        return 2;
    }

    public static int exchangeIDSinceVersion()
    {
        return 0;
    }

    public static int exchangeIDEncodingOffset()
    {
        return 31;
    }

    public static int exchangeIDEncodingLength()
    {
        return 9;
    }

    public static String exchangeIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte exchangeID(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 31 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getExchangeID(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 31, dst, dstOffset, length);

        return length;
    }

    public String exchangeID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 31, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int instrumentNameId()
    {
        return 3;
    }

    public static int instrumentNameSinceVersion()
    {
        return 0;
    }

    public static int instrumentNameEncodingOffset()
    {
        return 40;
    }

    public static int instrumentNameEncodingLength()
    {
        return 21;
    }

    public static String instrumentNameMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte instrumentNameNullValue()
    {
        return (byte)0;
    }

    public static byte instrumentNameMinValue()
    {
        return (byte)32;
    }

    public static byte instrumentNameMaxValue()
    {
        return (byte)126;
    }

    public static int instrumentNameLength()
    {
        return 21;
    }

    public byte instrumentName(final int index)
    {
        if (index < 0 || index >= 21)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 40 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String instrumentNameCharacterEncoding()
    {
        return "ASCII";
    }

    public int getInstrumentName(final byte[] dst, final int dstOffset)
    {
        final int length = 21;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 40, dst, dstOffset, length);

        return length;
    }

    public String instrumentName()
    {
        final byte[] dst = new byte[21];
        buffer.getBytes(this.offset + 40, dst, 0, 21);

        int end = 0;
        for (; end < 21 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int productIDId()
    {
        return 4;
    }

    public static int productIDSinceVersion()
    {
        return 0;
    }

    public static int productIDEncodingOffset()
    {
        return 61;
    }

    public static int productIDEncodingLength()
    {
        return 31;
    }

    public static String productIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte productIDNullValue()
    {
        return (byte)0;
    }

    public static byte productIDMinValue()
    {
        return (byte)32;
    }

    public static byte productIDMaxValue()
    {
        return (byte)126;
    }

    public static int productIDLength()
    {
        return 31;
    }

    public byte productID(final int index)
    {
        if (index < 0 || index >= 31)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 61 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String productIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getProductID(final byte[] dst, final int dstOffset)
    {
        final int length = 31;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 61, dst, dstOffset, length);

        return length;
    }

    public String productID()
    {
        final byte[] dst = new byte[31];
        buffer.getBytes(this.offset + 61, dst, 0, 31);

        int end = 0;
        for (; end < 31 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int productClassId()
    {
        return 5;
    }

    public static int productClassSinceVersion()
    {
        return 0;
    }

    public static int productClassEncodingOffset()
    {
        return 92;
    }

    public static int productClassEncodingLength()
    {
        return 1;
    }

    public static String productClassMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte productClassNullValue()
    {
        return (byte)0;
    }

    public static byte productClassMinValue()
    {
        return (byte)32;
    }

    public static byte productClassMaxValue()
    {
        return (byte)126;
    }

    public byte productClass()
    {
        return buffer.getByte(offset + 92);
    }


    public static int volumeMultipleId()
    {
        return 6;
    }

    public static int volumeMultipleSinceVersion()
    {
        return 0;
    }

    public static int volumeMultipleEncodingOffset()
    {
        return 93;
    }

    public static int volumeMultipleEncodingLength()
    {
        return 4;
    }

    public static String volumeMultipleMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long volumeMultipleNullValue()
    {
        return 4294967294L;
    }

    public static long volumeMultipleMinValue()
    {
        return 0L;
    }

    public static long volumeMultipleMaxValue()
    {
        return 4294967293L;
    }

    public long volumeMultiple()
    {
        return (buffer.getInt(offset + 93, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int priceTickId()
    {
        return 7;
    }

    public static int priceTickSinceVersion()
    {
        return 0;
    }

    public static int priceTickEncodingOffset()
    {
        return 97;
    }

    public static int priceTickEncodingLength()
    {
        return 8;
    }

    public static String priceTickMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double priceTickNullValue()
    {
        return Double.NaN;
    }

    public static double priceTickMinValue()
    {
        return 4.9E-324d;
    }

    public static double priceTickMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double priceTick()
    {
        return buffer.getDouble(offset + 97, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int openDateId()
    {
        return 8;
    }

    public static int openDateSinceVersion()
    {
        return 0;
    }

    public static int openDateEncodingOffset()
    {
        return 105;
    }

    public static int openDateEncodingLength()
    {
        return 9;
    }

    public static String openDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte openDateNullValue()
    {
        return (byte)0;
    }

    public static byte openDateMinValue()
    {
        return (byte)32;
    }

    public static byte openDateMaxValue()
    {
        return (byte)126;
    }

    public static int openDateLength()
    {
        return 9;
    }

    public byte openDate(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 105 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String openDateCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOpenDate(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 105, dst, dstOffset, length);

        return length;
    }

    public String openDate()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 105, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int expireDateId()
    {
        return 9;
    }

    public static int expireDateSinceVersion()
    {
        return 0;
    }

    public static int expireDateEncodingOffset()
    {
        return 114;
    }

    public static int expireDateEncodingLength()
    {
        return 9;
    }

    public static String expireDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte expireDateNullValue()
    {
        return (byte)0;
    }

    public static byte expireDateMinValue()
    {
        return (byte)32;
    }

    public static byte expireDateMaxValue()
    {
        return (byte)126;
    }

    public static int expireDateLength()
    {
        return 9;
    }

    public byte expireDate(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 114 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String expireDateCharacterEncoding()
    {
        return "ASCII";
    }

    public int getExpireDate(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 114, dst, dstOffset, length);

        return length;
    }

    public String expireDate()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 114, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int isTradingId()
    {
        return 10;
    }

    public static int isTradingSinceVersion()
    {
        return 0;
    }

    public static int isTradingEncodingOffset()
    {
        return 123;
    }

    public static int isTradingEncodingLength()
    {
        return 1;
    }

    public static String isTradingMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static short isTradingNullValue()
    {
        return (short)255;
    }

    public static short isTradingMinValue()
    {
        return (short)0;
    }

    public static short isTradingMaxValue()
    {
        return (short)254;
    }

    public short isTrading()
    {
        return ((short)(buffer.getByte(offset + 123) & 0xFF));
    }


    public static int execPriceId()
    {
        return 11;
    }

    public static int execPriceSinceVersion()
    {
        return 0;
    }

    public static int execPriceEncodingOffset()
    {
        return 124;
    }

    public static int execPriceEncodingLength()
    {
        return 8;
    }

    public static String execPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double execPriceNullValue()
    {
        return Double.NaN;
    }

    public static double execPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double execPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double execPrice()
    {
        return buffer.getDouble(offset + 124, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int unitMarginId()
    {
        return 12;
    }

    public static int unitMarginSinceVersion()
    {
        return 0;
    }

    public static int unitMarginEncodingOffset()
    {
        return 132;
    }

    public static int unitMarginEncodingLength()
    {
        return 8;
    }

    public static String unitMarginMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double unitMarginNullValue()
    {
        return Double.NaN;
    }

    public static double unitMarginMinValue()
    {
        return 4.9E-324d;
    }

    public static double unitMarginMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double unitMargin()
    {
        return buffer.getDouble(offset + 132, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradingDayId()
    {
        return 13;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 140;
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

        final int pos = this.offset + 140 + (index * 1);

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

        buffer.getBytes(this.offset + 140, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 140, dst, 0, 9);

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
        builder.append("[Instrument_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='InstrumentID', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='INSTRUMENTID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=31, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("instrumentID=");
        for (int i = 0; i < instrumentIDLength() && instrumentID(i) > 0; i++)
        {
            builder.append((char)instrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ExchangeID', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=31, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='EXCHANGEID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=31, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("exchangeID=");
        for (int i = 0; i < exchangeIDLength() && exchangeID(i) > 0; i++)
        {
            builder.append((char)exchangeID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InstrumentName', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=40, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='INSTRUMENTNAME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=21, offset=40, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("instrumentName=");
        for (int i = 0; i < instrumentNameLength() && instrumentName(i) > 0; i++)
        {
            builder.append((char)instrumentName(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ProductID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=61, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='PRODUCTID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=31, offset=61, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("productID=");
        for (int i = 0; i < productIDLength() && productID(i) > 0; i++)
        {
            builder.append((char)productID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ProductClass', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=0, offset=92, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=92, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("productClass=");
        builder.append(productClass());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='VolumeMultiple', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=93, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=93, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volumeMultiple=");
        builder.append(volumeMultiple());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PriceTick', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=97, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=97, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("priceTick=");
        builder.append(priceTick());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenDate', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=0, offset=105, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=105, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openDate=");
        for (int i = 0; i < openDateLength() && openDate(i) > 0; i++)
        {
            builder.append((char)openDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ExpireDate', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=0, offset=114, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=114, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("expireDate=");
        for (int i = 0; i < expireDateLength() && expireDate(i) > 0; i++)
        {
            builder.append((char)expireDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='IsTrading', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=123, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint8', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=123, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("isTrading=");
        builder.append(isTrading());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ExecPrice', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=124, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=124, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("execPrice=");
        builder.append(execPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnitMargin', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=132, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=132, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("unitMargin=");
        builder.append(unitMargin());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=140, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=140, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }

        limit(originalLimit);

        return builder;
    }
}

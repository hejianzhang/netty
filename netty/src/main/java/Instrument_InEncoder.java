/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.Instrument_InEncoder"})
@SuppressWarnings("all")
public class Instrument_InEncoder
{
    public static final int BLOCK_LENGTH = 149;
    public static final int TEMPLATE_ID = 2;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final Instrument_InEncoder parentMessage = this;
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

    public Instrument_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int instrumentIDEncodingOffset()
    {
        return 0;
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

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String instrumentIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder instrumentID(final String src)
    {
        final int length = 31;
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
        return 31;
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

        final int pos = this.offset + 31 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 31, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder exchangeID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 31, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 31 + start, (byte)0);
        }

        return this;
    }

    public static int instrumentNameEncodingOffset()
    {
        return 40;
    }

    public static int instrumentNameEncodingLength()
    {
        return 21;
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

    public void instrumentName(final int index, final byte value)
    {
        if (index < 0 || index >= 21)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 40 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String instrumentNameCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putInstrumentName(final byte[] src, final int srcOffset)
    {
        final int length = 21;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 40, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder instrumentName(final String src)
    {
        final int length = 21;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 40, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 40 + start, (byte)0);
        }

        return this;
    }

    public static int productIDEncodingOffset()
    {
        return 61;
    }

    public static int productIDEncodingLength()
    {
        return 31;
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

    public void productID(final int index, final byte value)
    {
        if (index < 0 || index >= 31)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 61 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String productIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putProductID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 61, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder productID(final String src)
    {
        final int length = 31;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 61, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 61 + start, (byte)0);
        }

        return this;
    }

    public static int productClassEncodingOffset()
    {
        return 92;
    }

    public static int productClassEncodingLength()
    {
        return 1;
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

    public Instrument_InEncoder productClass(final byte value)
    {
        buffer.putByte(offset + 92, value);
        return this;
    }


    public static int volumeMultipleEncodingOffset()
    {
        return 93;
    }

    public static int volumeMultipleEncodingLength()
    {
        return 4;
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

    public Instrument_InEncoder volumeMultiple(final long value)
    {
        buffer.putInt(offset + 93, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int priceTickEncodingOffset()
    {
        return 97;
    }

    public static int priceTickEncodingLength()
    {
        return 8;
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

    public Instrument_InEncoder priceTick(final double value)
    {
        buffer.putDouble(offset + 97, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openDateEncodingOffset()
    {
        return 105;
    }

    public static int openDateEncodingLength()
    {
        return 9;
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

    public void openDate(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 105 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String openDateCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putOpenDate(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 105, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder openDate(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 105, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 105 + start, (byte)0);
        }

        return this;
    }

    public static int expireDateEncodingOffset()
    {
        return 114;
    }

    public static int expireDateEncodingLength()
    {
        return 9;
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

    public void expireDate(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 114 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String expireDateCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putExpireDate(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 114, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder expireDate(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 114, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 114 + start, (byte)0);
        }

        return this;
    }

    public static int isTradingEncodingOffset()
    {
        return 123;
    }

    public static int isTradingEncodingLength()
    {
        return 1;
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

    public Instrument_InEncoder isTrading(final short value)
    {
        buffer.putByte(offset + 123, (byte)value);
        return this;
    }


    public static int execPriceEncodingOffset()
    {
        return 124;
    }

    public static int execPriceEncodingLength()
    {
        return 8;
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

    public Instrument_InEncoder execPrice(final double value)
    {
        buffer.putDouble(offset + 124, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int unitMarginEncodingOffset()
    {
        return 132;
    }

    public static int unitMarginEncodingLength()
    {
        return 8;
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

    public Instrument_InEncoder unitMargin(final double value)
    {
        buffer.putDouble(offset + 132, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradingDayEncodingOffset()
    {
        return 140;
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

        final int pos = this.offset + 140 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public Instrument_InEncoder putTradingDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 140, src, srcOffset, length);

        return this;
    }

    public Instrument_InEncoder tradingDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 140, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 140 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        Instrument_InDecoder writer = new Instrument_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

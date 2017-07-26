/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.DepthMarketData_InEncoder"})
@SuppressWarnings("all")
public class DepthMarketData_InEncoder
{
    public static final int BLOCK_LENGTH = 393;
    public static final int TEMPLATE_ID = 6;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final DepthMarketData_InEncoder parentMessage = this;
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

    public DepthMarketData_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public DepthMarketData_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public DepthMarketData_InEncoder instrumentID(final String src)
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

    public DepthMarketData_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 31, src, srcOffset, length);

        return this;
    }

    public DepthMarketData_InEncoder exchangeID(final String src)
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

    public static int lastPriceEncodingOffset()
    {
        return 40;
    }

    public static int lastPriceEncodingLength()
    {
        return 8;
    }

    public static double lastPriceNullValue()
    {
        return Double.NaN;
    }

    public static double lastPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double lastPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder lastPrice(final double value)
    {
        buffer.putDouble(offset + 40, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int preSettlementPriceEncodingOffset()
    {
        return 48;
    }

    public static int preSettlementPriceEncodingLength()
    {
        return 8;
    }

    public static double preSettlementPriceNullValue()
    {
        return Double.NaN;
    }

    public static double preSettlementPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double preSettlementPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder preSettlementPrice(final double value)
    {
        buffer.putDouble(offset + 48, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int preClosePriceEncodingOffset()
    {
        return 56;
    }

    public static int preClosePriceEncodingLength()
    {
        return 8;
    }

    public static double preClosePriceNullValue()
    {
        return Double.NaN;
    }

    public static double preClosePriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double preClosePriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder preClosePrice(final double value)
    {
        buffer.putDouble(offset + 56, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int preOpenInterestEncodingOffset()
    {
        return 64;
    }

    public static int preOpenInterestEncodingLength()
    {
        return 8;
    }

    public static double preOpenInterestNullValue()
    {
        return Double.NaN;
    }

    public static double preOpenInterestMinValue()
    {
        return 4.9E-324d;
    }

    public static double preOpenInterestMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder preOpenInterest(final double value)
    {
        buffer.putDouble(offset + 64, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openPriceEncodingOffset()
    {
        return 72;
    }

    public static int openPriceEncodingLength()
    {
        return 8;
    }

    public static double openPriceNullValue()
    {
        return Double.NaN;
    }

    public static double openPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double openPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder openPrice(final double value)
    {
        buffer.putDouble(offset + 72, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int highestPriceEncodingOffset()
    {
        return 80;
    }

    public static int highestPriceEncodingLength()
    {
        return 8;
    }

    public static double highestPriceNullValue()
    {
        return Double.NaN;
    }

    public static double highestPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double highestPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder highestPrice(final double value)
    {
        buffer.putDouble(offset + 80, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lowestPriceEncodingOffset()
    {
        return 88;
    }

    public static int lowestPriceEncodingLength()
    {
        return 8;
    }

    public static double lowestPriceNullValue()
    {
        return Double.NaN;
    }

    public static double lowestPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double lowestPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder lowestPrice(final double value)
    {
        buffer.putDouble(offset + 88, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradeVolumeEncodingOffset()
    {
        return 96;
    }

    public static int tradeVolumeEncodingLength()
    {
        return 8;
    }

    public static double tradeVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double tradeVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double tradeVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder tradeVolume(final double value)
    {
        buffer.putDouble(offset + 96, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int turnoverEncodingOffset()
    {
        return 104;
    }

    public static int turnoverEncodingLength()
    {
        return 8;
    }

    public static double turnoverNullValue()
    {
        return Double.NaN;
    }

    public static double turnoverMinValue()
    {
        return 4.9E-324d;
    }

    public static double turnoverMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder turnover(final double value)
    {
        buffer.putDouble(offset + 104, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openInterestEncodingOffset()
    {
        return 112;
    }

    public static int openInterestEncodingLength()
    {
        return 8;
    }

    public static double openInterestNullValue()
    {
        return Double.NaN;
    }

    public static double openInterestMinValue()
    {
        return 4.9E-324d;
    }

    public static double openInterestMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder openInterest(final double value)
    {
        buffer.putDouble(offset + 112, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closePriceEncodingOffset()
    {
        return 120;
    }

    public static int closePriceEncodingLength()
    {
        return 8;
    }

    public static double closePriceNullValue()
    {
        return Double.NaN;
    }

    public static double closePriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double closePriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder closePrice(final double value)
    {
        buffer.putDouble(offset + 120, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int settlementPriceEncodingOffset()
    {
        return 128;
    }

    public static int settlementPriceEncodingLength()
    {
        return 8;
    }

    public static double settlementPriceNullValue()
    {
        return Double.NaN;
    }

    public static double settlementPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double settlementPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder settlementPrice(final double value)
    {
        buffer.putDouble(offset + 128, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int upperLimitPriceEncodingOffset()
    {
        return 136;
    }

    public static int upperLimitPriceEncodingLength()
    {
        return 8;
    }

    public static double upperLimitPriceNullValue()
    {
        return Double.NaN;
    }

    public static double upperLimitPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double upperLimitPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder upperLimitPrice(final double value)
    {
        buffer.putDouble(offset + 136, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int lowerLimitPriceEncodingOffset()
    {
        return 144;
    }

    public static int lowerLimitPriceEncodingLength()
    {
        return 8;
    }

    public static double lowerLimitPriceNullValue()
    {
        return Double.NaN;
    }

    public static double lowerLimitPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double lowerLimitPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder lowerLimitPrice(final double value)
    {
        buffer.putDouble(offset + 144, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int preIOPVEncodingOffset()
    {
        return 152;
    }

    public static int preIOPVEncodingLength()
    {
        return 8;
    }

    public static double preIOPVNullValue()
    {
        return Double.NaN;
    }

    public static double preIOPVMinValue()
    {
        return 4.9E-324d;
    }

    public static double preIOPVMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder preIOPV(final double value)
    {
        buffer.putDouble(offset + 152, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int iOPVEncodingOffset()
    {
        return 160;
    }

    public static int iOPVEncodingLength()
    {
        return 8;
    }

    public static double iOPVNullValue()
    {
        return Double.NaN;
    }

    public static double iOPVMinValue()
    {
        return 4.9E-324d;
    }

    public static double iOPVMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder iOPV(final double value)
    {
        buffer.putDouble(offset + 160, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int preDeltaEncodingOffset()
    {
        return 168;
    }

    public static int preDeltaEncodingLength()
    {
        return 8;
    }

    public static double preDeltaNullValue()
    {
        return Double.NaN;
    }

    public static double preDeltaMinValue()
    {
        return 4.9E-324d;
    }

    public static double preDeltaMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder preDelta(final double value)
    {
        buffer.putDouble(offset + 168, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int currDeltaEncodingOffset()
    {
        return 176;
    }

    public static int currDeltaEncodingLength()
    {
        return 8;
    }

    public static double currDeltaNullValue()
    {
        return Double.NaN;
    }

    public static double currDeltaMinValue()
    {
        return 4.9E-324d;
    }

    public static double currDeltaMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder currDelta(final double value)
    {
        buffer.putDouble(offset + 176, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int auctionPriceEncodingOffset()
    {
        return 184;
    }

    public static int auctionPriceEncodingLength()
    {
        return 8;
    }

    public static double auctionPriceNullValue()
    {
        return Double.NaN;
    }

    public static double auctionPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double auctionPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder auctionPrice(final double value)
    {
        buffer.putDouble(offset + 184, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int updateTimeEncodingOffset()
    {
        return 192;
    }

    public static int updateTimeEncodingLength()
    {
        return 9;
    }

    public static byte updateTimeNullValue()
    {
        return (byte)0;
    }

    public static byte updateTimeMinValue()
    {
        return (byte)32;
    }

    public static byte updateTimeMaxValue()
    {
        return (byte)126;
    }

    public static int updateTimeLength()
    {
        return 9;
    }

    public void updateTime(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 192 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String updateTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public DepthMarketData_InEncoder putUpdateTime(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 192, src, srcOffset, length);

        return this;
    }

    public DepthMarketData_InEncoder updateTime(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 192, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 192 + start, (byte)0);
        }

        return this;
    }

    public static int updateMillisecEncodingOffset()
    {
        return 201;
    }

    public static int updateMillisecEncodingLength()
    {
        return 4;
    }

    public static long updateMillisecNullValue()
    {
        return 4294967294L;
    }

    public static long updateMillisecMinValue()
    {
        return 0L;
    }

    public static long updateMillisecMaxValue()
    {
        return 4294967293L;
    }

    public DepthMarketData_InEncoder updateMillisec(final long value)
    {
        buffer.putInt(offset + 201, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidPrice1EncodingOffset()
    {
        return 205;
    }

    public static int bidPrice1EncodingLength()
    {
        return 8;
    }

    public static double bidPrice1NullValue()
    {
        return Double.NaN;
    }

    public static double bidPrice1MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidPrice1MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidPrice1(final double value)
    {
        buffer.putDouble(offset + 205, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidVolume1EncodingOffset()
    {
        return 213;
    }

    public static int bidVolume1EncodingLength()
    {
        return 8;
    }

    public static double bidVolume1NullValue()
    {
        return Double.NaN;
    }

    public static double bidVolume1MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidVolume1MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidVolume1(final double value)
    {
        buffer.putDouble(offset + 213, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askPrice1EncodingOffset()
    {
        return 221;
    }

    public static int askPrice1EncodingLength()
    {
        return 8;
    }

    public static double askPrice1NullValue()
    {
        return Double.NaN;
    }

    public static double askPrice1MinValue()
    {
        return 4.9E-324d;
    }

    public static double askPrice1MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askPrice1(final double value)
    {
        buffer.putDouble(offset + 221, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askVolume1EncodingOffset()
    {
        return 229;
    }

    public static int askVolume1EncodingLength()
    {
        return 8;
    }

    public static double askVolume1NullValue()
    {
        return Double.NaN;
    }

    public static double askVolume1MinValue()
    {
        return 4.9E-324d;
    }

    public static double askVolume1MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askVolume1(final double value)
    {
        buffer.putDouble(offset + 229, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidPrice2EncodingOffset()
    {
        return 237;
    }

    public static int bidPrice2EncodingLength()
    {
        return 8;
    }

    public static double bidPrice2NullValue()
    {
        return Double.NaN;
    }

    public static double bidPrice2MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidPrice2MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidPrice2(final double value)
    {
        buffer.putDouble(offset + 237, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidVolume2EncodingOffset()
    {
        return 245;
    }

    public static int bidVolume2EncodingLength()
    {
        return 8;
    }

    public static double bidVolume2NullValue()
    {
        return Double.NaN;
    }

    public static double bidVolume2MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidVolume2MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidVolume2(final double value)
    {
        buffer.putDouble(offset + 245, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askPrice2EncodingOffset()
    {
        return 253;
    }

    public static int askPrice2EncodingLength()
    {
        return 8;
    }

    public static double askPrice2NullValue()
    {
        return Double.NaN;
    }

    public static double askPrice2MinValue()
    {
        return 4.9E-324d;
    }

    public static double askPrice2MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askPrice2(final double value)
    {
        buffer.putDouble(offset + 253, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askVolume2EncodingOffset()
    {
        return 261;
    }

    public static int askVolume2EncodingLength()
    {
        return 8;
    }

    public static double askVolume2NullValue()
    {
        return Double.NaN;
    }

    public static double askVolume2MinValue()
    {
        return 4.9E-324d;
    }

    public static double askVolume2MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askVolume2(final double value)
    {
        buffer.putDouble(offset + 261, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidPrice3EncodingOffset()
    {
        return 269;
    }

    public static int bidPrice3EncodingLength()
    {
        return 8;
    }

    public static double bidPrice3NullValue()
    {
        return Double.NaN;
    }

    public static double bidPrice3MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidPrice3MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidPrice3(final double value)
    {
        buffer.putDouble(offset + 269, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidVolume3EncodingOffset()
    {
        return 277;
    }

    public static int bidVolume3EncodingLength()
    {
        return 8;
    }

    public static double bidVolume3NullValue()
    {
        return Double.NaN;
    }

    public static double bidVolume3MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidVolume3MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidVolume3(final double value)
    {
        buffer.putDouble(offset + 277, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askPrice3EncodingOffset()
    {
        return 285;
    }

    public static int askPrice3EncodingLength()
    {
        return 8;
    }

    public static double askPrice3NullValue()
    {
        return Double.NaN;
    }

    public static double askPrice3MinValue()
    {
        return 4.9E-324d;
    }

    public static double askPrice3MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askPrice3(final double value)
    {
        buffer.putDouble(offset + 285, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askVolume3EncodingOffset()
    {
        return 293;
    }

    public static int askVolume3EncodingLength()
    {
        return 8;
    }

    public static double askVolume3NullValue()
    {
        return Double.NaN;
    }

    public static double askVolume3MinValue()
    {
        return 4.9E-324d;
    }

    public static double askVolume3MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askVolume3(final double value)
    {
        buffer.putDouble(offset + 293, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidPrice4EncodingOffset()
    {
        return 301;
    }

    public static int bidPrice4EncodingLength()
    {
        return 8;
    }

    public static double bidPrice4NullValue()
    {
        return Double.NaN;
    }

    public static double bidPrice4MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidPrice4MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidPrice4(final double value)
    {
        buffer.putDouble(offset + 301, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidVolume4EncodingOffset()
    {
        return 309;
    }

    public static int bidVolume4EncodingLength()
    {
        return 8;
    }

    public static double bidVolume4NullValue()
    {
        return Double.NaN;
    }

    public static double bidVolume4MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidVolume4MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidVolume4(final double value)
    {
        buffer.putDouble(offset + 309, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askPrice4EncodingOffset()
    {
        return 317;
    }

    public static int askPrice4EncodingLength()
    {
        return 8;
    }

    public static double askPrice4NullValue()
    {
        return Double.NaN;
    }

    public static double askPrice4MinValue()
    {
        return 4.9E-324d;
    }

    public static double askPrice4MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askPrice4(final double value)
    {
        buffer.putDouble(offset + 317, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askVolume4EncodingOffset()
    {
        return 325;
    }

    public static int askVolume4EncodingLength()
    {
        return 8;
    }

    public static double askVolume4NullValue()
    {
        return Double.NaN;
    }

    public static double askVolume4MinValue()
    {
        return 4.9E-324d;
    }

    public static double askVolume4MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askVolume4(final double value)
    {
        buffer.putDouble(offset + 325, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidPrice5EncodingOffset()
    {
        return 333;
    }

    public static int bidPrice5EncodingLength()
    {
        return 8;
    }

    public static double bidPrice5NullValue()
    {
        return Double.NaN;
    }

    public static double bidPrice5MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidPrice5MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidPrice5(final double value)
    {
        buffer.putDouble(offset + 333, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int bidVolume5EncodingOffset()
    {
        return 341;
    }

    public static int bidVolume5EncodingLength()
    {
        return 8;
    }

    public static double bidVolume5NullValue()
    {
        return Double.NaN;
    }

    public static double bidVolume5MinValue()
    {
        return 4.9E-324d;
    }

    public static double bidVolume5MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder bidVolume5(final double value)
    {
        buffer.putDouble(offset + 341, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askPrice5EncodingOffset()
    {
        return 349;
    }

    public static int askPrice5EncodingLength()
    {
        return 8;
    }

    public static double askPrice5NullValue()
    {
        return Double.NaN;
    }

    public static double askPrice5MinValue()
    {
        return 4.9E-324d;
    }

    public static double askPrice5MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askPrice5(final double value)
    {
        buffer.putDouble(offset + 349, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int askVolume5EncodingOffset()
    {
        return 357;
    }

    public static int askVolume5EncodingLength()
    {
        return 8;
    }

    public static double askVolume5NullValue()
    {
        return Double.NaN;
    }

    public static double askVolume5MinValue()
    {
        return 4.9E-324d;
    }

    public static double askVolume5MaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder askVolume5(final double value)
    {
        buffer.putDouble(offset + 357, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int averagePriceEncodingOffset()
    {
        return 365;
    }

    public static int averagePriceEncodingLength()
    {
        return 8;
    }

    public static double averagePriceNullValue()
    {
        return Double.NaN;
    }

    public static double averagePriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double averagePriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public DepthMarketData_InEncoder averagePrice(final double value)
    {
        buffer.putDouble(offset + 365, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradingPhaseEncodingOffset()
    {
        return 373;
    }

    public static int tradingPhaseEncodingLength()
    {
        return 1;
    }

    public static byte tradingPhaseNullValue()
    {
        return (byte)0;
    }

    public static byte tradingPhaseMinValue()
    {
        return (byte)32;
    }

    public static byte tradingPhaseMaxValue()
    {
        return (byte)126;
    }

    public DepthMarketData_InEncoder tradingPhase(final byte value)
    {
        buffer.putByte(offset + 373, value);
        return this;
    }


    public static int openRestrictionEncodingOffset()
    {
        return 374;
    }

    public static int openRestrictionEncodingLength()
    {
        return 1;
    }

    public static byte openRestrictionNullValue()
    {
        return (byte)0;
    }

    public static byte openRestrictionMinValue()
    {
        return (byte)32;
    }

    public static byte openRestrictionMaxValue()
    {
        return (byte)126;
    }

    public DepthMarketData_InEncoder openRestriction(final byte value)
    {
        buffer.putByte(offset + 374, value);
        return this;
    }


    public static int actionDayEncodingOffset()
    {
        return 375;
    }

    public static int actionDayEncodingLength()
    {
        return 9;
    }

    public static byte actionDayNullValue()
    {
        return (byte)0;
    }

    public static byte actionDayMinValue()
    {
        return (byte)32;
    }

    public static byte actionDayMaxValue()
    {
        return (byte)126;
    }

    public static int actionDayLength()
    {
        return 9;
    }

    public void actionDay(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 375 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String actionDayCharacterEncoding()
    {
        return "ASCII";
    }

    public DepthMarketData_InEncoder putActionDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 375, src, srcOffset, length);

        return this;
    }

    public DepthMarketData_InEncoder actionDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 375, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 375 + start, (byte)0);
        }

        return this;
    }

    public static int tradingDayEncodingOffset()
    {
        return 384;
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

        final int pos = this.offset + 384 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public DepthMarketData_InEncoder putTradingDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 384, src, srcOffset, length);

        return this;
    }

    public DepthMarketData_InEncoder tradingDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 384, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 384 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        DepthMarketData_InDecoder writer = new DepthMarketData_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.DepthMarketData_InDecoder"})
@SuppressWarnings("all")
public class DepthMarketData_InDecoder
{
    public static final int BLOCK_LENGTH = 393;
    public static final int TEMPLATE_ID = 6;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final DepthMarketData_InDecoder parentMessage = this;
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

    public DepthMarketData_InDecoder wrap(
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


    public static int lastPriceId()
    {
        return 3;
    }

    public static int lastPriceSinceVersion()
    {
        return 0;
    }

    public static int lastPriceEncodingOffset()
    {
        return 40;
    }

    public static int lastPriceEncodingLength()
    {
        return 8;
    }

    public static String lastPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double lastPrice()
    {
        return buffer.getDouble(offset + 40, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int preSettlementPriceId()
    {
        return 4;
    }

    public static int preSettlementPriceSinceVersion()
    {
        return 0;
    }

    public static int preSettlementPriceEncodingOffset()
    {
        return 48;
    }

    public static int preSettlementPriceEncodingLength()
    {
        return 8;
    }

    public static String preSettlementPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double preSettlementPrice()
    {
        return buffer.getDouble(offset + 48, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int preClosePriceId()
    {
        return 5;
    }

    public static int preClosePriceSinceVersion()
    {
        return 0;
    }

    public static int preClosePriceEncodingOffset()
    {
        return 56;
    }

    public static int preClosePriceEncodingLength()
    {
        return 8;
    }

    public static String preClosePriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double preClosePrice()
    {
        return buffer.getDouble(offset + 56, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int preOpenInterestId()
    {
        return 6;
    }

    public static int preOpenInterestSinceVersion()
    {
        return 0;
    }

    public static int preOpenInterestEncodingOffset()
    {
        return 64;
    }

    public static int preOpenInterestEncodingLength()
    {
        return 8;
    }

    public static String preOpenInterestMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double preOpenInterest()
    {
        return buffer.getDouble(offset + 64, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int openPriceId()
    {
        return 7;
    }

    public static int openPriceSinceVersion()
    {
        return 0;
    }

    public static int openPriceEncodingOffset()
    {
        return 72;
    }

    public static int openPriceEncodingLength()
    {
        return 8;
    }

    public static String openPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double openPrice()
    {
        return buffer.getDouble(offset + 72, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int highestPriceId()
    {
        return 8;
    }

    public static int highestPriceSinceVersion()
    {
        return 0;
    }

    public static int highestPriceEncodingOffset()
    {
        return 80;
    }

    public static int highestPriceEncodingLength()
    {
        return 8;
    }

    public static String highestPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double highestPrice()
    {
        return buffer.getDouble(offset + 80, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int lowestPriceId()
    {
        return 9;
    }

    public static int lowestPriceSinceVersion()
    {
        return 0;
    }

    public static int lowestPriceEncodingOffset()
    {
        return 88;
    }

    public static int lowestPriceEncodingLength()
    {
        return 8;
    }

    public static String lowestPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double lowestPrice()
    {
        return buffer.getDouble(offset + 88, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradeVolumeId()
    {
        return 10;
    }

    public static int tradeVolumeSinceVersion()
    {
        return 0;
    }

    public static int tradeVolumeEncodingOffset()
    {
        return 96;
    }

    public static int tradeVolumeEncodingLength()
    {
        return 8;
    }

    public static String tradeVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double tradeVolume()
    {
        return buffer.getDouble(offset + 96, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int turnoverId()
    {
        return 11;
    }

    public static int turnoverSinceVersion()
    {
        return 0;
    }

    public static int turnoverEncodingOffset()
    {
        return 104;
    }

    public static int turnoverEncodingLength()
    {
        return 8;
    }

    public static String turnoverMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double turnover()
    {
        return buffer.getDouble(offset + 104, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int openInterestId()
    {
        return 12;
    }

    public static int openInterestSinceVersion()
    {
        return 0;
    }

    public static int openInterestEncodingOffset()
    {
        return 112;
    }

    public static int openInterestEncodingLength()
    {
        return 8;
    }

    public static String openInterestMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double openInterest()
    {
        return buffer.getDouble(offset + 112, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int closePriceId()
    {
        return 13;
    }

    public static int closePriceSinceVersion()
    {
        return 0;
    }

    public static int closePriceEncodingOffset()
    {
        return 120;
    }

    public static int closePriceEncodingLength()
    {
        return 8;
    }

    public static String closePriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double closePrice()
    {
        return buffer.getDouble(offset + 120, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int settlementPriceId()
    {
        return 14;
    }

    public static int settlementPriceSinceVersion()
    {
        return 0;
    }

    public static int settlementPriceEncodingOffset()
    {
        return 128;
    }

    public static int settlementPriceEncodingLength()
    {
        return 8;
    }

    public static String settlementPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double settlementPrice()
    {
        return buffer.getDouble(offset + 128, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int upperLimitPriceId()
    {
        return 15;
    }

    public static int upperLimitPriceSinceVersion()
    {
        return 0;
    }

    public static int upperLimitPriceEncodingOffset()
    {
        return 136;
    }

    public static int upperLimitPriceEncodingLength()
    {
        return 8;
    }

    public static String upperLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double upperLimitPrice()
    {
        return buffer.getDouble(offset + 136, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int lowerLimitPriceId()
    {
        return 16;
    }

    public static int lowerLimitPriceSinceVersion()
    {
        return 0;
    }

    public static int lowerLimitPriceEncodingOffset()
    {
        return 144;
    }

    public static int lowerLimitPriceEncodingLength()
    {
        return 8;
    }

    public static String lowerLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double lowerLimitPrice()
    {
        return buffer.getDouble(offset + 144, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int preIOPVId()
    {
        return 17;
    }

    public static int preIOPVSinceVersion()
    {
        return 0;
    }

    public static int preIOPVEncodingOffset()
    {
        return 152;
    }

    public static int preIOPVEncodingLength()
    {
        return 8;
    }

    public static String preIOPVMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double preIOPV()
    {
        return buffer.getDouble(offset + 152, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int iOPVId()
    {
        return 18;
    }

    public static int iOPVSinceVersion()
    {
        return 0;
    }

    public static int iOPVEncodingOffset()
    {
        return 160;
    }

    public static int iOPVEncodingLength()
    {
        return 8;
    }

    public static String iOPVMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double iOPV()
    {
        return buffer.getDouble(offset + 160, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int preDeltaId()
    {
        return 19;
    }

    public static int preDeltaSinceVersion()
    {
        return 0;
    }

    public static int preDeltaEncodingOffset()
    {
        return 168;
    }

    public static int preDeltaEncodingLength()
    {
        return 8;
    }

    public static String preDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double preDelta()
    {
        return buffer.getDouble(offset + 168, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int currDeltaId()
    {
        return 20;
    }

    public static int currDeltaSinceVersion()
    {
        return 0;
    }

    public static int currDeltaEncodingOffset()
    {
        return 176;
    }

    public static int currDeltaEncodingLength()
    {
        return 8;
    }

    public static String currDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double currDelta()
    {
        return buffer.getDouble(offset + 176, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int auctionPriceId()
    {
        return 21;
    }

    public static int auctionPriceSinceVersion()
    {
        return 0;
    }

    public static int auctionPriceEncodingOffset()
    {
        return 184;
    }

    public static int auctionPriceEncodingLength()
    {
        return 8;
    }

    public static String auctionPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double auctionPrice()
    {
        return buffer.getDouble(offset + 184, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int updateTimeId()
    {
        return 22;
    }

    public static int updateTimeSinceVersion()
    {
        return 0;
    }

    public static int updateTimeEncodingOffset()
    {
        return 192;
    }

    public static int updateTimeEncodingLength()
    {
        return 9;
    }

    public static String updateTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte updateTime(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 192 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String updateTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public int getUpdateTime(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 192, dst, dstOffset, length);

        return length;
    }

    public String updateTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 192, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int updateMillisecId()
    {
        return 23;
    }

    public static int updateMillisecSinceVersion()
    {
        return 0;
    }

    public static int updateMillisecEncodingOffset()
    {
        return 201;
    }

    public static int updateMillisecEncodingLength()
    {
        return 4;
    }

    public static String updateMillisecMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long updateMillisec()
    {
        return (buffer.getInt(offset + 201, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int bidPrice1Id()
    {
        return 24;
    }

    public static int bidPrice1SinceVersion()
    {
        return 0;
    }

    public static int bidPrice1EncodingOffset()
    {
        return 205;
    }

    public static int bidPrice1EncodingLength()
    {
        return 8;
    }

    public static String bidPrice1MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidPrice1()
    {
        return buffer.getDouble(offset + 205, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidVolume1Id()
    {
        return 25;
    }

    public static int bidVolume1SinceVersion()
    {
        return 0;
    }

    public static int bidVolume1EncodingOffset()
    {
        return 213;
    }

    public static int bidVolume1EncodingLength()
    {
        return 8;
    }

    public static String bidVolume1MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidVolume1()
    {
        return buffer.getDouble(offset + 213, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askPrice1Id()
    {
        return 26;
    }

    public static int askPrice1SinceVersion()
    {
        return 0;
    }

    public static int askPrice1EncodingOffset()
    {
        return 221;
    }

    public static int askPrice1EncodingLength()
    {
        return 8;
    }

    public static String askPrice1MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askPrice1()
    {
        return buffer.getDouble(offset + 221, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askVolume1Id()
    {
        return 27;
    }

    public static int askVolume1SinceVersion()
    {
        return 0;
    }

    public static int askVolume1EncodingOffset()
    {
        return 229;
    }

    public static int askVolume1EncodingLength()
    {
        return 8;
    }

    public static String askVolume1MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askVolume1()
    {
        return buffer.getDouble(offset + 229, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidPrice2Id()
    {
        return 28;
    }

    public static int bidPrice2SinceVersion()
    {
        return 0;
    }

    public static int bidPrice2EncodingOffset()
    {
        return 237;
    }

    public static int bidPrice2EncodingLength()
    {
        return 8;
    }

    public static String bidPrice2MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidPrice2()
    {
        return buffer.getDouble(offset + 237, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidVolume2Id()
    {
        return 29;
    }

    public static int bidVolume2SinceVersion()
    {
        return 0;
    }

    public static int bidVolume2EncodingOffset()
    {
        return 245;
    }

    public static int bidVolume2EncodingLength()
    {
        return 8;
    }

    public static String bidVolume2MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidVolume2()
    {
        return buffer.getDouble(offset + 245, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askPrice2Id()
    {
        return 30;
    }

    public static int askPrice2SinceVersion()
    {
        return 0;
    }

    public static int askPrice2EncodingOffset()
    {
        return 253;
    }

    public static int askPrice2EncodingLength()
    {
        return 8;
    }

    public static String askPrice2MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askPrice2()
    {
        return buffer.getDouble(offset + 253, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askVolume2Id()
    {
        return 31;
    }

    public static int askVolume2SinceVersion()
    {
        return 0;
    }

    public static int askVolume2EncodingOffset()
    {
        return 261;
    }

    public static int askVolume2EncodingLength()
    {
        return 8;
    }

    public static String askVolume2MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askVolume2()
    {
        return buffer.getDouble(offset + 261, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidPrice3Id()
    {
        return 32;
    }

    public static int bidPrice3SinceVersion()
    {
        return 0;
    }

    public static int bidPrice3EncodingOffset()
    {
        return 269;
    }

    public static int bidPrice3EncodingLength()
    {
        return 8;
    }

    public static String bidPrice3MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidPrice3()
    {
        return buffer.getDouble(offset + 269, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidVolume3Id()
    {
        return 33;
    }

    public static int bidVolume3SinceVersion()
    {
        return 0;
    }

    public static int bidVolume3EncodingOffset()
    {
        return 277;
    }

    public static int bidVolume3EncodingLength()
    {
        return 8;
    }

    public static String bidVolume3MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidVolume3()
    {
        return buffer.getDouble(offset + 277, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askPrice3Id()
    {
        return 34;
    }

    public static int askPrice3SinceVersion()
    {
        return 0;
    }

    public static int askPrice3EncodingOffset()
    {
        return 285;
    }

    public static int askPrice3EncodingLength()
    {
        return 8;
    }

    public static String askPrice3MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askPrice3()
    {
        return buffer.getDouble(offset + 285, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askVolume3Id()
    {
        return 35;
    }

    public static int askVolume3SinceVersion()
    {
        return 0;
    }

    public static int askVolume3EncodingOffset()
    {
        return 293;
    }

    public static int askVolume3EncodingLength()
    {
        return 8;
    }

    public static String askVolume3MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askVolume3()
    {
        return buffer.getDouble(offset + 293, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidPrice4Id()
    {
        return 36;
    }

    public static int bidPrice4SinceVersion()
    {
        return 0;
    }

    public static int bidPrice4EncodingOffset()
    {
        return 301;
    }

    public static int bidPrice4EncodingLength()
    {
        return 8;
    }

    public static String bidPrice4MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidPrice4()
    {
        return buffer.getDouble(offset + 301, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidVolume4Id()
    {
        return 37;
    }

    public static int bidVolume4SinceVersion()
    {
        return 0;
    }

    public static int bidVolume4EncodingOffset()
    {
        return 309;
    }

    public static int bidVolume4EncodingLength()
    {
        return 8;
    }

    public static String bidVolume4MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidVolume4()
    {
        return buffer.getDouble(offset + 309, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askPrice4Id()
    {
        return 38;
    }

    public static int askPrice4SinceVersion()
    {
        return 0;
    }

    public static int askPrice4EncodingOffset()
    {
        return 317;
    }

    public static int askPrice4EncodingLength()
    {
        return 8;
    }

    public static String askPrice4MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askPrice4()
    {
        return buffer.getDouble(offset + 317, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askVolume4Id()
    {
        return 39;
    }

    public static int askVolume4SinceVersion()
    {
        return 0;
    }

    public static int askVolume4EncodingOffset()
    {
        return 325;
    }

    public static int askVolume4EncodingLength()
    {
        return 8;
    }

    public static String askVolume4MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askVolume4()
    {
        return buffer.getDouble(offset + 325, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidPrice5Id()
    {
        return 40;
    }

    public static int bidPrice5SinceVersion()
    {
        return 0;
    }

    public static int bidPrice5EncodingOffset()
    {
        return 333;
    }

    public static int bidPrice5EncodingLength()
    {
        return 8;
    }

    public static String bidPrice5MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidPrice5()
    {
        return buffer.getDouble(offset + 333, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int bidVolume5Id()
    {
        return 41;
    }

    public static int bidVolume5SinceVersion()
    {
        return 0;
    }

    public static int bidVolume5EncodingOffset()
    {
        return 341;
    }

    public static int bidVolume5EncodingLength()
    {
        return 8;
    }

    public static String bidVolume5MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double bidVolume5()
    {
        return buffer.getDouble(offset + 341, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askPrice5Id()
    {
        return 42;
    }

    public static int askPrice5SinceVersion()
    {
        return 0;
    }

    public static int askPrice5EncodingOffset()
    {
        return 349;
    }

    public static int askPrice5EncodingLength()
    {
        return 8;
    }

    public static String askPrice5MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askPrice5()
    {
        return buffer.getDouble(offset + 349, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int askVolume5Id()
    {
        return 43;
    }

    public static int askVolume5SinceVersion()
    {
        return 0;
    }

    public static int askVolume5EncodingOffset()
    {
        return 357;
    }

    public static int askVolume5EncodingLength()
    {
        return 8;
    }

    public static String askVolume5MetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double askVolume5()
    {
        return buffer.getDouble(offset + 357, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int averagePriceId()
    {
        return 44;
    }

    public static int averagePriceSinceVersion()
    {
        return 0;
    }

    public static int averagePriceEncodingOffset()
    {
        return 365;
    }

    public static int averagePriceEncodingLength()
    {
        return 8;
    }

    public static String averagePriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double averagePrice()
    {
        return buffer.getDouble(offset + 365, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradingPhaseId()
    {
        return 45;
    }

    public static int tradingPhaseSinceVersion()
    {
        return 0;
    }

    public static int tradingPhaseEncodingOffset()
    {
        return 373;
    }

    public static int tradingPhaseEncodingLength()
    {
        return 1;
    }

    public static String tradingPhaseMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte tradingPhase()
    {
        return buffer.getByte(offset + 373);
    }


    public static int openRestrictionId()
    {
        return 46;
    }

    public static int openRestrictionSinceVersion()
    {
        return 0;
    }

    public static int openRestrictionEncodingOffset()
    {
        return 374;
    }

    public static int openRestrictionEncodingLength()
    {
        return 1;
    }

    public static String openRestrictionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte openRestriction()
    {
        return buffer.getByte(offset + 374);
    }


    public static int actionDayId()
    {
        return 47;
    }

    public static int actionDaySinceVersion()
    {
        return 0;
    }

    public static int actionDayEncodingOffset()
    {
        return 375;
    }

    public static int actionDayEncodingLength()
    {
        return 9;
    }

    public static String actionDayMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte actionDay(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 375 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String actionDayCharacterEncoding()
    {
        return "ASCII";
    }

    public int getActionDay(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 375, dst, dstOffset, length);

        return length;
    }

    public String actionDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 375, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int tradingDayId()
    {
        return 48;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 384;
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

        final int pos = this.offset + 384 + (index * 1);

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

        buffer.getBytes(this.offset + 384, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 384, dst, 0, 9);

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
        builder.append("[DepthMarketData_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='LastPrice', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=40, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=40, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("lastPrice=");
        builder.append(lastPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PreSettlementPrice', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=48, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=48, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("preSettlementPrice=");
        builder.append(preSettlementPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PreClosePrice', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=0, offset=56, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=56, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("preClosePrice=");
        builder.append(preClosePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PreOpenInterest', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=64, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=64, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("preOpenInterest=");
        builder.append(preOpenInterest());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenPrice', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=72, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=72, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openPrice=");
        builder.append(openPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HighestPrice', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=0, offset=80, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=80, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("highestPrice=");
        builder.append(highestPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LowestPrice', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=0, offset=88, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=88, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("lowestPrice=");
        builder.append(lowestPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeVolume', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=96, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=96, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeVolume=");
        builder.append(tradeVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Turnover', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=104, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=104, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("turnover=");
        builder.append(turnover());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenInterest', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=112, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=112, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openInterest=");
        builder.append(openInterest());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ClosePrice', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=120, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=120, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("closePrice=");
        builder.append(closePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SettlementPrice', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=0, offset=128, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=128, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("settlementPrice=");
        builder.append(settlementPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UpperLimitPrice', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=0, offset=136, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=136, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("upperLimitPrice=");
        builder.append(upperLimitPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LowerLimitPrice', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=0, offset=144, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=144, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("lowerLimitPrice=");
        builder.append(lowerLimitPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PreIOPV', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=0, offset=152, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=152, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("preIOPV=");
        builder.append(preIOPV());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='IOPV', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=0, offset=160, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=160, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("iOPV=");
        builder.append(iOPV());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PreDelta', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=0, offset=168, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=168, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("preDelta=");
        builder.append(preDelta());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CurrDelta', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=0, offset=176, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=176, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("currDelta=");
        builder.append(currDelta());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AuctionPrice', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=0, offset=184, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=184, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("auctionPrice=");
        builder.append(auctionPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UpdateTime', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=0, offset=192, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=192, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("updateTime=");
        for (int i = 0; i < updateTimeLength() && updateTime(i) > 0; i++)
        {
            builder.append((char)updateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UpdateMillisec', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=0, offset=201, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=201, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("updateMillisec=");
        builder.append(updateMillisec());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidPrice1', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=0, offset=205, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=205, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidPrice1=");
        builder.append(bidPrice1());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidVolume1', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=0, offset=213, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=213, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidVolume1=");
        builder.append(bidVolume1());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskPrice1', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=0, offset=221, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=221, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askPrice1=");
        builder.append(askPrice1());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskVolume1', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=0, offset=229, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=229, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askVolume1=");
        builder.append(askVolume1());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidPrice2', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=0, offset=237, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=237, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidPrice2=");
        builder.append(bidPrice2());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidVolume2', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=0, offset=245, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=245, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidVolume2=");
        builder.append(bidVolume2());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskPrice2', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=0, offset=253, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=253, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askPrice2=");
        builder.append(askPrice2());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskVolume2', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=0, offset=261, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=261, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askVolume2=");
        builder.append(askVolume2());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidPrice3', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=0, offset=269, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=269, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidPrice3=");
        builder.append(bidPrice3());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidVolume3', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=0, offset=277, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=277, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidVolume3=");
        builder.append(bidVolume3());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskPrice3', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=0, offset=285, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=285, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askPrice3=");
        builder.append(askPrice3());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskVolume3', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=0, offset=293, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=293, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askVolume3=");
        builder.append(askVolume3());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidPrice4', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=0, offset=301, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=301, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidPrice4=");
        builder.append(bidPrice4());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidVolume4', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=0, offset=309, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=309, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidVolume4=");
        builder.append(bidVolume4());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskPrice4', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=0, offset=317, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=317, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askPrice4=");
        builder.append(askPrice4());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskVolume4', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=0, offset=325, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=325, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askVolume4=");
        builder.append(askVolume4());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidPrice5', referencedName='null', description='null', id=40, version=0, deprecated=0, encodedLength=0, offset=333, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=333, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidPrice5=");
        builder.append(bidPrice5());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BidVolume5', referencedName='null', description='null', id=41, version=0, deprecated=0, encodedLength=0, offset=341, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=341, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("bidVolume5=");
        builder.append(bidVolume5());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskPrice5', referencedName='null', description='null', id=42, version=0, deprecated=0, encodedLength=0, offset=349, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=349, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askPrice5=");
        builder.append(askPrice5());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AskVolume5', referencedName='null', description='null', id=43, version=0, deprecated=0, encodedLength=0, offset=357, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=357, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("askVolume5=");
        builder.append(askVolume5());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AveragePrice', referencedName='null', description='null', id=44, version=0, deprecated=0, encodedLength=0, offset=365, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=365, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("averagePrice=");
        builder.append(averagePrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingPhase', referencedName='null', description='null', id=45, version=0, deprecated=0, encodedLength=0, offset=373, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=373, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingPhase=");
        builder.append(tradingPhase());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenRestriction', referencedName='null', description='null', id=46, version=0, deprecated=0, encodedLength=0, offset=374, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=374, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openRestriction=");
        builder.append(openRestriction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ActionDay', referencedName='null', description='null', id=47, version=0, deprecated=0, encodedLength=0, offset=375, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=375, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("actionDay=");
        for (int i = 0; i < actionDayLength() && actionDay(i) > 0; i++)
        {
            builder.append((char)actionDay(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=48, version=0, deprecated=0, encodedLength=0, offset=384, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=384, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }

        limit(originalLimit);

        return builder;
    }
}

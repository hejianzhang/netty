/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.OrderReq_InDecoder"})
@SuppressWarnings("all")
public class OrderReq_InDecoder
{
    public static final int BLOCK_LENGTH = 136;
    public static final int TEMPLATE_ID = 11;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final OrderReq_InDecoder parentMessage = this;
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

    public OrderReq_InDecoder wrap(
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

    public static int investorIDId()
    {
        return 1;
    }

    public static int investorIDSinceVersion()
    {
        return 0;
    }

    public static int investorIDEncodingOffset()
    {
        return 0;
    }

    public static int investorIDEncodingLength()
    {
        return 15;
    }

    public static String investorIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte investorID(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String investorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getInvestorID(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String investorID()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 0, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int optSubInvestorIDId()
    {
        return 2;
    }

    public static int optSubInvestorIDSinceVersion()
    {
        return 0;
    }

    public static int optSubInvestorIDEncodingOffset()
    {
        return 15;
    }

    public static int optSubInvestorIDEncodingLength()
    {
        return 9;
    }

    public static String optSubInvestorIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte optSubInvestorIDNullValue()
    {
        return (byte)0;
    }

    public static byte optSubInvestorIDMinValue()
    {
        return (byte)32;
    }

    public static byte optSubInvestorIDMaxValue()
    {
        return (byte)126;
    }

    public static int optSubInvestorIDLength()
    {
        return 9;
    }

    public byte optSubInvestorID(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 15 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String optSubInvestorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOptSubInvestorID(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 15, dst, dstOffset, length);

        return length;
    }

    public String optSubInvestorID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 15, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int businessUnitId()
    {
        return 3;
    }

    public static int businessUnitSinceVersion()
    {
        return 0;
    }

    public static int businessUnitEncodingOffset()
    {
        return 24;
    }

    public static int businessUnitEncodingLength()
    {
        return 6;
    }

    public static String businessUnitMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte businessUnitNullValue()
    {
        return (byte)0;
    }

    public static byte businessUnitMinValue()
    {
        return (byte)32;
    }

    public static byte businessUnitMaxValue()
    {
        return (byte)126;
    }

    public static int businessUnitLength()
    {
        return 6;
    }

    public byte businessUnit(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 24 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String businessUnitCharacterEncoding()
    {
        return "ASCII";
    }

    public int getBusinessUnit(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 24, dst, dstOffset, length);

        return length;
    }

    public String businessUnit()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 24, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int branchIDId()
    {
        return 4;
    }

    public static int branchIDSinceVersion()
    {
        return 0;
    }

    public static int branchIDEncodingOffset()
    {
        return 30;
    }

    public static int branchIDEncodingLength()
    {
        return 6;
    }

    public static String branchIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte branchIDNullValue()
    {
        return (byte)0;
    }

    public static byte branchIDMinValue()
    {
        return (byte)32;
    }

    public static byte branchIDMaxValue()
    {
        return (byte)126;
    }

    public static int branchIDLength()
    {
        return 6;
    }

    public byte branchID(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 30 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String branchIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getBranchID(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 30, dst, dstOffset, length);

        return length;
    }

    public String branchID()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 30, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int instrumentIDId()
    {
        return 5;
    }

    public static int instrumentIDSinceVersion()
    {
        return 0;
    }

    public static int instrumentIDEncodingOffset()
    {
        return 36;
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

        final int pos = this.offset + 36 + (index * 1);

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

        buffer.getBytes(this.offset + 36, dst, dstOffset, length);

        return length;
    }

    public String instrumentID()
    {
        final byte[] dst = new byte[31];
        buffer.getBytes(this.offset + 36, dst, 0, 31);

        int end = 0;
        for (; end < 31 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderRefId()
    {
        return 6;
    }

    public static int orderRefSinceVersion()
    {
        return 0;
    }

    public static int orderRefEncodingOffset()
    {
        return 67;
    }

    public static int orderRefEncodingLength()
    {
        return 11;
    }

    public static String orderRefMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte orderRef(final int index)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String orderRefCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOrderRef(final byte[] dst, final int dstOffset)
    {
        final int length = 11;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 67, dst, dstOffset, length);

        return length;
    }

    public String orderRef()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 67, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int exchangeIDId()
    {
        return 7;
    }

    public static int exchangeIDSinceVersion()
    {
        return 0;
    }

    public static int exchangeIDEncodingOffset()
    {
        return 78;
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

        final int pos = this.offset + 78 + (index * 1);

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

        buffer.getBytes(this.offset + 78, dst, dstOffset, length);

        return length;
    }

    public String exchangeID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 78, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderPriceTypeId()
    {
        return 8;
    }

    public static int orderPriceTypeSinceVersion()
    {
        return 0;
    }

    public static int orderPriceTypeEncodingOffset()
    {
        return 87;
    }

    public static int orderPriceTypeEncodingLength()
    {
        return 1;
    }

    public static String orderPriceTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte orderPriceTypeNullValue()
    {
        return (byte)0;
    }

    public static byte orderPriceTypeMinValue()
    {
        return (byte)32;
    }

    public static byte orderPriceTypeMaxValue()
    {
        return (byte)126;
    }

    public byte orderPriceType()
    {
        return buffer.getByte(offset + 87);
    }


    public static int directionId()
    {
        return 9;
    }

    public static int directionSinceVersion()
    {
        return 0;
    }

    public static int directionEncodingOffset()
    {
        return 88;
    }

    public static int directionEncodingLength()
    {
        return 1;
    }

    public static String directionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte directionNullValue()
    {
        return (byte)0;
    }

    public static byte directionMinValue()
    {
        return (byte)32;
    }

    public static byte directionMaxValue()
    {
        return (byte)126;
    }

    public byte direction()
    {
        return buffer.getByte(offset + 88);
    }


    public static int coveredFlagId()
    {
        return 10;
    }

    public static int coveredFlagSinceVersion()
    {
        return 0;
    }

    public static int coveredFlagEncodingOffset()
    {
        return 89;
    }

    public static int coveredFlagEncodingLength()
    {
        return 1;
    }

    public static String coveredFlagMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte coveredFlagNullValue()
    {
        return (byte)0;
    }

    public static byte coveredFlagMinValue()
    {
        return (byte)32;
    }

    public static byte coveredFlagMaxValue()
    {
        return (byte)126;
    }

    public byte coveredFlag()
    {
        return buffer.getByte(offset + 89);
    }


    public static int ownerTypeId()
    {
        return 11;
    }

    public static int ownerTypeSinceVersion()
    {
        return 0;
    }

    public static int ownerTypeEncodingOffset()
    {
        return 90;
    }

    public static int ownerTypeEncodingLength()
    {
        return 1;
    }

    public static String ownerTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte ownerTypeNullValue()
    {
        return (byte)0;
    }

    public static byte ownerTypeMinValue()
    {
        return (byte)32;
    }

    public static byte ownerTypeMaxValue()
    {
        return (byte)126;
    }

    public byte ownerType()
    {
        return buffer.getByte(offset + 90);
    }


    public static int combOffsetFlagId()
    {
        return 12;
    }

    public static int combOffsetFlagSinceVersion()
    {
        return 0;
    }

    public static int combOffsetFlagEncodingOffset()
    {
        return 91;
    }

    public static int combOffsetFlagEncodingLength()
    {
        return 5;
    }

    public static String combOffsetFlagMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte combOffsetFlagNullValue()
    {
        return (byte)0;
    }

    public static byte combOffsetFlagMinValue()
    {
        return (byte)32;
    }

    public static byte combOffsetFlagMaxValue()
    {
        return (byte)126;
    }

    public static int combOffsetFlagLength()
    {
        return 5;
    }

    public byte combOffsetFlag(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 91 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String combOffsetFlagCharacterEncoding()
    {
        return "ASCII";
    }

    public int getCombOffsetFlag(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 91, dst, dstOffset, length);

        return length;
    }

    public String combOffsetFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 91, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int combHedgeFlagId()
    {
        return 13;
    }

    public static int combHedgeFlagSinceVersion()
    {
        return 0;
    }

    public static int combHedgeFlagEncodingOffset()
    {
        return 96;
    }

    public static int combHedgeFlagEncodingLength()
    {
        return 5;
    }

    public static String combHedgeFlagMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte combHedgeFlagNullValue()
    {
        return (byte)0;
    }

    public static byte combHedgeFlagMinValue()
    {
        return (byte)32;
    }

    public static byte combHedgeFlagMaxValue()
    {
        return (byte)126;
    }

    public static int combHedgeFlagLength()
    {
        return 5;
    }

    public byte combHedgeFlag(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 96 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String combHedgeFlagCharacterEncoding()
    {
        return "ASCII";
    }

    public int getCombHedgeFlag(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 96, dst, dstOffset, length);

        return length;
    }

    public String combHedgeFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 96, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int limitPriceId()
    {
        return 14;
    }

    public static int limitPriceSinceVersion()
    {
        return 0;
    }

    public static int limitPriceEncodingOffset()
    {
        return 101;
    }

    public static int limitPriceEncodingLength()
    {
        return 8;
    }

    public static String limitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double limitPriceNullValue()
    {
        return Double.NaN;
    }

    public static double limitPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double limitPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double limitPrice()
    {
        return buffer.getDouble(offset + 101, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int volumeTotalOriginalId()
    {
        return 15;
    }

    public static int volumeTotalOriginalSinceVersion()
    {
        return 0;
    }

    public static int volumeTotalOriginalEncodingOffset()
    {
        return 109;
    }

    public static int volumeTotalOriginalEncodingLength()
    {
        return 4;
    }

    public static String volumeTotalOriginalMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long volumeTotalOriginalNullValue()
    {
        return 4294967294L;
    }

    public static long volumeTotalOriginalMinValue()
    {
        return 0L;
    }

    public static long volumeTotalOriginalMaxValue()
    {
        return 4294967293L;
    }

    public long volumeTotalOriginal()
    {
        return (buffer.getInt(offset + 109, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int timeConditionId()
    {
        return 16;
    }

    public static int timeConditionSinceVersion()
    {
        return 0;
    }

    public static int timeConditionEncodingOffset()
    {
        return 113;
    }

    public static int timeConditionEncodingLength()
    {
        return 1;
    }

    public static String timeConditionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte timeConditionNullValue()
    {
        return (byte)0;
    }

    public static byte timeConditionMinValue()
    {
        return (byte)32;
    }

    public static byte timeConditionMaxValue()
    {
        return (byte)126;
    }

    public byte timeCondition()
    {
        return buffer.getByte(offset + 113);
    }


    public static int volumeConditionId()
    {
        return 17;
    }

    public static int volumeConditionSinceVersion()
    {
        return 0;
    }

    public static int volumeConditionEncodingOffset()
    {
        return 114;
    }

    public static int volumeConditionEncodingLength()
    {
        return 1;
    }

    public static String volumeConditionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte volumeConditionNullValue()
    {
        return (byte)0;
    }

    public static byte volumeConditionMinValue()
    {
        return (byte)32;
    }

    public static byte volumeConditionMaxValue()
    {
        return (byte)126;
    }

    public byte volumeCondition()
    {
        return buffer.getByte(offset + 114);
    }


    public static int minVolumeId()
    {
        return 18;
    }

    public static int minVolumeSinceVersion()
    {
        return 0;
    }

    public static int minVolumeEncodingOffset()
    {
        return 115;
    }

    public static int minVolumeEncodingLength()
    {
        return 4;
    }

    public static String minVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long minVolumeNullValue()
    {
        return 4294967294L;
    }

    public static long minVolumeMinValue()
    {
        return 0L;
    }

    public static long minVolumeMaxValue()
    {
        return 4294967293L;
    }

    public long minVolume()
    {
        return (buffer.getInt(offset + 115, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int contingentConditionId()
    {
        return 19;
    }

    public static int contingentConditionSinceVersion()
    {
        return 0;
    }

    public static int contingentConditionEncodingOffset()
    {
        return 119;
    }

    public static int contingentConditionEncodingLength()
    {
        return 1;
    }

    public static String contingentConditionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte contingentConditionNullValue()
    {
        return (byte)0;
    }

    public static byte contingentConditionMinValue()
    {
        return (byte)32;
    }

    public static byte contingentConditionMaxValue()
    {
        return (byte)126;
    }

    public byte contingentCondition()
    {
        return buffer.getByte(offset + 119);
    }


    public static int stopPriceId()
    {
        return 20;
    }

    public static int stopPriceSinceVersion()
    {
        return 0;
    }

    public static int stopPriceEncodingOffset()
    {
        return 120;
    }

    public static int stopPriceEncodingLength()
    {
        return 8;
    }

    public static String stopPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double stopPriceNullValue()
    {
        return Double.NaN;
    }

    public static double stopPriceMinValue()
    {
        return 4.9E-324d;
    }

    public static double stopPriceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double stopPrice()
    {
        return buffer.getDouble(offset + 120, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int requestIDId()
    {
        return 21;
    }

    public static int requestIDSinceVersion()
    {
        return 0;
    }

    public static int requestIDEncodingOffset()
    {
        return 128;
    }

    public static int requestIDEncodingLength()
    {
        return 4;
    }

    public static String requestIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long requestIDNullValue()
    {
        return 4294967294L;
    }

    public static long requestIDMinValue()
    {
        return 0L;
    }

    public static long requestIDMaxValue()
    {
        return 4294967293L;
    }

    public long requestID()
    {
        return (buffer.getInt(offset + 128, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int thirdReffId()
    {
        return 22;
    }

    public static int thirdReffSinceVersion()
    {
        return 0;
    }

    public static int thirdReffEncodingOffset()
    {
        return 132;
    }

    public static int thirdReffEncodingLength()
    {
        return 4;
    }

    public static String thirdReffMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long thirdReffNullValue()
    {
        return 4294967294L;
    }

    public static long thirdReffMinValue()
    {
        return 0L;
    }

    public static long thirdReffMaxValue()
    {
        return 4294967293L;
    }

    public long thirdReff()
    {
        return (buffer.getInt(offset + 132, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[OrderReq_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='InvestorID', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='INVESTORID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("investorID=");
        for (int i = 0; i < investorIDLength() && investorID(i) > 0; i++)
        {
            builder.append((char)investorID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OptSubInvestorID', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=15, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='OPTSUBINVESTORID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=15, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("optSubInvestorID=");
        for (int i = 0; i < optSubInvestorIDLength() && optSubInvestorID(i) > 0; i++)
        {
            builder.append((char)optSubInvestorID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BusinessUnit', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=24, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BUSINESSUNIT_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=24, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("businessUnit=");
        for (int i = 0; i < businessUnitLength() && businessUnit(i) > 0; i++)
        {
            builder.append((char)businessUnit(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BranchID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=30, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BRANCHID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=30, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("branchID=");
        for (int i = 0; i < branchIDLength() && branchID(i) > 0; i++)
        {
            builder.append((char)branchID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InstrumentID', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=0, offset=36, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='INSTRUMENTID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=31, offset=36, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("instrumentID=");
        for (int i = 0; i < instrumentIDLength() && instrumentID(i) > 0; i++)
        {
            builder.append((char)instrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderRef', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=67, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERREF_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=67, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderRef=");
        for (int i = 0; i < orderRefLength() && orderRef(i) > 0; i++)
        {
            builder.append((char)orderRef(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ExchangeID', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=78, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='EXCHANGEID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=78, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("exchangeID=");
        for (int i = 0; i < exchangeIDLength() && exchangeID(i) > 0; i++)
        {
            builder.append((char)exchangeID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderPriceType', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=0, offset=87, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=87, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderPriceType=");
        builder.append(orderPriceType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Direction', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=0, offset=88, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=88, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("direction=");
        builder.append(direction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CoveredFlag', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=89, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=89, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("coveredFlag=");
        builder.append(coveredFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OwnerType', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=90, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=90, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("ownerType=");
        builder.append(ownerType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CombOffsetFlag', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=91, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='COMBOFFSETFLAG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=91, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("combOffsetFlag=");
        for (int i = 0; i < combOffsetFlagLength() && combOffsetFlag(i) > 0; i++)
        {
            builder.append((char)combOffsetFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CombHedgeFlag', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=96, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='COMBHEDGEFLAG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=96, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("combHedgeFlag=");
        for (int i = 0; i < combHedgeFlagLength() && combHedgeFlag(i) > 0; i++)
        {
            builder.append((char)combHedgeFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LimitPrice', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=0, offset=101, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=101, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("limitPrice=");
        builder.append(limitPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='VolumeTotalOriginal', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=0, offset=109, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=109, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volumeTotalOriginal=");
        builder.append(volumeTotalOriginal());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TimeCondition', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=0, offset=113, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=113, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("timeCondition=");
        builder.append(timeCondition());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='VolumeCondition', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=0, offset=114, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=114, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volumeCondition=");
        builder.append(volumeCondition());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinVolume', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=0, offset=115, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=115, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("minVolume=");
        builder.append(minVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ContingentCondition', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=0, offset=119, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=119, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("contingentCondition=");
        builder.append(contingentCondition());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StopPrice', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=0, offset=120, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=120, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("stopPrice=");
        builder.append(stopPrice());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='RequestID', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=0, offset=128, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=128, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("requestID=");
        builder.append(requestID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ThirdReff', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=0, offset=132, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=132, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("thirdReff=");
        builder.append(thirdReff());

        limit(originalLimit);

        return builder;
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.Order_InDecoder"})
@SuppressWarnings("all")
public class Order_InDecoder
{
    public static final int BLOCK_LENGTH = 330;
    public static final int TEMPLATE_ID = 5;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final Order_InDecoder parentMessage = this;
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

    public Order_InDecoder wrap(
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


    public static int combOffsetFlagId()
    {
        return 10;
    }

    public static int combOffsetFlagSinceVersion()
    {
        return 0;
    }

    public static int combOffsetFlagEncodingOffset()
    {
        return 89;
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

        final int pos = this.offset + 89 + (index * 1);

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

        buffer.getBytes(this.offset + 89, dst, dstOffset, length);

        return length;
    }

    public String combOffsetFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 89, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int combHedgeFlagId()
    {
        return 11;
    }

    public static int combHedgeFlagSinceVersion()
    {
        return 0;
    }

    public static int combHedgeFlagEncodingOffset()
    {
        return 94;
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

        final int pos = this.offset + 94 + (index * 1);

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

        buffer.getBytes(this.offset + 94, dst, dstOffset, length);

        return length;
    }

    public String combHedgeFlag()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(this.offset + 94, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int coveredFlagId()
    {
        return 12;
    }

    public static int coveredFlagSinceVersion()
    {
        return 0;
    }

    public static int coveredFlagEncodingOffset()
    {
        return 99;
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
        return buffer.getByte(offset + 99);
    }


    public static int ownerTypeId()
    {
        return 13;
    }

    public static int ownerTypeSinceVersion()
    {
        return 0;
    }

    public static int ownerTypeEncodingOffset()
    {
        return 100;
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
        return buffer.getByte(offset + 100);
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
        return (buffer.getInt(offset + 109, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
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
        return (buffer.getInt(offset + 115, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
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
        return (buffer.getInt(offset + 128, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int orderLocalIDId()
    {
        return 22;
    }

    public static int orderLocalIDSinceVersion()
    {
        return 0;
    }

    public static int orderLocalIDEncodingOffset()
    {
        return 132;
    }

    public static int orderLocalIDEncodingLength()
    {
        return 13;
    }

    public static String orderLocalIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte orderLocalID(final int index)
    {
        if (index < 0 || index >= 13)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 132 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String orderLocalIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOrderLocalID(final byte[] dst, final int dstOffset)
    {
        final int length = 13;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 132, dst, dstOffset, length);

        return length;
    }

    public String orderLocalID()
    {
        final byte[] dst = new byte[13];
        buffer.getBytes(this.offset + 132, dst, 0, 13);

        int end = 0;
        for (; end < 13 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderSubmitStatusId()
    {
        return 23;
    }

    public static int orderSubmitStatusSinceVersion()
    {
        return 0;
    }

    public static int orderSubmitStatusEncodingOffset()
    {
        return 145;
    }

    public static int orderSubmitStatusEncodingLength()
    {
        return 1;
    }

    public static String orderSubmitStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte orderSubmitStatusNullValue()
    {
        return (byte)0;
    }

    public static byte orderSubmitStatusMinValue()
    {
        return (byte)32;
    }

    public static byte orderSubmitStatusMaxValue()
    {
        return (byte)126;
    }

    public byte orderSubmitStatus()
    {
        return buffer.getByte(offset + 145);
    }


    public static int orderSysIDId()
    {
        return 24;
    }

    public static int orderSysIDSinceVersion()
    {
        return 0;
    }

    public static int orderSysIDEncodingOffset()
    {
        return 146;
    }

    public static int orderSysIDEncodingLength()
    {
        return 17;
    }

    public static String orderSysIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte orderSysID(final int index)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 146 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String orderSysIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOrderSysID(final byte[] dst, final int dstOffset)
    {
        final int length = 17;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 146, dst, dstOffset, length);

        return length;
    }

    public String orderSysID()
    {
        final byte[] dst = new byte[17];
        buffer.getBytes(this.offset + 146, dst, 0, 17);

        int end = 0;
        for (; end < 17 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderStatusId()
    {
        return 25;
    }

    public static int orderStatusSinceVersion()
    {
        return 0;
    }

    public static int orderStatusEncodingOffset()
    {
        return 163;
    }

    public static int orderStatusEncodingLength()
    {
        return 1;
    }

    public static String orderStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte orderStatusNullValue()
    {
        return (byte)0;
    }

    public static byte orderStatusMinValue()
    {
        return (byte)32;
    }

    public static byte orderStatusMaxValue()
    {
        return (byte)126;
    }

    public byte orderStatus()
    {
        return buffer.getByte(offset + 163);
    }


    public static int orderTypeId()
    {
        return 26;
    }

    public static int orderTypeSinceVersion()
    {
        return 0;
    }

    public static int orderTypeEncodingOffset()
    {
        return 164;
    }

    public static int orderTypeEncodingLength()
    {
        return 1;
    }

    public static String orderTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte orderTypeNullValue()
    {
        return (byte)0;
    }

    public static byte orderTypeMinValue()
    {
        return (byte)32;
    }

    public static byte orderTypeMaxValue()
    {
        return (byte)126;
    }

    public byte orderType()
    {
        return buffer.getByte(offset + 164);
    }


    public static int volumeTradedId()
    {
        return 27;
    }

    public static int volumeTradedSinceVersion()
    {
        return 0;
    }

    public static int volumeTradedEncodingOffset()
    {
        return 165;
    }

    public static int volumeTradedEncodingLength()
    {
        return 4;
    }

    public static String volumeTradedMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long volumeTradedNullValue()
    {
        return 4294967294L;
    }

    public static long volumeTradedMinValue()
    {
        return 0L;
    }

    public static long volumeTradedMaxValue()
    {
        return 4294967293L;
    }

    public long volumeTraded()
    {
        return (buffer.getInt(offset + 165, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int amountTradedId()
    {
        return 28;
    }

    public static int amountTradedSinceVersion()
    {
        return 0;
    }

    public static int amountTradedEncodingOffset()
    {
        return 169;
    }

    public static int amountTradedEncodingLength()
    {
        return 8;
    }

    public static String amountTradedMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double amountTradedNullValue()
    {
        return Double.NaN;
    }

    public static double amountTradedMinValue()
    {
        return 4.9E-324d;
    }

    public static double amountTradedMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double amountTraded()
    {
        return buffer.getDouble(offset + 169, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int volumeRemainId()
    {
        return 29;
    }

    public static int volumeRemainSinceVersion()
    {
        return 0;
    }

    public static int volumeRemainEncodingOffset()
    {
        return 177;
    }

    public static int volumeRemainEncodingLength()
    {
        return 4;
    }

    public static String volumeRemainMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static long volumeRemainNullValue()
    {
        return 4294967294L;
    }

    public static long volumeRemainMinValue()
    {
        return 0L;
    }

    public static long volumeRemainMaxValue()
    {
        return 4294967293L;
    }

    public long volumeRemain()
    {
        return (buffer.getInt(offset + 177, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int insertDateId()
    {
        return 30;
    }

    public static int insertDateSinceVersion()
    {
        return 0;
    }

    public static int insertDateEncodingOffset()
    {
        return 181;
    }

    public static int insertDateEncodingLength()
    {
        return 9;
    }

    public static String insertDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte insertDateNullValue()
    {
        return (byte)0;
    }

    public static byte insertDateMinValue()
    {
        return (byte)32;
    }

    public static byte insertDateMaxValue()
    {
        return (byte)126;
    }

    public static int insertDateLength()
    {
        return 9;
    }

    public byte insertDate(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 181 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String insertDateCharacterEncoding()
    {
        return "ASCII";
    }

    public int getInsertDate(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 181, dst, dstOffset, length);

        return length;
    }

    public String insertDate()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 181, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int insertTimeId()
    {
        return 31;
    }

    public static int insertTimeSinceVersion()
    {
        return 0;
    }

    public static int insertTimeEncodingOffset()
    {
        return 190;
    }

    public static int insertTimeEncodingLength()
    {
        return 9;
    }

    public static String insertTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte insertTimeNullValue()
    {
        return (byte)0;
    }

    public static byte insertTimeMinValue()
    {
        return (byte)32;
    }

    public static byte insertTimeMaxValue()
    {
        return (byte)126;
    }

    public static int insertTimeLength()
    {
        return 9;
    }

    public byte insertTime(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 190 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String insertTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public int getInsertTime(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 190, dst, dstOffset, length);

        return length;
    }

    public String insertTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 190, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int updateTimeId()
    {
        return 32;
    }

    public static int updateTimeSinceVersion()
    {
        return 0;
    }

    public static int updateTimeEncodingOffset()
    {
        return 199;
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

        final int pos = this.offset + 199 + (index * 1);

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

        buffer.getBytes(this.offset + 199, dst, dstOffset, length);

        return length;
    }

    public String updateTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 199, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int cancelTimeId()
    {
        return 33;
    }

    public static int cancelTimeSinceVersion()
    {
        return 0;
    }

    public static int cancelTimeEncodingOffset()
    {
        return 208;
    }

    public static int cancelTimeEncodingLength()
    {
        return 9;
    }

    public static String cancelTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte cancelTimeNullValue()
    {
        return (byte)0;
    }

    public static byte cancelTimeMinValue()
    {
        return (byte)32;
    }

    public static byte cancelTimeMaxValue()
    {
        return (byte)126;
    }

    public static int cancelTimeLength()
    {
        return 9;
    }

    public byte cancelTime(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 208 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String cancelTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public int getCancelTime(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 208, dst, dstOffset, length);

        return length;
    }

    public String cancelTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 208, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int frontIDId()
    {
        return 34;
    }

    public static int frontIDSinceVersion()
    {
        return 0;
    }

    public static int frontIDEncodingOffset()
    {
        return 217;
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
        return (buffer.getInt(offset + 217, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int sessionIDId()
    {
        return 35;
    }

    public static int sessionIDSinceVersion()
    {
        return 0;
    }

    public static int sessionIDEncodingOffset()
    {
        return 221;
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
        return (buffer.getInt(offset + 221, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int orderActionRefId()
    {
        return 36;
    }

    public static int orderActionRefSinceVersion()
    {
        return 0;
    }

    public static int orderActionRefEncodingOffset()
    {
        return 225;
    }

    public static int orderActionRefEncodingLength()
    {
        return 11;
    }

    public static String orderActionRefMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte orderActionRefNullValue()
    {
        return (byte)0;
    }

    public static byte orderActionRefMinValue()
    {
        return (byte)32;
    }

    public static byte orderActionRefMaxValue()
    {
        return (byte)126;
    }

    public static int orderActionRefLength()
    {
        return 11;
    }

    public byte orderActionRef(final int index)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 225 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String orderActionRefCharacterEncoding()
    {
        return "ASCII";
    }

    public int getOrderActionRef(final byte[] dst, final int dstOffset)
    {
        final int length = 11;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 225, dst, dstOffset, length);

        return length;
    }

    public String orderActionRef()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 225, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int statusMsgId()
    {
        return 37;
    }

    public static int statusMsgSinceVersion()
    {
        return 0;
    }

    public static int statusMsgEncodingOffset()
    {
        return 236;
    }

    public static int statusMsgEncodingLength()
    {
        return 81;
    }

    public static String statusMsgMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte statusMsgNullValue()
    {
        return (byte)0;
    }

    public static byte statusMsgMinValue()
    {
        return (byte)32;
    }

    public static byte statusMsgMaxValue()
    {
        return (byte)126;
    }

    public static int statusMsgLength()
    {
        return 81;
    }

    public byte statusMsg(final int index)
    {
        if (index < 0 || index >= 81)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 236 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String statusMsgCharacterEncoding()
    {
        return "ASCII";
    }

    public int getStatusMsg(final byte[] dst, final int dstOffset)
    {
        final int length = 81;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 236, dst, dstOffset, length);

        return length;
    }

    public String statusMsg()
    {
        final byte[] dst = new byte[81];
        buffer.getBytes(this.offset + 236, dst, 0, 81);

        int end = 0;
        for (; end < 81 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int thirdReffId()
    {
        return 38;
    }

    public static int thirdReffSinceVersion()
    {
        return 0;
    }

    public static int thirdReffEncodingOffset()
    {
        return 317;
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
        return (buffer.getInt(offset + 317, java.nio.ByteOrder.LITTLE_ENDIAN)/* & 0xFFFF_FFFFL*/);
    }


    public static int tradingDayId()
    {
        return 39;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 321;
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

        final int pos = this.offset + 321 + (index * 1);

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

        buffer.getBytes(this.offset + 321, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 321, dst, 0, 9);

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
        builder.append("[Order_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='CombOffsetFlag', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=89, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='COMBOFFSETFLAG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=89, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("combOffsetFlag=");
        for (int i = 0; i < combOffsetFlagLength() && combOffsetFlag(i) > 0; i++)
        {
            builder.append((char)combOffsetFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CombHedgeFlag', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=94, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='COMBHEDGEFLAG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=5, offset=94, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("combHedgeFlag=");
        for (int i = 0; i < combHedgeFlagLength() && combHedgeFlag(i) > 0; i++)
        {
            builder.append((char)combHedgeFlag(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CoveredFlag', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=99, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=99, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("coveredFlag=");
        builder.append(coveredFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OwnerType', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=100, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=100, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("ownerType=");
        builder.append(ownerType());
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
        //Token{signal=BEGIN_FIELD, name='OrderLocalID', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=0, offset=132, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERLOCALID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=13, offset=132, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderLocalID=");
        for (int i = 0; i < orderLocalIDLength() && orderLocalID(i) > 0; i++)
        {
            builder.append((char)orderLocalID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderSubmitStatus', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=0, offset=145, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=145, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderSubmitStatus=");
        builder.append(orderSubmitStatus());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderSysID', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=0, offset=146, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERSYSID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=17, offset=146, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderSysID=");
        for (int i = 0; i < orderSysIDLength() && orderSysID(i) > 0; i++)
        {
            builder.append((char)orderSysID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderStatus', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=0, offset=163, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=163, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderStatus=");
        builder.append(orderStatus());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderType', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=0, offset=164, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=164, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderType=");
        builder.append(orderType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='VolumeTraded', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=0, offset=165, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=165, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volumeTraded=");
        builder.append(volumeTraded());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AmountTraded', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=0, offset=169, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=169, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("amountTraded=");
        builder.append(amountTraded());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='VolumeRemain', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=0, offset=177, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=177, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volumeRemain=");
        builder.append(volumeRemain());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InsertDate', referencedName='null', description='null', id=30, version=0, deprecated=0, encodedLength=0, offset=181, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=181, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("insertDate=");
        for (int i = 0; i < insertDateLength() && insertDate(i) > 0; i++)
        {
            builder.append((char)insertDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InsertTime', referencedName='null', description='null', id=31, version=0, deprecated=0, encodedLength=0, offset=190, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=190, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("insertTime=");
        for (int i = 0; i < insertTimeLength() && insertTime(i) > 0; i++)
        {
            builder.append((char)insertTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UpdateTime', referencedName='null', description='null', id=32, version=0, deprecated=0, encodedLength=0, offset=199, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=199, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("updateTime=");
        for (int i = 0; i < updateTimeLength() && updateTime(i) > 0; i++)
        {
            builder.append((char)updateTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CancelTime', referencedName='null', description='null', id=33, version=0, deprecated=0, encodedLength=0, offset=208, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=208, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("cancelTime=");
        for (int i = 0; i < cancelTimeLength() && cancelTime(i) > 0; i++)
        {
            builder.append((char)cancelTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='FrontID', referencedName='null', description='null', id=34, version=0, deprecated=0, encodedLength=0, offset=217, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=217, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("frontID=");
        builder.append(frontID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SessionID', referencedName='null', description='null', id=35, version=0, deprecated=0, encodedLength=0, offset=221, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=221, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("sessionID=");
        builder.append(sessionID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderActionRef', referencedName='null', description='null', id=36, version=0, deprecated=0, encodedLength=0, offset=225, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERACTIONREF_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=225, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderActionRef=");
        for (int i = 0; i < orderActionRefLength() && orderActionRef(i) > 0; i++)
        {
            builder.append((char)orderActionRef(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StatusMsg', referencedName='null', description='null', id=37, version=0, deprecated=0, encodedLength=0, offset=236, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='STATUSMSG_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=81, offset=236, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("statusMsg=");
        for (int i = 0; i < statusMsgLength() && statusMsg(i) > 0; i++)
        {
            builder.append((char)statusMsg(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ThirdReff', referencedName='null', description='null', id=38, version=0, deprecated=0, encodedLength=0, offset=317, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=317, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("thirdReff=");
        builder.append(thirdReff());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=39, version=0, deprecated=0, encodedLength=0, offset=321, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=321, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }

        limit(originalLimit);

        return builder;
    }
}

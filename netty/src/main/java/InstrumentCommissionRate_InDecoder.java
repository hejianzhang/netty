/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.InstrumentCommissionRate_InDecoder"})
@SuppressWarnings("all")
public class InstrumentCommissionRate_InDecoder
{
    public static final int BLOCK_LENGTH = 267;
    public static final int TEMPLATE_ID = 3;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final InstrumentCommissionRate_InDecoder parentMessage = this;
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

    public InstrumentCommissionRate_InDecoder wrap(
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

    public static int exchangeIDId()
    {
        return 1;
    }

    public static int exchangeIDSinceVersion()
    {
        return 0;
    }

    public static int exchangeIDEncodingOffset()
    {
        return 0;
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

        final int pos = this.offset + 0 + (index * 1);

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

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String exchangeID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 0, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int instrumentIDId()
    {
        return 2;
    }

    public static int instrumentIDSinceVersion()
    {
        return 0;
    }

    public static int instrumentIDEncodingOffset()
    {
        return 9;
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

        final int pos = this.offset + 9 + (index * 1);

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

        buffer.getBytes(this.offset + 9, dst, dstOffset, length);

        return length;
    }

    public String instrumentID()
    {
        final byte[] dst = new byte[31];
        buffer.getBytes(this.offset + 9, dst, 0, 31);

        int end = 0;
        for (; end < 31 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int investorRangeId()
    {
        return 3;
    }

    public static int investorRangeSinceVersion()
    {
        return 0;
    }

    public static int investorRangeEncodingOffset()
    {
        return 40;
    }

    public static int investorRangeEncodingLength()
    {
        return 1;
    }

    public static String investorRangeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte investorRangeNullValue()
    {
        return (byte)0;
    }

    public static byte investorRangeMinValue()
    {
        return (byte)32;
    }

    public static byte investorRangeMaxValue()
    {
        return (byte)126;
    }

    public byte investorRange()
    {
        return buffer.getByte(offset + 40);
    }


    public static int brokerIDId()
    {
        return 4;
    }

    public static int brokerIDSinceVersion()
    {
        return 0;
    }

    public static int brokerIDEncodingOffset()
    {
        return 41;
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

        final int pos = this.offset + 41 + (index * 1);

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

        buffer.getBytes(this.offset + 41, dst, dstOffset, length);

        return length;
    }

    public String brokerID()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 41, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int providerIDId()
    {
        return 5;
    }

    public static int providerIDSinceVersion()
    {
        return 0;
    }

    public static int providerIDEncodingOffset()
    {
        return 52;
    }

    public static int providerIDEncodingLength()
    {
        return 11;
    }

    public static String providerIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte providerIDNullValue()
    {
        return (byte)0;
    }

    public static byte providerIDMinValue()
    {
        return (byte)32;
    }

    public static byte providerIDMaxValue()
    {
        return (byte)126;
    }

    public static int providerIDLength()
    {
        return 11;
    }

    public byte providerID(final int index)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 52 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String providerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getProviderID(final byte[] dst, final int dstOffset)
    {
        final int length = 11;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 52, dst, dstOffset, length);

        return length;
    }

    public String providerID()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 52, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int brokerInvestorIDId()
    {
        return 6;
    }

    public static int brokerInvestorIDSinceVersion()
    {
        return 0;
    }

    public static int brokerInvestorIDEncodingOffset()
    {
        return 63;
    }

    public static int brokerInvestorIDEncodingLength()
    {
        return 33;
    }

    public static String brokerInvestorIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte brokerInvestorIDNullValue()
    {
        return (byte)0;
    }

    public static byte brokerInvestorIDMinValue()
    {
        return (byte)32;
    }

    public static byte brokerInvestorIDMaxValue()
    {
        return (byte)126;
    }

    public static int brokerInvestorIDLength()
    {
        return 33;
    }

    public byte brokerInvestorID(final int index)
    {
        if (index < 0 || index >= 33)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 63 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String brokerInvestorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getBrokerInvestorID(final byte[] dst, final int dstOffset)
    {
        final int length = 33;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 63, dst, dstOffset, length);

        return length;
    }

    public String brokerInvestorID()
    {
        final byte[] dst = new byte[33];
        buffer.getBytes(this.offset + 63, dst, 0, 33);

        int end = 0;
        for (; end < 33 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int directionId()
    {
        return 7;
    }

    public static int directionSinceVersion()
    {
        return 0;
    }

    public static int directionEncodingOffset()
    {
        return 96;
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
        return buffer.getByte(offset + 96);
    }


    public static int offsetFlagId()
    {
        return 8;
    }

    public static int offsetFlagSinceVersion()
    {
        return 0;
    }

    public static int offsetFlagEncodingOffset()
    {
        return 97;
    }

    public static int offsetFlagEncodingLength()
    {
        return 1;
    }

    public static String offsetFlagMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static byte offsetFlagNullValue()
    {
        return (byte)0;
    }

    public static byte offsetFlagMinValue()
    {
        return (byte)32;
    }

    public static byte offsetFlagMaxValue()
    {
        return (byte)126;
    }

    public byte offsetFlag()
    {
        return buffer.getByte(offset + 97);
    }


    public static int stampTaxRateByMoneyId()
    {
        return 9;
    }

    public static int stampTaxRateByMoneySinceVersion()
    {
        return 0;
    }

    public static int stampTaxRateByMoneyEncodingOffset()
    {
        return 98;
    }

    public static int stampTaxRateByMoneyEncodingLength()
    {
        return 8;
    }

    public static String stampTaxRateByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double stampTaxRateByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double stampTaxRateByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double stampTaxRateByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double stampTaxRateByMoney()
    {
        return buffer.getDouble(offset + 98, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int stampTaxRateByVolumeId()
    {
        return 10;
    }

    public static int stampTaxRateByVolumeSinceVersion()
    {
        return 0;
    }

    public static int stampTaxRateByVolumeEncodingOffset()
    {
        return 106;
    }

    public static int stampTaxRateByVolumeEncodingLength()
    {
        return 8;
    }

    public static String stampTaxRateByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double stampTaxRateByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double stampTaxRateByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double stampTaxRateByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double stampTaxRateByVolume()
    {
        return buffer.getDouble(offset + 106, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int transferFeeRateByMoneyId()
    {
        return 11;
    }

    public static int transferFeeRateByMoneySinceVersion()
    {
        return 0;
    }

    public static int transferFeeRateByMoneyEncodingOffset()
    {
        return 114;
    }

    public static int transferFeeRateByMoneyEncodingLength()
    {
        return 8;
    }

    public static String transferFeeRateByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double transferFeeRateByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double transferFeeRateByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double transferFeeRateByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double transferFeeRateByMoney()
    {
        return buffer.getDouble(offset + 114, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int transferFeeRateByVolumeId()
    {
        return 12;
    }

    public static int transferFeeRateByVolumeSinceVersion()
    {
        return 0;
    }

    public static int transferFeeRateByVolumeEncodingOffset()
    {
        return 122;
    }

    public static int transferFeeRateByVolumeEncodingLength()
    {
        return 8;
    }

    public static String transferFeeRateByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double transferFeeRateByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double transferFeeRateByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double transferFeeRateByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double transferFeeRateByVolume()
    {
        return buffer.getDouble(offset + 122, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int handlingFeeByMoneyId()
    {
        return 13;
    }

    public static int handlingFeeByMoneySinceVersion()
    {
        return 0;
    }

    public static int handlingFeeByMoneyEncodingOffset()
    {
        return 130;
    }

    public static int handlingFeeByMoneyEncodingLength()
    {
        return 8;
    }

    public static String handlingFeeByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double handlingFeeByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double handlingFeeByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double handlingFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double handlingFeeByMoney()
    {
        return buffer.getDouble(offset + 130, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int handlingFeeByVolumeId()
    {
        return 14;
    }

    public static int handlingFeeByVolumeSinceVersion()
    {
        return 0;
    }

    public static int handlingFeeByVolumeEncodingOffset()
    {
        return 138;
    }

    public static int handlingFeeByVolumeEncodingLength()
    {
        return 8;
    }

    public static String handlingFeeByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double handlingFeeByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double handlingFeeByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double handlingFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double handlingFeeByVolume()
    {
        return buffer.getDouble(offset + 138, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int adminFeeByMoneyId()
    {
        return 15;
    }

    public static int adminFeeByMoneySinceVersion()
    {
        return 0;
    }

    public static int adminFeeByMoneyEncodingOffset()
    {
        return 146;
    }

    public static int adminFeeByMoneyEncodingLength()
    {
        return 8;
    }

    public static String adminFeeByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double adminFeeByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double adminFeeByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double adminFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double adminFeeByMoney()
    {
        return buffer.getDouble(offset + 146, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int adminFeeByVolumeId()
    {
        return 16;
    }

    public static int adminFeeByVolumeSinceVersion()
    {
        return 0;
    }

    public static int adminFeeByVolumeEncodingOffset()
    {
        return 154;
    }

    public static int adminFeeByVolumeEncodingLength()
    {
        return 8;
    }

    public static String adminFeeByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double adminFeeByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double adminFeeByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double adminFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double adminFeeByVolume()
    {
        return buffer.getDouble(offset + 154, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradeFeeByMoneyId()
    {
        return 17;
    }

    public static int tradeFeeByMoneySinceVersion()
    {
        return 0;
    }

    public static int tradeFeeByMoneyEncodingOffset()
    {
        return 162;
    }

    public static int tradeFeeByMoneyEncodingLength()
    {
        return 8;
    }

    public static String tradeFeeByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double tradeFeeByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double tradeFeeByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double tradeFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double tradeFeeByMoney()
    {
        return buffer.getDouble(offset + 162, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradeFeeByVolumeId()
    {
        return 18;
    }

    public static int tradeFeeByVolumeSinceVersion()
    {
        return 0;
    }

    public static int tradeFeeByVolumeEncodingOffset()
    {
        return 170;
    }

    public static int tradeFeeByVolumeEncodingLength()
    {
        return 8;
    }

    public static String tradeFeeByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double tradeFeeByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double tradeFeeByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double tradeFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double tradeFeeByVolume()
    {
        return buffer.getDouble(offset + 170, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int clearingFeeByMoneyId()
    {
        return 19;
    }

    public static int clearingFeeByMoneySinceVersion()
    {
        return 0;
    }

    public static int clearingFeeByMoneyEncodingOffset()
    {
        return 178;
    }

    public static int clearingFeeByMoneyEncodingLength()
    {
        return 8;
    }

    public static String clearingFeeByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double clearingFeeByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double clearingFeeByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double clearingFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double clearingFeeByMoney()
    {
        return buffer.getDouble(offset + 178, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int clearingFeeByVolumeId()
    {
        return 20;
    }

    public static int clearingFeeByVolumeSinceVersion()
    {
        return 0;
    }

    public static int clearingFeeByVolumeEncodingOffset()
    {
        return 186;
    }

    public static int clearingFeeByVolumeEncodingLength()
    {
        return 8;
    }

    public static String clearingFeeByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double clearingFeeByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double clearingFeeByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double clearingFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double clearingFeeByVolume()
    {
        return buffer.getDouble(offset + 186, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int otherFeeByVolumeId()
    {
        return 21;
    }

    public static int otherFeeByVolumeSinceVersion()
    {
        return 0;
    }

    public static int otherFeeByVolumeEncodingOffset()
    {
        return 194;
    }

    public static int otherFeeByVolumeEncodingLength()
    {
        return 8;
    }

    public static String otherFeeByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double otherFeeByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double otherFeeByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double otherFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double otherFeeByVolume()
    {
        return buffer.getDouble(offset + 194, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int otherFeeByMoneyId()
    {
        return 22;
    }

    public static int otherFeeByMoneySinceVersion()
    {
        return 0;
    }

    public static int otherFeeByMoneyEncodingOffset()
    {
        return 202;
    }

    public static int otherFeeByMoneyEncodingLength()
    {
        return 8;
    }

    public static String otherFeeByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double otherFeeByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double otherFeeByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double otherFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double otherFeeByMoney()
    {
        return buffer.getDouble(offset + 202, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int closeRatioByMoneyId()
    {
        return 23;
    }

    public static int closeRatioByMoneySinceVersion()
    {
        return 0;
    }

    public static int closeRatioByMoneyEncodingOffset()
    {
        return 210;
    }

    public static int closeRatioByMoneyEncodingLength()
    {
        return 8;
    }

    public static String closeRatioByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double closeRatioByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double closeRatioByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double closeRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double closeRatioByMoney()
    {
        return buffer.getDouble(offset + 210, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int closeRatioByVolumeId()
    {
        return 24;
    }

    public static int closeRatioByVolumeSinceVersion()
    {
        return 0;
    }

    public static int closeRatioByVolumeEncodingOffset()
    {
        return 218;
    }

    public static int closeRatioByVolumeEncodingLength()
    {
        return 8;
    }

    public static String closeRatioByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double closeRatioByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double closeRatioByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double closeRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double closeRatioByVolume()
    {
        return buffer.getDouble(offset + 218, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int closeTodayRatioByMoneyId()
    {
        return 25;
    }

    public static int closeTodayRatioByMoneySinceVersion()
    {
        return 0;
    }

    public static int closeTodayRatioByMoneyEncodingOffset()
    {
        return 226;
    }

    public static int closeTodayRatioByMoneyEncodingLength()
    {
        return 8;
    }

    public static String closeTodayRatioByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double closeTodayRatioByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double closeTodayRatioByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double closeTodayRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double closeTodayRatioByMoney()
    {
        return buffer.getDouble(offset + 226, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int closeTodayRatioByVolumeId()
    {
        return 26;
    }

    public static int closeTodayRatioByVolumeSinceVersion()
    {
        return 0;
    }

    public static int closeTodayRatioByVolumeEncodingOffset()
    {
        return 234;
    }

    public static int closeTodayRatioByVolumeEncodingLength()
    {
        return 8;
    }

    public static String closeTodayRatioByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double closeTodayRatioByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double closeTodayRatioByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double closeTodayRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double closeTodayRatioByVolume()
    {
        return buffer.getDouble(offset + 234, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int openRatioByMoneyId()
    {
        return 27;
    }

    public static int openRatioByMoneySinceVersion()
    {
        return 0;
    }

    public static int openRatioByMoneyEncodingOffset()
    {
        return 242;
    }

    public static int openRatioByMoneyEncodingLength()
    {
        return 8;
    }

    public static String openRatioByMoneyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double openRatioByMoneyNullValue()
    {
        return Double.NaN;
    }

    public static double openRatioByMoneyMinValue()
    {
        return 4.9E-324d;
    }

    public static double openRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double openRatioByMoney()
    {
        return buffer.getDouble(offset + 242, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int openRatioByVolumeId()
    {
        return 28;
    }

    public static int openRatioByVolumeSinceVersion()
    {
        return 0;
    }

    public static int openRatioByVolumeEncodingOffset()
    {
        return 250;
    }

    public static int openRatioByVolumeEncodingLength()
    {
        return 8;
    }

    public static String openRatioByVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
    }

    public static double openRatioByVolumeNullValue()
    {
        return Double.NaN;
    }

    public static double openRatioByVolumeMinValue()
    {
        return 4.9E-324d;
    }

    public static double openRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public double openRatioByVolume()
    {
        return buffer.getDouble(offset + 250, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradingDayId()
    {
        return 29;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 258;
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

        final int pos = this.offset + 258 + (index * 1);

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

        buffer.getBytes(this.offset + 258, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 258, dst, 0, 9);

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
        builder.append("[InstrumentCommissionRate_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='ExchangeID', referencedName='null', description='null', id=1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='EXCHANGEID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("exchangeID=");
        for (int i = 0; i < exchangeIDLength() && exchangeID(i) > 0; i++)
        {
            builder.append((char)exchangeID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InstrumentID', referencedName='null', description='null', id=2, version=0, deprecated=0, encodedLength=0, offset=9, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='INSTRUMENTID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=31, offset=9, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("instrumentID=");
        for (int i = 0; i < instrumentIDLength() && instrumentID(i) > 0; i++)
        {
            builder.append((char)instrumentID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='InvestorRange', referencedName='null', description='null', id=3, version=0, deprecated=0, encodedLength=0, offset=40, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=40, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("investorRange=");
        builder.append(investorRange());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BrokerID', referencedName='null', description='null', id=4, version=0, deprecated=0, encodedLength=0, offset=41, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BROKERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=41, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("brokerID=");
        for (int i = 0; i < brokerIDLength() && brokerID(i) > 0; i++)
        {
            builder.append((char)brokerID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ProviderID', referencedName='null', description='null', id=5, version=0, deprecated=0, encodedLength=0, offset=52, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='PROVIDERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=52, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("providerID=");
        for (int i = 0; i < providerIDLength() && providerID(i) > 0; i++)
        {
            builder.append((char)providerID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='BrokerInvestorID', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=63, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='BROKERINVESTORID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=33, offset=63, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("brokerInvestorID=");
        for (int i = 0; i < brokerInvestorIDLength() && brokerInvestorID(i) > 0; i++)
        {
            builder.append((char)brokerInvestorID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Direction', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=96, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=96, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("direction=");
        builder.append(direction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OffsetFlag', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=0, offset=97, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=97, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("offsetFlag=");
        builder.append(offsetFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StampTaxRateByMoney', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=0, offset=98, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=98, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("stampTaxRateByMoney=");
        builder.append(stampTaxRateByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StampTaxRateByVolume', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=106, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=106, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("stampTaxRateByVolume=");
        builder.append(stampTaxRateByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TransferFeeRateByMoney', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=114, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=114, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("transferFeeRateByMoney=");
        builder.append(transferFeeRateByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TransferFeeRateByVolume', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=122, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=122, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("transferFeeRateByVolume=");
        builder.append(transferFeeRateByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HandlingFeeByMoney', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=130, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=130, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("handlingFeeByMoney=");
        builder.append(handlingFeeByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HandlingFeeByVolume', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=0, offset=138, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=138, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("handlingFeeByVolume=");
        builder.append(handlingFeeByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AdminFeeByMoney', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=0, offset=146, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=146, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("adminFeeByMoney=");
        builder.append(adminFeeByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='AdminFeeByVolume', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=0, offset=154, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=154, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("adminFeeByVolume=");
        builder.append(adminFeeByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeFeeByMoney', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=0, offset=162, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=162, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeFeeByMoney=");
        builder.append(tradeFeeByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeFeeByVolume', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=0, offset=170, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=170, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeFeeByVolume=");
        builder.append(tradeFeeByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ClearingFeeByMoney', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=0, offset=178, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=178, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("clearingFeeByMoney=");
        builder.append(clearingFeeByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ClearingFeeByVolume', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=0, offset=186, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=186, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("clearingFeeByVolume=");
        builder.append(clearingFeeByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OtherFeeByVolume', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=0, offset=194, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=194, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("otherFeeByVolume=");
        builder.append(otherFeeByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OtherFeeByMoney', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=0, offset=202, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=202, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("otherFeeByMoney=");
        builder.append(otherFeeByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CloseRatioByMoney', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=0, offset=210, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=210, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("closeRatioByMoney=");
        builder.append(closeRatioByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CloseRatioByVolume', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=0, offset=218, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=218, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("closeRatioByVolume=");
        builder.append(closeRatioByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CloseTodayRatioByMoney', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=0, offset=226, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=226, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("closeTodayRatioByMoney=");
        builder.append(closeTodayRatioByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CloseTodayRatioByVolume', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=0, offset=234, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=234, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("closeTodayRatioByVolume=");
        builder.append(closeTodayRatioByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenRatioByMoney', referencedName='null', description='null', id=27, version=0, deprecated=0, encodedLength=0, offset=242, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=242, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openRatioByMoney=");
        builder.append(openRatioByMoney());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenRatioByVolume', referencedName='null', description='null', id=28, version=0, deprecated=0, encodedLength=0, offset=250, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=250, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("openRatioByVolume=");
        builder.append(openRatioByVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=29, version=0, deprecated=0, encodedLength=0, offset=258, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=258, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }

        limit(originalLimit);

        return builder;
    }
}

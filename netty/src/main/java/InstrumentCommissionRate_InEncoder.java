/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.InstrumentCommissionRate_InEncoder"})
@SuppressWarnings("all")
public class InstrumentCommissionRate_InEncoder
{
    public static final int BLOCK_LENGTH = 267;
    public static final int TEMPLATE_ID = 3;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final InstrumentCommissionRate_InEncoder parentMessage = this;
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

    public InstrumentCommissionRate_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int exchangeIDEncodingOffset()
    {
        return 0;
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

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder exchangeID(final String src)
    {
        final int length = 9;
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

    public static int instrumentIDEncodingOffset()
    {
        return 9;
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

        final int pos = this.offset + 9 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String instrumentIDCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 9, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder instrumentID(final String src)
    {
        final int length = 31;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 9, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 9 + start, (byte)0);
        }

        return this;
    }

    public static int investorRangeEncodingOffset()
    {
        return 40;
    }

    public static int investorRangeEncodingLength()
    {
        return 1;
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

    public InstrumentCommissionRate_InEncoder investorRange(final byte value)
    {
        buffer.putByte(offset + 40, value);
        return this;
    }


    public static int brokerIDEncodingOffset()
    {
        return 41;
    }

    public static int brokerIDEncodingLength()
    {
        return 11;
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

    public void brokerID(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 41 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String brokerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putBrokerID(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 41, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder brokerID(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 41, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 41 + start, (byte)0);
        }

        return this;
    }

    public static int providerIDEncodingOffset()
    {
        return 52;
    }

    public static int providerIDEncodingLength()
    {
        return 11;
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

    public void providerID(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 52 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String providerIDCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putProviderID(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 52, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder providerID(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 52, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 52 + start, (byte)0);
        }

        return this;
    }

    public static int brokerInvestorIDEncodingOffset()
    {
        return 63;
    }

    public static int brokerInvestorIDEncodingLength()
    {
        return 33;
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

    public void brokerInvestorID(final int index, final byte value)
    {
        if (index < 0 || index >= 33)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 63 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String brokerInvestorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putBrokerInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 33;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 63, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder brokerInvestorID(final String src)
    {
        final int length = 33;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 63, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 63 + start, (byte)0);
        }

        return this;
    }

    public static int directionEncodingOffset()
    {
        return 96;
    }

    public static int directionEncodingLength()
    {
        return 1;
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

    public InstrumentCommissionRate_InEncoder direction(final byte value)
    {
        buffer.putByte(offset + 96, value);
        return this;
    }


    public static int offsetFlagEncodingOffset()
    {
        return 97;
    }

    public static int offsetFlagEncodingLength()
    {
        return 1;
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

    public InstrumentCommissionRate_InEncoder offsetFlag(final byte value)
    {
        buffer.putByte(offset + 97, value);
        return this;
    }


    public static int stampTaxRateByMoneyEncodingOffset()
    {
        return 98;
    }

    public static int stampTaxRateByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder stampTaxRateByMoney(final double value)
    {
        buffer.putDouble(offset + 98, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int stampTaxRateByVolumeEncodingOffset()
    {
        return 106;
    }

    public static int stampTaxRateByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder stampTaxRateByVolume(final double value)
    {
        buffer.putDouble(offset + 106, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int transferFeeRateByMoneyEncodingOffset()
    {
        return 114;
    }

    public static int transferFeeRateByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder transferFeeRateByMoney(final double value)
    {
        buffer.putDouble(offset + 114, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int transferFeeRateByVolumeEncodingOffset()
    {
        return 122;
    }

    public static int transferFeeRateByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder transferFeeRateByVolume(final double value)
    {
        buffer.putDouble(offset + 122, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int handlingFeeByMoneyEncodingOffset()
    {
        return 130;
    }

    public static int handlingFeeByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder handlingFeeByMoney(final double value)
    {
        buffer.putDouble(offset + 130, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int handlingFeeByVolumeEncodingOffset()
    {
        return 138;
    }

    public static int handlingFeeByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder handlingFeeByVolume(final double value)
    {
        buffer.putDouble(offset + 138, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int adminFeeByMoneyEncodingOffset()
    {
        return 146;
    }

    public static int adminFeeByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder adminFeeByMoney(final double value)
    {
        buffer.putDouble(offset + 146, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int adminFeeByVolumeEncodingOffset()
    {
        return 154;
    }

    public static int adminFeeByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder adminFeeByVolume(final double value)
    {
        buffer.putDouble(offset + 154, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradeFeeByMoneyEncodingOffset()
    {
        return 162;
    }

    public static int tradeFeeByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder tradeFeeByMoney(final double value)
    {
        buffer.putDouble(offset + 162, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradeFeeByVolumeEncodingOffset()
    {
        return 170;
    }

    public static int tradeFeeByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder tradeFeeByVolume(final double value)
    {
        buffer.putDouble(offset + 170, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int clearingFeeByMoneyEncodingOffset()
    {
        return 178;
    }

    public static int clearingFeeByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder clearingFeeByMoney(final double value)
    {
        buffer.putDouble(offset + 178, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int clearingFeeByVolumeEncodingOffset()
    {
        return 186;
    }

    public static int clearingFeeByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder clearingFeeByVolume(final double value)
    {
        buffer.putDouble(offset + 186, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int otherFeeByVolumeEncodingOffset()
    {
        return 194;
    }

    public static int otherFeeByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder otherFeeByVolume(final double value)
    {
        buffer.putDouble(offset + 194, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int otherFeeByMoneyEncodingOffset()
    {
        return 202;
    }

    public static int otherFeeByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder otherFeeByMoney(final double value)
    {
        buffer.putDouble(offset + 202, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closeRatioByMoneyEncodingOffset()
    {
        return 210;
    }

    public static int closeRatioByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder closeRatioByMoney(final double value)
    {
        buffer.putDouble(offset + 210, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closeRatioByVolumeEncodingOffset()
    {
        return 218;
    }

    public static int closeRatioByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder closeRatioByVolume(final double value)
    {
        buffer.putDouble(offset + 218, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closeTodayRatioByMoneyEncodingOffset()
    {
        return 226;
    }

    public static int closeTodayRatioByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder closeTodayRatioByMoney(final double value)
    {
        buffer.putDouble(offset + 226, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int closeTodayRatioByVolumeEncodingOffset()
    {
        return 234;
    }

    public static int closeTodayRatioByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder closeTodayRatioByVolume(final double value)
    {
        buffer.putDouble(offset + 234, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openRatioByMoneyEncodingOffset()
    {
        return 242;
    }

    public static int openRatioByMoneyEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder openRatioByMoney(final double value)
    {
        buffer.putDouble(offset + 242, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int openRatioByVolumeEncodingOffset()
    {
        return 250;
    }

    public static int openRatioByVolumeEncodingLength()
    {
        return 8;
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

    public InstrumentCommissionRate_InEncoder openRatioByVolume(final double value)
    {
        buffer.putDouble(offset + 250, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradingDayEncodingOffset()
    {
        return 258;
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

        final int pos = this.offset + 258 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public InstrumentCommissionRate_InEncoder putTradingDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 258, src, srcOffset, length);

        return this;
    }

    public InstrumentCommissionRate_InEncoder tradingDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 258, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 258 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        InstrumentCommissionRate_InDecoder writer = new InstrumentCommissionRate_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

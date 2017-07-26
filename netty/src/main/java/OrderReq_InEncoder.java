/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.OrderReq_InEncoder"})
@SuppressWarnings("all")
public class OrderReq_InEncoder
{
    public static final int BLOCK_LENGTH = 136;
    public static final int TEMPLATE_ID = 11;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final OrderReq_InEncoder parentMessage = this;
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

    public OrderReq_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int investorIDEncodingOffset()
    {
        return 0;
    }

    public static int investorIDEncodingLength()
    {
        return 15;
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

    public void investorID(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String investorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder investorID(final String src)
    {
        final int length = 15;
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

    public static int optSubInvestorIDEncodingOffset()
    {
        return 15;
    }

    public static int optSubInvestorIDEncodingLength()
    {
        return 9;
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

    public void optSubInvestorID(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 15 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String optSubInvestorIDCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putOptSubInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 15, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder optSubInvestorID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 15, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 15 + start, (byte)0);
        }

        return this;
    }

    public static int businessUnitEncodingOffset()
    {
        return 24;
    }

    public static int businessUnitEncodingLength()
    {
        return 6;
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

    public void businessUnit(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 24 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String businessUnitCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putBusinessUnit(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 24, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder businessUnit(final String src)
    {
        final int length = 6;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 24, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 24 + start, (byte)0);
        }

        return this;
    }

    public static int branchIDEncodingOffset()
    {
        return 30;
    }

    public static int branchIDEncodingLength()
    {
        return 6;
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

    public void branchID(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 30 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String branchIDCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putBranchID(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 30, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder branchID(final String src)
    {
        final int length = 6;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 30, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 30 + start, (byte)0);
        }

        return this;
    }

    public static int instrumentIDEncodingOffset()
    {
        return 36;
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

        final int pos = this.offset + 36 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String instrumentIDCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 36, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder instrumentID(final String src)
    {
        final int length = 31;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 36, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 36 + start, (byte)0);
        }

        return this;
    }

    public static int orderRefEncodingOffset()
    {
        return 67;
    }

    public static int orderRefEncodingLength()
    {
        return 11;
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

    public void orderRef(final int index, final byte value)
    {
        if (index < 0 || index >= 11)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderRefCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putOrderRef(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 67, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder orderRef(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 67, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 67 + start, (byte)0);
        }

        return this;
    }

    public static int exchangeIDEncodingOffset()
    {
        return 78;
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

        final int pos = this.offset + 78 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 78, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder exchangeID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 78, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 78 + start, (byte)0);
        }

        return this;
    }

    public static int orderPriceTypeEncodingOffset()
    {
        return 87;
    }

    public static int orderPriceTypeEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder orderPriceType(final byte value)
    {
        buffer.putByte(offset + 87, value);
        return this;
    }


    public static int directionEncodingOffset()
    {
        return 88;
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

    public OrderReq_InEncoder direction(final byte value)
    {
        buffer.putByte(offset + 88, value);
        return this;
    }


    public static int coveredFlagEncodingOffset()
    {
        return 89;
    }

    public static int coveredFlagEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder coveredFlag(final byte value)
    {
        buffer.putByte(offset + 89, value);
        return this;
    }


    public static int ownerTypeEncodingOffset()
    {
        return 90;
    }

    public static int ownerTypeEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder ownerType(final byte value)
    {
        buffer.putByte(offset + 90, value);
        return this;
    }


    public static int combOffsetFlagEncodingOffset()
    {
        return 91;
    }

    public static int combOffsetFlagEncodingLength()
    {
        return 5;
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

    public void combOffsetFlag(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 91 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String combOffsetFlagCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putCombOffsetFlag(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 91, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder combOffsetFlag(final String src)
    {
        final int length = 5;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 91, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 91 + start, (byte)0);
        }

        return this;
    }

    public static int combHedgeFlagEncodingOffset()
    {
        return 96;
    }

    public static int combHedgeFlagEncodingLength()
    {
        return 5;
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

    public void combHedgeFlag(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 96 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String combHedgeFlagCharacterEncoding()
    {
        return "ASCII";
    }

    public OrderReq_InEncoder putCombHedgeFlag(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 96, src, srcOffset, length);

        return this;
    }

    public OrderReq_InEncoder combHedgeFlag(final String src)
    {
        final int length = 5;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 96, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 96 + start, (byte)0);
        }

        return this;
    }

    public static int limitPriceEncodingOffset()
    {
        return 101;
    }

    public static int limitPriceEncodingLength()
    {
        return 8;
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

    public OrderReq_InEncoder limitPrice(final double value)
    {
        buffer.putDouble(offset + 101, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int volumeTotalOriginalEncodingOffset()
    {
        return 109;
    }

    public static int volumeTotalOriginalEncodingLength()
    {
        return 4;
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

    public OrderReq_InEncoder volumeTotalOriginal(final long value)
    {
        buffer.putInt(offset + 109, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int timeConditionEncodingOffset()
    {
        return 113;
    }

    public static int timeConditionEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder timeCondition(final byte value)
    {
        buffer.putByte(offset + 113, value);
        return this;
    }


    public static int volumeConditionEncodingOffset()
    {
        return 114;
    }

    public static int volumeConditionEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder volumeCondition(final byte value)
    {
        buffer.putByte(offset + 114, value);
        return this;
    }


    public static int minVolumeEncodingOffset()
    {
        return 115;
    }

    public static int minVolumeEncodingLength()
    {
        return 4;
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

    public OrderReq_InEncoder minVolume(final long value)
    {
        buffer.putInt(offset + 115, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int contingentConditionEncodingOffset()
    {
        return 119;
    }

    public static int contingentConditionEncodingLength()
    {
        return 1;
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

    public OrderReq_InEncoder contingentCondition(final byte value)
    {
        buffer.putByte(offset + 119, value);
        return this;
    }


    public static int stopPriceEncodingOffset()
    {
        return 120;
    }

    public static int stopPriceEncodingLength()
    {
        return 8;
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

    public OrderReq_InEncoder stopPrice(final double value)
    {
        buffer.putDouble(offset + 120, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int requestIDEncodingOffset()
    {
        return 128;
    }

    public static int requestIDEncodingLength()
    {
        return 4;
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

    public OrderReq_InEncoder requestID(final long value)
    {
        buffer.putInt(offset + 128, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int thirdReffEncodingOffset()
    {
        return 132;
    }

    public static int thirdReffEncodingLength()
    {
        return 4;
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

    public OrderReq_InEncoder thirdReff(final long value)
    {
        buffer.putInt(offset + 132, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        OrderReq_InDecoder writer = new OrderReq_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

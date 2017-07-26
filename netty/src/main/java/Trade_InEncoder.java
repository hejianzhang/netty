/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.Trade_InEncoder"})
@SuppressWarnings("all")
public class Trade_InEncoder
{
    public static final int BLOCK_LENGTH = 225;
    public static final int TEMPLATE_ID = 4;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final Trade_InEncoder parentMessage = this;
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

    public Trade_InEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public Trade_InEncoder putInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 0, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder investorID(final String src)
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

    public Trade_InEncoder putOptSubInvestorID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 15, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder optSubInvestorID(final String src)
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

    public Trade_InEncoder putBusinessUnit(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 24, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder businessUnit(final String src)
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

    public Trade_InEncoder putBranchID(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 30, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder branchID(final String src)
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

    public Trade_InEncoder putInstrumentID(final byte[] src, final int srcOffset)
    {
        final int length = 31;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 36, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder instrumentID(final String src)
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

    public static int userIDEncodingOffset()
    {
        return 67;
    }

    public static int userIDEncodingLength()
    {
        return 15;
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

    public void userID(final int index, final byte value)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String userIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putUserID(final byte[] src, final int srcOffset)
    {
        final int length = 15;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 67, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder userID(final String src)
    {
        final int length = 15;
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
        return 82;
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

        final int pos = this.offset + 82 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String exchangeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putExchangeID(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 82, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder exchangeID(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 82, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 82 + start, (byte)0);
        }

        return this;
    }

    public static int tradeIDEncodingOffset()
    {
        return 91;
    }

    public static int tradeIDEncodingLength()
    {
        return 21;
    }

    public static byte tradeIDNullValue()
    {
        return (byte)0;
    }

    public static byte tradeIDMinValue()
    {
        return (byte)32;
    }

    public static byte tradeIDMaxValue()
    {
        return (byte)126;
    }

    public static int tradeIDLength()
    {
        return 21;
    }

    public void tradeID(final int index, final byte value)
    {
        if (index < 0 || index >= 21)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 91 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putTradeID(final byte[] src, final int srcOffset)
    {
        final int length = 21;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 91, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder tradeID(final String src)
    {
        final int length = 21;
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

    public static int requestIDEncodingOffset()
    {
        return 112;
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

    public Trade_InEncoder requestID(final long value)
    {
        buffer.putInt(offset + 112, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int orderSysIDEncodingOffset()
    {
        return 116;
    }

    public static int orderSysIDEncodingLength()
    {
        return 17;
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

    public void orderSysID(final int index, final byte value)
    {
        if (index < 0 || index >= 17)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 116 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderSysIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putOrderSysID(final byte[] src, final int srcOffset)
    {
        final int length = 17;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 116, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder orderSysID(final String src)
    {
        final int length = 17;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 116, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 116 + start, (byte)0);
        }

        return this;
    }

    public static int orderLocalIDEncodingOffset()
    {
        return 133;
    }

    public static int orderLocalIDEncodingLength()
    {
        return 13;
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

    public void orderLocalID(final int index, final byte value)
    {
        if (index < 0 || index >= 13)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 133 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderLocalIDCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putOrderLocalID(final byte[] src, final int srcOffset)
    {
        final int length = 13;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 133, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder orderLocalID(final String src)
    {
        final int length = 13;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 133, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 133 + start, (byte)0);
        }

        return this;
    }

    public static int orderRefEncodingOffset()
    {
        return 146;
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

        final int pos = this.offset + 146 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String orderRefCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putOrderRef(final byte[] src, final int srcOffset)
    {
        final int length = 11;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 146, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder orderRef(final String src)
    {
        final int length = 11;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 146, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 146 + start, (byte)0);
        }

        return this;
    }

    public static int thirdReffEncodingOffset()
    {
        return 157;
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

    public Trade_InEncoder thirdReff(final long value)
    {
        buffer.putInt(offset + 157, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int directionEncodingOffset()
    {
        return 161;
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

    public Trade_InEncoder direction(final byte value)
    {
        buffer.putByte(offset + 161, value);
        return this;
    }


    public static int offsetFlagEncodingOffset()
    {
        return 162;
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

    public Trade_InEncoder offsetFlag(final byte value)
    {
        buffer.putByte(offset + 162, value);
        return this;
    }


    public static int coveredFlagEncodingOffset()
    {
        return 163;
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

    public Trade_InEncoder coveredFlag(final byte value)
    {
        buffer.putByte(offset + 163, value);
        return this;
    }


    public static int ownerTypeEncodingOffset()
    {
        return 164;
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

    public Trade_InEncoder ownerType(final byte value)
    {
        buffer.putByte(offset + 164, value);
        return this;
    }


    public static int hedgeFlagEncodingOffset()
    {
        return 165;
    }

    public static int hedgeFlagEncodingLength()
    {
        return 1;
    }

    public static byte hedgeFlagNullValue()
    {
        return (byte)0;
    }

    public static byte hedgeFlagMinValue()
    {
        return (byte)32;
    }

    public static byte hedgeFlagMaxValue()
    {
        return (byte)126;
    }

    public Trade_InEncoder hedgeFlag(final byte value)
    {
        buffer.putByte(offset + 165, value);
        return this;
    }


    public static int priceEncodingOffset()
    {
        return 166;
    }

    public static int priceEncodingLength()
    {
        return 8;
    }

    public static double priceNullValue()
    {
        return Double.NaN;
    }

    public static double priceMinValue()
    {
        return 4.9E-324d;
    }

    public static double priceMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public Trade_InEncoder price(final double value)
    {
        buffer.putDouble(offset + 166, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int volumeEncodingOffset()
    {
        return 174;
    }

    public static int volumeEncodingLength()
    {
        return 4;
    }

    public static long volumeNullValue()
    {
        return 4294967294L;
    }

    public static long volumeMinValue()
    {
        return 0L;
    }

    public static long volumeMaxValue()
    {
        return 4294967293L;
    }

    public Trade_InEncoder volume(final long value)
    {
        buffer.putInt(offset + 174, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradeAmountEncodingOffset()
    {
        return 178;
    }

    public static int tradeAmountEncodingLength()
    {
        return 8;
    }

    public static double tradeAmountNullValue()
    {
        return Double.NaN;
    }

    public static double tradeAmountMinValue()
    {
        return 4.9E-324d;
    }

    public static double tradeAmountMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public Trade_InEncoder tradeAmount(final double value)
    {
        buffer.putDouble(offset + 178, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradeDateEncodingOffset()
    {
        return 186;
    }

    public static int tradeDateEncodingLength()
    {
        return 9;
    }

    public static byte tradeDateNullValue()
    {
        return (byte)0;
    }

    public static byte tradeDateMinValue()
    {
        return (byte)32;
    }

    public static byte tradeDateMaxValue()
    {
        return (byte)126;
    }

    public static int tradeDateLength()
    {
        return 9;
    }

    public void tradeDate(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 186 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradeDateCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putTradeDate(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 186, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder tradeDate(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 186, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 186 + start, (byte)0);
        }

        return this;
    }

    public static int tradeTimeEncodingOffset()
    {
        return 195;
    }

    public static int tradeTimeEncodingLength()
    {
        return 9;
    }

    public static byte tradeTimeNullValue()
    {
        return (byte)0;
    }

    public static byte tradeTimeMinValue()
    {
        return (byte)32;
    }

    public static byte tradeTimeMaxValue()
    {
        return (byte)126;
    }

    public static int tradeTimeLength()
    {
        return 9;
    }

    public void tradeTime(final int index, final byte value)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 195 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradeTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putTradeTime(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 195, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder tradeTime(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 195, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 195 + start, (byte)0);
        }

        return this;
    }

    public static int sequenceNoEncodingOffset()
    {
        return 204;
    }

    public static int sequenceNoEncodingLength()
    {
        return 4;
    }

    public static long sequenceNoNullValue()
    {
        return 4294967294L;
    }

    public static long sequenceNoMinValue()
    {
        return 0L;
    }

    public static long sequenceNoMaxValue()
    {
        return 4294967293L;
    }

    public Trade_InEncoder sequenceNo(final long value)
    {
        buffer.putInt(offset + 204, (int)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int commissionEncodingOffset()
    {
        return 208;
    }

    public static int commissionEncodingLength()
    {
        return 8;
    }

    public static double commissionNullValue()
    {
        return Double.NaN;
    }

    public static double commissionMinValue()
    {
        return 4.9E-324d;
    }

    public static double commissionMaxValue()
    {
        return 1.7976931348623157E308d;
    }

    public Trade_InEncoder commission(final double value)
    {
        buffer.putDouble(offset + 208, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int tradingDayEncodingOffset()
    {
        return 216;
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

        final int pos = this.offset + 216 + (index * 1);
        buffer.putByte(pos, value);
    }

    public static String tradingDayCharacterEncoding()
    {
        return "ASCII";
    }

    public Trade_InEncoder putTradingDay(final byte[] src, final int srcOffset)
    {
        final int length = 9;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("srcOffset out of range for copy: offset=" + srcOffset);
        }

        buffer.putBytes(this.offset + 216, src, srcOffset, length);

        return this;
    }

    public Trade_InEncoder tradingDay(final String src)
    {
        final int length = 9;
        final byte[] bytes = src.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        if (bytes.length > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + bytes.length);
        }

        buffer.putBytes(this.offset + 216, bytes, 0, bytes.length);

        for (int start = bytes.length; start < length; ++start)
        {
            buffer.putByte(this.offset + 216 + start, (byte)0);
        }

        return this;
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        Trade_InDecoder writer = new Trade_InDecoder();
        writer.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return writer.appendTo(builder);
    }
}

/* Generated SBE (Simple Binary Encoding) message codec */

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@javax.annotation.Generated(value = {"tfzq.Trade_InDecoder"})
@SuppressWarnings("all")
public class Trade_InDecoder
{
    public static final int BLOCK_LENGTH = 225;
    public static final int TEMPLATE_ID = 4;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 1;

    private final Trade_InDecoder parentMessage = this;
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

    public Trade_InDecoder wrap(
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


    public static int userIDId()
    {
        return 6;
    }

    public static int userIDSinceVersion()
    {
        return 0;
    }

    public static int userIDEncodingOffset()
    {
        return 67;
    }

    public static int userIDEncodingLength()
    {
        return 15;
    }

    public static String userIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte userID(final int index)
    {
        if (index < 0 || index >= 15)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 67 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String userIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getUserID(final byte[] dst, final int dstOffset)
    {
        final int length = 15;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 67, dst, dstOffset, length);

        return length;
    }

    public String userID()
    {
        final byte[] dst = new byte[15];
        buffer.getBytes(this.offset + 67, dst, 0, 15);

        int end = 0;
        for (; end < 15 && dst[end] != 0; ++end);

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
        return 82;
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

        final int pos = this.offset + 82 + (index * 1);

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

        buffer.getBytes(this.offset + 82, dst, dstOffset, length);

        return length;
    }

    public String exchangeID()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 82, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int tradeIDId()
    {
        return 8;
    }

    public static int tradeIDSinceVersion()
    {
        return 0;
    }

    public static int tradeIDEncodingOffset()
    {
        return 91;
    }

    public static int tradeIDEncodingLength()
    {
        return 21;
    }

    public static String tradeIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte tradeID(final int index)
    {
        if (index < 0 || index >= 21)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 91 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradeIDCharacterEncoding()
    {
        return "ASCII";
    }

    public int getTradeID(final byte[] dst, final int dstOffset)
    {
        final int length = 21;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 91, dst, dstOffset, length);

        return length;
    }

    public String tradeID()
    {
        final byte[] dst = new byte[21];
        buffer.getBytes(this.offset + 91, dst, 0, 21);

        int end = 0;
        for (; end < 21 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int requestIDId()
    {
        return 9;
    }

    public static int requestIDSinceVersion()
    {
        return 0;
    }

    public static int requestIDEncodingOffset()
    {
        return 112;
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
        return (buffer.getInt(offset + 112, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int orderSysIDId()
    {
        return 10;
    }

    public static int orderSysIDSinceVersion()
    {
        return 0;
    }

    public static int orderSysIDEncodingOffset()
    {
        return 116;
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

        final int pos = this.offset + 116 + (index * 1);

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

        buffer.getBytes(this.offset + 116, dst, dstOffset, length);

        return length;
    }

    public String orderSysID()
    {
        final byte[] dst = new byte[17];
        buffer.getBytes(this.offset + 116, dst, 0, 17);

        int end = 0;
        for (; end < 17 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderLocalIDId()
    {
        return 11;
    }

    public static int orderLocalIDSinceVersion()
    {
        return 0;
    }

    public static int orderLocalIDEncodingOffset()
    {
        return 133;
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

        final int pos = this.offset + 133 + (index * 1);

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

        buffer.getBytes(this.offset + 133, dst, dstOffset, length);

        return length;
    }

    public String orderLocalID()
    {
        final byte[] dst = new byte[13];
        buffer.getBytes(this.offset + 133, dst, 0, 13);

        int end = 0;
        for (; end < 13 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int orderRefId()
    {
        return 12;
    }

    public static int orderRefSinceVersion()
    {
        return 0;
    }

    public static int orderRefEncodingOffset()
    {
        return 146;
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

        final int pos = this.offset + 146 + (index * 1);

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

        buffer.getBytes(this.offset + 146, dst, dstOffset, length);

        return length;
    }

    public String orderRef()
    {
        final byte[] dst = new byte[11];
        buffer.getBytes(this.offset + 146, dst, 0, 11);

        int end = 0;
        for (; end < 11 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int thirdReffId()
    {
        return 13;
    }

    public static int thirdReffSinceVersion()
    {
        return 0;
    }

    public static int thirdReffEncodingOffset()
    {
        return 157;
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
        return (buffer.getInt(offset + 157, java.nio.ByteOrder.LITTLE_ENDIAN)  /*&0xFFFF_FFFFL*/);
    }


    public static int directionId()
    {
        return 14;
    }

    public static int directionSinceVersion()
    {
        return 0;
    }

    public static int directionEncodingOffset()
    {
        return 161;
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
        return buffer.getByte(offset + 161);
    }


    public static int offsetFlagId()
    {
        return 15;
    }

    public static int offsetFlagSinceVersion()
    {
        return 0;
    }

    public static int offsetFlagEncodingOffset()
    {
        return 162;
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
        return buffer.getByte(offset + 162);
    }


    public static int coveredFlagId()
    {
        return 16;
    }

    public static int coveredFlagSinceVersion()
    {
        return 0;
    }

    public static int coveredFlagEncodingOffset()
    {
        return 163;
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
        return buffer.getByte(offset + 163);
    }


    public static int ownerTypeId()
    {
        return 17;
    }

    public static int ownerTypeSinceVersion()
    {
        return 0;
    }

    public static int ownerTypeEncodingOffset()
    {
        return 164;
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
        return buffer.getByte(offset + 164);
    }


    public static int hedgeFlagId()
    {
        return 18;
    }

    public static int hedgeFlagSinceVersion()
    {
        return 0;
    }

    public static int hedgeFlagEncodingOffset()
    {
        return 165;
    }

    public static int hedgeFlagEncodingLength()
    {
        return 1;
    }

    public static String hedgeFlagMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte hedgeFlag()
    {
        return buffer.getByte(offset + 165);
    }


    public static int priceId()
    {
        return 19;
    }

    public static int priceSinceVersion()
    {
        return 0;
    }

    public static int priceEncodingOffset()
    {
        return 166;
    }

    public static int priceEncodingLength()
    {
        return 8;
    }

    public static String priceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double price()
    {
        return buffer.getDouble(offset + 166, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int volumeId()
    {
        return 20;
    }

    public static int volumeSinceVersion()
    {
        return 0;
    }

    public static int volumeEncodingOffset()
    {
        return 174;
    }

    public static int volumeEncodingLength()
    {
        return 4;
    }

    public static String volumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long volume()
    {
        return (buffer.getInt(offset + 174, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int tradeAmountId()
    {
        return 21;
    }

    public static int tradeAmountSinceVersion()
    {
        return 0;
    }

    public static int tradeAmountEncodingOffset()
    {
        return 178;
    }

    public static int tradeAmountEncodingLength()
    {
        return 8;
    }

    public static String tradeAmountMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double tradeAmount()
    {
        return buffer.getDouble(offset + 178, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradeDateId()
    {
        return 22;
    }

    public static int tradeDateSinceVersion()
    {
        return 0;
    }

    public static int tradeDateEncodingOffset()
    {
        return 186;
    }

    public static int tradeDateEncodingLength()
    {
        return 9;
    }

    public static String tradeDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte tradeDate(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 186 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradeDateCharacterEncoding()
    {
        return "ASCII";
    }

    public int getTradeDate(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 186, dst, dstOffset, length);

        return length;
    }

    public String tradeDate()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 186, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int tradeTimeId()
    {
        return 23;
    }

    public static int tradeTimeSinceVersion()
    {
        return 0;
    }

    public static int tradeTimeEncodingOffset()
    {
        return 195;
    }

    public static int tradeTimeEncodingLength()
    {
        return 9;
    }

    public static String tradeTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public byte tradeTime(final int index)
    {
        if (index < 0 || index >= 9)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 195 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradeTimeCharacterEncoding()
    {
        return "ASCII";
    }

    public int getTradeTime(final byte[] dst, final int dstOffset)
    {
        final int length = 9;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("dstOffset out of range for copy: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 195, dst, dstOffset, length);

        return length;
    }

    public String tradeTime()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 195, dst, 0, 9);

        int end = 0;
        for (; end < 9 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public static int sequenceNoId()
    {
        return 24;
    }

    public static int sequenceNoSinceVersion()
    {
        return 0;
    }

    public static int sequenceNoEncodingOffset()
    {
        return 204;
    }

    public static int sequenceNoEncodingLength()
    {
        return 4;
    }

    public static String sequenceNoMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public long sequenceNo()
    {
        return (buffer.getInt(offset + 204, java.nio.ByteOrder.LITTLE_ENDIAN) /*& 0xFFFF_FFFFL*/);
    }


    public static int commissionId()
    {
        return 25;
    }

    public static int commissionSinceVersion()
    {
        return 0;
    }

    public static int commissionEncodingOffset()
    {
        return 208;
    }

    public static int commissionEncodingLength()
    {
        return 8;
    }

    public static String commissionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "";
        }

        return "";
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

    public double commission()
    {
        return buffer.getDouble(offset + 208, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tradingDayId()
    {
        return 26;
    }

    public static int tradingDaySinceVersion()
    {
        return 0;
    }

    public static int tradingDayEncodingOffset()
    {
        return 216;
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

        final int pos = this.offset + 216 + (index * 1);

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

        buffer.getBytes(this.offset + 216, dst, dstOffset, length);

        return length;
    }

    public String tradingDay()
    {
        final byte[] dst = new byte[9];
        buffer.getBytes(this.offset + 216, dst, 0, 9);

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
        builder.append("[Trade_In](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='UserID', referencedName='null', description='null', id=6, version=0, deprecated=0, encodedLength=0, offset=67, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='USERID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=15, offset=67, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("userID=");
        for (int i = 0; i < userIDLength() && userID(i) > 0; i++)
        {
            builder.append((char)userID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ExchangeID', referencedName='null', description='null', id=7, version=0, deprecated=0, encodedLength=0, offset=82, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='EXCHANGEID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=82, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("exchangeID=");
        for (int i = 0; i < exchangeIDLength() && exchangeID(i) > 0; i++)
        {
            builder.append((char)exchangeID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeID', referencedName='null', description='null', id=8, version=0, deprecated=0, encodedLength=0, offset=91, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TRADEID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=21, offset=91, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeID=");
        for (int i = 0; i < tradeIDLength() && tradeID(i) > 0; i++)
        {
            builder.append((char)tradeID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='RequestID', referencedName='null', description='null', id=9, version=0, deprecated=0, encodedLength=0, offset=112, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=112, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("requestID=");
        builder.append(requestID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderSysID', referencedName='null', description='null', id=10, version=0, deprecated=0, encodedLength=0, offset=116, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERSYSID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=17, offset=116, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderSysID=");
        for (int i = 0; i < orderSysIDLength() && orderSysID(i) > 0; i++)
        {
            builder.append((char)orderSysID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderLocalID', referencedName='null', description='null', id=11, version=0, deprecated=0, encodedLength=0, offset=133, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERLOCALID_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=13, offset=133, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderLocalID=");
        for (int i = 0; i < orderLocalIDLength() && orderLocalID(i) > 0; i++)
        {
            builder.append((char)orderLocalID(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OrderRef', referencedName='null', description='null', id=12, version=0, deprecated=0, encodedLength=0, offset=146, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='ORDERREF_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=11, offset=146, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("orderRef=");
        for (int i = 0; i < orderRefLength() && orderRef(i) > 0; i++)
        {
            builder.append((char)orderRef(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ThirdReff', referencedName='null', description='null', id=13, version=0, deprecated=0, encodedLength=0, offset=157, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=157, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("thirdReff=");
        builder.append(thirdReff());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Direction', referencedName='null', description='null', id=14, version=0, deprecated=0, encodedLength=0, offset=161, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=161, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("direction=");
        builder.append(direction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OffsetFlag', referencedName='null', description='null', id=15, version=0, deprecated=0, encodedLength=0, offset=162, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=162, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("offsetFlag=");
        builder.append(offsetFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CoveredFlag', referencedName='null', description='null', id=16, version=0, deprecated=0, encodedLength=0, offset=163, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=163, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("coveredFlag=");
        builder.append(coveredFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OwnerType', referencedName='null', description='null', id=17, version=0, deprecated=0, encodedLength=0, offset=164, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=164, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("ownerType=");
        builder.append(ownerType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HedgeFlag', referencedName='null', description='null', id=18, version=0, deprecated=0, encodedLength=0, offset=165, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='char', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=165, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("hedgeFlag=");
        builder.append(hedgeFlag());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Price', referencedName='null', description='null', id=19, version=0, deprecated=0, encodedLength=0, offset=166, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=166, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("price=");
        builder.append(price());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Volume', referencedName='null', description='null', id=20, version=0, deprecated=0, encodedLength=0, offset=174, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=174, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("volume=");
        builder.append(volume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeAmount', referencedName='null', description='null', id=21, version=0, deprecated=0, encodedLength=0, offset=178, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=178, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeAmount=");
        builder.append(tradeAmount());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeDate', referencedName='null', description='null', id=22, version=0, deprecated=0, encodedLength=0, offset=186, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=186, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeDate=");
        for (int i = 0; i < tradeDateLength() && tradeDate(i) > 0; i++)
        {
            builder.append((char)tradeDate(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradeTime', referencedName='null', description='null', id=23, version=0, deprecated=0, encodedLength=0, offset=195, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='TIME_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=195, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradeTime=");
        for (int i = 0; i < tradeTimeLength() && tradeTime(i) > 0; i++)
        {
            builder.append((char)tradeTime(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SequenceNo', referencedName='null', description='null', id=24, version=0, deprecated=0, encodedLength=0, offset=204, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='uint32', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=204, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("sequenceNo=");
        builder.append(sequenceNo());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Commission', referencedName='null', description='null', id=25, version=0, deprecated=0, encodedLength=0, offset=208, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='double', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=8, offset=208, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=DOUBLE, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("commission=");
        builder.append(commission());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingDay', referencedName='null', description='null', id=26, version=0, deprecated=0, encodedLength=0, offset=216, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        //Token{signal=ENCODING, name='DATE_TYPE', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=9, offset=216, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='ASCII', epoch='unix', timeUnit=nanosecond, semanticType='null'}}
        builder.append("tradingDay=");
        for (int i = 0; i < tradingDayLength() && tradingDay(i) > 0; i++)
        {
            builder.append((char)tradingDay(i));
        }

        limit(originalLimit);

        return builder;
    }
}

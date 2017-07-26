/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_ORDERREQ_IN_H_
#define _TFZQ_ORDERREQ_IN_H_

#if defined(SBE_HAVE_CMATH)
/* cmath needed for std::numeric_limits<double>::quiet_NaN() */
#  include <cmath>
#  define SBE_FLOAT_NAN std::numeric_limits<float>::quiet_NaN()
#  define SBE_DOUBLE_NAN std::numeric_limits<double>::quiet_NaN()
#else
/* math.h needed for NAN */
#  include <math.h>
#  define SBE_FLOAT_NAN NAN
#  define SBE_DOUBLE_NAN NAN
#endif

#if __cplusplus >= 201103L
#  include <cstdint>
#  include <string>
#  include <cstring>
#endif

#if __cplusplus >= 201103L
#  define SBE_CONSTEXPR constexpr
#else
#  define SBE_CONSTEXPR
#endif

#include <sbe/sbe.h>


using namespace sbe;

namespace tfzq {

class OrderReq_In
{
private:
    char *m_buffer;
    std::uint64_t m_bufferLength;
    std::uint64_t *m_positionPtr;
    std::uint64_t m_offset;
    std::uint64_t m_position;
    std::uint64_t m_actingBlockLength;
    std::uint64_t m_actingVersion;

    inline void reset(
        char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength,
        const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        m_buffer = buffer;
        m_offset = offset;
        m_bufferLength = bufferLength;
        m_actingBlockLength = actingBlockLength;
        m_actingVersion = actingVersion;
        m_positionPtr = &m_position;
        position(offset + m_actingBlockLength);
    }

public:

    OrderReq_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    OrderReq_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    OrderReq_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)136;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)11;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeSchemaId(void)
    {
        return (std::uint16_t)1;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeSchemaVersion(void)
    {
        return (std::uint16_t)1;
    }

    static SBE_CONSTEXPR const char * sbeSemanticType(void)
    {
        return "";
    }

    std::uint64_t offset(void) const
    {
        return m_offset;
    }

    OrderReq_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    OrderReq_In &wrapForDecode(
         char *buffer, const std::uint64_t offset, const std::uint64_t actingBlockLength,
         const std::uint64_t actingVersion, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, actingBlockLength, actingVersion);
        return *this;
    }

    std::uint64_t position(void) const
    {
        return m_position;
    }

    void position(const std::uint64_t position)
    {
        if (SBE_BOUNDS_CHECK_EXPECT((position > m_bufferLength), false))
        {
            throw std::runtime_error("buffer too short [E100]");
        }
        m_position = position;
    }

    std::uint64_t encodedLength(void) const
    {
        return position() - m_offset;
    }

    char *buffer(void)
    {
        return m_buffer;
    }

    std::uint64_t actingVersion(void) const
    {
        return m_actingVersion;
    }

    static SBE_CONSTEXPR const std::uint16_t investorIDId(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t investorIDSinceVersion(void)
    {
         return 0;
    }

    bool investorIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= investorIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t investorIDEncodingOffset(void)
    {
         return 0;
    }


    static const char *InvestorIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char investorIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char investorIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char investorIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t investorIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t investorIDLength(void)
    {
        return 15;
    }

    const char *investorID(void) const
    {
        return (m_buffer + m_offset + 0);
    }

    char investorID(const std::uint64_t index) const
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for investorID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 0 + (index * 1))));
    }

    void investorID(const std::uint64_t index, const char value)
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for investorID [E105]");
        }

        *((char *)(m_buffer + m_offset + 0 + (index * 1))) = (value);
    }

    std::uint64_t getInvestorID(char *dst, const std::uint64_t length) const
    {
        if (length > 15)
        {
             throw std::runtime_error("length too large for getInvestorID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 0, length);
        return length;
    }

    OrderReq_In &putInvestorID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 15);
        return *this;
    }

    std::string getInvestorIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 15);
        return result;
    }

    OrderReq_In &putInvestorID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 0, str.c_str(), 15);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t optSubInvestorIDId(void)
    {
        return 2;
    }

    static SBE_CONSTEXPR const std::uint64_t optSubInvestorIDSinceVersion(void)
    {
         return 0;
    }

    bool optSubInvestorIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= optSubInvestorIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t optSubInvestorIDEncodingOffset(void)
    {
         return 15;
    }


    static const char *OptSubInvestorIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char optSubInvestorIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char optSubInvestorIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char optSubInvestorIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t optSubInvestorIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t optSubInvestorIDLength(void)
    {
        return 9;
    }

    const char *optSubInvestorID(void) const
    {
        return (m_buffer + m_offset + 15);
    }

    char optSubInvestorID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for optSubInvestorID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 15 + (index * 1))));
    }

    void optSubInvestorID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for optSubInvestorID [E105]");
        }

        *((char *)(m_buffer + m_offset + 15 + (index * 1))) = (value);
    }

    std::uint64_t getOptSubInvestorID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getOptSubInvestorID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 15, length);
        return length;
    }

    OrderReq_In &putOptSubInvestorID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 15, src, 9);
        return *this;
    }

    std::string getOptSubInvestorIDAsString() const
    {
        std::string result(m_buffer + m_offset + 15, 9);
        return result;
    }

    OrderReq_In &putOptSubInvestorID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 15, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t businessUnitId(void)
    {
        return 3;
    }

    static SBE_CONSTEXPR const std::uint64_t businessUnitSinceVersion(void)
    {
         return 0;
    }

    bool businessUnitInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= businessUnitSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t businessUnitEncodingOffset(void)
    {
         return 24;
    }


    static const char *BusinessUnitMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char businessUnitNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char businessUnitMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char businessUnitMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t businessUnitEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t businessUnitLength(void)
    {
        return 6;
    }

    const char *businessUnit(void) const
    {
        return (m_buffer + m_offset + 24);
    }

    char businessUnit(const std::uint64_t index) const
    {
        if (index >= 6)
        {
            throw std::runtime_error("index out of range for businessUnit [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 24 + (index * 1))));
    }

    void businessUnit(const std::uint64_t index, const char value)
    {
        if (index >= 6)
        {
            throw std::runtime_error("index out of range for businessUnit [E105]");
        }

        *((char *)(m_buffer + m_offset + 24 + (index * 1))) = (value);
    }

    std::uint64_t getBusinessUnit(char *dst, const std::uint64_t length) const
    {
        if (length > 6)
        {
             throw std::runtime_error("length too large for getBusinessUnit [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 24, length);
        return length;
    }

    OrderReq_In &putBusinessUnit(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 24, src, 6);
        return *this;
    }

    std::string getBusinessUnitAsString() const
    {
        std::string result(m_buffer + m_offset + 24, 6);
        return result;
    }

    OrderReq_In &putBusinessUnit(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 24, str.c_str(), 6);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t branchIDId(void)
    {
        return 4;
    }

    static SBE_CONSTEXPR const std::uint64_t branchIDSinceVersion(void)
    {
         return 0;
    }

    bool branchIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= branchIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t branchIDEncodingOffset(void)
    {
         return 30;
    }


    static const char *BranchIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char branchIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char branchIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char branchIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t branchIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t branchIDLength(void)
    {
        return 6;
    }

    const char *branchID(void) const
    {
        return (m_buffer + m_offset + 30);
    }

    char branchID(const std::uint64_t index) const
    {
        if (index >= 6)
        {
            throw std::runtime_error("index out of range for branchID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 30 + (index * 1))));
    }

    void branchID(const std::uint64_t index, const char value)
    {
        if (index >= 6)
        {
            throw std::runtime_error("index out of range for branchID [E105]");
        }

        *((char *)(m_buffer + m_offset + 30 + (index * 1))) = (value);
    }

    std::uint64_t getBranchID(char *dst, const std::uint64_t length) const
    {
        if (length > 6)
        {
             throw std::runtime_error("length too large for getBranchID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 30, length);
        return length;
    }

    OrderReq_In &putBranchID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 30, src, 6);
        return *this;
    }

    std::string getBranchIDAsString() const
    {
        std::string result(m_buffer + m_offset + 30, 6);
        return result;
    }

    OrderReq_In &putBranchID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 30, str.c_str(), 6);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t instrumentIDId(void)
    {
        return 5;
    }

    static SBE_CONSTEXPR const std::uint64_t instrumentIDSinceVersion(void)
    {
         return 0;
    }

    bool instrumentIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= instrumentIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t instrumentIDEncodingOffset(void)
    {
         return 36;
    }


    static const char *InstrumentIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char instrumentIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char instrumentIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char instrumentIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t instrumentIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t instrumentIDLength(void)
    {
        return 31;
    }

    const char *instrumentID(void) const
    {
        return (m_buffer + m_offset + 36);
    }

    char instrumentID(const std::uint64_t index) const
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 36 + (index * 1))));
    }

    void instrumentID(const std::uint64_t index, const char value)
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E105]");
        }

        *((char *)(m_buffer + m_offset + 36 + (index * 1))) = (value);
    }

    std::uint64_t getInstrumentID(char *dst, const std::uint64_t length) const
    {
        if (length > 31)
        {
             throw std::runtime_error("length too large for getInstrumentID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 36, length);
        return length;
    }

    OrderReq_In &putInstrumentID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 36, src, 31);
        return *this;
    }

    std::string getInstrumentIDAsString() const
    {
        std::string result(m_buffer + m_offset + 36, 31);
        return result;
    }

    OrderReq_In &putInstrumentID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 36, str.c_str(), 31);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t orderRefId(void)
    {
        return 6;
    }

    static SBE_CONSTEXPR const std::uint64_t orderRefSinceVersion(void)
    {
         return 0;
    }

    bool orderRefInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= orderRefSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t orderRefEncodingOffset(void)
    {
         return 67;
    }


    static const char *OrderRefMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char orderRefNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char orderRefMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char orderRefMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t orderRefEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t orderRefLength(void)
    {
        return 11;
    }

    const char *orderRef(void) const
    {
        return (m_buffer + m_offset + 67);
    }

    char orderRef(const std::uint64_t index) const
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for orderRef [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 67 + (index * 1))));
    }

    void orderRef(const std::uint64_t index, const char value)
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for orderRef [E105]");
        }

        *((char *)(m_buffer + m_offset + 67 + (index * 1))) = (value);
    }

    std::uint64_t getOrderRef(char *dst, const std::uint64_t length) const
    {
        if (length > 11)
        {
             throw std::runtime_error("length too large for getOrderRef [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 67, length);
        return length;
    }

    OrderReq_In &putOrderRef(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 67, src, 11);
        return *this;
    }

    std::string getOrderRefAsString() const
    {
        std::string result(m_buffer + m_offset + 67, 11);
        return result;
    }

    OrderReq_In &putOrderRef(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 67, str.c_str(), 11);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t exchangeIDId(void)
    {
        return 7;
    }

    static SBE_CONSTEXPR const std::uint64_t exchangeIDSinceVersion(void)
    {
         return 0;
    }

    bool exchangeIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= exchangeIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t exchangeIDEncodingOffset(void)
    {
         return 78;
    }


    static const char *ExchangeIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char exchangeIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char exchangeIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char exchangeIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t exchangeIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t exchangeIDLength(void)
    {
        return 9;
    }

    const char *exchangeID(void) const
    {
        return (m_buffer + m_offset + 78);
    }

    char exchangeID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 78 + (index * 1))));
    }

    void exchangeID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E105]");
        }

        *((char *)(m_buffer + m_offset + 78 + (index * 1))) = (value);
    }

    std::uint64_t getExchangeID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getExchangeID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 78, length);
        return length;
    }

    OrderReq_In &putExchangeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 78, src, 9);
        return *this;
    }

    std::string getExchangeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 78, 9);
        return result;
    }

    OrderReq_In &putExchangeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 78, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t orderPriceTypeId(void)
    {
        return 8;
    }

    static SBE_CONSTEXPR const std::uint64_t orderPriceTypeSinceVersion(void)
    {
         return 0;
    }

    bool orderPriceTypeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= orderPriceTypeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t orderPriceTypeEncodingOffset(void)
    {
         return 87;
    }


    static const char *OrderPriceTypeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char orderPriceTypeNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char orderPriceTypeMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char orderPriceTypeMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t orderPriceTypeEncodingLength(void)
    {
        return 1;
    }

    char orderPriceType(void) const
    {
        return (*((char *)(m_buffer + m_offset + 87)));
    }

    OrderReq_In &orderPriceType(const char value)
    {
        *((char *)(m_buffer + m_offset + 87)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t directionId(void)
    {
        return 9;
    }

    static SBE_CONSTEXPR const std::uint64_t directionSinceVersion(void)
    {
         return 0;
    }

    bool directionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= directionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t directionEncodingOffset(void)
    {
         return 88;
    }


    static const char *DirectionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char directionNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char directionMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char directionMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t directionEncodingLength(void)
    {
        return 1;
    }

    char direction(void) const
    {
        return (*((char *)(m_buffer + m_offset + 88)));
    }

    OrderReq_In &direction(const char value)
    {
        *((char *)(m_buffer + m_offset + 88)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t coveredFlagId(void)
    {
        return 10;
    }

    static SBE_CONSTEXPR const std::uint64_t coveredFlagSinceVersion(void)
    {
         return 0;
    }

    bool coveredFlagInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= coveredFlagSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t coveredFlagEncodingOffset(void)
    {
         return 89;
    }


    static const char *CoveredFlagMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char coveredFlagNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char coveredFlagMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char coveredFlagMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t coveredFlagEncodingLength(void)
    {
        return 1;
    }

    char coveredFlag(void) const
    {
        return (*((char *)(m_buffer + m_offset + 89)));
    }

    OrderReq_In &coveredFlag(const char value)
    {
        *((char *)(m_buffer + m_offset + 89)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t ownerTypeId(void)
    {
        return 11;
    }

    static SBE_CONSTEXPR const std::uint64_t ownerTypeSinceVersion(void)
    {
         return 0;
    }

    bool ownerTypeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= ownerTypeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t ownerTypeEncodingOffset(void)
    {
         return 90;
    }


    static const char *OwnerTypeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char ownerTypeNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char ownerTypeMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char ownerTypeMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t ownerTypeEncodingLength(void)
    {
        return 1;
    }

    char ownerType(void) const
    {
        return (*((char *)(m_buffer + m_offset + 90)));
    }

    OrderReq_In &ownerType(const char value)
    {
        *((char *)(m_buffer + m_offset + 90)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t combOffsetFlagId(void)
    {
        return 12;
    }

    static SBE_CONSTEXPR const std::uint64_t combOffsetFlagSinceVersion(void)
    {
         return 0;
    }

    bool combOffsetFlagInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= combOffsetFlagSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t combOffsetFlagEncodingOffset(void)
    {
         return 91;
    }


    static const char *CombOffsetFlagMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char combOffsetFlagNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char combOffsetFlagMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char combOffsetFlagMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t combOffsetFlagEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t combOffsetFlagLength(void)
    {
        return 5;
    }

    const char *combOffsetFlag(void) const
    {
        return (m_buffer + m_offset + 91);
    }

    char combOffsetFlag(const std::uint64_t index) const
    {
        if (index >= 5)
        {
            throw std::runtime_error("index out of range for combOffsetFlag [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 91 + (index * 1))));
    }

    void combOffsetFlag(const std::uint64_t index, const char value)
    {
        if (index >= 5)
        {
            throw std::runtime_error("index out of range for combOffsetFlag [E105]");
        }

        *((char *)(m_buffer + m_offset + 91 + (index * 1))) = (value);
    }

    std::uint64_t getCombOffsetFlag(char *dst, const std::uint64_t length) const
    {
        if (length > 5)
        {
             throw std::runtime_error("length too large for getCombOffsetFlag [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 91, length);
        return length;
    }

    OrderReq_In &putCombOffsetFlag(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 91, src, 5);
        return *this;
    }

    std::string getCombOffsetFlagAsString() const
    {
        std::string result(m_buffer + m_offset + 91, 5);
        return result;
    }

    OrderReq_In &putCombOffsetFlag(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 91, str.c_str(), 5);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t combHedgeFlagId(void)
    {
        return 13;
    }

    static SBE_CONSTEXPR const std::uint64_t combHedgeFlagSinceVersion(void)
    {
         return 0;
    }

    bool combHedgeFlagInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= combHedgeFlagSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t combHedgeFlagEncodingOffset(void)
    {
         return 96;
    }


    static const char *CombHedgeFlagMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char combHedgeFlagNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char combHedgeFlagMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char combHedgeFlagMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t combHedgeFlagEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t combHedgeFlagLength(void)
    {
        return 5;
    }

    const char *combHedgeFlag(void) const
    {
        return (m_buffer + m_offset + 96);
    }

    char combHedgeFlag(const std::uint64_t index) const
    {
        if (index >= 5)
        {
            throw std::runtime_error("index out of range for combHedgeFlag [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 96 + (index * 1))));
    }

    void combHedgeFlag(const std::uint64_t index, const char value)
    {
        if (index >= 5)
        {
            throw std::runtime_error("index out of range for combHedgeFlag [E105]");
        }

        *((char *)(m_buffer + m_offset + 96 + (index * 1))) = (value);
    }

    std::uint64_t getCombHedgeFlag(char *dst, const std::uint64_t length) const
    {
        if (length > 5)
        {
             throw std::runtime_error("length too large for getCombHedgeFlag [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 96, length);
        return length;
    }

    OrderReq_In &putCombHedgeFlag(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 96, src, 5);
        return *this;
    }

    std::string getCombHedgeFlagAsString() const
    {
        std::string result(m_buffer + m_offset + 96, 5);
        return result;
    }

    OrderReq_In &putCombHedgeFlag(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 96, str.c_str(), 5);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t limitPriceId(void)
    {
        return 14;
    }

    static SBE_CONSTEXPR const std::uint64_t limitPriceSinceVersion(void)
    {
         return 0;
    }

    bool limitPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= limitPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t limitPriceEncodingOffset(void)
    {
         return 101;
    }


    static const char *LimitPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double limitPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double limitPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double limitPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t limitPriceEncodingLength(void)
    {
        return 8;
    }

    double limitPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 101)));
    }

    OrderReq_In &limitPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 101)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t volumeTotalOriginalId(void)
    {
        return 15;
    }

    static SBE_CONSTEXPR const std::uint64_t volumeTotalOriginalSinceVersion(void)
    {
         return 0;
    }

    bool volumeTotalOriginalInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= volumeTotalOriginalSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t volumeTotalOriginalEncodingOffset(void)
    {
         return 109;
    }


    static const char *VolumeTotalOriginalMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t volumeTotalOriginalNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeTotalOriginalMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeTotalOriginalMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t volumeTotalOriginalEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t volumeTotalOriginal(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 109)));
    }

    OrderReq_In &volumeTotalOriginal(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 109)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t timeConditionId(void)
    {
        return 16;
    }

    static SBE_CONSTEXPR const std::uint64_t timeConditionSinceVersion(void)
    {
         return 0;
    }

    bool timeConditionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= timeConditionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t timeConditionEncodingOffset(void)
    {
         return 113;
    }


    static const char *TimeConditionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char timeConditionNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char timeConditionMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char timeConditionMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t timeConditionEncodingLength(void)
    {
        return 1;
    }

    char timeCondition(void) const
    {
        return (*((char *)(m_buffer + m_offset + 113)));
    }

    OrderReq_In &timeCondition(const char value)
    {
        *((char *)(m_buffer + m_offset + 113)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t volumeConditionId(void)
    {
        return 17;
    }

    static SBE_CONSTEXPR const std::uint64_t volumeConditionSinceVersion(void)
    {
         return 0;
    }

    bool volumeConditionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= volumeConditionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t volumeConditionEncodingOffset(void)
    {
         return 114;
    }


    static const char *VolumeConditionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char volumeConditionNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char volumeConditionMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char volumeConditionMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t volumeConditionEncodingLength(void)
    {
        return 1;
    }

    char volumeCondition(void) const
    {
        return (*((char *)(m_buffer + m_offset + 114)));
    }

    OrderReq_In &volumeCondition(const char value)
    {
        *((char *)(m_buffer + m_offset + 114)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t minVolumeId(void)
    {
        return 18;
    }

    static SBE_CONSTEXPR const std::uint64_t minVolumeSinceVersion(void)
    {
         return 0;
    }

    bool minVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= minVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t minVolumeEncodingOffset(void)
    {
         return 115;
    }


    static const char *MinVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t minVolumeNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t minVolumeMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t minVolumeMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t minVolumeEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t minVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 115)));
    }

    OrderReq_In &minVolume(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 115)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t contingentConditionId(void)
    {
        return 19;
    }

    static SBE_CONSTEXPR const std::uint64_t contingentConditionSinceVersion(void)
    {
         return 0;
    }

    bool contingentConditionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= contingentConditionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t contingentConditionEncodingOffset(void)
    {
         return 119;
    }


    static const char *ContingentConditionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char contingentConditionNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char contingentConditionMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char contingentConditionMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t contingentConditionEncodingLength(void)
    {
        return 1;
    }

    char contingentCondition(void) const
    {
        return (*((char *)(m_buffer + m_offset + 119)));
    }

    OrderReq_In &contingentCondition(const char value)
    {
        *((char *)(m_buffer + m_offset + 119)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t stopPriceId(void)
    {
        return 20;
    }

    static SBE_CONSTEXPR const std::uint64_t stopPriceSinceVersion(void)
    {
         return 0;
    }

    bool stopPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= stopPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t stopPriceEncodingOffset(void)
    {
         return 120;
    }


    static const char *StopPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double stopPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double stopPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double stopPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t stopPriceEncodingLength(void)
    {
        return 8;
    }

    double stopPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 120)));
    }

    OrderReq_In &stopPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 120)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t requestIDId(void)
    {
        return 21;
    }

    static SBE_CONSTEXPR const std::uint64_t requestIDSinceVersion(void)
    {
         return 0;
    }

    bool requestIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= requestIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t requestIDEncodingOffset(void)
    {
         return 128;
    }


    static const char *RequestIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t requestIDNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t requestIDMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t requestIDMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t requestIDEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t requestID(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 128)));
    }

    OrderReq_In &requestID(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 128)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t thirdReffId(void)
    {
        return 22;
    }

    static SBE_CONSTEXPR const std::uint64_t thirdReffSinceVersion(void)
    {
         return 0;
    }

    bool thirdReffInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= thirdReffSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t thirdReffEncodingOffset(void)
    {
         return 132;
    }


    static const char *ThirdReffMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t thirdReffNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t thirdReffMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t thirdReffMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t thirdReffEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t thirdReff(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 132)));
    }

    OrderReq_In &thirdReff(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 132)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }
};
}
#endif

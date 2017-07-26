/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_TRADE_IN_H_
#define _TFZQ_TRADE_IN_H_

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

class Trade_In
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

    Trade_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    Trade_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    Trade_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)225;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)4;
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

    Trade_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    Trade_In &wrapForDecode(
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

    Trade_In &putInvestorID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 15);
        return *this;
    }

    std::string getInvestorIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 15);
        return result;
    }

    Trade_In &putInvestorID(const std::string& str)
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

    Trade_In &putOptSubInvestorID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 15, src, 9);
        return *this;
    }

    std::string getOptSubInvestorIDAsString() const
    {
        std::string result(m_buffer + m_offset + 15, 9);
        return result;
    }

    Trade_In &putOptSubInvestorID(const std::string& str)
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

    Trade_In &putBusinessUnit(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 24, src, 6);
        return *this;
    }

    std::string getBusinessUnitAsString() const
    {
        std::string result(m_buffer + m_offset + 24, 6);
        return result;
    }

    Trade_In &putBusinessUnit(const std::string& str)
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

    Trade_In &putBranchID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 30, src, 6);
        return *this;
    }

    std::string getBranchIDAsString() const
    {
        std::string result(m_buffer + m_offset + 30, 6);
        return result;
    }

    Trade_In &putBranchID(const std::string& str)
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

    Trade_In &putInstrumentID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 36, src, 31);
        return *this;
    }

    std::string getInstrumentIDAsString() const
    {
        std::string result(m_buffer + m_offset + 36, 31);
        return result;
    }

    Trade_In &putInstrumentID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 36, str.c_str(), 31);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t userIDId(void)
    {
        return 6;
    }

    static SBE_CONSTEXPR const std::uint64_t userIDSinceVersion(void)
    {
         return 0;
    }

    bool userIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= userIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t userIDEncodingOffset(void)
    {
         return 67;
    }


    static const char *UserIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char userIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char userIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char userIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t userIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t userIDLength(void)
    {
        return 15;
    }

    const char *userID(void) const
    {
        return (m_buffer + m_offset + 67);
    }

    char userID(const std::uint64_t index) const
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for userID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 67 + (index * 1))));
    }

    void userID(const std::uint64_t index, const char value)
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for userID [E105]");
        }

        *((char *)(m_buffer + m_offset + 67 + (index * 1))) = (value);
    }

    std::uint64_t getUserID(char *dst, const std::uint64_t length) const
    {
        if (length > 15)
        {
             throw std::runtime_error("length too large for getUserID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 67, length);
        return length;
    }

    Trade_In &putUserID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 67, src, 15);
        return *this;
    }

    std::string getUserIDAsString() const
    {
        std::string result(m_buffer + m_offset + 67, 15);
        return result;
    }

    Trade_In &putUserID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 67, str.c_str(), 15);
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
         return 82;
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
        return (m_buffer + m_offset + 82);
    }

    char exchangeID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 82 + (index * 1))));
    }

    void exchangeID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E105]");
        }

        *((char *)(m_buffer + m_offset + 82 + (index * 1))) = (value);
    }

    std::uint64_t getExchangeID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getExchangeID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 82, length);
        return length;
    }

    Trade_In &putExchangeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 82, src, 9);
        return *this;
    }

    std::string getExchangeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 82, 9);
        return result;
    }

    Trade_In &putExchangeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 82, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t tradeIDId(void)
    {
        return 8;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeIDSinceVersion(void)
    {
         return 0;
    }

    bool tradeIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeIDEncodingOffset(void)
    {
         return 91;
    }


    static const char *TradeIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char tradeIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char tradeIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char tradeIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t tradeIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeIDLength(void)
    {
        return 21;
    }

    const char *tradeID(void) const
    {
        return (m_buffer + m_offset + 91);
    }

    char tradeID(const std::uint64_t index) const
    {
        if (index >= 21)
        {
            throw std::runtime_error("index out of range for tradeID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 91 + (index * 1))));
    }

    void tradeID(const std::uint64_t index, const char value)
    {
        if (index >= 21)
        {
            throw std::runtime_error("index out of range for tradeID [E105]");
        }

        *((char *)(m_buffer + m_offset + 91 + (index * 1))) = (value);
    }

    std::uint64_t getTradeID(char *dst, const std::uint64_t length) const
    {
        if (length > 21)
        {
             throw std::runtime_error("length too large for getTradeID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 91, length);
        return length;
    }

    Trade_In &putTradeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 91, src, 21);
        return *this;
    }

    std::string getTradeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 91, 21);
        return result;
    }

    Trade_In &putTradeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 91, str.c_str(), 21);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t requestIDId(void)
    {
        return 9;
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
         return 112;
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
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 112)));
    }

    Trade_In &requestID(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 112)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t orderSysIDId(void)
    {
        return 10;
    }

    static SBE_CONSTEXPR const std::uint64_t orderSysIDSinceVersion(void)
    {
         return 0;
    }

    bool orderSysIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= orderSysIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t orderSysIDEncodingOffset(void)
    {
         return 116;
    }


    static const char *OrderSysIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char orderSysIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char orderSysIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char orderSysIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t orderSysIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t orderSysIDLength(void)
    {
        return 17;
    }

    const char *orderSysID(void) const
    {
        return (m_buffer + m_offset + 116);
    }

    char orderSysID(const std::uint64_t index) const
    {
        if (index >= 17)
        {
            throw std::runtime_error("index out of range for orderSysID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 116 + (index * 1))));
    }

    void orderSysID(const std::uint64_t index, const char value)
    {
        if (index >= 17)
        {
            throw std::runtime_error("index out of range for orderSysID [E105]");
        }

        *((char *)(m_buffer + m_offset + 116 + (index * 1))) = (value);
    }

    std::uint64_t getOrderSysID(char *dst, const std::uint64_t length) const
    {
        if (length > 17)
        {
             throw std::runtime_error("length too large for getOrderSysID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 116, length);
        return length;
    }

    Trade_In &putOrderSysID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 116, src, 17);
        return *this;
    }

    std::string getOrderSysIDAsString() const
    {
        std::string result(m_buffer + m_offset + 116, 17);
        return result;
    }

    Trade_In &putOrderSysID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 116, str.c_str(), 17);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t orderLocalIDId(void)
    {
        return 11;
    }

    static SBE_CONSTEXPR const std::uint64_t orderLocalIDSinceVersion(void)
    {
         return 0;
    }

    bool orderLocalIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= orderLocalIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t orderLocalIDEncodingOffset(void)
    {
         return 133;
    }


    static const char *OrderLocalIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char orderLocalIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char orderLocalIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char orderLocalIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t orderLocalIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t orderLocalIDLength(void)
    {
        return 13;
    }

    const char *orderLocalID(void) const
    {
        return (m_buffer + m_offset + 133);
    }

    char orderLocalID(const std::uint64_t index) const
    {
        if (index >= 13)
        {
            throw std::runtime_error("index out of range for orderLocalID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 133 + (index * 1))));
    }

    void orderLocalID(const std::uint64_t index, const char value)
    {
        if (index >= 13)
        {
            throw std::runtime_error("index out of range for orderLocalID [E105]");
        }

        *((char *)(m_buffer + m_offset + 133 + (index * 1))) = (value);
    }

    std::uint64_t getOrderLocalID(char *dst, const std::uint64_t length) const
    {
        if (length > 13)
        {
             throw std::runtime_error("length too large for getOrderLocalID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 133, length);
        return length;
    }

    Trade_In &putOrderLocalID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 133, src, 13);
        return *this;
    }

    std::string getOrderLocalIDAsString() const
    {
        std::string result(m_buffer + m_offset + 133, 13);
        return result;
    }

    Trade_In &putOrderLocalID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 133, str.c_str(), 13);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t orderRefId(void)
    {
        return 12;
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
         return 146;
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
        return (m_buffer + m_offset + 146);
    }

    char orderRef(const std::uint64_t index) const
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for orderRef [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 146 + (index * 1))));
    }

    void orderRef(const std::uint64_t index, const char value)
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for orderRef [E105]");
        }

        *((char *)(m_buffer + m_offset + 146 + (index * 1))) = (value);
    }

    std::uint64_t getOrderRef(char *dst, const std::uint64_t length) const
    {
        if (length > 11)
        {
             throw std::runtime_error("length too large for getOrderRef [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 146, length);
        return length;
    }

    Trade_In &putOrderRef(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 146, src, 11);
        return *this;
    }

    std::string getOrderRefAsString() const
    {
        std::string result(m_buffer + m_offset + 146, 11);
        return result;
    }

    Trade_In &putOrderRef(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 146, str.c_str(), 11);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t thirdReffId(void)
    {
        return 13;
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
         return 157;
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
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 157)));
    }

    Trade_In &thirdReff(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 157)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t directionId(void)
    {
        return 14;
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
         return 161;
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
        return (*((char *)(m_buffer + m_offset + 161)));
    }

    Trade_In &direction(const char value)
    {
        *((char *)(m_buffer + m_offset + 161)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t offsetFlagId(void)
    {
        return 15;
    }

    static SBE_CONSTEXPR const std::uint64_t offsetFlagSinceVersion(void)
    {
         return 0;
    }

    bool offsetFlagInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= offsetFlagSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t offsetFlagEncodingOffset(void)
    {
         return 162;
    }


    static const char *OffsetFlagMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char offsetFlagNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char offsetFlagMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char offsetFlagMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t offsetFlagEncodingLength(void)
    {
        return 1;
    }

    char offsetFlag(void) const
    {
        return (*((char *)(m_buffer + m_offset + 162)));
    }

    Trade_In &offsetFlag(const char value)
    {
        *((char *)(m_buffer + m_offset + 162)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t coveredFlagId(void)
    {
        return 16;
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
         return 163;
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
        return (*((char *)(m_buffer + m_offset + 163)));
    }

    Trade_In &coveredFlag(const char value)
    {
        *((char *)(m_buffer + m_offset + 163)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t ownerTypeId(void)
    {
        return 17;
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
         return 164;
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
        return (*((char *)(m_buffer + m_offset + 164)));
    }

    Trade_In &ownerType(const char value)
    {
        *((char *)(m_buffer + m_offset + 164)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t hedgeFlagId(void)
    {
        return 18;
    }

    static SBE_CONSTEXPR const std::uint64_t hedgeFlagSinceVersion(void)
    {
         return 0;
    }

    bool hedgeFlagInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= hedgeFlagSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t hedgeFlagEncodingOffset(void)
    {
         return 165;
    }


    static const char *HedgeFlagMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char hedgeFlagNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char hedgeFlagMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char hedgeFlagMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t hedgeFlagEncodingLength(void)
    {
        return 1;
    }

    char hedgeFlag(void) const
    {
        return (*((char *)(m_buffer + m_offset + 165)));
    }

    Trade_In &hedgeFlag(const char value)
    {
        *((char *)(m_buffer + m_offset + 165)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t priceId(void)
    {
        return 19;
    }

    static SBE_CONSTEXPR const std::uint64_t priceSinceVersion(void)
    {
         return 0;
    }

    bool priceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= priceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t priceEncodingOffset(void)
    {
         return 166;
    }


    static const char *PriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double priceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double priceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double priceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t priceEncodingLength(void)
    {
        return 8;
    }

    double price(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 166)));
    }

    Trade_In &price(const double value)
    {
        *((double *)(m_buffer + m_offset + 166)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t volumeId(void)
    {
        return 20;
    }

    static SBE_CONSTEXPR const std::uint64_t volumeSinceVersion(void)
    {
         return 0;
    }

    bool volumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= volumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t volumeEncodingOffset(void)
    {
         return 174;
    }


    static const char *VolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t volumeNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t volumeEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t volume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 174)));
    }

    Trade_In &volume(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 174)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradeAmountId(void)
    {
        return 21;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeAmountSinceVersion(void)
    {
         return 0;
    }

    bool tradeAmountInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeAmountSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeAmountEncodingOffset(void)
    {
         return 178;
    }


    static const char *TradeAmountMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double tradeAmountNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double tradeAmountMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double tradeAmountMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t tradeAmountEncodingLength(void)
    {
        return 8;
    }

    double tradeAmount(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 178)));
    }

    Trade_In &tradeAmount(const double value)
    {
        *((double *)(m_buffer + m_offset + 178)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradeDateId(void)
    {
        return 22;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeDateSinceVersion(void)
    {
         return 0;
    }

    bool tradeDateInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeDateSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeDateEncodingOffset(void)
    {
         return 186;
    }


    static const char *TradeDateMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char tradeDateNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char tradeDateMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char tradeDateMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t tradeDateEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeDateLength(void)
    {
        return 9;
    }

    const char *tradeDate(void) const
    {
        return (m_buffer + m_offset + 186);
    }

    char tradeDate(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradeDate [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 186 + (index * 1))));
    }

    void tradeDate(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradeDate [E105]");
        }

        *((char *)(m_buffer + m_offset + 186 + (index * 1))) = (value);
    }

    std::uint64_t getTradeDate(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradeDate [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 186, length);
        return length;
    }

    Trade_In &putTradeDate(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 186, src, 9);
        return *this;
    }

    std::string getTradeDateAsString() const
    {
        std::string result(m_buffer + m_offset + 186, 9);
        return result;
    }

    Trade_In &putTradeDate(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 186, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t tradeTimeId(void)
    {
        return 23;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeTimeSinceVersion(void)
    {
         return 0;
    }

    bool tradeTimeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeTimeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeTimeEncodingOffset(void)
    {
         return 195;
    }


    static const char *TradeTimeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char tradeTimeNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char tradeTimeMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char tradeTimeMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t tradeTimeEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeTimeLength(void)
    {
        return 9;
    }

    const char *tradeTime(void) const
    {
        return (m_buffer + m_offset + 195);
    }

    char tradeTime(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradeTime [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 195 + (index * 1))));
    }

    void tradeTime(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradeTime [E105]");
        }

        *((char *)(m_buffer + m_offset + 195 + (index * 1))) = (value);
    }

    std::uint64_t getTradeTime(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradeTime [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 195, length);
        return length;
    }

    Trade_In &putTradeTime(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 195, src, 9);
        return *this;
    }

    std::string getTradeTimeAsString() const
    {
        std::string result(m_buffer + m_offset + 195, 9);
        return result;
    }

    Trade_In &putTradeTime(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 195, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t sequenceNoId(void)
    {
        return 24;
    }

    static SBE_CONSTEXPR const std::uint64_t sequenceNoSinceVersion(void)
    {
         return 0;
    }

    bool sequenceNoInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= sequenceNoSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t sequenceNoEncodingOffset(void)
    {
         return 204;
    }


    static const char *SequenceNoMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t sequenceNoNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t sequenceNoMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t sequenceNoMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t sequenceNoEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t sequenceNo(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 204)));
    }

    Trade_In &sequenceNo(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 204)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t commissionId(void)
    {
        return 25;
    }

    static SBE_CONSTEXPR const std::uint64_t commissionSinceVersion(void)
    {
         return 0;
    }

    bool commissionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= commissionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t commissionEncodingOffset(void)
    {
         return 208;
    }


    static const char *CommissionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double commissionNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double commissionMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double commissionMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t commissionEncodingLength(void)
    {
        return 8;
    }

    double commission(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 208)));
    }

    Trade_In &commission(const double value)
    {
        *((double *)(m_buffer + m_offset + 208)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradingDayId(void)
    {
        return 26;
    }

    static SBE_CONSTEXPR const std::uint64_t tradingDaySinceVersion(void)
    {
         return 0;
    }

    bool tradingDayInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradingDaySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradingDayEncodingOffset(void)
    {
         return 216;
    }


    static const char *TradingDayMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char tradingDayNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char tradingDayMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char tradingDayMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t tradingDayEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t tradingDayLength(void)
    {
        return 9;
    }

    const char *tradingDay(void) const
    {
        return (m_buffer + m_offset + 216);
    }

    char tradingDay(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 216 + (index * 1))));
    }

    void tradingDay(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E105]");
        }

        *((char *)(m_buffer + m_offset + 216 + (index * 1))) = (value);
    }

    std::uint64_t getTradingDay(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradingDay [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 216, length);
        return length;
    }

    Trade_In &putTradingDay(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 216, src, 9);
        return *this;
    }

    std::string getTradingDayAsString() const
    {
        std::string result(m_buffer + m_offset + 216, 9);
        return result;
    }

    Trade_In &putTradingDay(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 216, str.c_str(), 9);
        return *this;
    }

};
}
#endif

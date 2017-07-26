/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_INSTRUMENTCOMMISSIONRATE_IN_H_
#define _TFZQ_INSTRUMENTCOMMISSIONRATE_IN_H_

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

class InstrumentCommissionRate_In
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

    InstrumentCommissionRate_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    InstrumentCommissionRate_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    InstrumentCommissionRate_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)267;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)3;
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

    InstrumentCommissionRate_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    InstrumentCommissionRate_In &wrapForDecode(
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

    static SBE_CONSTEXPR const std::uint16_t exchangeIDId(void)
    {
        return 1;
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
         return 0;
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
        return (m_buffer + m_offset + 0);
    }

    char exchangeID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 0 + (index * 1))));
    }

    void exchangeID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E105]");
        }

        *((char *)(m_buffer + m_offset + 0 + (index * 1))) = (value);
    }

    std::uint64_t getExchangeID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getExchangeID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 0, length);
        return length;
    }

    InstrumentCommissionRate_In &putExchangeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 9);
        return *this;
    }

    std::string getExchangeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 9);
        return result;
    }

    InstrumentCommissionRate_In &putExchangeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 0, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t instrumentIDId(void)
    {
        return 2;
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
         return 9;
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
        return (m_buffer + m_offset + 9);
    }

    char instrumentID(const std::uint64_t index) const
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 9 + (index * 1))));
    }

    void instrumentID(const std::uint64_t index, const char value)
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E105]");
        }

        *((char *)(m_buffer + m_offset + 9 + (index * 1))) = (value);
    }

    std::uint64_t getInstrumentID(char *dst, const std::uint64_t length) const
    {
        if (length > 31)
        {
             throw std::runtime_error("length too large for getInstrumentID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 9, length);
        return length;
    }

    InstrumentCommissionRate_In &putInstrumentID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 9, src, 31);
        return *this;
    }

    std::string getInstrumentIDAsString() const
    {
        std::string result(m_buffer + m_offset + 9, 31);
        return result;
    }

    InstrumentCommissionRate_In &putInstrumentID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 9, str.c_str(), 31);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t investorRangeId(void)
    {
        return 3;
    }

    static SBE_CONSTEXPR const std::uint64_t investorRangeSinceVersion(void)
    {
         return 0;
    }

    bool investorRangeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= investorRangeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t investorRangeEncodingOffset(void)
    {
         return 40;
    }


    static const char *InvestorRangeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char investorRangeNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char investorRangeMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char investorRangeMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t investorRangeEncodingLength(void)
    {
        return 1;
    }

    char investorRange(void) const
    {
        return (*((char *)(m_buffer + m_offset + 40)));
    }

    InstrumentCommissionRate_In &investorRange(const char value)
    {
        *((char *)(m_buffer + m_offset + 40)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t brokerIDId(void)
    {
        return 4;
    }

    static SBE_CONSTEXPR const std::uint64_t brokerIDSinceVersion(void)
    {
         return 0;
    }

    bool brokerIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= brokerIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t brokerIDEncodingOffset(void)
    {
         return 41;
    }


    static const char *BrokerIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char brokerIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char brokerIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char brokerIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t brokerIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t brokerIDLength(void)
    {
        return 11;
    }

    const char *brokerID(void) const
    {
        return (m_buffer + m_offset + 41);
    }

    char brokerID(const std::uint64_t index) const
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for brokerID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 41 + (index * 1))));
    }

    void brokerID(const std::uint64_t index, const char value)
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for brokerID [E105]");
        }

        *((char *)(m_buffer + m_offset + 41 + (index * 1))) = (value);
    }

    std::uint64_t getBrokerID(char *dst, const std::uint64_t length) const
    {
        if (length > 11)
        {
             throw std::runtime_error("length too large for getBrokerID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 41, length);
        return length;
    }

    InstrumentCommissionRate_In &putBrokerID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 41, src, 11);
        return *this;
    }

    std::string getBrokerIDAsString() const
    {
        std::string result(m_buffer + m_offset + 41, 11);
        return result;
    }

    InstrumentCommissionRate_In &putBrokerID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 41, str.c_str(), 11);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t providerIDId(void)
    {
        return 5;
    }

    static SBE_CONSTEXPR const std::uint64_t providerIDSinceVersion(void)
    {
         return 0;
    }

    bool providerIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= providerIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t providerIDEncodingOffset(void)
    {
         return 52;
    }


    static const char *ProviderIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char providerIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char providerIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char providerIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t providerIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t providerIDLength(void)
    {
        return 11;
    }

    const char *providerID(void) const
    {
        return (m_buffer + m_offset + 52);
    }

    char providerID(const std::uint64_t index) const
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for providerID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 52 + (index * 1))));
    }

    void providerID(const std::uint64_t index, const char value)
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for providerID [E105]");
        }

        *((char *)(m_buffer + m_offset + 52 + (index * 1))) = (value);
    }

    std::uint64_t getProviderID(char *dst, const std::uint64_t length) const
    {
        if (length > 11)
        {
             throw std::runtime_error("length too large for getProviderID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 52, length);
        return length;
    }

    InstrumentCommissionRate_In &putProviderID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 52, src, 11);
        return *this;
    }

    std::string getProviderIDAsString() const
    {
        std::string result(m_buffer + m_offset + 52, 11);
        return result;
    }

    InstrumentCommissionRate_In &putProviderID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 52, str.c_str(), 11);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t brokerInvestorIDId(void)
    {
        return 6;
    }

    static SBE_CONSTEXPR const std::uint64_t brokerInvestorIDSinceVersion(void)
    {
         return 0;
    }

    bool brokerInvestorIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= brokerInvestorIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t brokerInvestorIDEncodingOffset(void)
    {
         return 63;
    }


    static const char *BrokerInvestorIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char brokerInvestorIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char brokerInvestorIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char brokerInvestorIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t brokerInvestorIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t brokerInvestorIDLength(void)
    {
        return 33;
    }

    const char *brokerInvestorID(void) const
    {
        return (m_buffer + m_offset + 63);
    }

    char brokerInvestorID(const std::uint64_t index) const
    {
        if (index >= 33)
        {
            throw std::runtime_error("index out of range for brokerInvestorID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 63 + (index * 1))));
    }

    void brokerInvestorID(const std::uint64_t index, const char value)
    {
        if (index >= 33)
        {
            throw std::runtime_error("index out of range for brokerInvestorID [E105]");
        }

        *((char *)(m_buffer + m_offset + 63 + (index * 1))) = (value);
    }

    std::uint64_t getBrokerInvestorID(char *dst, const std::uint64_t length) const
    {
        if (length > 33)
        {
             throw std::runtime_error("length too large for getBrokerInvestorID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 63, length);
        return length;
    }

    InstrumentCommissionRate_In &putBrokerInvestorID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 63, src, 33);
        return *this;
    }

    std::string getBrokerInvestorIDAsString() const
    {
        std::string result(m_buffer + m_offset + 63, 33);
        return result;
    }

    InstrumentCommissionRate_In &putBrokerInvestorID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 63, str.c_str(), 33);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t directionId(void)
    {
        return 7;
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
         return 96;
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
        return (*((char *)(m_buffer + m_offset + 96)));
    }

    InstrumentCommissionRate_In &direction(const char value)
    {
        *((char *)(m_buffer + m_offset + 96)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t offsetFlagId(void)
    {
        return 8;
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
         return 97;
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
        return (*((char *)(m_buffer + m_offset + 97)));
    }

    InstrumentCommissionRate_In &offsetFlag(const char value)
    {
        *((char *)(m_buffer + m_offset + 97)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t stampTaxRateByMoneyId(void)
    {
        return 9;
    }

    static SBE_CONSTEXPR const std::uint64_t stampTaxRateByMoneySinceVersion(void)
    {
         return 0;
    }

    bool stampTaxRateByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= stampTaxRateByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t stampTaxRateByMoneyEncodingOffset(void)
    {
         return 98;
    }


    static const char *StampTaxRateByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double stampTaxRateByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double stampTaxRateByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double stampTaxRateByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t stampTaxRateByMoneyEncodingLength(void)
    {
        return 8;
    }

    double stampTaxRateByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 98)));
    }

    InstrumentCommissionRate_In &stampTaxRateByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 98)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t stampTaxRateByVolumeId(void)
    {
        return 10;
    }

    static SBE_CONSTEXPR const std::uint64_t stampTaxRateByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool stampTaxRateByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= stampTaxRateByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t stampTaxRateByVolumeEncodingOffset(void)
    {
         return 106;
    }


    static const char *StampTaxRateByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double stampTaxRateByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double stampTaxRateByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double stampTaxRateByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t stampTaxRateByVolumeEncodingLength(void)
    {
        return 8;
    }

    double stampTaxRateByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 106)));
    }

    InstrumentCommissionRate_In &stampTaxRateByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 106)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t transferFeeRateByMoneyId(void)
    {
        return 11;
    }

    static SBE_CONSTEXPR const std::uint64_t transferFeeRateByMoneySinceVersion(void)
    {
         return 0;
    }

    bool transferFeeRateByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= transferFeeRateByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t transferFeeRateByMoneyEncodingOffset(void)
    {
         return 114;
    }


    static const char *TransferFeeRateByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double transferFeeRateByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double transferFeeRateByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double transferFeeRateByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t transferFeeRateByMoneyEncodingLength(void)
    {
        return 8;
    }

    double transferFeeRateByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 114)));
    }

    InstrumentCommissionRate_In &transferFeeRateByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 114)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t transferFeeRateByVolumeId(void)
    {
        return 12;
    }

    static SBE_CONSTEXPR const std::uint64_t transferFeeRateByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool transferFeeRateByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= transferFeeRateByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t transferFeeRateByVolumeEncodingOffset(void)
    {
         return 122;
    }


    static const char *TransferFeeRateByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double transferFeeRateByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double transferFeeRateByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double transferFeeRateByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t transferFeeRateByVolumeEncodingLength(void)
    {
        return 8;
    }

    double transferFeeRateByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 122)));
    }

    InstrumentCommissionRate_In &transferFeeRateByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 122)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t handlingFeeByMoneyId(void)
    {
        return 13;
    }

    static SBE_CONSTEXPR const std::uint64_t handlingFeeByMoneySinceVersion(void)
    {
         return 0;
    }

    bool handlingFeeByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= handlingFeeByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t handlingFeeByMoneyEncodingOffset(void)
    {
         return 130;
    }


    static const char *HandlingFeeByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double handlingFeeByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double handlingFeeByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double handlingFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t handlingFeeByMoneyEncodingLength(void)
    {
        return 8;
    }

    double handlingFeeByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 130)));
    }

    InstrumentCommissionRate_In &handlingFeeByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 130)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t handlingFeeByVolumeId(void)
    {
        return 14;
    }

    static SBE_CONSTEXPR const std::uint64_t handlingFeeByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool handlingFeeByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= handlingFeeByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t handlingFeeByVolumeEncodingOffset(void)
    {
         return 138;
    }


    static const char *HandlingFeeByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double handlingFeeByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double handlingFeeByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double handlingFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t handlingFeeByVolumeEncodingLength(void)
    {
        return 8;
    }

    double handlingFeeByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 138)));
    }

    InstrumentCommissionRate_In &handlingFeeByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 138)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t adminFeeByMoneyId(void)
    {
        return 15;
    }

    static SBE_CONSTEXPR const std::uint64_t adminFeeByMoneySinceVersion(void)
    {
         return 0;
    }

    bool adminFeeByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= adminFeeByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t adminFeeByMoneyEncodingOffset(void)
    {
         return 146;
    }


    static const char *AdminFeeByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double adminFeeByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double adminFeeByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double adminFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t adminFeeByMoneyEncodingLength(void)
    {
        return 8;
    }

    double adminFeeByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 146)));
    }

    InstrumentCommissionRate_In &adminFeeByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 146)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t adminFeeByVolumeId(void)
    {
        return 16;
    }

    static SBE_CONSTEXPR const std::uint64_t adminFeeByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool adminFeeByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= adminFeeByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t adminFeeByVolumeEncodingOffset(void)
    {
         return 154;
    }


    static const char *AdminFeeByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double adminFeeByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double adminFeeByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double adminFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t adminFeeByVolumeEncodingLength(void)
    {
        return 8;
    }

    double adminFeeByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 154)));
    }

    InstrumentCommissionRate_In &adminFeeByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 154)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradeFeeByMoneyId(void)
    {
        return 17;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeFeeByMoneySinceVersion(void)
    {
         return 0;
    }

    bool tradeFeeByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeFeeByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeFeeByMoneyEncodingOffset(void)
    {
         return 162;
    }


    static const char *TradeFeeByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double tradeFeeByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double tradeFeeByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double tradeFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t tradeFeeByMoneyEncodingLength(void)
    {
        return 8;
    }

    double tradeFeeByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 162)));
    }

    InstrumentCommissionRate_In &tradeFeeByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 162)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradeFeeByVolumeId(void)
    {
        return 18;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeFeeByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool tradeFeeByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeFeeByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeFeeByVolumeEncodingOffset(void)
    {
         return 170;
    }


    static const char *TradeFeeByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double tradeFeeByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double tradeFeeByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double tradeFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t tradeFeeByVolumeEncodingLength(void)
    {
        return 8;
    }

    double tradeFeeByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 170)));
    }

    InstrumentCommissionRate_In &tradeFeeByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 170)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t clearingFeeByMoneyId(void)
    {
        return 19;
    }

    static SBE_CONSTEXPR const std::uint64_t clearingFeeByMoneySinceVersion(void)
    {
         return 0;
    }

    bool clearingFeeByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= clearingFeeByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t clearingFeeByMoneyEncodingOffset(void)
    {
         return 178;
    }


    static const char *ClearingFeeByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double clearingFeeByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double clearingFeeByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double clearingFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t clearingFeeByMoneyEncodingLength(void)
    {
        return 8;
    }

    double clearingFeeByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 178)));
    }

    InstrumentCommissionRate_In &clearingFeeByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 178)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t clearingFeeByVolumeId(void)
    {
        return 20;
    }

    static SBE_CONSTEXPR const std::uint64_t clearingFeeByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool clearingFeeByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= clearingFeeByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t clearingFeeByVolumeEncodingOffset(void)
    {
         return 186;
    }


    static const char *ClearingFeeByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double clearingFeeByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double clearingFeeByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double clearingFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t clearingFeeByVolumeEncodingLength(void)
    {
        return 8;
    }

    double clearingFeeByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 186)));
    }

    InstrumentCommissionRate_In &clearingFeeByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 186)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t otherFeeByVolumeId(void)
    {
        return 21;
    }

    static SBE_CONSTEXPR const std::uint64_t otherFeeByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool otherFeeByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= otherFeeByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t otherFeeByVolumeEncodingOffset(void)
    {
         return 194;
    }


    static const char *OtherFeeByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double otherFeeByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double otherFeeByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double otherFeeByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t otherFeeByVolumeEncodingLength(void)
    {
        return 8;
    }

    double otherFeeByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 194)));
    }

    InstrumentCommissionRate_In &otherFeeByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 194)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t otherFeeByMoneyId(void)
    {
        return 22;
    }

    static SBE_CONSTEXPR const std::uint64_t otherFeeByMoneySinceVersion(void)
    {
         return 0;
    }

    bool otherFeeByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= otherFeeByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t otherFeeByMoneyEncodingOffset(void)
    {
         return 202;
    }


    static const char *OtherFeeByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double otherFeeByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double otherFeeByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double otherFeeByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t otherFeeByMoneyEncodingLength(void)
    {
        return 8;
    }

    double otherFeeByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 202)));
    }

    InstrumentCommissionRate_In &otherFeeByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 202)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t closeRatioByMoneyId(void)
    {
        return 23;
    }

    static SBE_CONSTEXPR const std::uint64_t closeRatioByMoneySinceVersion(void)
    {
         return 0;
    }

    bool closeRatioByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= closeRatioByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t closeRatioByMoneyEncodingOffset(void)
    {
         return 210;
    }


    static const char *CloseRatioByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double closeRatioByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double closeRatioByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double closeRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t closeRatioByMoneyEncodingLength(void)
    {
        return 8;
    }

    double closeRatioByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 210)));
    }

    InstrumentCommissionRate_In &closeRatioByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 210)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t closeRatioByVolumeId(void)
    {
        return 24;
    }

    static SBE_CONSTEXPR const std::uint64_t closeRatioByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool closeRatioByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= closeRatioByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t closeRatioByVolumeEncodingOffset(void)
    {
         return 218;
    }


    static const char *CloseRatioByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double closeRatioByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double closeRatioByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double closeRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t closeRatioByVolumeEncodingLength(void)
    {
        return 8;
    }

    double closeRatioByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 218)));
    }

    InstrumentCommissionRate_In &closeRatioByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 218)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t closeTodayRatioByMoneyId(void)
    {
        return 25;
    }

    static SBE_CONSTEXPR const std::uint64_t closeTodayRatioByMoneySinceVersion(void)
    {
         return 0;
    }

    bool closeTodayRatioByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= closeTodayRatioByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t closeTodayRatioByMoneyEncodingOffset(void)
    {
         return 226;
    }


    static const char *CloseTodayRatioByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double closeTodayRatioByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double closeTodayRatioByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double closeTodayRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t closeTodayRatioByMoneyEncodingLength(void)
    {
        return 8;
    }

    double closeTodayRatioByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 226)));
    }

    InstrumentCommissionRate_In &closeTodayRatioByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 226)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t closeTodayRatioByVolumeId(void)
    {
        return 26;
    }

    static SBE_CONSTEXPR const std::uint64_t closeTodayRatioByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool closeTodayRatioByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= closeTodayRatioByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t closeTodayRatioByVolumeEncodingOffset(void)
    {
         return 234;
    }


    static const char *CloseTodayRatioByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double closeTodayRatioByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double closeTodayRatioByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double closeTodayRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t closeTodayRatioByVolumeEncodingLength(void)
    {
        return 8;
    }

    double closeTodayRatioByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 234)));
    }

    InstrumentCommissionRate_In &closeTodayRatioByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 234)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openRatioByMoneyId(void)
    {
        return 27;
    }

    static SBE_CONSTEXPR const std::uint64_t openRatioByMoneySinceVersion(void)
    {
         return 0;
    }

    bool openRatioByMoneyInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openRatioByMoneySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openRatioByMoneyEncodingOffset(void)
    {
         return 242;
    }


    static const char *OpenRatioByMoneyMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double openRatioByMoneyNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double openRatioByMoneyMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double openRatioByMoneyMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t openRatioByMoneyEncodingLength(void)
    {
        return 8;
    }

    double openRatioByMoney(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 242)));
    }

    InstrumentCommissionRate_In &openRatioByMoney(const double value)
    {
        *((double *)(m_buffer + m_offset + 242)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openRatioByVolumeId(void)
    {
        return 28;
    }

    static SBE_CONSTEXPR const std::uint64_t openRatioByVolumeSinceVersion(void)
    {
         return 0;
    }

    bool openRatioByVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openRatioByVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openRatioByVolumeEncodingOffset(void)
    {
         return 250;
    }


    static const char *OpenRatioByVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double openRatioByVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double openRatioByVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double openRatioByVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t openRatioByVolumeEncodingLength(void)
    {
        return 8;
    }

    double openRatioByVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 250)));
    }

    InstrumentCommissionRate_In &openRatioByVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 250)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradingDayId(void)
    {
        return 29;
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
         return 258;
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
        return (m_buffer + m_offset + 258);
    }

    char tradingDay(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 258 + (index * 1))));
    }

    void tradingDay(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E105]");
        }

        *((char *)(m_buffer + m_offset + 258 + (index * 1))) = (value);
    }

    std::uint64_t getTradingDay(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradingDay [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 258, length);
        return length;
    }

    InstrumentCommissionRate_In &putTradingDay(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 258, src, 9);
        return *this;
    }

    std::string getTradingDayAsString() const
    {
        std::string result(m_buffer + m_offset + 258, 9);
        return result;
    }

    InstrumentCommissionRate_In &putTradingDay(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 258, str.c_str(), 9);
        return *this;
    }

};
}
#endif

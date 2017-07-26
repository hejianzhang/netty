/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_DEPTHMARKETDATA_IN_H_
#define _TFZQ_DEPTHMARKETDATA_IN_H_

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

class DepthMarketData_In
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

    DepthMarketData_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    DepthMarketData_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    DepthMarketData_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)393;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)6;
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

    DepthMarketData_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    DepthMarketData_In &wrapForDecode(
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

    static SBE_CONSTEXPR const std::uint16_t instrumentIDId(void)
    {
        return 1;
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
         return 0;
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
        return (m_buffer + m_offset + 0);
    }

    char instrumentID(const std::uint64_t index) const
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 0 + (index * 1))));
    }

    void instrumentID(const std::uint64_t index, const char value)
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for instrumentID [E105]");
        }

        *((char *)(m_buffer + m_offset + 0 + (index * 1))) = (value);
    }

    std::uint64_t getInstrumentID(char *dst, const std::uint64_t length) const
    {
        if (length > 31)
        {
             throw std::runtime_error("length too large for getInstrumentID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 0, length);
        return length;
    }

    DepthMarketData_In &putInstrumentID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 31);
        return *this;
    }

    std::string getInstrumentIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 31);
        return result;
    }

    DepthMarketData_In &putInstrumentID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 0, str.c_str(), 31);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t exchangeIDId(void)
    {
        return 2;
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
         return 31;
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
        return (m_buffer + m_offset + 31);
    }

    char exchangeID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 31 + (index * 1))));
    }

    void exchangeID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for exchangeID [E105]");
        }

        *((char *)(m_buffer + m_offset + 31 + (index * 1))) = (value);
    }

    std::uint64_t getExchangeID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getExchangeID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 31, length);
        return length;
    }

    DepthMarketData_In &putExchangeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 31, src, 9);
        return *this;
    }

    std::string getExchangeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 31, 9);
        return result;
    }

    DepthMarketData_In &putExchangeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 31, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t lastPriceId(void)
    {
        return 3;
    }

    static SBE_CONSTEXPR const std::uint64_t lastPriceSinceVersion(void)
    {
         return 0;
    }

    bool lastPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= lastPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t lastPriceEncodingOffset(void)
    {
         return 40;
    }


    static const char *LastPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double lastPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double lastPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double lastPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t lastPriceEncodingLength(void)
    {
        return 8;
    }

    double lastPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 40)));
    }

    DepthMarketData_In &lastPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 40)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t preSettlementPriceId(void)
    {
        return 4;
    }

    static SBE_CONSTEXPR const std::uint64_t preSettlementPriceSinceVersion(void)
    {
         return 0;
    }

    bool preSettlementPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= preSettlementPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t preSettlementPriceEncodingOffset(void)
    {
         return 48;
    }


    static const char *PreSettlementPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double preSettlementPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double preSettlementPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double preSettlementPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t preSettlementPriceEncodingLength(void)
    {
        return 8;
    }

    double preSettlementPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 48)));
    }

    DepthMarketData_In &preSettlementPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 48)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t preClosePriceId(void)
    {
        return 5;
    }

    static SBE_CONSTEXPR const std::uint64_t preClosePriceSinceVersion(void)
    {
         return 0;
    }

    bool preClosePriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= preClosePriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t preClosePriceEncodingOffset(void)
    {
         return 56;
    }


    static const char *PreClosePriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double preClosePriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double preClosePriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double preClosePriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t preClosePriceEncodingLength(void)
    {
        return 8;
    }

    double preClosePrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 56)));
    }

    DepthMarketData_In &preClosePrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 56)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t preOpenInterestId(void)
    {
        return 6;
    }

    static SBE_CONSTEXPR const std::uint64_t preOpenInterestSinceVersion(void)
    {
         return 0;
    }

    bool preOpenInterestInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= preOpenInterestSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t preOpenInterestEncodingOffset(void)
    {
         return 64;
    }


    static const char *PreOpenInterestMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double preOpenInterestNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double preOpenInterestMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double preOpenInterestMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t preOpenInterestEncodingLength(void)
    {
        return 8;
    }

    double preOpenInterest(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 64)));
    }

    DepthMarketData_In &preOpenInterest(const double value)
    {
        *((double *)(m_buffer + m_offset + 64)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openPriceId(void)
    {
        return 7;
    }

    static SBE_CONSTEXPR const std::uint64_t openPriceSinceVersion(void)
    {
         return 0;
    }

    bool openPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openPriceEncodingOffset(void)
    {
         return 72;
    }


    static const char *OpenPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double openPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double openPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double openPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t openPriceEncodingLength(void)
    {
        return 8;
    }

    double openPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 72)));
    }

    DepthMarketData_In &openPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 72)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t highestPriceId(void)
    {
        return 8;
    }

    static SBE_CONSTEXPR const std::uint64_t highestPriceSinceVersion(void)
    {
         return 0;
    }

    bool highestPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= highestPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t highestPriceEncodingOffset(void)
    {
         return 80;
    }


    static const char *HighestPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double highestPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double highestPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double highestPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t highestPriceEncodingLength(void)
    {
        return 8;
    }

    double highestPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 80)));
    }

    DepthMarketData_In &highestPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 80)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t lowestPriceId(void)
    {
        return 9;
    }

    static SBE_CONSTEXPR const std::uint64_t lowestPriceSinceVersion(void)
    {
         return 0;
    }

    bool lowestPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= lowestPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t lowestPriceEncodingOffset(void)
    {
         return 88;
    }


    static const char *LowestPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double lowestPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double lowestPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double lowestPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t lowestPriceEncodingLength(void)
    {
        return 8;
    }

    double lowestPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 88)));
    }

    DepthMarketData_In &lowestPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 88)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradeVolumeId(void)
    {
        return 10;
    }

    static SBE_CONSTEXPR const std::uint64_t tradeVolumeSinceVersion(void)
    {
         return 0;
    }

    bool tradeVolumeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradeVolumeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradeVolumeEncodingOffset(void)
    {
         return 96;
    }


    static const char *TradeVolumeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double tradeVolumeNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double tradeVolumeMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double tradeVolumeMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t tradeVolumeEncodingLength(void)
    {
        return 8;
    }

    double tradeVolume(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 96)));
    }

    DepthMarketData_In &tradeVolume(const double value)
    {
        *((double *)(m_buffer + m_offset + 96)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t turnoverId(void)
    {
        return 11;
    }

    static SBE_CONSTEXPR const std::uint64_t turnoverSinceVersion(void)
    {
         return 0;
    }

    bool turnoverInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= turnoverSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t turnoverEncodingOffset(void)
    {
         return 104;
    }


    static const char *TurnoverMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double turnoverNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double turnoverMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double turnoverMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t turnoverEncodingLength(void)
    {
        return 8;
    }

    double turnover(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 104)));
    }

    DepthMarketData_In &turnover(const double value)
    {
        *((double *)(m_buffer + m_offset + 104)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openInterestId(void)
    {
        return 12;
    }

    static SBE_CONSTEXPR const std::uint64_t openInterestSinceVersion(void)
    {
         return 0;
    }

    bool openInterestInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openInterestSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openInterestEncodingOffset(void)
    {
         return 112;
    }


    static const char *OpenInterestMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double openInterestNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double openInterestMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double openInterestMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t openInterestEncodingLength(void)
    {
        return 8;
    }

    double openInterest(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 112)));
    }

    DepthMarketData_In &openInterest(const double value)
    {
        *((double *)(m_buffer + m_offset + 112)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t closePriceId(void)
    {
        return 13;
    }

    static SBE_CONSTEXPR const std::uint64_t closePriceSinceVersion(void)
    {
         return 0;
    }

    bool closePriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= closePriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t closePriceEncodingOffset(void)
    {
         return 120;
    }


    static const char *ClosePriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double closePriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double closePriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double closePriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t closePriceEncodingLength(void)
    {
        return 8;
    }

    double closePrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 120)));
    }

    DepthMarketData_In &closePrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 120)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t settlementPriceId(void)
    {
        return 14;
    }

    static SBE_CONSTEXPR const std::uint64_t settlementPriceSinceVersion(void)
    {
         return 0;
    }

    bool settlementPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= settlementPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t settlementPriceEncodingOffset(void)
    {
         return 128;
    }


    static const char *SettlementPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double settlementPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double settlementPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double settlementPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t settlementPriceEncodingLength(void)
    {
        return 8;
    }

    double settlementPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 128)));
    }

    DepthMarketData_In &settlementPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 128)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t upperLimitPriceId(void)
    {
        return 15;
    }

    static SBE_CONSTEXPR const std::uint64_t upperLimitPriceSinceVersion(void)
    {
         return 0;
    }

    bool upperLimitPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= upperLimitPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t upperLimitPriceEncodingOffset(void)
    {
         return 136;
    }


    static const char *UpperLimitPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double upperLimitPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double upperLimitPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double upperLimitPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t upperLimitPriceEncodingLength(void)
    {
        return 8;
    }

    double upperLimitPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 136)));
    }

    DepthMarketData_In &upperLimitPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 136)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t lowerLimitPriceId(void)
    {
        return 16;
    }

    static SBE_CONSTEXPR const std::uint64_t lowerLimitPriceSinceVersion(void)
    {
         return 0;
    }

    bool lowerLimitPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= lowerLimitPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t lowerLimitPriceEncodingOffset(void)
    {
         return 144;
    }


    static const char *LowerLimitPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double lowerLimitPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double lowerLimitPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double lowerLimitPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t lowerLimitPriceEncodingLength(void)
    {
        return 8;
    }

    double lowerLimitPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 144)));
    }

    DepthMarketData_In &lowerLimitPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 144)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t preIOPVId(void)
    {
        return 17;
    }

    static SBE_CONSTEXPR const std::uint64_t preIOPVSinceVersion(void)
    {
         return 0;
    }

    bool preIOPVInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= preIOPVSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t preIOPVEncodingOffset(void)
    {
         return 152;
    }


    static const char *PreIOPVMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double preIOPVNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double preIOPVMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double preIOPVMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t preIOPVEncodingLength(void)
    {
        return 8;
    }

    double preIOPV(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 152)));
    }

    DepthMarketData_In &preIOPV(const double value)
    {
        *((double *)(m_buffer + m_offset + 152)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t iOPVId(void)
    {
        return 18;
    }

    static SBE_CONSTEXPR const std::uint64_t iOPVSinceVersion(void)
    {
         return 0;
    }

    bool iOPVInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= iOPVSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t iOPVEncodingOffset(void)
    {
         return 160;
    }


    static const char *IOPVMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double iOPVNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double iOPVMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double iOPVMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t iOPVEncodingLength(void)
    {
        return 8;
    }

    double iOPV(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 160)));
    }

    DepthMarketData_In &iOPV(const double value)
    {
        *((double *)(m_buffer + m_offset + 160)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t preDeltaId(void)
    {
        return 19;
    }

    static SBE_CONSTEXPR const std::uint64_t preDeltaSinceVersion(void)
    {
         return 0;
    }

    bool preDeltaInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= preDeltaSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t preDeltaEncodingOffset(void)
    {
         return 168;
    }


    static const char *PreDeltaMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double preDeltaNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double preDeltaMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double preDeltaMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t preDeltaEncodingLength(void)
    {
        return 8;
    }

    double preDelta(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 168)));
    }

    DepthMarketData_In &preDelta(const double value)
    {
        *((double *)(m_buffer + m_offset + 168)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t currDeltaId(void)
    {
        return 20;
    }

    static SBE_CONSTEXPR const std::uint64_t currDeltaSinceVersion(void)
    {
         return 0;
    }

    bool currDeltaInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= currDeltaSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t currDeltaEncodingOffset(void)
    {
         return 176;
    }


    static const char *CurrDeltaMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double currDeltaNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double currDeltaMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double currDeltaMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t currDeltaEncodingLength(void)
    {
        return 8;
    }

    double currDelta(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 176)));
    }

    DepthMarketData_In &currDelta(const double value)
    {
        *((double *)(m_buffer + m_offset + 176)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t auctionPriceId(void)
    {
        return 21;
    }

    static SBE_CONSTEXPR const std::uint64_t auctionPriceSinceVersion(void)
    {
         return 0;
    }

    bool auctionPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= auctionPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t auctionPriceEncodingOffset(void)
    {
         return 184;
    }


    static const char *AuctionPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double auctionPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double auctionPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double auctionPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t auctionPriceEncodingLength(void)
    {
        return 8;
    }

    double auctionPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 184)));
    }

    DepthMarketData_In &auctionPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 184)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t updateTimeId(void)
    {
        return 22;
    }

    static SBE_CONSTEXPR const std::uint64_t updateTimeSinceVersion(void)
    {
         return 0;
    }

    bool updateTimeInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= updateTimeSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t updateTimeEncodingOffset(void)
    {
         return 192;
    }


    static const char *UpdateTimeMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char updateTimeNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char updateTimeMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char updateTimeMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t updateTimeEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t updateTimeLength(void)
    {
        return 9;
    }

    const char *updateTime(void) const
    {
        return (m_buffer + m_offset + 192);
    }

    char updateTime(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for updateTime [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 192 + (index * 1))));
    }

    void updateTime(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for updateTime [E105]");
        }

        *((char *)(m_buffer + m_offset + 192 + (index * 1))) = (value);
    }

    std::uint64_t getUpdateTime(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getUpdateTime [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 192, length);
        return length;
    }

    DepthMarketData_In &putUpdateTime(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 192, src, 9);
        return *this;
    }

    std::string getUpdateTimeAsString() const
    {
        std::string result(m_buffer + m_offset + 192, 9);
        return result;
    }

    DepthMarketData_In &putUpdateTime(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 192, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t updateMillisecId(void)
    {
        return 23;
    }

    static SBE_CONSTEXPR const std::uint64_t updateMillisecSinceVersion(void)
    {
         return 0;
    }

    bool updateMillisecInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= updateMillisecSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t updateMillisecEncodingOffset(void)
    {
         return 201;
    }


    static const char *UpdateMillisecMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t updateMillisecNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t updateMillisecMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t updateMillisecMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t updateMillisecEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t updateMillisec(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 201)));
    }

    DepthMarketData_In &updateMillisec(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 201)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidPrice1Id(void)
    {
        return 24;
    }

    static SBE_CONSTEXPR const std::uint64_t bidPrice1SinceVersion(void)
    {
         return 0;
    }

    bool bidPrice1InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidPrice1SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidPrice1EncodingOffset(void)
    {
         return 205;
    }


    static const char *BidPrice1MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidPrice1NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidPrice1MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidPrice1MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidPrice1EncodingLength(void)
    {
        return 8;
    }

    double bidPrice1(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 205)));
    }

    DepthMarketData_In &bidPrice1(const double value)
    {
        *((double *)(m_buffer + m_offset + 205)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidVolume1Id(void)
    {
        return 25;
    }

    static SBE_CONSTEXPR const std::uint64_t bidVolume1SinceVersion(void)
    {
         return 0;
    }

    bool bidVolume1InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidVolume1SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidVolume1EncodingOffset(void)
    {
         return 213;
    }


    static const char *BidVolume1MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidVolume1NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidVolume1MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidVolume1MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidVolume1EncodingLength(void)
    {
        return 8;
    }

    double bidVolume1(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 213)));
    }

    DepthMarketData_In &bidVolume1(const double value)
    {
        *((double *)(m_buffer + m_offset + 213)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askPrice1Id(void)
    {
        return 26;
    }

    static SBE_CONSTEXPR const std::uint64_t askPrice1SinceVersion(void)
    {
         return 0;
    }

    bool askPrice1InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askPrice1SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askPrice1EncodingOffset(void)
    {
         return 221;
    }


    static const char *AskPrice1MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askPrice1NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askPrice1MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askPrice1MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askPrice1EncodingLength(void)
    {
        return 8;
    }

    double askPrice1(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 221)));
    }

    DepthMarketData_In &askPrice1(const double value)
    {
        *((double *)(m_buffer + m_offset + 221)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askVolume1Id(void)
    {
        return 27;
    }

    static SBE_CONSTEXPR const std::uint64_t askVolume1SinceVersion(void)
    {
         return 0;
    }

    bool askVolume1InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askVolume1SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askVolume1EncodingOffset(void)
    {
         return 229;
    }


    static const char *AskVolume1MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askVolume1NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askVolume1MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askVolume1MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askVolume1EncodingLength(void)
    {
        return 8;
    }

    double askVolume1(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 229)));
    }

    DepthMarketData_In &askVolume1(const double value)
    {
        *((double *)(m_buffer + m_offset + 229)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidPrice2Id(void)
    {
        return 28;
    }

    static SBE_CONSTEXPR const std::uint64_t bidPrice2SinceVersion(void)
    {
         return 0;
    }

    bool bidPrice2InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidPrice2SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidPrice2EncodingOffset(void)
    {
         return 237;
    }


    static const char *BidPrice2MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidPrice2NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidPrice2MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidPrice2MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidPrice2EncodingLength(void)
    {
        return 8;
    }

    double bidPrice2(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 237)));
    }

    DepthMarketData_In &bidPrice2(const double value)
    {
        *((double *)(m_buffer + m_offset + 237)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidVolume2Id(void)
    {
        return 29;
    }

    static SBE_CONSTEXPR const std::uint64_t bidVolume2SinceVersion(void)
    {
         return 0;
    }

    bool bidVolume2InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidVolume2SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidVolume2EncodingOffset(void)
    {
         return 245;
    }


    static const char *BidVolume2MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidVolume2NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidVolume2MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidVolume2MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidVolume2EncodingLength(void)
    {
        return 8;
    }

    double bidVolume2(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 245)));
    }

    DepthMarketData_In &bidVolume2(const double value)
    {
        *((double *)(m_buffer + m_offset + 245)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askPrice2Id(void)
    {
        return 30;
    }

    static SBE_CONSTEXPR const std::uint64_t askPrice2SinceVersion(void)
    {
         return 0;
    }

    bool askPrice2InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askPrice2SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askPrice2EncodingOffset(void)
    {
         return 253;
    }


    static const char *AskPrice2MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askPrice2NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askPrice2MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askPrice2MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askPrice2EncodingLength(void)
    {
        return 8;
    }

    double askPrice2(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 253)));
    }

    DepthMarketData_In &askPrice2(const double value)
    {
        *((double *)(m_buffer + m_offset + 253)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askVolume2Id(void)
    {
        return 31;
    }

    static SBE_CONSTEXPR const std::uint64_t askVolume2SinceVersion(void)
    {
         return 0;
    }

    bool askVolume2InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askVolume2SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askVolume2EncodingOffset(void)
    {
         return 261;
    }


    static const char *AskVolume2MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askVolume2NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askVolume2MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askVolume2MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askVolume2EncodingLength(void)
    {
        return 8;
    }

    double askVolume2(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 261)));
    }

    DepthMarketData_In &askVolume2(const double value)
    {
        *((double *)(m_buffer + m_offset + 261)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidPrice3Id(void)
    {
        return 32;
    }

    static SBE_CONSTEXPR const std::uint64_t bidPrice3SinceVersion(void)
    {
         return 0;
    }

    bool bidPrice3InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidPrice3SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidPrice3EncodingOffset(void)
    {
         return 269;
    }


    static const char *BidPrice3MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidPrice3NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidPrice3MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidPrice3MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidPrice3EncodingLength(void)
    {
        return 8;
    }

    double bidPrice3(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 269)));
    }

    DepthMarketData_In &bidPrice3(const double value)
    {
        *((double *)(m_buffer + m_offset + 269)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidVolume3Id(void)
    {
        return 33;
    }

    static SBE_CONSTEXPR const std::uint64_t bidVolume3SinceVersion(void)
    {
         return 0;
    }

    bool bidVolume3InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidVolume3SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidVolume3EncodingOffset(void)
    {
         return 277;
    }


    static const char *BidVolume3MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidVolume3NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidVolume3MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidVolume3MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidVolume3EncodingLength(void)
    {
        return 8;
    }

    double bidVolume3(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 277)));
    }

    DepthMarketData_In &bidVolume3(const double value)
    {
        *((double *)(m_buffer + m_offset + 277)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askPrice3Id(void)
    {
        return 34;
    }

    static SBE_CONSTEXPR const std::uint64_t askPrice3SinceVersion(void)
    {
         return 0;
    }

    bool askPrice3InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askPrice3SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askPrice3EncodingOffset(void)
    {
         return 285;
    }


    static const char *AskPrice3MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askPrice3NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askPrice3MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askPrice3MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askPrice3EncodingLength(void)
    {
        return 8;
    }

    double askPrice3(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 285)));
    }

    DepthMarketData_In &askPrice3(const double value)
    {
        *((double *)(m_buffer + m_offset + 285)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askVolume3Id(void)
    {
        return 35;
    }

    static SBE_CONSTEXPR const std::uint64_t askVolume3SinceVersion(void)
    {
         return 0;
    }

    bool askVolume3InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askVolume3SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askVolume3EncodingOffset(void)
    {
         return 293;
    }


    static const char *AskVolume3MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askVolume3NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askVolume3MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askVolume3MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askVolume3EncodingLength(void)
    {
        return 8;
    }

    double askVolume3(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 293)));
    }

    DepthMarketData_In &askVolume3(const double value)
    {
        *((double *)(m_buffer + m_offset + 293)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidPrice4Id(void)
    {
        return 36;
    }

    static SBE_CONSTEXPR const std::uint64_t bidPrice4SinceVersion(void)
    {
         return 0;
    }

    bool bidPrice4InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidPrice4SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidPrice4EncodingOffset(void)
    {
         return 301;
    }


    static const char *BidPrice4MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidPrice4NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidPrice4MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidPrice4MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidPrice4EncodingLength(void)
    {
        return 8;
    }

    double bidPrice4(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 301)));
    }

    DepthMarketData_In &bidPrice4(const double value)
    {
        *((double *)(m_buffer + m_offset + 301)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidVolume4Id(void)
    {
        return 37;
    }

    static SBE_CONSTEXPR const std::uint64_t bidVolume4SinceVersion(void)
    {
         return 0;
    }

    bool bidVolume4InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidVolume4SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidVolume4EncodingOffset(void)
    {
         return 309;
    }


    static const char *BidVolume4MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidVolume4NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidVolume4MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidVolume4MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidVolume4EncodingLength(void)
    {
        return 8;
    }

    double bidVolume4(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 309)));
    }

    DepthMarketData_In &bidVolume4(const double value)
    {
        *((double *)(m_buffer + m_offset + 309)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askPrice4Id(void)
    {
        return 38;
    }

    static SBE_CONSTEXPR const std::uint64_t askPrice4SinceVersion(void)
    {
         return 0;
    }

    bool askPrice4InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askPrice4SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askPrice4EncodingOffset(void)
    {
         return 317;
    }


    static const char *AskPrice4MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askPrice4NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askPrice4MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askPrice4MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askPrice4EncodingLength(void)
    {
        return 8;
    }

    double askPrice4(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 317)));
    }

    DepthMarketData_In &askPrice4(const double value)
    {
        *((double *)(m_buffer + m_offset + 317)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askVolume4Id(void)
    {
        return 39;
    }

    static SBE_CONSTEXPR const std::uint64_t askVolume4SinceVersion(void)
    {
         return 0;
    }

    bool askVolume4InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askVolume4SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askVolume4EncodingOffset(void)
    {
         return 325;
    }


    static const char *AskVolume4MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askVolume4NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askVolume4MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askVolume4MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askVolume4EncodingLength(void)
    {
        return 8;
    }

    double askVolume4(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 325)));
    }

    DepthMarketData_In &askVolume4(const double value)
    {
        *((double *)(m_buffer + m_offset + 325)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidPrice5Id(void)
    {
        return 40;
    }

    static SBE_CONSTEXPR const std::uint64_t bidPrice5SinceVersion(void)
    {
         return 0;
    }

    bool bidPrice5InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidPrice5SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidPrice5EncodingOffset(void)
    {
         return 333;
    }


    static const char *BidPrice5MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidPrice5NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidPrice5MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidPrice5MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidPrice5EncodingLength(void)
    {
        return 8;
    }

    double bidPrice5(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 333)));
    }

    DepthMarketData_In &bidPrice5(const double value)
    {
        *((double *)(m_buffer + m_offset + 333)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t bidVolume5Id(void)
    {
        return 41;
    }

    static SBE_CONSTEXPR const std::uint64_t bidVolume5SinceVersion(void)
    {
         return 0;
    }

    bool bidVolume5InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= bidVolume5SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t bidVolume5EncodingOffset(void)
    {
         return 341;
    }


    static const char *BidVolume5MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double bidVolume5NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double bidVolume5MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double bidVolume5MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t bidVolume5EncodingLength(void)
    {
        return 8;
    }

    double bidVolume5(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 341)));
    }

    DepthMarketData_In &bidVolume5(const double value)
    {
        *((double *)(m_buffer + m_offset + 341)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askPrice5Id(void)
    {
        return 42;
    }

    static SBE_CONSTEXPR const std::uint64_t askPrice5SinceVersion(void)
    {
         return 0;
    }

    bool askPrice5InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askPrice5SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askPrice5EncodingOffset(void)
    {
         return 349;
    }


    static const char *AskPrice5MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askPrice5NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askPrice5MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askPrice5MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askPrice5EncodingLength(void)
    {
        return 8;
    }

    double askPrice5(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 349)));
    }

    DepthMarketData_In &askPrice5(const double value)
    {
        *((double *)(m_buffer + m_offset + 349)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t askVolume5Id(void)
    {
        return 43;
    }

    static SBE_CONSTEXPR const std::uint64_t askVolume5SinceVersion(void)
    {
         return 0;
    }

    bool askVolume5InActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= askVolume5SinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t askVolume5EncodingOffset(void)
    {
         return 357;
    }


    static const char *AskVolume5MetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double askVolume5NullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double askVolume5MinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double askVolume5MaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t askVolume5EncodingLength(void)
    {
        return 8;
    }

    double askVolume5(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 357)));
    }

    DepthMarketData_In &askVolume5(const double value)
    {
        *((double *)(m_buffer + m_offset + 357)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t averagePriceId(void)
    {
        return 44;
    }

    static SBE_CONSTEXPR const std::uint64_t averagePriceSinceVersion(void)
    {
         return 0;
    }

    bool averagePriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= averagePriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t averagePriceEncodingOffset(void)
    {
         return 365;
    }


    static const char *AveragePriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double averagePriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double averagePriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double averagePriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t averagePriceEncodingLength(void)
    {
        return 8;
    }

    double averagePrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 365)));
    }

    DepthMarketData_In &averagePrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 365)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradingPhaseId(void)
    {
        return 45;
    }

    static SBE_CONSTEXPR const std::uint64_t tradingPhaseSinceVersion(void)
    {
         return 0;
    }

    bool tradingPhaseInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= tradingPhaseSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t tradingPhaseEncodingOffset(void)
    {
         return 373;
    }


    static const char *TradingPhaseMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char tradingPhaseNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char tradingPhaseMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char tradingPhaseMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t tradingPhaseEncodingLength(void)
    {
        return 1;
    }

    char tradingPhase(void) const
    {
        return (*((char *)(m_buffer + m_offset + 373)));
    }

    DepthMarketData_In &tradingPhase(const char value)
    {
        *((char *)(m_buffer + m_offset + 373)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openRestrictionId(void)
    {
        return 46;
    }

    static SBE_CONSTEXPR const std::uint64_t openRestrictionSinceVersion(void)
    {
         return 0;
    }

    bool openRestrictionInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openRestrictionSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openRestrictionEncodingOffset(void)
    {
         return 374;
    }


    static const char *OpenRestrictionMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char openRestrictionNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char openRestrictionMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char openRestrictionMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t openRestrictionEncodingLength(void)
    {
        return 1;
    }

    char openRestriction(void) const
    {
        return (*((char *)(m_buffer + m_offset + 374)));
    }

    DepthMarketData_In &openRestriction(const char value)
    {
        *((char *)(m_buffer + m_offset + 374)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t actionDayId(void)
    {
        return 47;
    }

    static SBE_CONSTEXPR const std::uint64_t actionDaySinceVersion(void)
    {
         return 0;
    }

    bool actionDayInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= actionDaySinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t actionDayEncodingOffset(void)
    {
         return 375;
    }


    static const char *ActionDayMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char actionDayNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char actionDayMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char actionDayMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t actionDayEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t actionDayLength(void)
    {
        return 9;
    }

    const char *actionDay(void) const
    {
        return (m_buffer + m_offset + 375);
    }

    char actionDay(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for actionDay [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 375 + (index * 1))));
    }

    void actionDay(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for actionDay [E105]");
        }

        *((char *)(m_buffer + m_offset + 375 + (index * 1))) = (value);
    }

    std::uint64_t getActionDay(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getActionDay [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 375, length);
        return length;
    }

    DepthMarketData_In &putActionDay(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 375, src, 9);
        return *this;
    }

    std::string getActionDayAsString() const
    {
        std::string result(m_buffer + m_offset + 375, 9);
        return result;
    }

    DepthMarketData_In &putActionDay(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 375, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t tradingDayId(void)
    {
        return 48;
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
         return 384;
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
        return (m_buffer + m_offset + 384);
    }

    char tradingDay(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 384 + (index * 1))));
    }

    void tradingDay(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E105]");
        }

        *((char *)(m_buffer + m_offset + 384 + (index * 1))) = (value);
    }

    std::uint64_t getTradingDay(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradingDay [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 384, length);
        return length;
    }

    DepthMarketData_In &putTradingDay(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 384, src, 9);
        return *this;
    }

    std::string getTradingDayAsString() const
    {
        std::string result(m_buffer + m_offset + 384, 9);
        return result;
    }

    DepthMarketData_In &putTradingDay(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 384, str.c_str(), 9);
        return *this;
    }

};
}
#endif

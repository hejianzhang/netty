/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_INSTRUMENT_IN_H_
#define _TFZQ_INSTRUMENT_IN_H_

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

class Instrument_In
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

    Instrument_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    Instrument_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    Instrument_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)149;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)2;
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

    Instrument_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    Instrument_In &wrapForDecode(
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

    Instrument_In &putInstrumentID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 31);
        return *this;
    }

    std::string getInstrumentIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 31);
        return result;
    }

    Instrument_In &putInstrumentID(const std::string& str)
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

    Instrument_In &putExchangeID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 31, src, 9);
        return *this;
    }

    std::string getExchangeIDAsString() const
    {
        std::string result(m_buffer + m_offset + 31, 9);
        return result;
    }

    Instrument_In &putExchangeID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 31, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t instrumentNameId(void)
    {
        return 3;
    }

    static SBE_CONSTEXPR const std::uint64_t instrumentNameSinceVersion(void)
    {
         return 0;
    }

    bool instrumentNameInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= instrumentNameSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t instrumentNameEncodingOffset(void)
    {
         return 40;
    }


    static const char *InstrumentNameMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char instrumentNameNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char instrumentNameMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char instrumentNameMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t instrumentNameEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t instrumentNameLength(void)
    {
        return 21;
    }

    const char *instrumentName(void) const
    {
        return (m_buffer + m_offset + 40);
    }

    char instrumentName(const std::uint64_t index) const
    {
        if (index >= 21)
        {
            throw std::runtime_error("index out of range for instrumentName [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 40 + (index * 1))));
    }

    void instrumentName(const std::uint64_t index, const char value)
    {
        if (index >= 21)
        {
            throw std::runtime_error("index out of range for instrumentName [E105]");
        }

        *((char *)(m_buffer + m_offset + 40 + (index * 1))) = (value);
    }

    std::uint64_t getInstrumentName(char *dst, const std::uint64_t length) const
    {
        if (length > 21)
        {
             throw std::runtime_error("length too large for getInstrumentName [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 40, length);
        return length;
    }

    Instrument_In &putInstrumentName(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 40, src, 21);
        return *this;
    }

    std::string getInstrumentNameAsString() const
    {
        std::string result(m_buffer + m_offset + 40, 21);
        return result;
    }

    Instrument_In &putInstrumentName(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 40, str.c_str(), 21);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t productIDId(void)
    {
        return 4;
    }

    static SBE_CONSTEXPR const std::uint64_t productIDSinceVersion(void)
    {
         return 0;
    }

    bool productIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= productIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t productIDEncodingOffset(void)
    {
         return 61;
    }


    static const char *ProductIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char productIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char productIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char productIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t productIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t productIDLength(void)
    {
        return 31;
    }

    const char *productID(void) const
    {
        return (m_buffer + m_offset + 61);
    }

    char productID(const std::uint64_t index) const
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for productID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 61 + (index * 1))));
    }

    void productID(const std::uint64_t index, const char value)
    {
        if (index >= 31)
        {
            throw std::runtime_error("index out of range for productID [E105]");
        }

        *((char *)(m_buffer + m_offset + 61 + (index * 1))) = (value);
    }

    std::uint64_t getProductID(char *dst, const std::uint64_t length) const
    {
        if (length > 31)
        {
             throw std::runtime_error("length too large for getProductID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 61, length);
        return length;
    }

    Instrument_In &putProductID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 61, src, 31);
        return *this;
    }

    std::string getProductIDAsString() const
    {
        std::string result(m_buffer + m_offset + 61, 31);
        return result;
    }

    Instrument_In &putProductID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 61, str.c_str(), 31);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t productClassId(void)
    {
        return 5;
    }

    static SBE_CONSTEXPR const std::uint64_t productClassSinceVersion(void)
    {
         return 0;
    }

    bool productClassInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= productClassSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t productClassEncodingOffset(void)
    {
         return 92;
    }


    static const char *ProductClassMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char productClassNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char productClassMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char productClassMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t productClassEncodingLength(void)
    {
        return 1;
    }

    char productClass(void) const
    {
        return (*((char *)(m_buffer + m_offset + 92)));
    }

    Instrument_In &productClass(const char value)
    {
        *((char *)(m_buffer + m_offset + 92)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t volumeMultipleId(void)
    {
        return 6;
    }

    static SBE_CONSTEXPR const std::uint64_t volumeMultipleSinceVersion(void)
    {
         return 0;
    }

    bool volumeMultipleInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= volumeMultipleSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t volumeMultipleEncodingOffset(void)
    {
         return 93;
    }


    static const char *VolumeMultipleMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint32_t volumeMultipleNullValue()
    {
        return SBE_NULLVALUE_UINT32;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeMultipleMinValue()
    {
        return 0;
    }

    static SBE_CONSTEXPR const std::uint32_t volumeMultipleMaxValue()
    {
        return 4294967293;
    }

    static SBE_CONSTEXPR const std::size_t volumeMultipleEncodingLength(void)
    {
        return 4;
    }

    std::uint32_t volumeMultiple(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_32(*((std::uint32_t *)(m_buffer + m_offset + 93)));
    }

    Instrument_In &volumeMultiple(const std::uint32_t value)
    {
        *((std::uint32_t *)(m_buffer + m_offset + 93)) = SBE_LITTLE_ENDIAN_ENCODE_32(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t priceTickId(void)
    {
        return 7;
    }

    static SBE_CONSTEXPR const std::uint64_t priceTickSinceVersion(void)
    {
         return 0;
    }

    bool priceTickInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= priceTickSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t priceTickEncodingOffset(void)
    {
         return 97;
    }


    static const char *PriceTickMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double priceTickNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double priceTickMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double priceTickMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t priceTickEncodingLength(void)
    {
        return 8;
    }

    double priceTick(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 97)));
    }

    Instrument_In &priceTick(const double value)
    {
        *((double *)(m_buffer + m_offset + 97)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t openDateId(void)
    {
        return 8;
    }

    static SBE_CONSTEXPR const std::uint64_t openDateSinceVersion(void)
    {
         return 0;
    }

    bool openDateInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= openDateSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t openDateEncodingOffset(void)
    {
         return 105;
    }


    static const char *OpenDateMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char openDateNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char openDateMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char openDateMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t openDateEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t openDateLength(void)
    {
        return 9;
    }

    const char *openDate(void) const
    {
        return (m_buffer + m_offset + 105);
    }

    char openDate(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for openDate [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 105 + (index * 1))));
    }

    void openDate(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for openDate [E105]");
        }

        *((char *)(m_buffer + m_offset + 105 + (index * 1))) = (value);
    }

    std::uint64_t getOpenDate(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getOpenDate [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 105, length);
        return length;
    }

    Instrument_In &putOpenDate(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 105, src, 9);
        return *this;
    }

    std::string getOpenDateAsString() const
    {
        std::string result(m_buffer + m_offset + 105, 9);
        return result;
    }

    Instrument_In &putOpenDate(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 105, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t expireDateId(void)
    {
        return 9;
    }

    static SBE_CONSTEXPR const std::uint64_t expireDateSinceVersion(void)
    {
         return 0;
    }

    bool expireDateInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= expireDateSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t expireDateEncodingOffset(void)
    {
         return 114;
    }


    static const char *ExpireDateMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char expireDateNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char expireDateMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char expireDateMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t expireDateEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t expireDateLength(void)
    {
        return 9;
    }

    const char *expireDate(void) const
    {
        return (m_buffer + m_offset + 114);
    }

    char expireDate(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for expireDate [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 114 + (index * 1))));
    }

    void expireDate(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for expireDate [E105]");
        }

        *((char *)(m_buffer + m_offset + 114 + (index * 1))) = (value);
    }

    std::uint64_t getExpireDate(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getExpireDate [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 114, length);
        return length;
    }

    Instrument_In &putExpireDate(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 114, src, 9);
        return *this;
    }

    std::string getExpireDateAsString() const
    {
        std::string result(m_buffer + m_offset + 114, 9);
        return result;
    }

    Instrument_In &putExpireDate(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 114, str.c_str(), 9);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t isTradingId(void)
    {
        return 10;
    }

    static SBE_CONSTEXPR const std::uint64_t isTradingSinceVersion(void)
    {
         return 0;
    }

    bool isTradingInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= isTradingSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t isTradingEncodingOffset(void)
    {
         return 123;
    }


    static const char *IsTradingMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const std::uint8_t isTradingNullValue()
    {
        return SBE_NULLVALUE_UINT8;
    }

    static SBE_CONSTEXPR const std::uint8_t isTradingMinValue()
    {
        return (std::uint8_t)0;
    }

    static SBE_CONSTEXPR const std::uint8_t isTradingMaxValue()
    {
        return (std::uint8_t)254;
    }

    static SBE_CONSTEXPR const std::size_t isTradingEncodingLength(void)
    {
        return 1;
    }

    std::uint8_t isTrading(void) const
    {
        return (*((std::uint8_t *)(m_buffer + m_offset + 123)));
    }

    Instrument_In &isTrading(const std::uint8_t value)
    {
        *((std::uint8_t *)(m_buffer + m_offset + 123)) = (value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t execPriceId(void)
    {
        return 11;
    }

    static SBE_CONSTEXPR const std::uint64_t execPriceSinceVersion(void)
    {
         return 0;
    }

    bool execPriceInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= execPriceSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t execPriceEncodingOffset(void)
    {
         return 124;
    }


    static const char *ExecPriceMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double execPriceNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double execPriceMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double execPriceMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t execPriceEncodingLength(void)
    {
        return 8;
    }

    double execPrice(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 124)));
    }

    Instrument_In &execPrice(const double value)
    {
        *((double *)(m_buffer + m_offset + 124)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t unitMarginId(void)
    {
        return 12;
    }

    static SBE_CONSTEXPR const std::uint64_t unitMarginSinceVersion(void)
    {
         return 0;
    }

    bool unitMarginInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= unitMarginSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t unitMarginEncodingOffset(void)
    {
         return 132;
    }


    static const char *UnitMarginMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const double unitMarginNullValue()
    {
        return SBE_DOUBLE_NAN;
    }

    static SBE_CONSTEXPR const double unitMarginMinValue()
    {
        return 4.9E-324;
    }

    static SBE_CONSTEXPR const double unitMarginMaxValue()
    {
        return 1.7976931348623157E308;
    }

    static SBE_CONSTEXPR const std::size_t unitMarginEncodingLength(void)
    {
        return 8;
    }

    double unitMargin(void) const
    {
        return SBE_LITTLE_ENDIAN_ENCODE_64(*((double *)(m_buffer + m_offset + 132)));
    }

    Instrument_In &unitMargin(const double value)
    {
        *((double *)(m_buffer + m_offset + 132)) = SBE_LITTLE_ENDIAN_ENCODE_64(value);
        return *this;
    }

    static SBE_CONSTEXPR const std::uint16_t tradingDayId(void)
    {
        return 13;
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
         return 140;
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
        return (m_buffer + m_offset + 140);
    }

    char tradingDay(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 140 + (index * 1))));
    }

    void tradingDay(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for tradingDay [E105]");
        }

        *((char *)(m_buffer + m_offset + 140 + (index * 1))) = (value);
    }

    std::uint64_t getTradingDay(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getTradingDay [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 140, length);
        return length;
    }

    Instrument_In &putTradingDay(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 140, src, 9);
        return *this;
    }

    std::string getTradingDayAsString() const
    {
        std::string result(m_buffer + m_offset + 140, 9);
        return result;
    }

    Instrument_In &putTradingDay(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 140, str.c_str(), 9);
        return *this;
    }

};
}
#endif

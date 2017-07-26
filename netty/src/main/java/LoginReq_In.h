/* Generated SBE (Simple Binary Encoding) message codec */
#ifndef _TFZQ_LOGINREQ_IN_H_
#define _TFZQ_LOGINREQ_IN_H_

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

class LoginReq_In
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

    LoginReq_In(void) : m_buffer(nullptr), m_bufferLength(0), m_offset(0) {}

    LoginReq_In(char *buffer, const std::uint64_t bufferLength)
    {
        reset(buffer, 0, bufferLength, sbeBlockLength(), sbeSchemaVersion());
    }

    LoginReq_In(char *buffer, const std::uint64_t bufferLength, const std::uint64_t actingBlockLength, const std::uint64_t actingVersion)
    {
        reset(buffer, 0, bufferLength, actingBlockLength, actingVersion);
    }

    static SBE_CONSTEXPR const std::uint16_t sbeBlockLength(void)
    {
        return (std::uint16_t)76;
    }

    static SBE_CONSTEXPR const std::uint16_t sbeTemplateId(void)
    {
        return (std::uint16_t)8;
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

    LoginReq_In &wrapForEncode(char *buffer, const std::uint64_t offset, const std::uint64_t bufferLength)
    {
        reset(buffer, offset, bufferLength, sbeBlockLength(), sbeSchemaVersion());
        return *this;
    }

    LoginReq_In &wrapForDecode(
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

    static SBE_CONSTEXPR const std::uint16_t brokerIDId(void)
    {
        return 1;
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
         return 0;
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
        return (m_buffer + m_offset + 0);
    }

    char brokerID(const std::uint64_t index) const
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for brokerID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 0 + (index * 1))));
    }

    void brokerID(const std::uint64_t index, const char value)
    {
        if (index >= 11)
        {
            throw std::runtime_error("index out of range for brokerID [E105]");
        }

        *((char *)(m_buffer + m_offset + 0 + (index * 1))) = (value);
    }

    std::uint64_t getBrokerID(char *dst, const std::uint64_t length) const
    {
        if (length > 11)
        {
             throw std::runtime_error("length too large for getBrokerID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 0, length);
        return length;
    }

    LoginReq_In &putBrokerID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 0, src, 11);
        return *this;
    }

    std::string getBrokerIDAsString() const
    {
        std::string result(m_buffer + m_offset + 0, 11);
        return result;
    }

    LoginReq_In &putBrokerID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 0, str.c_str(), 11);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t userIDId(void)
    {
        return 2;
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
         return 11;
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
        return (m_buffer + m_offset + 11);
    }

    char userID(const std::uint64_t index) const
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for userID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 11 + (index * 1))));
    }

    void userID(const std::uint64_t index, const char value)
    {
        if (index >= 15)
        {
            throw std::runtime_error("index out of range for userID [E105]");
        }

        *((char *)(m_buffer + m_offset + 11 + (index * 1))) = (value);
    }

    std::uint64_t getUserID(char *dst, const std::uint64_t length) const
    {
        if (length > 15)
        {
             throw std::runtime_error("length too large for getUserID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 11, length);
        return length;
    }

    LoginReq_In &putUserID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 11, src, 15);
        return *this;
    }

    std::string getUserIDAsString() const
    {
        std::string result(m_buffer + m_offset + 11, 15);
        return result;
    }

    LoginReq_In &putUserID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 11, str.c_str(), 15);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t passwordId(void)
    {
        return 3;
    }

    static SBE_CONSTEXPR const std::uint64_t passwordSinceVersion(void)
    {
         return 0;
    }

    bool passwordInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= passwordSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t passwordEncodingOffset(void)
    {
         return 26;
    }


    static const char *PasswordMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char passwordNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char passwordMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char passwordMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t passwordEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t passwordLength(void)
    {
        return 41;
    }

    const char *password(void) const
    {
        return (m_buffer + m_offset + 26);
    }

    char password(const std::uint64_t index) const
    {
        if (index >= 41)
        {
            throw std::runtime_error("index out of range for password [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 26 + (index * 1))));
    }

    void password(const std::uint64_t index, const char value)
    {
        if (index >= 41)
        {
            throw std::runtime_error("index out of range for password [E105]");
        }

        *((char *)(m_buffer + m_offset + 26 + (index * 1))) = (value);
    }

    std::uint64_t getPassword(char *dst, const std::uint64_t length) const
    {
        if (length > 41)
        {
             throw std::runtime_error("length too large for getPassword [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 26, length);
        return length;
    }

    LoginReq_In &putPassword(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 26, src, 41);
        return *this;
    }

    std::string getPasswordAsString() const
    {
        std::string result(m_buffer + m_offset + 26, 41);
        return result;
    }

    LoginReq_In &putPassword(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 26, str.c_str(), 41);
        return *this;
    }


    static SBE_CONSTEXPR const std::uint16_t comboIDId(void)
    {
        return 4;
    }

    static SBE_CONSTEXPR const std::uint64_t comboIDSinceVersion(void)
    {
         return 0;
    }

    bool comboIDInActingVersion(void)
    {
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wtautological-compare"
        return m_actingVersion >= comboIDSinceVersion();
#pragma GCC diagnostic pop
    }

    static SBE_CONSTEXPR const std::size_t comboIDEncodingOffset(void)
    {
         return 67;
    }


    static const char *ComboIDMetaAttribute(const MetaAttribute::Attribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case MetaAttribute::EPOCH: return "unix";
            case MetaAttribute::TIME_UNIT: return "nanosecond";
            case MetaAttribute::SEMANTIC_TYPE: return "";
        }

        return "";
    }

    static SBE_CONSTEXPR const char comboIDNullValue()
    {
        return (char)0;
    }

    static SBE_CONSTEXPR const char comboIDMinValue()
    {
        return (char)32;
    }

    static SBE_CONSTEXPR const char comboIDMaxValue()
    {
        return (char)126;
    }

    static SBE_CONSTEXPR const std::size_t comboIDEncodingLength(void)
    {
        return 1;
    }

    static SBE_CONSTEXPR const std::uint64_t comboIDLength(void)
    {
        return 9;
    }

    const char *comboID(void) const
    {
        return (m_buffer + m_offset + 67);
    }

    char comboID(const std::uint64_t index) const
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for comboID [E104]");
        }

        return (*((char *)(m_buffer + m_offset + 67 + (index * 1))));
    }

    void comboID(const std::uint64_t index, const char value)
    {
        if (index >= 9)
        {
            throw std::runtime_error("index out of range for comboID [E105]");
        }

        *((char *)(m_buffer + m_offset + 67 + (index * 1))) = (value);
    }

    std::uint64_t getComboID(char *dst, const std::uint64_t length) const
    {
        if (length > 9)
        {
             throw std::runtime_error("length too large for getComboID [E106]");
        }

        std::memcpy(dst, m_buffer + m_offset + 67, length);
        return length;
    }

    LoginReq_In &putComboID(const char *src)
    {
        std::memcpy(m_buffer + m_offset + 67, src, 9);
        return *this;
    }

    std::string getComboIDAsString() const
    {
        std::string result(m_buffer + m_offset + 67, 9);
        return result;
    }

    LoginReq_In &putComboID(const std::string& str)
    {
        std::memcpy(m_buffer + m_offset + 67, str.c_str(), 9);
        return *this;
    }

};
}
#endif

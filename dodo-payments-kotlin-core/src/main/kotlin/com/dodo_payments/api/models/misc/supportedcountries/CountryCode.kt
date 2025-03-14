// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.misc.supportedcountries

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** ISO country code alpha2 variant */
class CountryCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AF = of("AF")

        val AX = of("AX")

        val AL = of("AL")

        val DZ = of("DZ")

        val AS = of("AS")

        val AD = of("AD")

        val AO = of("AO")

        val AI = of("AI")

        val AQ = of("AQ")

        val AG = of("AG")

        val AR = of("AR")

        val AM = of("AM")

        val AW = of("AW")

        val AU = of("AU")

        val AT = of("AT")

        val AZ = of("AZ")

        val BS = of("BS")

        val BH = of("BH")

        val BD = of("BD")

        val BB = of("BB")

        val BY = of("BY")

        val BE = of("BE")

        val BZ = of("BZ")

        val BJ = of("BJ")

        val BM = of("BM")

        val BT = of("BT")

        val BO = of("BO")

        val BQ = of("BQ")

        val BA = of("BA")

        val BW = of("BW")

        val BV = of("BV")

        val BR = of("BR")

        val IO = of("IO")

        val BN = of("BN")

        val BG = of("BG")

        val BF = of("BF")

        val BI = of("BI")

        val KH = of("KH")

        val CM = of("CM")

        val CA = of("CA")

        val CV = of("CV")

        val KY = of("KY")

        val CF = of("CF")

        val TD = of("TD")

        val CL = of("CL")

        val CN = of("CN")

        val CX = of("CX")

        val CC = of("CC")

        val CO = of("CO")

        val KM = of("KM")

        val CG = of("CG")

        val CD = of("CD")

        val CK = of("CK")

        val CR = of("CR")

        val CI = of("CI")

        val HR = of("HR")

        val CU = of("CU")

        val CW = of("CW")

        val CY = of("CY")

        val CZ = of("CZ")

        val DK = of("DK")

        val DJ = of("DJ")

        val DM = of("DM")

        val DO = of("DO")

        val EC = of("EC")

        val EG = of("EG")

        val SV = of("SV")

        val GQ = of("GQ")

        val ER = of("ER")

        val EE = of("EE")

        val ET = of("ET")

        val FK = of("FK")

        val FO = of("FO")

        val FJ = of("FJ")

        val FI = of("FI")

        val FR = of("FR")

        val GF = of("GF")

        val PF = of("PF")

        val TF = of("TF")

        val GA = of("GA")

        val GM = of("GM")

        val GE = of("GE")

        val DE = of("DE")

        val GH = of("GH")

        val GI = of("GI")

        val GR = of("GR")

        val GL = of("GL")

        val GD = of("GD")

        val GP = of("GP")

        val GU = of("GU")

        val GT = of("GT")

        val GG = of("GG")

        val GN = of("GN")

        val GW = of("GW")

        val GY = of("GY")

        val HT = of("HT")

        val HM = of("HM")

        val VA = of("VA")

        val HN = of("HN")

        val HK = of("HK")

        val HU = of("HU")

        val IS = of("IS")

        val IN = of("IN")

        val ID = of("ID")

        val IR = of("IR")

        val IQ = of("IQ")

        val IE = of("IE")

        val IM = of("IM")

        val IL = of("IL")

        val IT = of("IT")

        val JM = of("JM")

        val JP = of("JP")

        val JE = of("JE")

        val JO = of("JO")

        val KZ = of("KZ")

        val KE = of("KE")

        val KI = of("KI")

        val KP = of("KP")

        val KR = of("KR")

        val KW = of("KW")

        val KG = of("KG")

        val LA = of("LA")

        val LV = of("LV")

        val LB = of("LB")

        val LS = of("LS")

        val LR = of("LR")

        val LY = of("LY")

        val LI = of("LI")

        val LT = of("LT")

        val LU = of("LU")

        val MO = of("MO")

        val MK = of("MK")

        val MG = of("MG")

        val MW = of("MW")

        val MY = of("MY")

        val MV = of("MV")

        val ML = of("ML")

        val MT = of("MT")

        val MH = of("MH")

        val MQ = of("MQ")

        val MR = of("MR")

        val MU = of("MU")

        val YT = of("YT")

        val MX = of("MX")

        val FM = of("FM")

        val MD = of("MD")

        val MC = of("MC")

        val MN = of("MN")

        val ME = of("ME")

        val MS = of("MS")

        val MA = of("MA")

        val MZ = of("MZ")

        val MM = of("MM")

        val NA = of("NA")

        val NR = of("NR")

        val NP = of("NP")

        val NL = of("NL")

        val NC = of("NC")

        val NZ = of("NZ")

        val NI = of("NI")

        val NE = of("NE")

        val NG = of("NG")

        val NU = of("NU")

        val NF = of("NF")

        val MP = of("MP")

        val NO = of("NO")

        val OM = of("OM")

        val PK = of("PK")

        val PW = of("PW")

        val PS = of("PS")

        val PA = of("PA")

        val PG = of("PG")

        val PY = of("PY")

        val PE = of("PE")

        val PH = of("PH")

        val PN = of("PN")

        val PL = of("PL")

        val PT = of("PT")

        val PR = of("PR")

        val QA = of("QA")

        val RE = of("RE")

        val RO = of("RO")

        val RU = of("RU")

        val RW = of("RW")

        val BL = of("BL")

        val SH = of("SH")

        val KN = of("KN")

        val LC = of("LC")

        val MF = of("MF")

        val PM = of("PM")

        val VC = of("VC")

        val WS = of("WS")

        val SM = of("SM")

        val ST = of("ST")

        val SA = of("SA")

        val SN = of("SN")

        val RS = of("RS")

        val SC = of("SC")

        val SL = of("SL")

        val SG = of("SG")

        val SX = of("SX")

        val SK = of("SK")

        val SI = of("SI")

        val SB = of("SB")

        val SO = of("SO")

        val ZA = of("ZA")

        val GS = of("GS")

        val SS = of("SS")

        val ES = of("ES")

        val LK = of("LK")

        val SD = of("SD")

        val SR = of("SR")

        val SJ = of("SJ")

        val SZ = of("SZ")

        val SE = of("SE")

        val CH = of("CH")

        val SY = of("SY")

        val TW = of("TW")

        val TJ = of("TJ")

        val TZ = of("TZ")

        val TH = of("TH")

        val TL = of("TL")

        val TG = of("TG")

        val TK = of("TK")

        val TO = of("TO")

        val TT = of("TT")

        val TN = of("TN")

        val TR = of("TR")

        val TM = of("TM")

        val TC = of("TC")

        val TV = of("TV")

        val UG = of("UG")

        val UA = of("UA")

        val AE = of("AE")

        val GB = of("GB")

        val UM = of("UM")

        val US = of("US")

        val UY = of("UY")

        val UZ = of("UZ")

        val VU = of("VU")

        val VE = of("VE")

        val VN = of("VN")

        val VG = of("VG")

        val VI = of("VI")

        val WF = of("WF")

        val EH = of("EH")

        val YE = of("YE")

        val ZM = of("ZM")

        val ZW = of("ZW")

        fun of(value: String) = CountryCode(JsonField.of(value))
    }

    /** An enum containing [CountryCode]'s known values. */
    enum class Known {
        AF,
        AX,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BQ,
        BA,
        BW,
        BV,
        BR,
        IO,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CG,
        CD,
        CK,
        CR,
        CI,
        HR,
        CU,
        CW,
        CY,
        CZ,
        DK,
        DJ,
        DM,
        DO,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        GF,
        PF,
        TF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GP,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HM,
        VA,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KP,
        KR,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MQ,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        NF,
        MP,
        NO,
        OM,
        PK,
        PW,
        PS,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        GS,
        SS,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TL,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        UG,
        UA,
        AE,
        GB,
        UM,
        US,
        UY,
        UZ,
        VU,
        VE,
        VN,
        VG,
        VI,
        WF,
        EH,
        YE,
        ZM,
        ZW,
    }

    /**
     * An enum containing [CountryCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CountryCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AF,
        AX,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BQ,
        BA,
        BW,
        BV,
        BR,
        IO,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CG,
        CD,
        CK,
        CR,
        CI,
        HR,
        CU,
        CW,
        CY,
        CZ,
        DK,
        DJ,
        DM,
        DO,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        GF,
        PF,
        TF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GP,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HM,
        VA,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KP,
        KR,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MQ,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        NF,
        MP,
        NO,
        OM,
        PK,
        PW,
        PS,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        GS,
        SS,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TL,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        UG,
        UA,
        AE,
        GB,
        UM,
        US,
        UY,
        UZ,
        VU,
        VE,
        VN,
        VG,
        VI,
        WF,
        EH,
        YE,
        ZM,
        ZW,
        /** An enum member indicating that [CountryCode] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            AF -> Value.AF
            AX -> Value.AX
            AL -> Value.AL
            DZ -> Value.DZ
            AS -> Value.AS
            AD -> Value.AD
            AO -> Value.AO
            AI -> Value.AI
            AQ -> Value.AQ
            AG -> Value.AG
            AR -> Value.AR
            AM -> Value.AM
            AW -> Value.AW
            AU -> Value.AU
            AT -> Value.AT
            AZ -> Value.AZ
            BS -> Value.BS
            BH -> Value.BH
            BD -> Value.BD
            BB -> Value.BB
            BY -> Value.BY
            BE -> Value.BE
            BZ -> Value.BZ
            BJ -> Value.BJ
            BM -> Value.BM
            BT -> Value.BT
            BO -> Value.BO
            BQ -> Value.BQ
            BA -> Value.BA
            BW -> Value.BW
            BV -> Value.BV
            BR -> Value.BR
            IO -> Value.IO
            BN -> Value.BN
            BG -> Value.BG
            BF -> Value.BF
            BI -> Value.BI
            KH -> Value.KH
            CM -> Value.CM
            CA -> Value.CA
            CV -> Value.CV
            KY -> Value.KY
            CF -> Value.CF
            TD -> Value.TD
            CL -> Value.CL
            CN -> Value.CN
            CX -> Value.CX
            CC -> Value.CC
            CO -> Value.CO
            KM -> Value.KM
            CG -> Value.CG
            CD -> Value.CD
            CK -> Value.CK
            CR -> Value.CR
            CI -> Value.CI
            HR -> Value.HR
            CU -> Value.CU
            CW -> Value.CW
            CY -> Value.CY
            CZ -> Value.CZ
            DK -> Value.DK
            DJ -> Value.DJ
            DM -> Value.DM
            DO -> Value.DO
            EC -> Value.EC
            EG -> Value.EG
            SV -> Value.SV
            GQ -> Value.GQ
            ER -> Value.ER
            EE -> Value.EE
            ET -> Value.ET
            FK -> Value.FK
            FO -> Value.FO
            FJ -> Value.FJ
            FI -> Value.FI
            FR -> Value.FR
            GF -> Value.GF
            PF -> Value.PF
            TF -> Value.TF
            GA -> Value.GA
            GM -> Value.GM
            GE -> Value.GE
            DE -> Value.DE
            GH -> Value.GH
            GI -> Value.GI
            GR -> Value.GR
            GL -> Value.GL
            GD -> Value.GD
            GP -> Value.GP
            GU -> Value.GU
            GT -> Value.GT
            GG -> Value.GG
            GN -> Value.GN
            GW -> Value.GW
            GY -> Value.GY
            HT -> Value.HT
            HM -> Value.HM
            VA -> Value.VA
            HN -> Value.HN
            HK -> Value.HK
            HU -> Value.HU
            IS -> Value.IS
            IN -> Value.IN
            ID -> Value.ID
            IR -> Value.IR
            IQ -> Value.IQ
            IE -> Value.IE
            IM -> Value.IM
            IL -> Value.IL
            IT -> Value.IT
            JM -> Value.JM
            JP -> Value.JP
            JE -> Value.JE
            JO -> Value.JO
            KZ -> Value.KZ
            KE -> Value.KE
            KI -> Value.KI
            KP -> Value.KP
            KR -> Value.KR
            KW -> Value.KW
            KG -> Value.KG
            LA -> Value.LA
            LV -> Value.LV
            LB -> Value.LB
            LS -> Value.LS
            LR -> Value.LR
            LY -> Value.LY
            LI -> Value.LI
            LT -> Value.LT
            LU -> Value.LU
            MO -> Value.MO
            MK -> Value.MK
            MG -> Value.MG
            MW -> Value.MW
            MY -> Value.MY
            MV -> Value.MV
            ML -> Value.ML
            MT -> Value.MT
            MH -> Value.MH
            MQ -> Value.MQ
            MR -> Value.MR
            MU -> Value.MU
            YT -> Value.YT
            MX -> Value.MX
            FM -> Value.FM
            MD -> Value.MD
            MC -> Value.MC
            MN -> Value.MN
            ME -> Value.ME
            MS -> Value.MS
            MA -> Value.MA
            MZ -> Value.MZ
            MM -> Value.MM
            NA -> Value.NA
            NR -> Value.NR
            NP -> Value.NP
            NL -> Value.NL
            NC -> Value.NC
            NZ -> Value.NZ
            NI -> Value.NI
            NE -> Value.NE
            NG -> Value.NG
            NU -> Value.NU
            NF -> Value.NF
            MP -> Value.MP
            NO -> Value.NO
            OM -> Value.OM
            PK -> Value.PK
            PW -> Value.PW
            PS -> Value.PS
            PA -> Value.PA
            PG -> Value.PG
            PY -> Value.PY
            PE -> Value.PE
            PH -> Value.PH
            PN -> Value.PN
            PL -> Value.PL
            PT -> Value.PT
            PR -> Value.PR
            QA -> Value.QA
            RE -> Value.RE
            RO -> Value.RO
            RU -> Value.RU
            RW -> Value.RW
            BL -> Value.BL
            SH -> Value.SH
            KN -> Value.KN
            LC -> Value.LC
            MF -> Value.MF
            PM -> Value.PM
            VC -> Value.VC
            WS -> Value.WS
            SM -> Value.SM
            ST -> Value.ST
            SA -> Value.SA
            SN -> Value.SN
            RS -> Value.RS
            SC -> Value.SC
            SL -> Value.SL
            SG -> Value.SG
            SX -> Value.SX
            SK -> Value.SK
            SI -> Value.SI
            SB -> Value.SB
            SO -> Value.SO
            ZA -> Value.ZA
            GS -> Value.GS
            SS -> Value.SS
            ES -> Value.ES
            LK -> Value.LK
            SD -> Value.SD
            SR -> Value.SR
            SJ -> Value.SJ
            SZ -> Value.SZ
            SE -> Value.SE
            CH -> Value.CH
            SY -> Value.SY
            TW -> Value.TW
            TJ -> Value.TJ
            TZ -> Value.TZ
            TH -> Value.TH
            TL -> Value.TL
            TG -> Value.TG
            TK -> Value.TK
            TO -> Value.TO
            TT -> Value.TT
            TN -> Value.TN
            TR -> Value.TR
            TM -> Value.TM
            TC -> Value.TC
            TV -> Value.TV
            UG -> Value.UG
            UA -> Value.UA
            AE -> Value.AE
            GB -> Value.GB
            UM -> Value.UM
            US -> Value.US
            UY -> Value.UY
            UZ -> Value.UZ
            VU -> Value.VU
            VE -> Value.VE
            VN -> Value.VN
            VG -> Value.VG
            VI -> Value.VI
            WF -> Value.WF
            EH -> Value.EH
            YE -> Value.YE
            ZM -> Value.ZM
            ZW -> Value.ZW
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            AF -> Known.AF
            AX -> Known.AX
            AL -> Known.AL
            DZ -> Known.DZ
            AS -> Known.AS
            AD -> Known.AD
            AO -> Known.AO
            AI -> Known.AI
            AQ -> Known.AQ
            AG -> Known.AG
            AR -> Known.AR
            AM -> Known.AM
            AW -> Known.AW
            AU -> Known.AU
            AT -> Known.AT
            AZ -> Known.AZ
            BS -> Known.BS
            BH -> Known.BH
            BD -> Known.BD
            BB -> Known.BB
            BY -> Known.BY
            BE -> Known.BE
            BZ -> Known.BZ
            BJ -> Known.BJ
            BM -> Known.BM
            BT -> Known.BT
            BO -> Known.BO
            BQ -> Known.BQ
            BA -> Known.BA
            BW -> Known.BW
            BV -> Known.BV
            BR -> Known.BR
            IO -> Known.IO
            BN -> Known.BN
            BG -> Known.BG
            BF -> Known.BF
            BI -> Known.BI
            KH -> Known.KH
            CM -> Known.CM
            CA -> Known.CA
            CV -> Known.CV
            KY -> Known.KY
            CF -> Known.CF
            TD -> Known.TD
            CL -> Known.CL
            CN -> Known.CN
            CX -> Known.CX
            CC -> Known.CC
            CO -> Known.CO
            KM -> Known.KM
            CG -> Known.CG
            CD -> Known.CD
            CK -> Known.CK
            CR -> Known.CR
            CI -> Known.CI
            HR -> Known.HR
            CU -> Known.CU
            CW -> Known.CW
            CY -> Known.CY
            CZ -> Known.CZ
            DK -> Known.DK
            DJ -> Known.DJ
            DM -> Known.DM
            DO -> Known.DO
            EC -> Known.EC
            EG -> Known.EG
            SV -> Known.SV
            GQ -> Known.GQ
            ER -> Known.ER
            EE -> Known.EE
            ET -> Known.ET
            FK -> Known.FK
            FO -> Known.FO
            FJ -> Known.FJ
            FI -> Known.FI
            FR -> Known.FR
            GF -> Known.GF
            PF -> Known.PF
            TF -> Known.TF
            GA -> Known.GA
            GM -> Known.GM
            GE -> Known.GE
            DE -> Known.DE
            GH -> Known.GH
            GI -> Known.GI
            GR -> Known.GR
            GL -> Known.GL
            GD -> Known.GD
            GP -> Known.GP
            GU -> Known.GU
            GT -> Known.GT
            GG -> Known.GG
            GN -> Known.GN
            GW -> Known.GW
            GY -> Known.GY
            HT -> Known.HT
            HM -> Known.HM
            VA -> Known.VA
            HN -> Known.HN
            HK -> Known.HK
            HU -> Known.HU
            IS -> Known.IS
            IN -> Known.IN
            ID -> Known.ID
            IR -> Known.IR
            IQ -> Known.IQ
            IE -> Known.IE
            IM -> Known.IM
            IL -> Known.IL
            IT -> Known.IT
            JM -> Known.JM
            JP -> Known.JP
            JE -> Known.JE
            JO -> Known.JO
            KZ -> Known.KZ
            KE -> Known.KE
            KI -> Known.KI
            KP -> Known.KP
            KR -> Known.KR
            KW -> Known.KW
            KG -> Known.KG
            LA -> Known.LA
            LV -> Known.LV
            LB -> Known.LB
            LS -> Known.LS
            LR -> Known.LR
            LY -> Known.LY
            LI -> Known.LI
            LT -> Known.LT
            LU -> Known.LU
            MO -> Known.MO
            MK -> Known.MK
            MG -> Known.MG
            MW -> Known.MW
            MY -> Known.MY
            MV -> Known.MV
            ML -> Known.ML
            MT -> Known.MT
            MH -> Known.MH
            MQ -> Known.MQ
            MR -> Known.MR
            MU -> Known.MU
            YT -> Known.YT
            MX -> Known.MX
            FM -> Known.FM
            MD -> Known.MD
            MC -> Known.MC
            MN -> Known.MN
            ME -> Known.ME
            MS -> Known.MS
            MA -> Known.MA
            MZ -> Known.MZ
            MM -> Known.MM
            NA -> Known.NA
            NR -> Known.NR
            NP -> Known.NP
            NL -> Known.NL
            NC -> Known.NC
            NZ -> Known.NZ
            NI -> Known.NI
            NE -> Known.NE
            NG -> Known.NG
            NU -> Known.NU
            NF -> Known.NF
            MP -> Known.MP
            NO -> Known.NO
            OM -> Known.OM
            PK -> Known.PK
            PW -> Known.PW
            PS -> Known.PS
            PA -> Known.PA
            PG -> Known.PG
            PY -> Known.PY
            PE -> Known.PE
            PH -> Known.PH
            PN -> Known.PN
            PL -> Known.PL
            PT -> Known.PT
            PR -> Known.PR
            QA -> Known.QA
            RE -> Known.RE
            RO -> Known.RO
            RU -> Known.RU
            RW -> Known.RW
            BL -> Known.BL
            SH -> Known.SH
            KN -> Known.KN
            LC -> Known.LC
            MF -> Known.MF
            PM -> Known.PM
            VC -> Known.VC
            WS -> Known.WS
            SM -> Known.SM
            ST -> Known.ST
            SA -> Known.SA
            SN -> Known.SN
            RS -> Known.RS
            SC -> Known.SC
            SL -> Known.SL
            SG -> Known.SG
            SX -> Known.SX
            SK -> Known.SK
            SI -> Known.SI
            SB -> Known.SB
            SO -> Known.SO
            ZA -> Known.ZA
            GS -> Known.GS
            SS -> Known.SS
            ES -> Known.ES
            LK -> Known.LK
            SD -> Known.SD
            SR -> Known.SR
            SJ -> Known.SJ
            SZ -> Known.SZ
            SE -> Known.SE
            CH -> Known.CH
            SY -> Known.SY
            TW -> Known.TW
            TJ -> Known.TJ
            TZ -> Known.TZ
            TH -> Known.TH
            TL -> Known.TL
            TG -> Known.TG
            TK -> Known.TK
            TO -> Known.TO
            TT -> Known.TT
            TN -> Known.TN
            TR -> Known.TR
            TM -> Known.TM
            TC -> Known.TC
            TV -> Known.TV
            UG -> Known.UG
            UA -> Known.UA
            AE -> Known.AE
            GB -> Known.GB
            UM -> Known.UM
            US -> Known.US
            UY -> Known.UY
            UZ -> Known.UZ
            VU -> Known.VU
            VE -> Known.VE
            VN -> Known.VN
            VG -> Known.VG
            VI -> Known.VI
            WF -> Known.WF
            EH -> Known.EH
            YE -> Known.YE
            ZM -> Known.ZM
            ZW -> Known.ZW
            else -> throw DodoPaymentsInvalidDataException("Unknown CountryCode: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CountryCode && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

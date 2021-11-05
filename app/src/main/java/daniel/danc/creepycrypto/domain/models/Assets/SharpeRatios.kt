package daniel.danc.creepycrypto.domain.models.Assets

data class SharpeRatios(
    val last_1_year: Double,
    val last_30_days: Double,
    val last_3_years: Double,
    val last_90_days: Double
)
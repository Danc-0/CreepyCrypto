package daniel.danc.creepycrypto.domain.models.Assets

data class OhlcvLast24Hour(
    val close: Double,
    val high: Double,
    val low: Double,
    val `open`: Double,
    val volume: Double
)
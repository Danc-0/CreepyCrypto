package daniel.danc.creepycrypto.domain.models.Assets

data class CycleLow(
    val at: String,
    val days_since: Int,
    val percent_up: Double,
    val price: Double
)
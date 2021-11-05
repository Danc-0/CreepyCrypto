package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Regulation(
    val regulatory_details: String,
    val sfar_score: Int,
    val sfar_summary: String
)
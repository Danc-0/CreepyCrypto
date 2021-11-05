package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Overview(
    val category: String,
    val is_verified: Boolean,
    val official_links: List<OfficialLink>,
    val project_details: String,
    val sector: String,
    val tagline: String,
    val tags: String
)
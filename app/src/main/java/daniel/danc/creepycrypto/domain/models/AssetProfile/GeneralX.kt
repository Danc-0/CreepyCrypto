package daniel.danc.creepycrypto.domain.models.AssetProfile

data class GeneralX(
    val background: Background,
    val overview: Overview,
    val regulation: Regulation,
    val roadmap: List<Roadmap>
)
package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Profile(
    val advisors: Advisors,
    val contributors: Contributors,
    val economics: Economics,
    val ecosystem: Ecosystem,
    val general: GeneralX,
    val governance: Governance,
    val investors: Investors,
    val metadata: Metadata,
    val technology: Technology
)
package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Security(
    val audits: List<Any>,
    val known_exploits_and_vulnerabilities: List<KnownExploitsAndVulnerability>
)
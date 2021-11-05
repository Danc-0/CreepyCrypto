package daniel.danc.creepycrypto.domain.models.Assets

data class Security(
    val audits: List<Audit>,
    val known_exploits_and_vulnerabilities: List<KnownExploitsAndVulnerability>
)
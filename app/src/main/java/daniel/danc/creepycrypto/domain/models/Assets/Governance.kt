package daniel.danc.creepycrypto.domain.models.Assets

data class Governance(
    val governance_details: String,
    val grants: List<Grant>,
    val onchain_governance: OnchainGovernance
)
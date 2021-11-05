package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Governance(
    val governance_details: String,
    val grants: List<Any>,
    val onchain_governance: OnchainGovernance
)
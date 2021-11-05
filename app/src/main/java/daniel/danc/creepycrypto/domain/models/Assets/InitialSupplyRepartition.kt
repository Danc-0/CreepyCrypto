package daniel.danc.creepycrypto.domain.models.Assets

data class InitialSupplyRepartition(
    val allocated_to_investors_percentage: Int,
    val allocated_to_organization_or_founders_percentage: Int,
    val allocated_to_premined_rewards_or_airdrops_percentage: Int
)
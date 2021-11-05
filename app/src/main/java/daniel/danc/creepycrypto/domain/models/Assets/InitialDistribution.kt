package daniel.danc.creepycrypto.domain.models.Assets

data class InitialDistribution(
    val genesis_block_date: String,
    val initial_supply: Int,
    val initial_supply_repartition: InitialSupplyRepartition,
    val token_distribution_date: Any
)
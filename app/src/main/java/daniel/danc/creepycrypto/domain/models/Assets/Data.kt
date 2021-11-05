package daniel.danc.creepycrypto.domain.models.Assets

data class Data(
    val _internal_temp_agora_id: String,
    val contract_addresses: List<ContractAddresse>,
    val id: String,
    val metrics: Metrics,
    val name: String,
    val profile: Profile,
    val slug: String,
    val symbol: String
)
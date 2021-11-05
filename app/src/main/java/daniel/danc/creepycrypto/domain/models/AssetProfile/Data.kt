package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Data(
    val _internal_temp_agora_id: String,
    val contract_addresses: List<Any>,
    val id: String,
    val name: String,
    val profile: Profile,
    val slug: String,
    val symbol: String
)
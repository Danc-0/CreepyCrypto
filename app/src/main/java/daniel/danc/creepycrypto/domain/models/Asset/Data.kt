package daniel.danc.creepycrypto.domain.models.Asset

data class Data(
    val _internal_temp_agora_id: String,
    val contract_addresses: List<Any>,
    val id: String,
    val name: String,
    val slug: String,
    val symbol: String
)
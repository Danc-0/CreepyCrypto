package daniel.danc.creepycrypto.domain.models.Assets

data class Token(
    val block_explorers: List<BlockExplorer>,
    val multitoken: List<Any>,
    val token_address: Any,
    val token_name: String,
    val token_type: String,
    val token_usage: String,
    val token_usage_details: String
)
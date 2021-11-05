package daniel.danc.creepycrypto.domain.models.Assets

data class SalesRound(
    val amount_collected_in_asset: Double,
    val amount_collected_in_usd: Int,
    val asset_collected: String,
    val details: Any,
    val end_date: String,
    val equivalent_price_per_token_in_usd: Double,
    val is_kyc_required: Any,
    val native_tokens_allocated: Int,
    val price_per_token_in_asset: Double,
    val restricted_jurisdictions: List<String>,
    val start_date: String,
    val title: String,
    val type: String
)
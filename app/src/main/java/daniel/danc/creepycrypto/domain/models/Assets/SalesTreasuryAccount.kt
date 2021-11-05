package daniel.danc.creepycrypto.domain.models.Assets

data class SalesTreasuryAccount(
    val account_type: String,
    val addresses: List<Addresse>,
    val asset_held: AssetHeld,
    val security: Any
)
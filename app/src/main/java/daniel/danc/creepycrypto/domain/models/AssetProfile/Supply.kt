package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Supply(
    val general_emission_type: String,
    val is_capped_supply: Boolean,
    val max_supply: Double,
    val precise_emission_type: String,
    val supply_curve_details: String
)
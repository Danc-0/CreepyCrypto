package daniel.danc.creepycrypto.domain.models.AssetProfile

data class Economics(
    val consensus_and_emission: ConsensusAndEmission,
    val launch: Launch,
    val native_treasury: NativeTreasury,
    val token: Token
)
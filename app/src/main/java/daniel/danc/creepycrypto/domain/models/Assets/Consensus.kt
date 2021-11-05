package daniel.danc.creepycrypto.domain.models.Assets

data class Consensus(
    val block_reward: Double,
    val consensus_details: String,
    val general_consensus_mechanism: String,
    val is_victim_of_51_percent_attack: Boolean,
    val mining_algorithm: String,
    val next_halving_date: String,
    val precise_consensus_mechanism: String,
    val targeted_block_time: Int
)
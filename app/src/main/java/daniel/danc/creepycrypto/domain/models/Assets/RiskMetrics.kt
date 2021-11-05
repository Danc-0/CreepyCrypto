package daniel.danc.creepycrypto.domain.models.Assets

data class RiskMetrics(
    val sharpe_ratios: SharpeRatios,
    val volatility_stats: VolatilityStats
)
package daniel.danc.creepycrypto.domain.models.Assets

data class Fundraising(
    val projected_use_of_sales_proceeds: List<ProjectedUseOfSalesProceed>,
    val sales_documents: List<SalesDocument>,
    val sales_rounds: List<SalesRound>,
    val sales_treasury_accounts: List<SalesTreasuryAccount>,
    val treasury_policies: Any
)
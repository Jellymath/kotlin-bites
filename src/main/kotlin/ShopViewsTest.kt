interface WithShopInfo {
    val shopInfo: ShopInfo
}

data class ShopInfo(val id: Int, val description: String)

interface OrderView: WithShopInfo {
    val orders: List<Order>
}

data class Order(val id: Int, val description: String)

interface ProductView: WithShopInfo {
    val products: List<Product>
}

data class Product(val id: Int, val description: String)

class Shop(override val shopInfo: ShopInfo,
           override val orders: List<Order>,
           override val products: List<Product>): OrderView, ProductView

val shops: List<Shop> = emptyList()

fun getShop(shopId: Int): Shop = shops.first { it.shopInfo.id == shopId }
fun getOrderView(shopId: Int): OrderView = getShop(shopId)
fun getProductView(shopId: Int): ProductView = getShop(shopId)

fun getShops(shopIds: List<Int>) = shopIds.map(::getShop)
fun getOrderViews(shopIds: List<Int>): List<OrderView> = getShops(shopIds)
fun getProductViews(shopIds: List<Int>): List<ProductView> = getShops(shopIds)
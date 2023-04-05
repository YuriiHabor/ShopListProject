package com.company.shoplistproject.domain

interface ShopListRepository {
    fun removeShopItem(shopListItem: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun editShopItem(shopListItem: ShopItem): ShopItem

    fun addShopListItem(shopItem: ShopItem)
}
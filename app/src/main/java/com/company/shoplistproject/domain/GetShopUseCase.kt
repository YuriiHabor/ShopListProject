package com.company.shoplistproject.domain

class GetShopUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()
    }
}
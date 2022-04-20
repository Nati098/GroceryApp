package ru.sf.grocery.model.datafiller

import ru.sf.grocery.model.data.BasketGoods
import ru.sf.grocery.model.data.Goods

private val objectFiller: RandomObjectFiller = RandomObjectFiller()

val basketGoodsList = arrayListOf(objectFiller.createAndFill(BasketGoods::class.java),
    objectFiller.createAndFill(BasketGoods::class.java),
    objectFiller.createAndFill(BasketGoods::class.java),
    objectFiller.createAndFill(BasketGoods::class.java))

val goodsList = arrayListOf(objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java),
    objectFiller.createAndFill(Goods::class.java))
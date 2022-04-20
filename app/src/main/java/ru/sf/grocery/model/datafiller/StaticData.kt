package ru.sf.grocery.model.datafiller

import ru.sf.grocery.model.data.BasketGood
import ru.sf.grocery.model.data.Good

private val objectFiller: RandomObjectFiller = RandomObjectFiller()

val basketGoodsList = arrayListOf(objectFiller.createAndFill(BasketGood::class.java),
    objectFiller.createAndFill(BasketGood::class.java),
    objectFiller.createAndFill(BasketGood::class.java),
    objectFiller.createAndFill(BasketGood::class.java))

val goodsList = arrayListOf(objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java),
    objectFiller.createAndFill(Good::class.java))
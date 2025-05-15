package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right

interface AkiraHouseAbstraction {
    fun run()
    var bulbWarning: Boolean
}


fun main() {
    val bulb = B9000()
    val switch = S9000()
    val smartHome = AkiraHouse(bulb, switch)

    smartHome.run()
}

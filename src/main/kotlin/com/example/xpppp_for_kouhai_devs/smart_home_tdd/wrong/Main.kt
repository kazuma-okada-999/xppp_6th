package com.example.xpppp_for_kouhai_devs.smart_home_tdd.wrong

fun main(){
    val bulb = B9000()
    val switch = S9000()
    AkiraHouse(bulb,switch).run()
}

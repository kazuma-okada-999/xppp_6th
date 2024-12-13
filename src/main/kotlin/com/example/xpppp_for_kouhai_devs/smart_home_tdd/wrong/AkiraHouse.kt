package com.example.xpppp_for_kouhai_devs.smart_home_tdd.wrong

class AkiraHouse(val bulb: B9000, val switch: S9000) {
    fun run(){
            lighting(bulb, switch)
    }

    private fun lighting(bulb: B9000, switch: S9000){
        if(switch.isOn()){
            bulb.turnOn()
        }else{
            bulb.turnOff()
        }
    }
}
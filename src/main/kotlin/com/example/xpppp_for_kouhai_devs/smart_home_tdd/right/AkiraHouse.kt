package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right

interface BuldAbstraction {
    fun turnOn()
    fun turnOff()
}

interface SwitchAbstraction {
    fun isOn(): Boolean
}

class AkiraHouse(private val bulb: BuldAbstraction, private val switch: SwitchAbstraction): AkiraHouseAbstraction{
    var isOnCountter = 0
    override var bulbWarning = false

    override fun run(){
        if(isOnCountter == 0) bulbWarning = false
        lighting(bulb, switch)
        if(isOnCountter == 5) bulbWarning = true
    }

    private fun lighting(bulb: BuldAbstraction, switch: SwitchAbstraction){
        if(switch.isOn()){
            bulb.turnOn()
            isOnCountter++
        }else{
            bulb.turnOff()
        }
    }
}



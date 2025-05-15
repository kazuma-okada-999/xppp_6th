package com.example.xpppp_for_senpai_devs.smart_home_tdd

import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.AkiraHouse
import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.AkiraHouseAbstraction
import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.B9000
import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.S9000
import org.junit.jupiter.api.Test
import io.mockk.*
import org.junit.jupiter.api.Assertions.*

class SmartHomeTest {
    //このテストだけはmockkを使用しますが、それ以降のテストは自分でtestDoubleを準備し、mockしてください
    @Test
    fun `smartHomeが正しく初期化されること`() {
        val bulb = mockk<B9000>()
        val switch = mockk<S9000>()
        val smartHome = AkiraHouse(bulb, switch)

        assertNotNull(smartHome)
    }

    @Test
    fun `isOnCounterが5になったら、bulbWarningをtrueにする`() {
        //given
        val testBulb = B9000()
        val testSwitch = S9000()
        val testHome:AkiraHouseAbstraction = AkiraHouse(testBulb, testSwitch)
        //when
        testHome.run()
        testHome.run()
        testHome.run()
        testHome.run()

        assertFalse(testHome.bulbWarning)
        
        testHome.run()

        //then
        assertTrue(testHome.bulbWarning)
    }

    @Test
    fun `isOnCounterが0の時、システムを起動したら、bulbWarningをfalseにする`() {
        val testBulb = B9000()
        val testSwitch = S9000()
        val testHome = AkiraHouse(testBulb, testSwitch)

        testHome.isOnCountter = 4
        testHome.run()
        assertTrue(testHome.bulbWarning)

        testHome.isOnCountter = 0
        testHome.run()
        assertFalse(testHome.bulbWarning)
    }

    @Test
    fun `bulbWarningがTrueの時、システムを起動すると「電球を交換してください。」を表示する`() {
        val testBulb = B9000()
        val testSwitch = S9000()
        val testHome = AkiraHouse(testBulb, testSwitch)

        testHome.bulbWarning = true


    }

    @Test
    fun `電球交換したら、isOnCounterResetをよぶ`() {

    }

    @Test
    fun `システムを起動したら、10秒後に「照明を消灯しました」を表示する`() {

    }
    //参考リンク: https://www.baeldung.com/kotlin/wait-sleep-delay-difference
}



package DIP.Right

import com.example.xpppp_for_kouhai_devs.dip.right.WheelAbstraction

// 下位モジュールの抽象に依存
class NormalWheel: WheelAbstraction {
    override fun rotate(): String {
        return "ノーマルホイール"
    }
}

// 下位モジュールの抽象に依存
class OptionWheel: WheelAbstraction {
    override fun rotate(): String {
        return "オプションホイール"
    }
}
package com.tom.textview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1.setText("聊天室滑起來！")
        tv1.setTextColor(Color.parseColor("#ff0000"))
        tv1.setTextSize(TypedValue.COMPLEX_UNIT_PX,dpTopx(40f))  //onCreate會蓋過xml中註冊的data



        tv2.setText("還趕下來啊?冰鳥!!!!!")
        tv2.setTextColor(Color.CYAN)
        tv2.setTextSize(TypedValue.COMPLEX_UNIT_PX,dpTopx(40f))

    }

    private fun dpTopx(dp: Float): Float {
            return dp * this.resources.displayMetrics.density
    }


}

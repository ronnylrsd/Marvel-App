package br.unicap.c3.pwm.sobre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import br.unicap.c3.pwm.sobre.R
import kotlinx.android.synthetic.main.activity_ronny_screen.*

class RonnyScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_ronny_screen)
        ronny_icon.setOnClickListener(){
            changeBackground()
        }
    }

    private fun changeBackground(){
        ronny_card.setBackgroundResource(R.drawable.scarletwitch)
    }
}
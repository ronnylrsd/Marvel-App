package br.unicap.c3.pwm.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.unicap.c3.pwm.sobre.R
import kotlinx.android.synthetic.main.activity_davi_screen.*

class daviScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_davi_screen)

        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}
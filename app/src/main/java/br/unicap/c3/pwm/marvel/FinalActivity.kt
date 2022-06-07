package br.unicap.c3.pwm.marvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.unicap.c3.pwm.planetas.R
import br.unicap.c3.pwm.planetas.telaJoao
import kotlinx.android.synthetic.main.activity_final.*


class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        davi_info.setOnClickListener {
            openDaviScreen()
        }
        joao_info.setOnClickListener{
            abreTelaJoao()
        }
    }

    private fun openDaviScreen() {
        val intent = Intent(this, daviScreen::class.java)
        startActivity(intent)
    }
    private fun abreTelaJoao(){
        val intent = Intent(this, telaJoao::class.java)
        startActivity(intent)
    }
}
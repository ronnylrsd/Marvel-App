package br.unicap.c3.pwm.sobre

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_joao.*

class telaJoao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_joao)
        github_joao.setOnClickListener{
            openGithub()
        }
    }
    private fun openGithub(){
        startActivity( Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joovitor12")))
    }


}
package br.unicap.c3.pwm.marvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.unicap.c3.pwm.sobre.R
import kotlinx.android.synthetic.main.activity_planet_detail.*

class MarvelDetail : AppCompatActivity() {
    private lateinit var obj: MarvelData
    private var marvelImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}

        obj= intent.getParcelableExtra("marvel")!!
        marvelImg=intent.getIntExtra("marvelImage",-1)
        setData(obj, marvelImg!!)

        button_info.setOnClickListener{
            val intent=Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setData(obj: MarvelData, marvelImg:Int){
        title_info.text=obj.title
        locality_info.text=obj.locality
        power_info.text=obj.power
        weakness_info.text=obj.weakness
        overview_info.text=obj.overview
        marvel_info_img.setImageResource(marvelImg)
    }
}
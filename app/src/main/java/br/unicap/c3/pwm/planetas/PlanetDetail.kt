package br.unicap.c3.pwm.planetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_planet_detail.*

class PlanetDetail : AppCompatActivity() {
    private lateinit var obj:PlanetData
    private var planetImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}

        obj= intent.getParcelableExtra("planet")!!
        planetImg=intent.getIntExtra("planetImage",-1)
        setData(obj, planetImg!!)

        button_info.setOnClickListener{
            val intent=Intent(this,FinalActivity::class.java)
            startActivity(intent)
        }

        button_back_home.setOnClickListener(){
            onBackPressed()
        }
    }
    private fun setData(obj:PlanetData,planetImg:Int){
        title_info.text=obj.title
        galaxy_info.text=obj.locality
        distance_info.text=obj.power
        gravity_info.text=obj.weakness
        overview_info.text=obj.overview
        planet_info_img.setImageResource(planetImg)
    }
}
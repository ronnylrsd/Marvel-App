package br.unicap.c3.pwm.planetas


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet:List<PlanetData>): RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)
        }
        holder.title.text=planet[position].title
        holder.galaxy.text=planet[position].galaxy
        holder.distance.text=planet[position].distance+" m km"
        holder.gravity.text=planet[position].gravity+" m/ss"

        when(planet[position].title!!.toLowerCase()){
            "iron man"->{
                dummyImage=R.drawable.ic_mars
            }
            "thor"->{
                dummyImage=R.drawable.ic_neptune
            }
            "hulk"->{
                dummyImage=R.drawable.ic_earth
            }
            "capitain america"->{
                dummyImage=R.drawable.ic_moon
            }
            "black widow"->{
                dummyImage=R.drawable.ic_venus
            }
            "scarlate witch"->{
                dummyImage=R.drawable.ic_jupiter
            }
            "vision"->{
                dummyImage=R.drawable.ic_saturn
            }
            "black panther"->{
                dummyImage=R.drawable.ic_uranus
            }
            "spider man"->{
                dummyImage=R.drawable.ic_mercury
            }
            "doctor strange"->{
                dummyImage=R.drawable.ic_sun
            }

        }
        if (dummyImage != null) {
            holder.planetimg.setImageResource(dummyImage!!)
        }

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}
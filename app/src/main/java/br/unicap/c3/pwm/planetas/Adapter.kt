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
                dummyImage=R.drawable.iron
            }
            "thor"->{
                dummyImage=R.drawable.thor
            }
            "hulk"->{
                dummyImage=R.drawable.hulk
            }
            "capitain america"->{
                dummyImage=R.drawable.american
            }
            "black widow"->{
                dummyImage=R.drawable.widow
            }
            "scarlate witch"->{
                dummyImage=R.drawable.scarlate
            }
            "vision"->{
                dummyImage=R.drawable.vision
            }
            "black panther"->{
                dummyImage=R.drawable.panther
            }
            "spider man"->{
                dummyImage=R.drawable.spider
            }
            "doctor strange"->{
                dummyImage=R.drawable.strange
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
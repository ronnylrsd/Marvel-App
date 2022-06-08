package br.unicap.c3.pwm.marvel


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.unicap.c3.pwm.sobre.R
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var marvel:List<MarvelData>): RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var marvelimg = view.marvel_img
        var locality = view.locality
        var power = view.power
        var weakness = view.weakness
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, MarvelDetail::class.java)
            intent.putExtra("marvel",marvel[position])
            intent.putExtra("marvelImage",dummyImage)
            holder.itemView.context.startActivity(intent)
        }
        holder.title.text=marvel[position].title
        holder.locality.text=marvel[position].locality
        holder.power.text=marvel[position].power
        holder.weakness.text=marvel[position].weakness

        when(marvel[position].title!!.toLowerCase()){
            "iron man"->{
                dummyImage= R.drawable.iron
            }
            "thor"->{
                dummyImage= R.drawable.thor
            }
            "hulk"->{
                dummyImage= R.drawable.hulk
            }
            "capitan america"->{
                dummyImage= R.drawable.american
            }
            "black widow"->{
                dummyImage= R.drawable.widow
            }
            "scarlet witch"->{
                dummyImage= R.drawable.scarlate
            }
            "vision"->{
                dummyImage= R.drawable.vision
            }
            "black panther"->{
                dummyImage= R.drawable.panther
            }
            "spider man"->{
                dummyImage= R.drawable.spider
            }
            "doctor strange"->{
                dummyImage= R.drawable.strange
            }

        }
        if (dummyImage != null) {
            holder.marvelimg.setImageResource(dummyImage!!)
        }

    }

    override fun getItemCount(): Int {
        return marvel.size
    }
}
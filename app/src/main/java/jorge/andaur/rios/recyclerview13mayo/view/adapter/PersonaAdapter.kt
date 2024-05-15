package jorge.andaur.rios.recyclerview13mayo.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import jorge.andaur.rios.recyclerview13mayo.R
import jorge.andaur.rios.recyclerview13mayo.model.Persona

class PersonaAdapter(private val persona: List<Persona>) :
//RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>()
    RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
    return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = persona[position]
        holder.bind(persona)
    }

    override fun getItemCount(): Int {
        return persona.size
    }

    inner class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textviewName: TextView = itemView.findViewById(R.id.textViewName)
        private val textLastName: TextView = itemView.findViewById(R.id.textViewLastName)

        fun bind(persona: Persona) {
            textviewName.text = persona.nombre
            textLastName.text = persona.apellido
        }
    }


}
package jorge.andaur.rios.recyclerview13mayo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jorge.andaur.rios.recyclerview13mayo.PersonaProveedor
import jorge.andaur.rios.recyclerview13mayo.R
import jorge.andaur.rios.recyclerview13mayo.view.adapter.PersonaAdapter
import jorge.andaur.rios.recyclerview13mayo.model.Persona

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PersonaProveedor.personaList

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

//        val persona = listOf(
//            Persona("James", "Lambda"),
//            Persona("Abigail", "Alpha"),
//            Persona("Ellen", "Beta"),
//            Persona("Richard", "Gamma"),
//            Persona("Thomas", "Theta"),
//            Persona("John", "Epsilon"),
//            Persona("William", "Zeta"),
//            Persona("John", "Nada"),
//            Persona("William", "Nadie"),
//            Persona("James", "Lambda"),
//            Persona("Abigail", "Alpha"),
//            Persona("Ellen", "Beta"),
//            Persona("Richard", "Gamma"),
//            Persona("Thomas", "Theta"),
//            Persona("John", "Epsilon"),
//            Persona("William", "Zeta"),
//            Persona("John", "Nada"),
//            Persona("William", "Nadie")
//        )

//        val adapter = PersonaAdapter(persona)
        val adapter = PersonaAdapter(PersonaProveedor.personaList)
        recyclerView.adapter = adapter

    }
}
package es.vrivas.ejemplosapartado11propietariosyperros

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_nuevo_propietario.*
import kotlinx.android.synthetic.main.fragment_listado_perros.*
import kotlinx.android.synthetic.main.fragment_listado_propietarios.*

/**
 * A simple [Fragment] subclass.
 */
class ListadoPropietarios : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fr_listado_propietarios
        return inflater.inflate(R.layout.fragment_listado_propietarios, container, false)
    }



    override fun onResume() {
        super.onResume()
        tv_propietarios.text= datos.propietarios.toString()
    }


}
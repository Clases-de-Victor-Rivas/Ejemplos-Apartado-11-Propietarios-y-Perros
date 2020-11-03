package es.vrivas.ejemplosapartado11propietariosyperros

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_nuevo_propietario.*
import kotlinx.android.synthetic.main.fragment_nombre_fecha_nacimiento.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class nombre_fecha_nacimiento : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nombre_fecha_nacimiento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Establecemos el hint de lso campos de texto cuando el usuario hace focus sobre ellos
        // Para saber qué debemos poner en el hint accedemos a la "etiqueta" que hemos puesto en lo alto del formulario
        // que puede ser "Nuevo propietario" o "Nuevo perro"
        et_nombre.setOnFocusChangeListener { _, hasFocus ->
            et_nombre.hint = if (hasFocus)
                            "Nombre del " + activity?.tv_etiqueta?.text.toString().toLowerCase(Locale.getDefault())
                             else ""
        }
        et_fecha_nacimiento.setOnFocusChangeListener { _, hasFocus ->
            et_fecha_nacimiento.hint = if (hasFocus)
                                        "F. nacimiento del " + activity?.tv_etiqueta?.text.toString().toLowerCase(Locale.getDefault())
                                        else ""
        }
    }

    override fun onResume() {
        super.onResume()
        // Para saber qué debemos poner en el hint accedemos a la "etiqueta" que hemos puesto en lo alto del formulario
        // que puede ser "Nuevo propietario" o "Nuevo perro"
        et_nombre.hint = "Nombre del " + activity?.tv_etiqueta?.text.toString().toLowerCase(Locale.getDefault())
        et_fecha_nacimiento.hint = "F. nacimiento del " + activity?.tv_etiqueta?.text.toString().toLowerCase(Locale.getDefault())
    }

}
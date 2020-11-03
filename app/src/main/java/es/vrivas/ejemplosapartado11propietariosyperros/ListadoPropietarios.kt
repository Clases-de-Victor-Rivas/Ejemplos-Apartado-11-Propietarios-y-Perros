package es.vrivas.ejemplosapartado11propietariosyperros

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_listado_perros.*
import kotlinx.android.synthetic.main.fragment_listado_propietarios.*

// TODO: Rename parameter arguments, choose names that match
// the fr_listado_perros initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListadoPropietarios.newInstance] factory method to
 * create an instance of this fr_listado_perros.
 */
class ListadoPropietarios : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onClick( view: View?) {
        var intent=Intent( this.context, NuevoPropietario::class.java)
        startActivity(intent)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fr_listado_propietarios
        return inflater.inflate(R.layout.fragment_listado_propietarios, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_add_propietario.setOnClickListener( this )
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fr_listado_propietarios using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fr_listado_perros ListadoPropietarios.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListadoPropietarios().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
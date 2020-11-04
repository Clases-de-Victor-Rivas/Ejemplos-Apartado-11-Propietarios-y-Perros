package es.vrivas.ejemplosapartado11propietariosyperros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_acerca_de.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "autor"
private const val ARG_PARAM2 = "año"

/**
 * A simple [Fragment] subclass.
 * Use the [acerca_de.newInstance] factory method to
 * create an instance of this fragment.
 */
class acerca_de : Fragment() {
    private var autor: String? = null
    private var anio: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            autor = it.getString(ARG_PARAM1)
            anio = it.getInt(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acerca_de, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_autor_anio.text=tv_autor_anio.text.toString()
            .replace("#Autor" , autor as String )
            .replace( "#Anio", anio.toString() )
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param autor Nombre del autor del programa
         * @param anio Año de creación del programa
         * @return A new instance of fragment acerca_de.
         */
        @JvmStatic
        fun newInstance(autor: String, anio: Int) =
                acerca_de().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, autor)
                        putInt(ARG_PARAM2, anio)
                    }
                }
    }
}
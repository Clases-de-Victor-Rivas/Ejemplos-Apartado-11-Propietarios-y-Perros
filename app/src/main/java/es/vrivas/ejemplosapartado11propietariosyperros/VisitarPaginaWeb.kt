package es.vrivas.ejemplosapartado11propietariosyperros

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_nuevo_perro.*
import kotlinx.android.synthetic.main.fragment_visitar_pagina_web.*


/**
 * A simple [Fragment] subclass.
 * Use the [VisitarPaginaWeb.newInstance] factory method to
 * create an instance of this fragment.
 */
class VisitarPaginaWeb : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visitar_pagina_web, container, false)
    }

    // Asignamos el onClickListener al botón del fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_ver_pagina_web.setOnClickListener(this)
    }

    // Definimos un intent implícito para que una app muestre una página web
    override fun onClick(v: View?) {
        val url = "https://vrivas.es"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment VisitarPaginaWeb.
         */
        @JvmStatic
        fun newInstance() =
            VisitarPaginaWeb()
    }
}
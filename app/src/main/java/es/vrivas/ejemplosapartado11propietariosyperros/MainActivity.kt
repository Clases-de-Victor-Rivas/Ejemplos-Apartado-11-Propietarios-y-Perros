package es.vrivas.ejemplosapartado11propietariosyperros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun boton_click(view: View?){
        view?.let { Snackbar.make(it, "Pulsado", Snackbar.LENGTH_LONG).show() }
    }
}
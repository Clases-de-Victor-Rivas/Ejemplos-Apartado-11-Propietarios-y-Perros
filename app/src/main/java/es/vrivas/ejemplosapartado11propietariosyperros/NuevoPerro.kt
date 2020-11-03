package es.vrivas.ejemplosapartado11propietariosyperros

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_nuevo_perro.*
import kotlinx.android.synthetic.main.fragment_nombre_fecha_nacimiento.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class NuevoPerro : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_perro)

        bt_nuevo_perro_add.setOnClickListener(this)
    }

    @SuppressLint("NewApi")
    override fun onClick(v: View?) {
        val formatter = DateTimeFormatter.ofPattern("d/M/yyyy")
        val date = LocalDate.parse(et_fecha_nacimiento.text.toString(), formatter)
        datos.perros.add(Persistencia.Perro(et_nombre.text.toString(),
            date
            , et_raza.text.toString()))
        Log.d( "VICTOR", datos.perros.size.toString())

        Log.d( "VICTOR", datos.perros.last().nombre)
        Log.d( "VICTOR", datos.perros.last().fecha.toString())
        Log.d( "VICTOR", datos.perros.last().raza)

        finish()
    }
}
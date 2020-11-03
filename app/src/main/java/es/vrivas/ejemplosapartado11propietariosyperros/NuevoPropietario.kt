package es.vrivas.ejemplosapartado11propietariosyperros

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_nuevo_perro.*
import kotlinx.android.synthetic.main.activity_nuevo_propietario.*
import kotlinx.android.synthetic.main.fragment_nombre_fecha_nacimiento.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class NuevoPropietario : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_propietario)
        bt_nuevo_propietario_add.setOnClickListener(this)
        bt_nuevo_propietario_cancelar.setOnClickListener(this)
    }

    @SuppressLint("NewApi")
    override fun onClick(v: View?) {
        when( v ) {
            bt_nuevo_propietario_add-> {
                val formatter = DateTimeFormatter.ofPattern("d/M/yyyy")
                val date = LocalDate.parse(et_fecha_nacimiento.text.toString(), formatter)
                datos.propietarios.add(
                    Persistencia.Propietario(
                        et_nombre.text.toString(),
                        date, et_direccion.text.toString()
                    )
                )
            }
        }
        finish()
    }
}
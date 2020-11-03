package es.vrivas.ejemplosapartado11propietariosyperros

import java.time.LocalDate

@Suppress("unused")
class Persistencia() {
    class Propietario( _nombre: String, _fecha: LocalDate, _direccion: String  ) {
        var nombre=_nombre
        var fecha= _fecha
        var direccion= _direccion

        override fun toString(): String {
            return "{$nombre, "+fecha.toString()+",$direccion}"
        }
    }

    class Perro ( _nombre: String, _fecha: LocalDate, _raza: String  ){
        var nombre= _nombre
        var fecha= _fecha
        var raza= _raza

        override fun toString(): String {
            return "{$nombre, "+fecha.toString()+",$raza}\n"
        }
    }

    val propietarios: MutableList<Propietario> = mutableListOf()
    val perros: MutableList<Perro> = mutableListOf()


}

var datos=Persistencia()
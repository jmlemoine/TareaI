package com.example.tareai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_segunda_actividad.*
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtApellido
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtNombre
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtTelefono
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtCorreo

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)

        val objetoIntent: Intent = intent

        var Nombre = objetoIntent.getStringExtra("Nombre")
        var Apellido = objetoIntent.getStringExtra("Apellido")
        var Telefono = objetoIntent.getStringExtra("Telefono")
        var Correo = objetoIntent.getStringExtra("Correo")

        txtNombre.text = Nombre
        txtApellido.text = Apellido
        txtTelefono.text = Telefono
        txtCorreo.text = Correo




    }
}

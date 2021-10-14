package com.example.labii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vehiculo:Vehiculos = Vehiculos("Sentra", "Nissan","Azul", 2016, "Roberto", "124657-5")
        vehiculo.Datos()
        vehiculo.encenderVehiculo()
        vehiculo.apagarVehiculo()
        vehiculo.Propietario()
    }
    }
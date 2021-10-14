package com.example.labii

class Vehiculos(var Modelo:String, var Marca:String, var Color:String, var Año:Int, nombre:String, DUI:String):Persona(nombre, DUI), Encender, Apagar {

    override fun encenderVehiculo() {
        println("El Vehiculo esta encendido")
    }

    override fun apagarVehiculo() {
        println("El Vehiculo esta apagado")
    }

    fun Datos(){
        println("El propietario del Vehiculo es: $nombre con el numero de DUI: $DUI")
        println("Modelo: $Modelo")
        println("Marca: $Marca")
        println("Año: $Año")
        println("Color: $Color")
    }

    public override fun Propietario(){
        println("El propietario del vehiculo es $nombre")
    }
}
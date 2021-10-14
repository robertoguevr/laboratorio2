package com.example.labii

open class Persona(var nombre:String,var DUI:String) {

    private var name = "Roberto"
    protected open fun Propietario(){
        println("El vehiculo pertenece a: $name")
    }
}
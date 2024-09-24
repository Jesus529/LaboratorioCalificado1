package com.vargas.kevin.laboratoriocalificado01

// Definición de la clase Ejercicio01Kotlin
class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Convierte ambas palabras en arrays de caracteres y los ordena
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Compara los arrays ordenados para verificar si son iguales
        return palabra1Ordenada == palabra2Ordenada
    }
}
// Función principal para ejecutar el programa
fun main() {
    // Creación de una instancia de la clase Ejercicio01Kotlin
    val ejercicio = Ejercicio01Kotlin()

    // Imprime el resultado de la verificación de anagramas entre "listen" y "silent"
    println(ejercicio.sonAnagramas("listen", "silent")) // true

    // Imprime el resultado de la verificación de anagramas entre "hello" y "world"
    println(ejercicio.sonAnagramas("hello", "world"))  // false
}

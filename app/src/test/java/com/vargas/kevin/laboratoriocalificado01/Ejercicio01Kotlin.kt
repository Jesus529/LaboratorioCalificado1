import com.vargas.kevin.laboratoriocalificado01.Ejercicio01Kotlin

// Clase para verificar si dos palabras son anagramas
class Ejercicio01Kotlin {

    // Función que recibe dos palabras y devuelve true si son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Convertir ambas palabras en listas de caracteres y ordenarlas
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Comparar las dos listas de caracteres
        return palabra1Ordenada == palabra2Ordenada
    }
}

// Función principal para probar el algoritmo
fun main() {
    val ejercicio = Ejercicio01Kotlin()

    // Ejemplo 1: "listen" y "silent" son anagramas
    println(ejercicio.sonAnagramas("listen", "silent")) // true

    // Ejemplo 2: "hello" y "world" no son anagramas
    println(ejercicio.sonAnagramas("hello", "world"))  // false
}

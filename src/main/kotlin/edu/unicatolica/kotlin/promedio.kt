package edu.unicatolica.kotlin

package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun promedioDeTresNotas(n1: Double, n2: Double, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}

fun main() {
    // === Promedio de 3 asignaturas ===
    println("=== Promedio de 3 asignaturas ===")

    val nota1 = 4.5
    val nota2 = 3.8
    val nota3 = 4.2

    val promedio = promedioDeTresNotas(nota1, nota2, nota3)

    println("Las notas son: $nota1, $nota2, $nota3")
    println("El promedio es: $promedio")

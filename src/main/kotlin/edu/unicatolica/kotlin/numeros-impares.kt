package edu.unicatolica.kotlin

fun paresEImpares() {
    println("===== Números Pares e Impares =====")

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }
    val impares = numeros.filter { it % 2 != 0 }

    println("Números: $numeros")
    println("Pares: $pares")
    println("Impares: $impares")
}

fun promedioNotas() {
    println("===== Promedio de Notas =====")

    val notas = listOf(3.5, 4.0, 2.8, 5.0, 3.9)  // Cambia estas notas si quieres
    val promedio = if (notas.isNotEmpty()) notas.average() else 0.0

    println("Notas: $notas")
    println("Promedio: $promedio")

    if (promedio >= 3.0) {
        println("Resultado: Aprobado ✅")
    } else {
        println("Resultado: Reprobado ❌")
    }
}

fun main() {
    paresEImpares()
    promedioNotas()
}

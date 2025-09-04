package edu.unicatolica.kotlin
fun main() {
    println("Ingrese la nota de la primera asignatura:")
    val nota1 = readLine()!!.toDouble()

    println("Ingrese la nota de la segunda asignatura:")
    val nota2 = readLine()!!.toDouble()

    println("Ingrese la nota de la tercera asignatura:")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    println("El promedio de las tres asignaturas es: $promedio")
}

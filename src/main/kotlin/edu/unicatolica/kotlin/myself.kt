package edu.unicatolica.kotlin

fun section(title: String) {
    println("\n" + "=".repeat(72))
    println(title)
    println("=".repeat(72))
}
fun aboutMeDemo() {
    section("Y) About Me")

    val name = "Stefany"
    val age = 23
    val major = "ingenieria sistemas"
    val skills = listOf("Programming", "Teamwork", "Problem Solving")

    val message = "Hi, my name is $name, I am $age years old, I study $major " +
            "and my skills are: ${skills.joinToString(", ")}."

    println(message)
}

fun main() {
    aboutMeDemo()
}

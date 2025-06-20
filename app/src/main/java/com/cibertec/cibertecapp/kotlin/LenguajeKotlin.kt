package com.cibertec.cibertecapp.kotlin

fun main () {

    // 1. Variables
    // Variables de valor mutable
    var miPrimerExamen: Int = 15

    // Variables de valor inmutable
    val miSegundoExamen: Int = 15

    // 2. Inferencia de tipo
    var miEdad: Int = 33
    var miDni = 45645645

    // 3. Tipos de Datos
    var myInt: Int = 10
    var myLong: Long = 2000000000
    var myByte: Byte = 12
    var myShor: Short = 20

    var myDouble: Double = 1.20
    var myFloat: Float = 6.5f

    var myBoolean: Boolean = true

    print(myBoolean)
    print("Mi variable es: $myBoolean")

    // Arreglos - ArregloLineal
    val myArray = arrayOf(15,13,15)
    myArray[0] = 18

    val myArrayInt = arrayOf<Int>(15,13,15)
    myArrayInt[0] = 18

    // Lista inmutables
    val myList = listOf(15,13,15)

    // ArrayMutable - Arreglos Dinamicos
    val myArrayListOf = arrayListOf(1,2,3)
    myArrayListOf[0] = 20
    myArrayListOf.add(12)

    // Condicionales
    val aprobare: Boolean = false
    if (aprobare) {
        print("Aprendere iOS")
    } else {
        print("Este ciclo aprendo, el otro apruebo")
    }

    // for
    var cursos = listOf("Android", "iOS", "Java")
    for (curso in cursos) { // contenido
        print(curso)
    }

    for ((index, curso) in cursos.withIndex()) { // index, contenido
        print("$index $curso")
    }
    // While
    var contador = 0
    while (contador < cursos.size) {
        print(cursos[contador])
        contador++
    }
    // do while
    var maximo = 10
    var contador2 = 0
    do {
        print("Contador: $contador2")
        contador2++
    } while (contador2 <= maximo)

    // When
    val mes: Int = 1
    when(mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        else -> "Ingreso un mes erroneo"
    }

    // Operadores
    print(1+1)
    print(5-2)
    print(5*5)
    print(25/5)
    print(9%4) // Operadore modulo

    val sumarNumero = sumar(1,2)
}

// Funciones
fun sumar(a: Int, b: Int): Int {
    val resultado = a + b
    print(resultado)
    return resultado
}
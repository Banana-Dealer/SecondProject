package oop

class Matrix( val a: Array<IntArray> = Array(3) { IntArray(4) {0} },
              var column: Int, var row: Int) {

    fun multiplication() {

        var c: Array<IntArray> = Array(3){ IntArray(4){0} }
        var b: Array<IntArray> = Array(3){ IntArray(4){0} }

        println("Second Matrix")
        for (i in 0 until column) {
            for (j in 0 until row) {
                b[i][j] = (Math.random() * 10)
                    .toInt()
                print(" ${b[i][j]}")
            }
            println()
        }
        println("Summ Base+Second Matrix")
        for (i in 0 until column) {
            for (j in 0 until row) {
                c[i][j] = a[i][j] + b[i][j]
                    .toInt()
                print(" ${c[i][j]}")
            }
            println()
        }
    }

    fun addition() {

        var d: Array<IntArray> = Array(3){ IntArray(4){0} }
        var b: Array<IntArray> = Array(3){ IntArray(4){0} }

        println("Second Matrix")
        for (i in 0 until column) {
            for (j in 0 until row) {
                b[i][j] = (Math.random() * 10)
                    .toInt()
                print(" ${b[i][j]}")
            }
            println()
        }

        println("Addition Base+Second Matrix")
        for (i in 0 until column) {
            for (j in 0 until row) {
                d[i][j] = a[i][j] + b[i][j]
                    .toInt()
                print(" ${d[i][j]}")
            }
            println()
        }

    }

    fun print() {
        println(a)
    }

    fun mmultiplication() {
        var n = 3
        var f: Array<IntArray> = Array(3){ IntArray(4){0} }

        println("Number $n * Matrix")
        for (i in 0 until column) {
            for (j in 0 until row) {
                f[i][j] = a[i][j] * n
                    .toInt()
                print(" ${f[i][j]}")
            }
            println()
        }

    }
}

fun main() {
    val a: Array<IntArray> = Array(3) { IntArray(4) { 0 } }
    val matrix1 = Matrix(a, 3,4)
    // количество строк
    val column = a.size
    // количество элементов в строке
    val row = a[0].size

    println("Base Matrix")
    for (i in 0 until column) {
        for (j in 0 until row) {
            a[i][j] = (Math.random() * 10)
                .toInt()
            print(" ${a[i][j]}")
        }
        println()
    }

//    matrix1.multiplication()
//    matrix1.addition()
//    matrix1.print()
    matrix1.mmultiplication()
}
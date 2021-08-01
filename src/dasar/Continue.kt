package dasar


/*
continue digunakan untuke menghentikan perulagan
*/

fun main() {
    for (i in 1..1000) {
        if (i % 2 == 0) {
            //melompati bilangan genap
            continue
        }
        println("Angka $i")
    }
}
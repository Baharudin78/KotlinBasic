package dasar

fun main() {
/* Break kondisi digunakan untuk menghentikan
perulangan dan tidak akan di eksekusi lagi
    */
    var i = 0
    while (true) {
        println("Perlurangan ke -$i")
        i++
        if (i >= 1000) {
            //untuk menghentikan perulangan hanya sampai 1000
            break
        }
    }
}
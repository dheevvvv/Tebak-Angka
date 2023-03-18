import kotlin.random.Random

fun main() {
    tebakAngka()
}

fun tebakAngka() {
    // Menghasilkan sebuah bilangan acak antara 1 dan 100
    val angkaAcak = Random.nextInt(1, 101)
    var jumlahTebakan = 0

    // Memberi 5 kali kesempatan untuk menebak
    while (jumlahTebakan < 5) {
        // Minta tebakan dari pengguna
        print("Tebak sebuah angka antara 1 dan 100: ")
        val tebakan = readLine()!!.toInt()

        // Jika tebakan benar, keluar dari loop dan memberikan pesan keberhasilan
        if (tebakan == angkaAcak) {
            println("Selamat! Anda berhasil menebak angka dengan benar.")
            return
        }

        // Jika tebakan salah, berikan petunjuk kecil dan tambah jumlah tebakan
        if (tebakan < angkaAcak) {
            println("Angka terlalu kecil.")
        } else {
            println("Angka terlalu besar.")
        }
        jumlahTebakan++
    }

    // Jika tebakan habis tapi masih salah, memberikan pesan kegagalan
    println("Maaf, Anda gagal menebak angka. Angka yang benar adalah $angkaAcak")
}

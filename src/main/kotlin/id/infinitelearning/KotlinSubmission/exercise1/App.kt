package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan = "Hermawan Abdillah"
    val namaBelakang = "Hamka"
    val umur = 21
    val single = true

    println("Saya $namaDepan $namaBelakang, berumur $umur, berstatus masih single adalah $single");
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {


    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {

    val daftarAnggota = listOf<Any>("Hermawan", "Anandito", "Farizul", "Birrul", "Rama", "Akmal")

    return "$daftarAnggota"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val member = arrayOf("Hermawan", "Anandito", "Farizul", "Birrul", "Rama", "Akmal")
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = member.size + mentor.size

    return countOfGroup
}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(2, listOf("Hermawan Abdillah Hamka", "Anandito Rafi Putra", "Muhammad Farizul Imami Sudirman", "Ahmad AlBirrul Iqbal", "Muhammad Ramadhan", "Akmal Sakirin"), "Morning")

}
package id.infinitelearning.KotlinSubmission.exercise4



fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        var nomor = 30/0
        println(nomor)
    }
    catch (e : ArithmeticException){
       println("Kaga Bisa Dihitung KOCAK")
    }


}
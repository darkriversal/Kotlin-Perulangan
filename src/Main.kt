fun main(args: Array<String>){
    for (i in 1..100) {
        when{
            i%2==0 -> println("$i -> kelipatan angka dua")
            i%10==0 -> println("$i -> kelipatan angka sepuluh")
            else -> println("$i")
        }
    }
}
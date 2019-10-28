package com.example.listfilm
import java.util.*

object film_data {
    private val judul_film= arrayOf(
        "Yowisben 2",
        "dilan 1990",
        "Danur 3",
        "dua garis biru",
        "Pocong",
        "habibie ainun",
        "Laskar pelangi",
        "Tanah surga katanya",
        "The Santri",
        "Bumi Manusia")

    private val gendre= arrayOf(
        "Komedi, romantis, drama",
        "Romantis, drama",
        "Horor",
        "Romantis",
        "Horor",
        "romantis, biografi",
        "biografi",
        "biografi",
        "Romantis, biografi",
        "romantis, drama")

    private val filmImage= intArrayOf(
        R.drawable.yowisben,
        R.drawable.dilan,
        R.drawable.danur_3,
        R.drawable.dua_garisbiru,
        R.drawable.pocong,
        R.drawable.habibie_ainun,
        R.drawable.laskar_pelangi,
        R.drawable.tanah_surga,
        R.drawable.the_santri,
        R.drawable.bumi_manusia)

    val listdata:ArrayList<Film>
        get() {     val list= arrayListOf<Film>()
            for (position in judul_film.indices){
                val film = Film()

                film.judul= judul_film[position]
                film.gendre= gendre[position]
                film.Foto= filmImage[position]

                list.add(film)
                         }
                return list
                     }



}
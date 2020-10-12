package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //imutable variabel yang konstan

//        val iniImutable = "I Putu Ari Sisila"
//
//        //mutable
//        var namaSaya = "Ari susila"
//        namaSaya = "pala pantek"
//        var nama: String = "Nama saya"
//        var namaKmu : String
//        var iniInteger : Int = 20
//        var iniIntegerja = 1
//
//        Log.i("TAG" , "iniImutable $iniImutable")
//        Log.e("TAG","ini adalah nama saya : $namaSaya")

        val objekMobil = Mobil()
        objekMobil.ban = 4
        objekMobil.kursi = "4"
        objekMobil.pintu = "4 pintu"

        Log.e("TAG", "objek mobil ${objekMobil.kursi} ${objekMobil.pintu}")
    }
}


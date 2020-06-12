package com.udacoding.mvpbangundatar.presenter

import com.udacoding.mvpbangundatar.model.Hasil

//todo 7 membuat contruct di bagian presenter
class PersegiPanjangPresenter(var ppView : PersegiPanjangView) {

    //todo 3 function paramter hitung

    fun hitung(panjang : String,lebar : String){
        //todo 4 convert dari type data string ke Integer
        val cPanjang = panjang.toInt()
        val cLebar  = lebar.toInt()
        val total = cPanjang.times(cLebar)

        //todo 5 hasil presenter masukkan ke dalam model
        val hasil = Hasil()
        hasil.total = total



        //todo 8 masukkan model ke interface
        ppView.hasilHitung(hasil)


    }
}
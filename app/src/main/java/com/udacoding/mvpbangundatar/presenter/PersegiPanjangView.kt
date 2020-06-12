package com.udacoding.mvpbangundatar.presenter

import com.udacoding.mvpbangundatar.model.Hasil


//todo ke 6 membuat interface untuk notify activity(view) kalau hasil logic sudah selsai
interface PersegiPanjangView {

    fun hasilHitung(hasil : Hasil)
}
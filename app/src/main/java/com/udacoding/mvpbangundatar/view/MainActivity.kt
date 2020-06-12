package com.udacoding.mvpbangundatar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.udacoding.mvpbangundatar.R
import com.udacoding.mvpbangundatar.model.Hasil
import com.udacoding.mvpbangundatar.presenter.PersegiPanjangPresenter
import com.udacoding.mvpbangundatar.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PersegiPanjangView {

    //todo 9 deklrasi presenter
    private var presenter : PersegiPanjangPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 10 init presenter
        presenter = PersegiPanjangPresenter(this);



        //todo 1 event klik
        btnHitung.setOnClickListener {

            //todo 2 ambil inputan user
            val panjang = edInput1.text.toString()
            val lebar = edInput2.text.toString()

            //todo 11 eksekusi prsenter
            presenter?.hitung(panjang,lebar)
        }
    }

    override fun hasilHitung(hasil: Hasil) {
        //todo 12 bind data ke view
        Toast.makeText(this,hasil.total.toString(),Toast.LENGTH_LONG).show()

    }
}
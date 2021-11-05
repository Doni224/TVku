package com.doni.Tvku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        image_splashDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.sharp))
       textViewNamaDetail.text = intent.getStringExtra("Nama")
        textViewMerkDetail.text = intent.getStringExtra("Merk")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
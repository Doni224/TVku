package com.doni.Tvku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.sony1,"Sony","Sony X95G","Smart TV Sony X95G hadir dengan detail gambar 4K memukau.  " +
                "Resolusi 4K tinggi dipadukan dengan Sound From Picture Reality agar gambar dan suara lebih hidup," +
                "Prosesor X1 Ultimate mendeteksi objek dan meningkatkan kecerahan, detail, dan warna supaya terlihat lebih jelas. "))

        data?.add(DataModel(R.drawable.sharp,"Sharp", "Sharp AQUOS TV LED"," memiliki Fitur Antenna Booster yang berfungsi untuk memperkuat sinyal yang diterima oleh antena," +
                "sehingga dapat berpengaruh besar untuk memperjernihkan kualitas gambar serta menghilangkan gambar berbayang. " +
                "Memberikan konsumsi daya TV yang rendah yang dapat menyimpan hingga setengah (18W) dari model standar. Dengan refleksi sound yang melengkung sehingga suara yang keluar dari televisi tidak pecah dan terdengar sempurna. "))

        data?.add(DataModel(R.drawable.samsung,"Samsung", "Samsung UA24T4001 ","adalah TV dengan luas layar 24 inci yang memiliki fitur lengkap. TV ini memiliki resolusi HD Ready 1366 x 768 piksel. Kualitas gambarnya jernih dan warnanya tajam. TV Samsung 24 inci ini dibekali port USB. Anda bisa memutar video di TV melalui USB flashdisk. " +
                "Caranya cukup mudah, tinggal colokan flashdisk ke port USB yang disediakan. Sedangkan untuk port HDMI bisa Anda gunakan untuk menghubungkan TV ke perangkat media player atau konsol game. " +
                " TV LED Samsung UA24T4001 hadir dengan Wide Colour Enhancer yang bisa meningkatkan akurasi warna. Serta, ada Clean View yang membuat gambar lebih jelas, terang, dan bebas noise. "))

        data?.add(DataModel(R.drawable.lg,"LG", " Smart TV LG LM570 ","LG LM570 adalah smart TV murah dengan fitur melimpah. TV ini didukung sistem operasi webOS yang memungkinkan Anda bisa menikmati konten seru dengan mudah.  " +
                "simpel memberikan kenyamanan saat Anda menonton. Di dalam TV terdapat prosesor Quad Core yang berfungsi untuk menghilangkan noise gambar dan menciptakan warna dan kontras lebih dinamis. "
                ))

        data?.add(DataModel(R.drawable.polytron,"Polytron", "Polytron 32T7511","memiliki layar LED 32 inch dengan teknologi layar HD. Dilengkapi dengan port HDMI dan USB, harga TV LED Polytron ini berada di kisaran Rp 1 jutaan. " +
                "TV ini memiliki resolusi layar 1366x768 piksel, dan memiliki port USB yang bisa dikoneksikan dengan flashdisk " +
                " untuk menonton berbagai film dalam berbagai format yang kompatibel. Kekuranga TV ini ada pada ketidaktersediaan teknologi 3D dan fitur touchscreen."))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.Nama)
                intent.putExtra("merk", item?.Merk)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}
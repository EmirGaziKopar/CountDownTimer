package com.emirgazikopar.sayaclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(100000,1000){ //CountDownTimer abstract nesnesinden bir adet ananymous bir object türettik
            override fun onTick(millisUntilFinished: Long) { //Her countDownInterval çalışmasında bir kere çağırılır yani bu kod için saniyede bir kere
                textView.text = "left: ${millisUntilFinished/1000}"
            }

            override fun onFinish() { //Bitiş noktasındır aralık kapandığında en son bu method çalışır
                textView.text="left:0"
            }

        }.start() //farkettiysen burada CoutDownTimer'da  oluşturduğumuz nesnenin içerisinde olan bir method muhtemelen encapsulation nedeniyle kullanılmış aynı bizim yazdir methodlarımız gibi

    }




}
package id.ac.polbeng.jumiatiriyana.uts_6304221448_jumiatiriyana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.jumiatiriyana.uts_6304221448_jumiatiriyana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHitung.setOnClickListener {
            val panjang = binding.edtPanjang.text.toString().toDouble()
            val lebar = binding.edtLebar.text.toString().toDouble()
            val tinggi = binding.edtTinggi.text.toString().toDouble()


            val volume = panjang * lebar * tinggi
            binding.txtHasil.text = "Volume Balok: $volume"
        }
    }
}
package com.example.lesson2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding) {
            btnMain.setOnClickListener {
                Toast.makeText(this@MainActivity, getBuildInfoString(), Toast.LENGTH_LONG).show()
            }
        }

        setContentView(binding.root)
    }

    private fun getBuildInfoString(): String {
        return "${Build.MANUFACTURER} ${Build.MODEL} \n" +
                "Android ${Build.VERSION.RELEASE} (SDK ${Build.VERSION.SDK_INT})"
    }
}
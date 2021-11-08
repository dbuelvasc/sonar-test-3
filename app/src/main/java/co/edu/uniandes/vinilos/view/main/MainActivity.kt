package co.edu.uniandes.vinilos.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.edu.uniandes.vinilos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
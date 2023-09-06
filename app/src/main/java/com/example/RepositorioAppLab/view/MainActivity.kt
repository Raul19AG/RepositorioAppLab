package com.example.RepositorioAppLab.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.RepositorioAppLab.viewmodel.CompararViewModel
import com.example.proyectointegradora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val compararViewModel : CompararViewModel by viewModels()
   // var patron:EditText = FindViewById(R.id.comparar)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // compararViewModel._comparar.observe()
       //Boton de la app bindiado al precionarlo debe llamar a la fun comparador() y asignarla a la Textview.salida.text
        binding.button.setOnClickListener {
            binding.salida!!.text= compararViewModel.comparador(binding.patron,binding.acomparar)}
    }
}
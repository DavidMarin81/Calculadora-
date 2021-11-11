package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculadora.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var sumando1 = ""

        fun crearSumando(boton : Button, tecla : Int){
            boton.setOnClickListener{
                sumando1 = sumando1 + tecla
                binding.tvResultado.setText(sumando1)
            }
        }

        crearSumando(binding.btCero, 0)
        crearSumando(binding.btUno, 1)
        crearSumando(binding.btDos, 2)
        crearSumando(binding.btTres, 3)
        crearSumando(binding.btCuatro, 4)
        crearSumando(binding.btCinco, 5)
        crearSumando(binding.btSeis, 6)
        crearSumando(binding.btSiete, 7)
        crearSumando(binding.btOcho, 8)
        crearSumando(binding.btNueve, 9)
    }
}
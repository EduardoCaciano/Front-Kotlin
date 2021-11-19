package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.senai.sp.jandira.everypetspp.R

class MainActivity : AppCompatActivity() {

    lateinit var edCrieSuaConta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCrieSuaConta = findViewById(R.id.ed_criar_conta)

        edCrieSuaConta.setOnClickListener {
            Trocartela()
        }

    }

    private fun Trocartela(){
        val intent = Intent(this, CadastroEmail::class.java)
        startActivity(intent)
    }
}
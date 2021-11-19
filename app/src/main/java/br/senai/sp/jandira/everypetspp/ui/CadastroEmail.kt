package br.senai.sp.jandira.everypetspp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import br.senai.sp.jandira.everypetspp.R

class CadastroEmail : AppCompatActivity() {
    lateinit var button: Button
    lateinit var voltar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_email)

        button = findViewById(R.id.btn_login_cadastro_email)
        button.setOnClickListener {
            Trocartela()
        }

        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }
}

package br.senai.sp.jandira.everypetspp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.everypetspp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoard : AppCompatActivity() {
//    private lateinit var buttonHome: Button
//    private lateinit var buttonPerfil: Button
//    private lateinit var buttonCarrinho: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var pesquisaFragment: PesquisaFragment
    private lateinit var carrinhoFragment: CarrinhoFragment

    //

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dash_board)

//        buttonHome = findViewById(R.id.button_home)
//
//        buttonPerfil = findViewById(R.id.button_perfil)
//
//        buttonCarrinho = findViewById(R.id.button_carrinho)

        homeFragment = HomeFragment()
        pesquisaFragment = PesquisaFragment()
        carrinhoFragment = CarrinhoFragment()

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        //
        setFragment(homeFragment)

//        buttonHome.setOnClickListener {
//            setFragment(homeFragment)
//        }
//        buttonPerfil.setOnClickListener {
//            setFragment(perfilFragment)
//        }
//        buttonCarrinho.setOnClickListener {
//            setFragment(carrinhoFragment)
//        }

        bottomNavigationView.setOnItemSelectedListener {
            onNavigationItemSelected(it)
        }

    }

    private fun setFragment(fragment: Fragment) {

        val fragmentTrasaction = //gerencia os fragmentos/ transacoes
                supportFragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.frame_fragments, fragment)
        //faz a acontecer
        fragmentTrasaction.commit()

    }

    fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.i("xpto", "caiu")
        when (item.itemId) {
            R.id.menu_home -> {
                setFragment(homeFragment)
            }
            R.id.menu_pesquisa -> {
                setFragment(pesquisaFragment)
            }
            else -> {
                setFragment(carrinhoFragment)
            }
        }
        return true
    }


}
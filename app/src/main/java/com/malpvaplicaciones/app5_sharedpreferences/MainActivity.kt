package com.malpvaplicaciones.app5_sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.malpvaplicaciones.app5_sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)

        binding.rvUser.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers(): MutableList<User>{
        val users = mutableListOf<User>()

        val marcos = User(1, "Marcos", "Palma Valenzuela", " ")
        val carolina = User(2, "Carolina", "Zuniga Pacheco", " ")
        val jacqueline = User(3, "Jacqueline", "Valenzuela Fredes", " ")
        val maritza = User(4, "Maritza", "Reyes Fredes", " ")
        val karol = User(5, "Karol", "Dance Lucero", " ")

        users.add(marcos)
        users.add(carolina)
        users.add(jacqueline)
        users.add(maritza)
        users.add(karol)

        return  users
    }
}
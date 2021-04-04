package com.malpvaplicaciones.app5_sharedpreferences

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.malpvaplicaciones.app5_sharedpreferences.databinding.ItemUserBinding

/****
 * Project: App5-SharedPreferences
 * Created by Malpv Developer
 ****/
class UserAdapter (private  val users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolderUser>(){

    // FIXME: 03-04-2021 se iniciara en tiempo de compilacion
    private lateinit var context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUser {
        context = parent.context

        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return  ViewHolderUser(view)
    }

    override fun onBindViewHolder(holder: ViewHolderUser, position: Int) {
        val user = users[position]

        with(holder){
            bindingItem.tvOrder.text = user.id.toString()
            bindingItem.tvName.text = user.name +" "+user.LastName
        }
    }

    override fun getItemCount(): Int { return  users.size }

    // FIXME: 03-04-2021 inner -> clase interna
    inner class ViewHolderUser(view:View) : RecyclerView.ViewHolder(view) {
        val bindingItem = ItemUserBinding.bind(view)
    }
}
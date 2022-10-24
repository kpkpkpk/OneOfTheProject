package com.kponomarev.oneofthenewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kponomarev.oneofthenewproject.databinding.CryptoListItemBinding

class CryptoAdapter : ListAdapter<Crypto,CryptoAdapter.ItemHolder>(ItemComparator()) {

    class ItemHolder(private val binding : CryptoListItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(crypto: Crypto) = with(binding){
            cryptoButton.text = crypto.name
        }
        companion object{
            fun create(parent: ViewGroup): ItemHolder{
                return ItemHolder(CryptoListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
            }
        }
    }

    class ItemComparator : DiffUtil.ItemCallback<Crypto>() {

        override fun areContentsTheSame(oldItem: Crypto, newItem: Crypto): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(oldItem: Crypto, newItem: Crypto): Boolean {
            return oldItem == newItem
        }

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder.create(parent)
    }


}
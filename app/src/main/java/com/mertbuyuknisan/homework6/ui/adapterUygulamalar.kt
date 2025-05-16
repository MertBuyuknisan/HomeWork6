package com.mertbuyuknisan.homework6.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mertbuyuknisan.homework6.data.Uygulamalar
import com.mertbuyuknisan.homework6.databinding.CardTasarimBinding

class adapterUygulamalar(var mContext: Context, var uygulamaListesi: List<Uygulamalar>): RecyclerView.Adapter<adapterUygulamalar.cardTasarimTutucu>() {

        inner class cardTasarimTutucu(var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu {
            var binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
            return cardTasarimTutucu(binding)
        }

        override fun onBindViewHolder(holder: cardTasarimTutucu, position: Int) {
            val uygulama=uygulamaListesi.get(position)
            val t=holder.tasarim
            t.tvIsim.text= uygulama.uygulamaIsmi
            t.tvId.text= uygulama.uygulamaId
            t.tvTur.text= uygulama.uygulamaTur
            t.ivResim.setImageResource(mContext.resources.getIdentifier(uygulama.uygulamaResmi,"drawable",mContext.packageName))
            t.tvBoyut.text= uygulama.uygulamaBoyutu
            t.tvPuan.text= uygulama.uygulamaPuanı
        }

        override fun getItemCount(): Int {
            return uygulamaListesi.size
        }


    }

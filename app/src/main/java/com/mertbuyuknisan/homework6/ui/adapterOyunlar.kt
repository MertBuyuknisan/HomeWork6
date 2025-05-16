package com.mertbuyuknisan.homework6.ui

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mertbuyuknisan.homework6.data.Oyunlar
import com.mertbuyuknisan.homework6.databinding.CardTasarimBinding

class adapterOyunlar(var mContext: Context, var oyunlarListesi: List<Oyunlar>): RecyclerView.Adapter<adapterOyunlar.cardTasarimTutucu>() {

    inner class cardTasarimTutucu(var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu {
        var binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return cardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(
        holder: cardTasarimTutucu, position: Int) {
        val oyun= oyunlarListesi.get(position)

        val t=holder.tasarim
        t.tvIsim.text= oyun.oyunIsmi
        t.tvId.text= oyun.oyunId
        t.tvTur.text= oyun.oyunTur
        t.ivResim.setImageResource(mContext.resources.getIdentifier(oyun.oyunResmi,"drawable",mContext.packageName))
        t.tvBoyut.text= oyun.oyunBoyutu
        t.tvPuan.text= oyun.oyunPuanı

    }

    override fun getItemCount(): Int {
        return oyunlarListesi.size

    }


}
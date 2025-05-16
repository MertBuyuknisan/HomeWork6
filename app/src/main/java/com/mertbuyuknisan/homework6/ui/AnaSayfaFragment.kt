package com.mertbuyuknisan.homework6.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mertbuyuknisan.homework6.data.Oyunlar
import com.mertbuyuknisan.homework6.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater,container,false)

var oyunlarListesi= ArrayList<Oyunlar>()
        val pubg= Oyunlar("1","pubg","Pubg Mobile","Aksiyon","4.6","1.1 GB")
        oyunlarListesi.add(pubg)
        val stumbleguys= Oyunlar("2","stumbleguys","Stumble Guys","Platform","4.5","149 MB")
        oyunlarListesi.add(stumbleguys)
        val brawlStars= Oyunlar("3","brawlstars","Brawl Stars","Nişancı","4.2","2.13 GB")
        oyunlarListesi.add(brawlStars)
        val subwaySurfers= Oyunlar("4","subway","Subway Surfers","Koşucu","4.4","128 MB")
        oyunlarListesi.add(subwaySurfers)
        val benimKonusanTom= Oyunlar("5","benimkonusantom","Benim Konuşan Tom'um","Simülasyon","4.2","136 MB")
        oyunlarListesi.add(benimKonusanTom)
        val clashOfClans= Oyunlar("5","clashofclans","Clash of Clans","Strateji","4.5","328 MB")
        oyunlarListesi.add(clashOfClans)
        val clashRoyale= Oyunlar("6","clashroyale","Clash Royale","Strateji","4.2","747 MB")
        oyunlarListesi.add(clashRoyale)
        val donerEfsanesi= Oyunlar("7","donerefsanesi","Döner Efsanesi","Simülasyon","4.7","89 MB")
        oyunlarListesi.add(donerEfsanesi)
        val drDriving= Oyunlar("8","drdriving","Dr Driving","Yarış","4.3","13 MB")
        oyunlarListesi.add(drDriving)
        val fifa= Oyunlar("9","easports","EA SPORTS FC Mobile Futbol","Spor","4.4","118 MB")
        oyunlarListesi.add(fifa)
        val hayDay= Oyunlar("10","hayday","Hay Day","Simülasyon","4.3","250 MB")
        oyunlarListesi.add(hayDay)
        val kafaTopu= Oyunlar("11","kafatopu","Kafa Topu 2 - Online Futbol","Spor","4.3","169 MB")
        oyunlarListesi.add(kafaTopu)
        val minecraft= Oyunlar("12","minecraft","Minecraft","Simülasyon","4.3","502 MB")
        oyunlarListesi.add(minecraft)
        val mobileLegends= Oyunlar("13","mobillegends","Mobile Legends: Bang Bang","Moba","4.0","137 MB")
        oyunlarListesi.add(mobileLegends)
        val redball4= Oyunlar("14","redball4","Red Ball 4","Platform","4.6","107 MB")
        oyunlarListesi.add(redball4)
            val candyCrush= Oyunlar("15","candycrush","Candy Crush Saga ","Bulmaca","4.5","84 MB")
            oyunlarListesi.add(candyCrush)


        val adapter= adapterOyunlar(requireContext(),oyunlarListesi)
        binding.rvAnasayfa.adapter=adapter
        binding.rvAnasayfa.layoutManager= LinearLayoutManager(requireContext())




        return binding.root
    }
}
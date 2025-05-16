package com.mertbuyuknisan.homework6.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mertbuyuknisan.homework6.data.Uygulamalar
import com.mertbuyuknisan.homework6.databinding.FragmentUygulamalarBinding



class UygulamalarFragment : Fragment() {
private lateinit var binding: FragmentUygulamalarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding=FragmentUygulamalarBinding.inflate(inflater,container,false)
        val uygulamalarListesi= ArrayList<Uygulamalar>()
        val chatgpt= Uygulamalar("1","chatgpt","ChatGPT","Verimlilik","4.7","120 MB")
        uygulamalarListesi.add(chatgpt)
        val temu= Uygulamalar("2","temu","Temu: Milyarder Gibi Harca","Alışveriş","4.4","149 MB")
        uygulamalarListesi.add(temu)
        val maxhbo= Uygulamalar("3","maxhbo","Max: HBO, TV ve film izle","Eğlence","4.7","54 MB")
        uygulamalarListesi.add(maxhbo)
        val instagram= Uygulamalar("4","instagram","Instagram","Sosyal","4.1","80 MB")
        uygulamalarListesi.add(instagram)
        val tiktok= Uygulamalar("5","tiktok","TikTok","Sosyal","4.0","142 MB")
        uygulamalarListesi.add(tiktok)
        val edevlet= Uygulamalar("6","edevlet","e-Devlet Kapısı","İş","4.0","100 MB")
        uygulamalarListesi.add(edevlet)
        val whatsapp= Uygulamalar("7","whatsapp","WhatsApp Messenger","İletişim","4.2","135 MB")
        uygulamalarListesi.add(whatsapp)
        val turkcell= Uygulamalar("8","turkcell","Turkcell","Servis Sağlayıcılar","4.4","55 MB")
        uygulamalarListesi.add(turkcell)
        val myt= Uygulamalar("9","mytmusic","MYT Müzik - Dinle ve İndir","Müzik ve Ses","4.0","24 MB")
        uygulamalarListesi.add(myt)
        val turktelekom= Uygulamalar("10","turktelekom","Türk Telekom","Servis Sağlayıcılar","4.0","76 MB")
        uygulamalarListesi.add(turktelekom)
        val capcut= Uygulamalar("11","capcut","CapCut","Video Oynatıcılar ve Düzenleyiciler","3.7","177 MB")
        uygulamalarListesi.add(capcut)
        val vodafoneyanimda= Uygulamalar("12","vodafoneyanimda","Vodafone Yanımda","Servis Sağlayıcılar","4.4","25 MB")
        uygulamalarListesi.add(vodafoneyanimda)
        val mhrs= Uygulamalar("13","mhrs","MHRS","Sağlık","4.8","34 MB")
        uygulamalarListesi.add(mhrs)
        val ziraatmobil= Uygulamalar("14","ziraatmobil","Ziraat Mobil","Finans","4.3","80 MB")
        uygulamalarListesi.add(ziraatmobil)
        val snapchat= Uygulamalar("15","snapchat","Snapchat","Sosyal","4.1","67 MB")
        uygulamalarListesi.add(snapchat)


        val adapter= adapterUygulamalar(requireContext(),uygulamalarListesi)
        binding.rvUygulamalar.adapter= adapter
        binding.rvUygulamalar.layoutManager= LinearLayoutManager(requireContext())





        return binding.root
    }
}
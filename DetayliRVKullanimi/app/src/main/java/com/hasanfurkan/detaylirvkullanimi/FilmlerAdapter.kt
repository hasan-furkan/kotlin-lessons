package com.hasanfurkan.detaylirvkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mContext: Context, private val filmlerListesi: List<Filmler>)

    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriniTutucu>() {


    inner class CardTasarimNesneleriniTutucu(view: View): RecyclerView.ViewHolder(view){

        var imageViewFilmResim : ImageView
        var textViewFilmFiyat : TextView
        var textViewFilmBaslik: TextView
        var buttonSepeteEkle : Button


        init {
            imageViewFilmResim = view.findViewById(R.id.imageViewFilmResim)
            textViewFilmFiyat = view.findViewById(R.id.textViewFilmFiyat)
            textViewFilmBaslik = view.findViewById(R.id.textViewFilmBaslik)
            buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarimi, parent, false)

        return CardTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val film = filmlerListesi[position]

        holder.textViewFilmBaslik.text = film.filmAdi
        holder.textViewFilmFiyat.text = "${film.filmFiyati} TL"
        holder.imageViewFilmResim.setImageResource(mContext.resources.getIdentifier(film.filmResimAdi, "drawable", mContext.packageName))
        holder.buttonSepeteEkle.setOnClickListener {
            Toast.makeText(mContext, "${film.filmAdi} isimli kitap sepete eklendi", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }


}
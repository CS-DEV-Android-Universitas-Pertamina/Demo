package com.csdev.week5.List

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.csdev.week5.List.data.Hero2
import com.csdev.week5.R
import com.csdev.week5.databinding.ActivityDetailBinding
import com.csdev.week5.databinding.ActivityRecyclerViewBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    lateinit var image: ImageView
    lateinit var name: TextView
    lateinit var desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val hero = intent.getParcelableExtra<Hero2>("HERO_OBJECT") as Hero2
        image = binding.imgPhoto
        name = binding.txtName
        desc = binding.txtDescription

        Glide.with(this)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(image)
        name.text = hero.name
        desc.text = hero.description

    }
}
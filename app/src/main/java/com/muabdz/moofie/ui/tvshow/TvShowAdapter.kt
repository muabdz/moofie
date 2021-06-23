package com.muabdz.moofie.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.muabdz.moofie.R
import com.muabdz.moofie.data.TvShowEntity
import com.muabdz.moofie.databinding.ItemsTvShowListBinding

class TvShowAdapter: RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvShows = ArrayList<TvShowEntity>()

    fun setTvShows(tvShows: List<TvShowEntity>?) {
        if (tvShows == null) return
        this.listTvShows.clear()
        this.listTvShows.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowListBinding = ItemsTvShowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowListBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShows[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShows.size

    class TvShowViewHolder(private val binding: ItemsTvShowListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShowEntity) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvDate.text = tvShow.releaseDate
                tvGenre.text  = tvShow.genre
                itemView.setOnClickListener {
                    // TODO: 23/06/2021 move to tv show detail
                }

                Glide.with(itemView.context)
                    .load(tvShow.imageDrawable)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_image_loading)
                        .error(R.drawable.ic_image_error))
                    .into(ivPoster)
            }
        }
    }
}
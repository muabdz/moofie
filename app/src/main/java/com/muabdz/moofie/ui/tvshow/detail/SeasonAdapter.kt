package com.muabdz.moofie.ui.tvshow.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muabdz.moofie.R
import com.muabdz.moofie.data.SeasonEntity
import com.muabdz.moofie.databinding.ItemsSeasonListBinding

class SeasonAdapter: RecyclerView.Adapter<SeasonAdapter.SeasonViewHolder>() {

    private var listSeasons = ArrayList<SeasonEntity>()

    fun setSeasons(seasons: List<SeasonEntity>?) {
        if (seasons == null) return
        this.listSeasons.clear()
        this.listSeasons.addAll(seasons)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeasonViewHolder {
        val itemsSeasonListBinding = ItemsSeasonListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SeasonViewHolder(itemsSeasonListBinding)
    }

    override fun onBindViewHolder(holder: SeasonViewHolder, position: Int) {
        val season = listSeasons[position]
        holder.bind(season)
    }

    override fun getItemCount(): Int = listSeasons.size

    class SeasonViewHolder(private val binding: ItemsSeasonListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(season: SeasonEntity) {
            with(binding) {
                tvSeason.text = season.name
                "${itemView.context.getString(R.string.episodes_colon)}${season.episodeCount}".also { tvEpisodes.text = it }
            }
        }
    }
}
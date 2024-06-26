package com.example.data.datasource.remote.retrofit.model.anime

import com.google.gson.annotations.SerializedName

data class AnimeResponse(
    val airing: Boolean,
    val approved: Boolean,
    val background: String,
    val demographics: List<Demographic>,
    val duration: String,
    val episodes: Int,
    val explicit_genres: List<Any>,
    val favorites: Int,
    val genres: List<Genre>,
    val images: Images,
    val licensors: List<Any>,
    @SerializedName("mal_id")
    val malId: Int,
    val members: Int,
    val popularity: Int,
    val producers: List<Producer>,
    val rank: Int,
    val rating: String,
    val score: Double,
    val scored_by: Int,
    val season: String,
    val source: String,
    val status: String,
    val studios: List<Studio>,
    val synopsis: String,
    val themes: List<Any>,
    val title: String,
    @SerializedName("title_english")
    val titleEnglish: String,
    val title_japanese: String,
    val title_synonyms: List<String>,
    val titles: List<Title>,
    val type: String,
    val url: String,
    val year: Int
)
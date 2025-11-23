package com.animesources.animiru

import eu.kanade.tachiyomi.source.SourceFactory
import com.animesources.animiru.betteranime.BetterAnime
import com.animesources.animiru.animesonlinecc.AnimesOnlineCC

class AnimeSources : SourceFactory {
    override fun createSources() = listOf(
        BetterAnime(),
        AnimesOnlineCC()
    )
}

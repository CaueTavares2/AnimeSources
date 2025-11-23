package com.animesources.animiru.animesonlinecc

import eu.kanade.tachiyomi.anime.source.AnimeHttpSource

class AnimesOnlineCC : AnimeHttpSource() {
    override val name = "AnimesOnlineCC"
    override val baseUrl = "https://animesonlinecc.to"
    override val lang = "pt-BR"
    override val supportsLatest = true
}

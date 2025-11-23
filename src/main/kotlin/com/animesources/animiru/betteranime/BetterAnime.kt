package com.animesources.animiru.betteranime

import eu.kanade.tachiyomi.anime.source.AnimeHttpSource

class BetterAnime : AnimeHttpSource() {
    override val name = "BetterAnime"
    override val baseUrl = "https://betteranime.net"
    override val lang = "pt-BR"
    override val supportsLatest = true
}

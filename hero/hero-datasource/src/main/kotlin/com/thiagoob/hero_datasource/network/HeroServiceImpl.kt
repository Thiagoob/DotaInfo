package com.thiagoob.hero_datasource.network

import com.thiagoob.hero_domain.Hero
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class HeroServiceImpl(
    private val httpClient: HttpClient
): HeroService {
    override suspend fun getHeroStats(): List<Hero> = httpClient.get(EndPoints.HERO_STATS).body<List<HeroDto>>().map { it.toHero() }

}
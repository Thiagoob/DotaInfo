package com.thiagoob.hero_datasource.network

import com.thiagoob.hero_domain.Hero
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

interface HeroService {
    suspend fun getHeroStats(): List<Hero>

    companion object Factory {
        fun build(): HeroService = HeroServiceImpl(
            httpClient = HttpClient(Android) {
                install(ContentNegotiation) {
                    json(
                        Json {
                            ignoreUnknownKeys =
                                true // if the server returns extra fields, ignore them
                        }
                    )
                }
            }
        )
    }
}
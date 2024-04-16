package com.mirconti.simfootball

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package com.omersungur.cryptocurrency_compose.data.remote.dto

data class Stats(
    val contributors: Int,
    val followers: Int,
    val stars: Int,
    val subscribers: Int
)
package com.coding.newsapp.core.domain

data class NewsList(
    val nextPage: String?,
    val articles: List<Article>,
)
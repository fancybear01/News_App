package com.coding.newsapp.article.presentation

import com.coding.newsapp.core.domain.Article

data class ArticleState(
    val article: Article? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false
)
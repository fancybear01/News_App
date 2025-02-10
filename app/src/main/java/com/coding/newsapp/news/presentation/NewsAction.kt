package com.coding.newsapp.news.presentation

sealed interface NewsAction {
    data object Paginate: NewsAction
}
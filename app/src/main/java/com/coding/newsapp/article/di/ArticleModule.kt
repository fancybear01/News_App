package com.coding.newsapp.article.di

import com.coding.newsapp.article.presentation.ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val articleModule = module {
    viewModel { ArticleViewModel(get()) }
}
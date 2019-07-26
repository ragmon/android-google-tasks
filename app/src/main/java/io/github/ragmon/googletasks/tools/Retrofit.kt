package io.github.ragmon.googletasks.tools

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun makeRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://www.googleapis.com/tasks/v1")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
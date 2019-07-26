package io.github.ragmon.googletasks.service

import io.github.ragmon.googletasks.ui.tasklist.TaskLists
import retrofit2.Call
import retrofit2.http.GET

interface TaskListService {
    @GET("https://www.googleapis.com/tasks/v1/users/@me/lists")
    fun listTaskLists(maxResults: Long, pageToken: String): Call<List<TaskLists>>

    // TODO: get, insert, update, delete, patch
}
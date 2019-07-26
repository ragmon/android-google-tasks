package io.github.ragmon.googletasks.service

import io.github.ragmon.googletasks.ui.task.Task
import retrofit2.Call
import retrofit2.http.GET

interface TaskService {
    @GET("https://www.googleapis.com/tasks/v1/lists/tasklist/tasks")
    fun listTasks(maxResults: Long? = 250, pageToken: String? = null): Call<List<Task>>

    // TODO: get, insert, update, delete, patch
}
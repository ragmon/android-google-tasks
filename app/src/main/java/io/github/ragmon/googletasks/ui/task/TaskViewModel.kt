package io.github.ragmon.googletasks.ui.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.ragmon.googletasks.service.TaskService
import io.github.ragmon.googletasks.tools.makeRetrofit

class TaskViewModel: ViewModel() {
    private val service: TaskService = makeRetrofit().create(TaskService::class.java)

    private val tasks: MutableLiveData<List<Task>> by lazy {
        MutableLiveData<List<Task>>().also {
            loadTasks()
        }
    }

    fun getTasks(): LiveData<List<Task>> {
        return tasks
    }

    private fun loadTasks() {
        tasks.value = service.listTasks().execute().body()
    }
}
package io.github.ragmon.googletasks.ui.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.api.services.tasks.model.Task

class TaskViewModel: ViewModel() {
    private val tasks: MutableLiveData<List<Task>> by lazy {
        MutableLiveData<List<Task>>().also {
            loadTasks()
        }
    }

    fun getTasks(): LiveData<List<Task>> {
        return tasks
    }

    private fun loadTasks() {
        //
    }
}
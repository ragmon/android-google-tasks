package io.github.ragmon.googletasks.ui.tasklist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.api.services.tasks.model.TaskList

class TaskListViewModel : ViewModel() {
    private val taskList: MutableLiveData<List<TaskList>> by lazy {
        MutableLiveData<List<TaskList>>().also {
            loadTaskLists()
        }
    }

    fun getTaskLists(): LiveData<List<TaskList>> {
        return taskList
    }

    private fun loadTaskLists() {
        //
    }

}

package io.github.ragmon.googletasks.ui.tasklist

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import io.github.ragmon.googletasks.R

class TaskListFragment : Fragment() {

    private lateinit var viewModel: TaskListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.task_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TaskListViewModel::class.java)
        viewModel.getTaskLists().observe(this, Observer<List<TaskList>> { taskList ->
            Toast.makeText(activity, "hello", Toast.LENGTH_LONG).show()
//            Log.d(TAG, taskList.toString())
        })
    }

    companion object {
        const val TAG = "TaskListFragment"

        fun newInstance() = TaskListFragment()
    }
}

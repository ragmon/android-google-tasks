package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.ragmon.googletasks.ui.tasklist.TaskListFragment

class TaskListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TaskListFragment.newInstance())
                .commitNow()
        }
    }

    companion object {
        const val TAG = "TaskListActivity"

        fun newIntent(context: Context): Intent {
            return Intent(context, TaskListActivity::class.java)
        }
    }

}

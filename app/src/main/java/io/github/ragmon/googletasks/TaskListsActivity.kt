package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import io.github.ragmon.googletasks.ui.tasklist.TaskLists

import kotlinx.android.synthetic.main.activity_tas_list.*

class TaskListsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tas_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        private const val INTENT_TASK_LISTS_ID = "task_lists_id"

        fun newIntent(context: Context, taskList: TaskLists? = null): Intent {
            val intent = Intent(context, TaskListsActivity::class.java)
            if (taskList != null) {
                intent.putExtra(INTENT_TASK_LISTS_ID, taskList.map {list -> list.id}.toTypedArray())
            }
            return intent
        }
    }

}

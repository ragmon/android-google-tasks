package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_tas_list.*

class TaskListActivity : AppCompatActivity() {

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
        private const val INTENT_TASK_LIST_ID = "task_list_id"

        fun newIntent(context: Context, taskList: TaskList?): Intent {
            val intent = Intent(context, TaskListActivity::class.java)
            if (taskList) {
                intent.putExtra(INTENT_TASK_LIST_ID, taskList.map(list -> list.id))
            }
            return intent
        }
    }

}

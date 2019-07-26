package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.ragmon.googletasks.ui.task.Task

class TaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
    }

    companion object {
        private const val INTENT_TASK_ID = "task_id"

        fun newIntent(context: Context, task: Task): Intent {
            val intent = Intent(context, TaskActivity::class.java)
            intent.putExtra(INTENT_TASK_ID, task.id)
            return intent
        }
    }
}

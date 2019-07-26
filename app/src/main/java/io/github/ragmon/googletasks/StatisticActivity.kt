package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.ragmon.googletasks.ui.statistic.StatisticFragment

class StatisticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistic_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StatisticFragment.newInstance())
                .commitNow()
        }
    }

    companion object {
        private const val INTENT_TASK_LISTS_ID = "task_list_id"

        fun newIntent(context: Context, taskList: TaskList? = null): Intent {
            val intent = Intent(context, StatisticActivity::class.java)
            if (taskList) {
                intent.putExtra(INTENT_TASK_LISTS_ID, taskList.map(task -> task.id))
            }
            return intent
        }
    }

}
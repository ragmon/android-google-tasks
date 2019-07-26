package io.github.ragmon.googletasks

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.github.ragmon.googletasks.ui.chart.ChartList
import io.github.ragmon.googletasks.ui.main.SectionsPagerAdapter

class ChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    companion object {
        private val INTENT_CHART_LISTS_ID = "chart_list_id"

        fun newIntent(context: Context, chartList: ChartList? = null): Intent {
            val intent = Intent(context, StatisticActivity::class.java)
            if (chartList != null) {
                intent.putExtra(INTENT_CHART_LISTS_ID, chartList.map { chart -> chart.id }.toTypedArray())
            }
            return intent
        }
    }
}
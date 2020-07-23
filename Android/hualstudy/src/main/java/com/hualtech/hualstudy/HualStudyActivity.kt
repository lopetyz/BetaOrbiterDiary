package com.hualtech.hualstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hualtech.hualstudy.ui.HualStudyFragment

class HualStudyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hual_study_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HualStudyFragment.newInstance())
                .commitNow()
        }
    }
}

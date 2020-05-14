package com.hualtech.hualstudy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hualtech.hualstudy.R

class HualStudyFragment : Fragment() {

    companion object {
        fun newInstance() = HualStudyFragment()
    }

    private lateinit var viewModel: HualStudyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.hual_study_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HualStudyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}




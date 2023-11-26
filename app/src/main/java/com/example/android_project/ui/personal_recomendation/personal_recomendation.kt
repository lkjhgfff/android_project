package com.example.android_project.ui.personal_recomendation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_project.R

class personal_recomendation : Fragment() {

    companion object {
        fun newInstance() = personal_recomendation()
    }

    private lateinit var viewModel: PersonalRecomendationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personal_recomendation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonalRecomendationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
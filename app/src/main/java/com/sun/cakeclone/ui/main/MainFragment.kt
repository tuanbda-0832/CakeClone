package com.sun.cakeclone.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.sun.cakeclone.R
import com.sun.cakeclone.databinding.FragmentMainBinding
import com.sun.cakeclone.ui.BaseFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [BaseFragment] subclass.
 */
class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val layoutId: Int = R.layout.fragment_main
    override val viewModel by viewModels<MainViewModel> { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navControler = findNavController()
        bottom_navigation.setupWithNavController(navControler)
    }

}

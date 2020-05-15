package com.sun.cakeclone.ui.home

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sun.cakeclone.R
import com.sun.cakeclone.databinding.HistoryFragmentBinding
import com.sun.cakeclone.ui.BaseFragment

class HomeFragment : BaseFragment<HistoryFragmentBinding>() {
    override val layoutId: Int = R.layout.history_fragment

    override val viewModel by viewModels<HistoryViewModel> { viewModelFactory }

    val navControler = findNavController()
}

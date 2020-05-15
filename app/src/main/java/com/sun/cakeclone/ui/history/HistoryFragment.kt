package com.sun.cakeclone.ui.history

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sun.cakeclone.R
import com.sun.cakeclone.databinding.HistoryFragmentBinding
import com.sun.cakeclone.ui.BaseFragment

class HistoryFragment : BaseFragment<HistoryFragmentBinding>() {
    override val layoutId: Int = R.layout.history_fragment

    override val viewModel by viewModels<HistoryViewModel> { viewModelFactory }

    val navControler = findNavController()
}

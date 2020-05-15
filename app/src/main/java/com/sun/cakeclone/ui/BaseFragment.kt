package com.sun.cakeclone.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sun.cakeclone.BR
import javax.inject.Inject


abstract class BaseFragment<B : ViewDataBinding> : Fragment() {
    @get:LayoutRes
    protected abstract val layoutId: Int

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected abstract val viewModel: ViewModel

    protected lateinit var viewBinding: B



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (::viewBinding.isInitialized.not()) {
            viewBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
            viewBinding.apply {
                lifecycleOwner = viewLifecycleOwner
                setVariable(BR.viewModel, viewModel)
                root.isClickable = true
                executePendingBindings()
            }
        }
        return viewBinding.root
    }
}
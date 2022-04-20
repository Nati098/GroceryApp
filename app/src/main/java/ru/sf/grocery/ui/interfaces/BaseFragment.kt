package ru.sf.grocery.ui.interfaces

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<VB : ViewBinding> : BaseContract.View, Fragment() {

    private var presenter: BaseContract.Presenter<BaseFragment<VB>>? = null

    private var _binding: VB? = null
    protected val binding get() = _binding!!

    private var isViewCreated: Boolean = false


    abstract fun bindLayout(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = bindLayout(inflater, container, savedInstanceState) //bindingInflater.invoke(inflater, container, false)
        isViewCreated = true
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun acceptPresenter(presenter: BaseContract.Presenter<BaseContract.View>) {
        this.presenter = presenter

        if (isViewCreated) {
            presenter.onViewCreated()
        }
    }

}
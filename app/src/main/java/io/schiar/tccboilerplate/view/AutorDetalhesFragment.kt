package io.schiar.tccboilerplate.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import io.schiar.tccboilerplate.databinding.FragmentAutorDetalhesBinding
import io.schiar.tccboilerplate.viewmodel.AutorViewModel

/**
 * Mostra uma string pré criada do ViewModel para fins de demonstração do DataBinding
 * @property viewModel ViewModel necessário para mostrar os dados necessários do modelo na View.
 */
class AutorDetalhesFragment : Fragment() {
    private lateinit var viewModel: AutorViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProviders
            .of(requireActivity())
            .get(AutorViewModel::class.java)
        val binding = FragmentAutorDetalhesBinding
            .inflate(inflater, container, false).apply {
                lifecycleOwner = this@AutorDetalhesFragment
                viewModel = this@AutorDetalhesFragment.viewModel
                executePendingBindings()
            }
        return binding.root
    }
}

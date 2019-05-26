package io.schiar.tccboilerplate.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import io.schiar.tccboilerplate.R
import io.schiar.tccboilerplate.viewmodel.AutorViewModel
import io.schiar.tccboilerplate.databinding.FragmentAutorBinding

/**
 * Mostra a lista de componentes arquiteturais utilizados neste boilerplate
 * @property viewModel ViewModel necessário para mostrar os dados necessários do modelo na View.
 */
class AutorFragment : Fragment(), AutorSelecionadoListener {
    private lateinit var viewModel: AutorViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProviders
            .of(requireActivity())
            .get(AutorViewModel::class.java)
        val binding = FragmentAutorBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@AutorFragment
            executePendingBindings()
        }
        viewModel.fetch()
        val view = binding.root
        viewModel.autores.observe(this, Observer {
            binding.adapter = AutoresListAdapter(it, this)
        })
        return view
    }

    override fun onAutorSelecionado(posicao: Int) {
        viewModel.fetchDetail(posicao)
        val navId = R.id.autor_to_autor_detalhes
        Navigation.findNavController(view ?: return).navigate(navId)
    }
}


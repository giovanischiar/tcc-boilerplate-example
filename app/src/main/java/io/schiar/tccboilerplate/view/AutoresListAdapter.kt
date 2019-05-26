package io.schiar.tccboilerplate.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.schiar.tccboilerplate.R
import io.schiar.tccboilerplate.databinding.AdapterAutorDetalhesBinding
import io.schiar.tccboilerplate.view.viewdata.AutorViewData

class AutoresListAdapter(
    private val autores: List<AutorViewData>,
    private val autorSelecionadoListener: AutorSelecionadoListener
): RecyclerView.Adapter<AutoresListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<AdapterAutorDetalhesBinding>(
            inflater, R.layout.adapter_autor_detalhes, parent, false);
        return ViewHolder(binding, autorSelecionadoListener);
    }
    override fun getItemCount(): Int {
        return autores.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(autores[position], position);
    }
    class ViewHolder(
        private val binding: AdapterAutorDetalhesBinding,
        private val autorSelecionadoListener: AutorSelecionadoListener
    ):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(autor: AutorViewData, posicao: Int) {
            binding.apply {
                this.autor = autor
                this.posicao = posicao
                this.autorSelecionadoListener = this@ViewHolder.autorSelecionadoListener
                executePendingBindings()
            }
        }
    }
}

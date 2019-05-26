package io.schiar.tccboilerplate.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.schiar.tccboilerplate.model.Autor
import io.schiar.tccboilerplate.model.repository.AutorRepository
import io.schiar.tccboilerplate.model.repository.AutorRepositoryInterface
import io.schiar.tccboilerplate.view.viewdata.AutorDetalhesViewData
import io.schiar.tccboilerplate.view.viewdata.AutorViewData

class AutorViewModel(
    private val autorRepository: AutorRepositoryInterface = AutorRepository()
) : ViewModel() {

    val autores: MutableLiveData<List<AutorViewData>> by lazy {
        MutableLiveData<List<AutorViewData>>()
    }

    val autor: MutableLiveData<AutorDetalhesViewData> by lazy {
        MutableLiveData<AutorDetalhesViewData>()
    }

    fun fetch() {
        autorRepository.fetch {
                autores.postValue(it.map { autor: Autor ->
                    AutorViewData(autor.nome)
            })
        }
    }

    fun fetchDetail(position: Int) {
        autorRepository.fetchDetails(autorRepository.autores[position].id) {
            val (cidade, estado, pais) = it.localDeNascimento ?: return@fetchDetails
            val (dia, mes, ano) = it.nascimento ?: return@fetchDetails
            val autorViewData = AutorDetalhesViewData(
                it.nome,
                "$dia/$mes/$ano",
                "$cidade, $estado - $pais"
            )
            autor.postValue(autorViewData)
        }
    }

}

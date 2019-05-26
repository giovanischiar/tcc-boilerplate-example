package io.schiar.tccboilerplate.model.repository

import io.schiar.tccboilerplate.model.Autor

class AutorRepository: AutorRepositoryInterface {
    override lateinit var autores: List<Autor>

    override fun fetch(callback: (List<Autor>) -> Unit) {
        Requisicao().buscaJSON("https://exemplo.com/autores") { resultado ->
            autores = parseJSON(resultado)
            callback(autores)
        }
    }
    override fun fetchDetails(id: String, callback: (Autor) -> Unit) {
        Requisicao().buscaJSON("https://exemplo.com/autores/$id") { resultado ->
            val autor: Autor = parseJSON(resultado)
            callback(autor)
        }
    }
}

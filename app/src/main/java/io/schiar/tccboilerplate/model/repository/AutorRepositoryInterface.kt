package io.schiar.tccboilerplate.model.repository

import io.schiar.tccboilerplate.model.Autor

interface AutorRepositoryInterface {
    val autores: List<Autor>
    fun fetch(callback: (List<Autor>) -> Unit )
    fun fetchDetails(id: String, callback: (Autor) -> Unit )
}

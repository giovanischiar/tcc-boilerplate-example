package io.schiar.tccboilerplate.model

data class Autor(
    val id: String,
    val nome: String,
    val nascimento: Data? = null,
    val localDeNascimento: Local? = null
)

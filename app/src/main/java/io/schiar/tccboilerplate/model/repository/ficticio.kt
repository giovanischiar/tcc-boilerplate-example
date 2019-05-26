package io.schiar.tccboilerplate.model.repository

import io.schiar.tccboilerplate.model.Autor
import io.schiar.tccboilerplate.model.Data
import io.schiar.tccboilerplate.model.Local

class Requisicao {
    fun buscaJSON(url: String, resultado: (String) -> Unit) {
        when(url) {
            "https://exemplo.com/autores" -> resultado("[\n" +
                    "    {\"id\": \"1\", \"nome\": \"Machado de Assis\"}, \n" +
                    "    {\"id\": \"2\", \"nome\": \"Carlos Drummond de Andrade\"}, \n" +
                    "    {\"id\": \"3\", \"nome\": \"Graciliano Ramos\"}\n" +
                    "]\n")
            else -> resultado("{\n" +
                    "    \"id\": \"1\", \n" +
                    "           \"nome\": \"Machado de Assis\", \n" +
                    "           \"nascimento\": { \"dia\": 21, \"mes\": 6, \"ano\": 1839}, \n" +
                    "           \"localDeNascimento\": {\n" +
                    "               \"cidade\": \"Rio de janeiro\", \n" +
                    "               \"estado\": \"RJ\", \n" +
                    "               \"pais\": \"Brasil\"\n" +
                    "           }\n" +
                    "}\n")
        }
    }
}

fun <T> parseJSON(json: String): T {
    if (json.first() == '[') {
        return listOf(
            Autor("a", "Machado de Assis"),
            Autor("a", "Carlos Drummond de Andrade"),
            Autor("a", "Graciliano Ramos")
        ) as T
    }

    return Autor(
        "1",
        "Machado de Assis",
        Data(21, 6, 1839),
        Local("Rio de Janeiro", "RJ", "Brasil")
    ) as T
}
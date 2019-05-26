[app](../../index.md) / [io.schiar.tccboilerplate.model.repository](../index.md) / [AutorRepository](./index.md)

# AutorRepository

`class AutorRepository : `[`AutorRepositoryInterface`](../-autor-repository-interface/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AutorRepository()` |

### Properties

| Name | Summary |
|---|---|
| [autores](autores.md) | `lateinit var autores: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [fetch](fetch.md) | `fun fetch(callback: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [fetchDetails](fetch-details.md) | `fun fetchDetails(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: (`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

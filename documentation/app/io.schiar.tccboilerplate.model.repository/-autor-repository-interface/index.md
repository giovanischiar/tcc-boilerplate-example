[app](../../index.md) / [io.schiar.tccboilerplate.model.repository](../index.md) / [AutorRepositoryInterface](./index.md)

# AutorRepositoryInterface

`interface AutorRepositoryInterface`

### Properties

| Name | Summary |
|---|---|
| [autores](autores.md) | `abstract val autores: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [fetch](fetch.md) | `abstract fun fetch(callback: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [fetchDetails](fetch-details.md) | `abstract fun fetchDetails(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: (`[`Autor`](../../io.schiar.tccboilerplate.model/-autor/index.md)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [AutorRepository](../-autor-repository/index.md) | `class AutorRepository : `[`AutorRepositoryInterface`](./index.md) |

[app](../../index.md) / [io.schiar.tccboilerplate.viewmodel](../index.md) / [AutorViewModel](./index.md)

# AutorViewModel

`class AutorViewModel : ViewModel`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AutorViewModel(autorRepository: `[`AutorRepositoryInterface`](../../io.schiar.tccboilerplate.model.repository/-autor-repository-interface/index.md)` = AutorRepository())` |

### Properties

| Name | Summary |
|---|---|
| [autor](autor.md) | `val autor: MutableLiveData<`[`AutorDetalhesViewData`](../../io.schiar.tccboilerplate.view.viewdata/-autor-detalhes-view-data/index.md)`>` |
| [autores](autores.md) | `val autores: MutableLiveData<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`AutorViewData`](../../io.schiar.tccboilerplate.view.viewdata/-autor-view-data/index.md)`>>` |

### Functions

| Name | Summary |
|---|---|
| [fetch](fetch.md) | `fun fetch(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [fetchDetail](fetch-detail.md) | `fun fetchDetail(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

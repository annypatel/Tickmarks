package tickmarks.bookmark.ui

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import tickmarks.bookmark.ui.add.AddBookmarkViewModel
import tickmarks.ui.viewmodel.ViewModelKey

/**
 * Dagger [module][Module] for bookmark ui module.
 */
@Module
abstract class BookmarkUiModule {

    @Binds
    @IntoMap
    @ViewModelKey(AddBookmarkViewModel::class)
    internal abstract fun addBookmarkViewModel(viewModel: AddBookmarkViewModel): ViewModel
}
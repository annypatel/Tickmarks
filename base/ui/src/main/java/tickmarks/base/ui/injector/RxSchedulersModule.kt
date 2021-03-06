package tickmarks.base.ui.injector

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import tickmarks.base.domain.rx.RxSchedulers
import javax.inject.Singleton

/**
 * Dagger [module][Module] for declaring [RxSchedulers] to be bind into application level object
 * graph.
 */
@Module
@InstallIn(ApplicationComponent::class)
object RxSchedulersModule {

    @Provides
    @Singleton
    fun rxSchedulers() = RxSchedulers(
        main = AndroidSchedulers.mainThread(),
        io = Schedulers.io(),
        computation = Schedulers.computation(),
        database = Schedulers.single()
    )
}

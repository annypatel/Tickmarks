package tickmarks.ui.test.rx

import io.reactivex.schedulers.Schedulers
import tickmarks.ui.rx.UiSchedulers

/**
 * [UiSchedulers] for unit tests.
 */
val testUiSchedulers = object : UiSchedulers {
    override val mainThread = Schedulers.trampoline()
}
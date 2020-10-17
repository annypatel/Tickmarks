package tickmarks.test.domain.rx

import io.reactivex.schedulers.Schedulers
import tickmarks.base.domain.rx.DomainSchedulers

/**
 * [DomainSchedulers] for unit tests.
 */
val testDomainSchedulers = object : DomainSchedulers {
    override val computation = Schedulers.trampoline()
}

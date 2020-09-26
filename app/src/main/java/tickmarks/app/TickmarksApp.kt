package tickmarks.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import tickmarks.app.injector.DaggerTickmarksComponent

/**
 * Base application class for this app. Use this class to do one time initialization.
 */
class TickmarksApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerTickmarksComponent.factory().create(this)
    }
}

package tickmarks.ui.binding

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import androidx.test.annotation.UiThreadTest
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import org.junit.Before
import org.junit.Test
import tickmarks.ui.R
import tickmarks.ui.event.Event
import tickmarks.ui.event.consume
import tickmarks.ui.test.assertThat
import tickmarks.ui.test.hasNoSnackbar
import tickmarks.ui.test.hasSnackbar
import tickmarks.ui.test.withMessage

class SnackbarBindingAdapterTest {

    private lateinit var container: View

    @Before
    fun setUp() {
        val context = ContextThemeWrapper(getInstrumentation().targetContext, R.style.Theme_AppCompat)
        container = FrameLayout(context)
    }

    @Test
    @UiThreadTest
    fun showSnackbar_givenEvent_shouldShowSnackbar() {
        val snackbarMsg = android.R.string.ok

        container.showSnackbar(Event(snackbarMsg))

        assertThat(container, hasSnackbar(withMessage(snackbarMsg)))
    }

    @Test
    @UiThreadTest
    fun showSnackbar_givenConsumedEvent_shouldNotShowSnackbar() {
        val snackbarMsg = android.R.string.ok
        val event = Event(snackbarMsg)
        event.consume { }

        container.showSnackbar(event)

        assertThat(container, hasNoSnackbar())
    }

    @Test
    @UiThreadTest
    fun showSnackbar_givenNull_shouldNotShowSnackbar() {
        container.showSnackbar(null)

        assertThat(container, hasNoSnackbar())
    }
}
package tickmarks.base.ui.binding

import android.view.View
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import tickmarks.test.ui.themedContext

@RunWith(AndroidJUnit4::class)
class ViewBindingAdapterTest {

    private val view = View(themedContext())

    @Test
    fun setVisibility_givenVisible__setVisibilityToVisible() {
        view.setVisibility(Visibility.VISIBLE)

        assertThat(view.visibility, equalTo(View.VISIBLE))
    }

    @Test
    fun setVisibility_givenInvisible_setVisibilityToInvisible() {
        view.setVisibility(Visibility.INVISIBLE)

        assertThat(view.visibility, equalTo(View.INVISIBLE))
    }

    @Test
    fun setVisibility_givenGone__setVisibilityToGone() {
        view.setVisibility(Visibility.GONE)

        assertThat(view.visibility, equalTo(View.GONE))
    }

    @Test
    fun setVisibility_givenNull__noChangeInVisibility() {
        view.visibility = View.INVISIBLE

        view.setVisibility(null)

        assertThat(view.visibility, equalTo(View.INVISIBLE))
    }
}

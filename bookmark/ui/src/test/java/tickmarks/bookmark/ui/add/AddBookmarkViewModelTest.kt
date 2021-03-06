package tickmarks.bookmark.ui.add

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Completable
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import tickmarks.base.ui.binding.NONE
import tickmarks.base.ui.binding.Visibility.GONE
import tickmarks.bookmark.domain.AddBookmark
import tickmarks.bookmark.ui.R
import tickmarks.test.domain.rx.testSchedulers

class AddBookmarkViewModelTest {

    private val addBookmark = mock<AddBookmark>()
    private val viewModel = AddBookmarkViewModel(testSchedulers, addBookmark)
    private val viewState = viewModel.viewState

    @Test
    fun addBookmark_givenEmptyUrl_shouldSetError() {
        viewState.url = ""

        viewModel.addBookmark()

        assertThat(viewState.error, equalTo(R.string.add_bookmark_empty_url))
    }

    @Test
    fun addBookmark_addBookmarkSuccessful_shouldSetSuccessMessage() {
        whenever(addBookmark(any())).thenReturn(Completable.complete())
        viewState.url = "http://example.com"

        viewModel.addBookmark()

        assertThat(viewState.error, equalTo(NONE))
        assertThat(viewState.loader, equalTo(GONE))
        assertThat(viewState.snackbar.data, equalTo(R.string.add_bookmark_successful))
    }

    @Test
    fun addBookmark_addBookmarkFailed_shouldSetFailureMessage() {
        whenever(addBookmark(any())).thenReturn(Completable.error(RuntimeException()))
        viewState.url = "http://example.com"

        viewModel.addBookmark()

        assertThat(viewState.error, equalTo(NONE))
        assertThat(viewState.loader, equalTo(GONE))
        assertThat(viewState.snackbar.data, equalTo(R.string.add_bookmark_failure))
    }
}

package tickmarks.bookmark.ui.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.AndroidSupportInjection
import tickmarks.ui.fragment.viewModel
import javax.inject.Inject

/**
 * Screen for adding bookmarks.
 */
class AddBookmarkFragment : Fragment() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = AddBookmarkFragmentBinding.inflate(inflater, container, false)
            .apply {
                viewModel = viewModel(factory)
                viewState = viewModel?.viewState
            }
        return binding.root
    }
}
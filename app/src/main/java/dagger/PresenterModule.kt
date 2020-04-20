package dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import javax.inject.Singleton

@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideHomepagePresenter(): HomepagePresenter = HomepagePresenterImpl()

    @Provides
    @Singleton
    fun provideEntryPresenter(): EntryPresenter = EntryPresenterImpl()
}
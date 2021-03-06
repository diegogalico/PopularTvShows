package com.android.populartvshows.presentation.presenters;

import com.android.populartvshows.presentation.presenters.base.BasePresenter;
import com.android.populartvshows.presentation.ui.BaseView;
import com.android.populartvshows.presentation.ui.fragments.SplashFragment;

/**
 * @author diego.galico
 *
 * ConfigurationPresenter is an interface that define methods to obtain configuration information
 *
 */
public interface ConfigurationPresenter extends BasePresenter {

    /**
     * Interface implemented by {@link SplashFragment} class
     */
    interface ConfigurationView extends BaseView {

        /**
         * Start Popular tv shows Activity
         */
        void startPopularTvShowsActivity();
    }
}

package es.ulpgc.eite.da.advclickcounter.clicks;

import java.lang.ref.WeakReference;

public interface ClicksContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void refreshWithDataUpdated(ClicksViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void onResumeCalled();

        void onCreateCalled();

        void onRecreateCalled();

        void onBackPressed();

        void onPauseCalled();

        void onDestroyCalled();

        void onClearPressed();
    }

    interface Model {
        Integer getStoredClicks();

        void updateOnRestartScreen(Integer number);

        void updateWithDataFromPreviousScreen(Integer number);

        void resetClicks();
    }

}

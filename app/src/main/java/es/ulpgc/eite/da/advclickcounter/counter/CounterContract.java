package es.ulpgc.eite.da.advclickcounter.counter;

import java.lang.ref.WeakReference;

public interface CounterContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void refreshWithDataUpdated(CounterViewModel viewModel);

        void navigateToNextScreen();

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

        void onIncrementPressed();

        void onResetPressed();

        void onClicksPressed();
    }

    interface Model {
        Integer getStoredClicks();

        Integer getStoredCounter();

        void updateWithDataFromClicksScreen(Integer number);

        void updateOnRestartScreen(Integer counter, Integer clicks);

        void incrementCounter();

        void resetCounter();
    }

}

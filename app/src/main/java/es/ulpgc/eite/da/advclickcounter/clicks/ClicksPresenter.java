package es.ulpgc.eite.da.advclickcounter.clicks;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advclickcounter.app.AppMediator;
import es.ulpgc.eite.da.advclickcounter.app.ClicksToCounterState;
import es.ulpgc.eite.da.advclickcounter.app.CounterToClicksState;


public class ClicksPresenter implements ClicksContract.Presenter {

    public static String TAG = "ClickCounter.ClicksPresenter";

    private WeakReference<ClicksContract.View> view;
    private ClicksState state;
    private ClicksContract.Model model;
    private final AppMediator mediator;

    public ClicksPresenter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void onCreateCalled() {
        Log.e(TAG, "onCreateCalled()");

        // initialize the state
        state = new ClicksState();
        // TODO: insert code if necessary

        // use passed state if is necessary
        CounterToClicksState savedState = getStateFromPreviousScreen();
        if (savedState != null) {

            // update the model if is necessary
            // TODO: insert code if necessary
        }

    }

    @Override
    public void onRecreateCalled() {
        Log.e(TAG, "onRecreateCalled()");

        // get back the state
        state = mediator.getClicksState();

        // update the model if is necessary
        // TODO: insert code if necessary
    }

    @Override
    public void onResumeCalled() {
        Log.e(TAG, "onResumeCalled()");

        // call the model and set view state
        // TODO: insert code if necessary

        // update the view
        view.get().refreshWithDataUpdated(state);

    }

    @Override
    public void onBackPressed() {
        Log.e(TAG, "onBackPressed()");

        // TODO: insert code if necessary
    }

    @Override
    public void onPauseCalled() {
        Log.e(TAG, "onPauseCalled()");

        // save the current state
        mediator.setClicksState(state);
    }

    @Override
    public void onDestroyCalled() {
        Log.e(TAG, "onDestroyCalled()");
    }

    @Override
    public void onClearPressed() {
        Log.e(TAG, "onClearPressed()");

        // TODO: insert code if necessary

    }

    private CounterToClicksState getStateFromPreviousScreen() {
        return mediator.getCounterToClicksState();
    }

    private void passStateToPreviousScreen(ClicksToCounterState state) {
        mediator.setClicksToCounterState(state);
    }

    @Override
    public void injectView(WeakReference<ClicksContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(ClicksContract.Model model) {
        this.model = model;
    }

}

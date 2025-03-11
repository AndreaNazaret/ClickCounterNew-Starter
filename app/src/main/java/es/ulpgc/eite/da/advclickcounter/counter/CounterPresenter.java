package es.ulpgc.eite.da.advclickcounter.counter;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advclickcounter.app.AppMediator;
import es.ulpgc.eite.da.advclickcounter.app.ClicksToCounterState;
import es.ulpgc.eite.da.advclickcounter.app.CounterToClicksState;


public class CounterPresenter implements CounterContract.Presenter {

    public static String TAG = "ClickCounter.CounterPresenter";

    private WeakReference<CounterContract.View> view;
    private CounterState state;
    private CounterContract.Model model;
    private final AppMediator mediator;

    public CounterPresenter(AppMediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void onCreateCalled() {
        Log.e(TAG, "onCreateCalled()");

        // initialize the state
        state = new CounterState();
        // TODO: insert code if necessary
    }

    @Override
    public void onRecreateCalled() {
        Log.e(TAG, "onRecreateCalled()");

        // get back the state
        state = mediator.getCounterState();

        // update the model
        // TODO: insert code if necessary
    }

    @Override
    public void onResumeCalled() {
        Log.e(TAG, "onResumeCalled()");

        // use passed state if is necessary
        ClicksToCounterState savedState = getStateFroNextScreen();
        if (savedState != null) {

            // update the model
            // TODO: insert code if necessary
        }

        // call the model and update the state
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
        mediator.setCounterState(state);
    }

    @Override
    public void onDestroyCalled() {
        Log.e(TAG, "onDestroyCalled()");
    }


    @Override
    public void onIncrementPressed() {
        Log.e(TAG, "onIncrementPressed()");

        // TODO: insert code if necessary
    }


    @Override
    public void onResetPressed() {
        Log.e(TAG, "onResetPressed()");

        // TODO: insert code if necessary
    }

    @Override
    public void onClicksPressed() {
        Log.e(TAG, "onClicksPressed()");

        // TODO: insert code if necessary
    }


    private void passStateToNextScreen(CounterToClicksState state) {
        mediator.setCounterToClicksState(state);
    }

    private ClicksToCounterState getStateFroNextScreen() {
        return mediator.getClicksToCounterState();
    }

    @Override
    public void injectView(WeakReference<CounterContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(CounterContract.Model model) {
        this.model = model;
    }

}

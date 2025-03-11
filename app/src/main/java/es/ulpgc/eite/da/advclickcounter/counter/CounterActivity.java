package es.ulpgc.eite.da.advclickcounter.counter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.da.advclickcounter.R;
import es.ulpgc.eite.da.advclickcounter.app.AppMediator;
import es.ulpgc.eite.da.advclickcounter.clicks.ClicksActivity;


public class CounterActivity
        extends AppCompatActivity implements CounterContract.View {

    public static String TAG = "ClickCounter.CounterActivity";


    private CounterContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        setTitle(R.string.counter_title);

        if (savedInstanceState == null) {
            AppMediator.resetInstance();

        }

        // do the setup
        CounterScreen.configure(this);

        if (savedInstanceState == null) {
            presenter.onCreateCalled();

        } else {
            presenter.onRecreateCalled();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        // load the counterVal
        presenter.onResumeCalled();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        presenter.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();

        presenter.onPauseCalled();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenter.onDestroyCalled();
    }

    @Override
    public void navigateToNextScreen() {
        Intent intent = new Intent(this, ClicksActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    @Override
    public void refreshWithDataUpdated(CounterViewModel viewModel) {
        //Log.e(TAG, "refreshWithDataUpdated()");

        // deal with the data
        String counterVal = String.valueOf(viewModel.counterVal);
        ((TextView) findViewById(R.id.tvCounter)).setText(counterVal);

        findViewById(R.id.btnClicks).setEnabled(viewModel.isClicksEnabled);
        findViewById(R.id.btnIncrement).setEnabled(viewModel.isIncrEnabled);
        findViewById(R.id.btnReset).setEnabled(viewModel.isResetEnabled);
    }


    public void onIncrementPressed(View view) {
        presenter.onIncrementPressed();
    }

    public void onResetPressed(View view) {
        presenter.onResetPressed();
    }

    public void onClicksPressed(View view) {
        presenter.onClicksPressed();
    }


    @Override
    public void injectPresenter(CounterContract.Presenter presenter) {
        this.presenter = presenter;
    }


}

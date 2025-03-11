package es.ulpgc.eite.da.advclickcounter.clicks;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.da.advclickcounter.R;


public class ClicksActivity
        extends AppCompatActivity implements ClicksContract.View {

    public static String TAG = "ClickCounter.ClicksActivity";

    private ClicksContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicks);
        setTitle(R.string.clicks_title);

        // do the setup
        ClicksScreen.configure(this);

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

    public void onClearPressed(View view) {
        presenter.onClearPressed();
    }

    @Override
    public void refreshWithDataUpdated(ClicksViewModel viewModel) {
        //Log.e(TAG, "refreshWithDataUpdated()");

        // deal with the data
        String numOfClicks = String.valueOf(viewModel.numOfClicks);
        ((TextView) findViewById(R.id.tvClicks)).setText(numOfClicks);

        findViewById(R.id.btnClear).setEnabled(viewModel.isClearEnabled);
    }

    @Override
    public void injectPresenter(ClicksContract.Presenter presenter) {
        this.presenter = presenter;
    }


}

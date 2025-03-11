package es.ulpgc.eite.da.advclickcounter.clicks;

public class ClicksModel implements ClicksContract.Model {

    public static String TAG = "ClickCounter.ClicksModel";

    private Integer numOfClicks;

    public ClicksModel() {
        numOfClicks = 0;
    }

    @Override
    public Integer getStoredClicks() {
        // Log.e(TAG, "getStoredClicks()");
        return numOfClicks;
    }

    @Override
    public void updateOnRestartScreen(Integer number) {
        // Log.e(TAG, "updateOnRestartScreen()");
        numOfClicks = number;
    }

    @Override
    public void updateWithDataFromPreviousScreen(Integer number) {
        // Log.e(TAG, "updateWithDataFromPreviousScreen()");
        numOfClicks = number;
    }

    @Override
    public void resetClicks() {
        numOfClicks = 0;
    }
}

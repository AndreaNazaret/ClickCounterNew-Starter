package es.ulpgc.eite.da.advclickcounter.counter;

public class CounterModel implements CounterContract.Model {

    public static String TAG = "ClickCounter.CounterModel";

    private Integer counterVal;
    private Integer numOfClicks;

    public CounterModel() {
        counterVal = 0;
        numOfClicks = 0;
    }

    @Override
    public Integer getStoredClicks() {
        // Log.e(TAG, "getStoredClicks()");
        return numOfClicks;
    }

    @Override
    public Integer getStoredCounter() {
        // Log.e(TAG, "getStoredCounter()");
        return counterVal;
    }


    @Override
    public void updateOnRestartScreen(Integer counter, Integer clicks) {
        // Log.e(TAG, "updateOnRestartScreen()");

        // TODO: include code if necessary
    }

    @Override
    public void updateWithDataFromClicksScreen(Integer number) {
        // Log.e(TAG, "updateWithDataFromClicksScreen()");

        // TODO: include code if necessary
    }


    @Override
    public void incrementCounter() {

        // TODO: include code if necessary
    }

    @Override
    public void resetCounter() {
        counterVal = 0;
    }
}

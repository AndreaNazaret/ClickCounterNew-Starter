package es.ulpgc.eite.da.advclickcounter.app;


import es.ulpgc.eite.da.advclickcounter.clicks.ClicksState;
import es.ulpgc.eite.da.advclickcounter.counter.CounterState;

public class AppMediator {

    private static AppMediator INSTANCE;

    private CounterState counterState;
    private ClicksState clicksState;

    private CounterToClicksState counterToClicksState;
    private ClicksToCounterState clicksToCounterState;


    private AppMediator() {
        //counterState=new CounterState();
        //clicksState=new ClicksState();
    }

    public static void resetInstance() {
        INSTANCE = null;
    }


    public static AppMediator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AppMediator();
        }

        return INSTANCE;
    }


    public CounterState getCounterState() {
        return counterState;
    }

    public void setCounterState(CounterState state) {
        counterState = state;
    }

    public ClicksState getClicksState() {
        return clicksState;
    }

    public void setClicksState(ClicksState state) {
        clicksState = state;
    }

    public CounterToClicksState getCounterToClicksState() {
        CounterToClicksState state = counterToClicksState;
        counterToClicksState = null;
        return state;
    }

    public void setCounterToClicksState(CounterToClicksState state) {
        counterToClicksState = state;
    }

    public ClicksToCounterState getClicksToCounterState() {
        ClicksToCounterState state = clicksToCounterState;
        clicksToCounterState = null;
        return state;
    }

    public void setClicksToCounterState(ClicksToCounterState state) {
        clicksToCounterState = state;
    }

}

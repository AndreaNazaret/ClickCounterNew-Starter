package es.ulpgc.eite.da.advclickcounter.counter;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advclickcounter.app.AppMediator;


public class CounterScreen {

    public static void configure(CounterContract.View view) {

//    WeakReference<FragmentActivity> context =
//        new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = AppMediator.getInstance();
        CounterContract.Presenter presenter = new CounterPresenter(mediator);

        CounterContract.Model model = new CounterModel();

        presenter.injectModel(model);
        presenter.injectView(new WeakReference<>(view));
        view.injectPresenter(presenter);

    }
}

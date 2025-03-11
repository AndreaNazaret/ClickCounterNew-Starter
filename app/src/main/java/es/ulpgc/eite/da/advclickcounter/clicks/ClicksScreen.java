package es.ulpgc.eite.da.advclickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advclickcounter.app.AppMediator;


public class ClicksScreen {

    public static void configure(ClicksContract.View view) {

//    WeakReference<FragmentActivity> context =
//        new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = AppMediator.getInstance();
        ClicksContract.Presenter presenter = new ClicksPresenter(mediator);

        ClicksContract.Model model = new ClicksModel();

        presenter.injectModel(model);
        presenter.injectView(new WeakReference<>(view));
        view.injectPresenter(presenter);

    }
}

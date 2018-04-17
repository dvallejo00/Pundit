
package mx.smartwireless.pandit.client.application.progres;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

public class ProgressPresenter extends PresenterWidget<ProgressPresenter.MyView> {
    interface MyView extends PopupView {
    }

    @Inject
    ProgressPresenter(final EventBus eventBus, final MyView view) {
        super(eventBus, view);

    }

}

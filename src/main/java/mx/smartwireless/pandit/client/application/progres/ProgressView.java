
package mx.smartwireless.pandit.client.application.progres;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;

public class ProgressView extends PopupViewImpl implements ProgressPresenter.MyView {
    interface Binder extends UiBinder<PopupPanel, ProgressView> {
    }

    @Inject
    ProgressView(Binder uiBinder, EventBus eventBus) {
        super(eventBus);

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void hide() {
        super.hide();
    }
}

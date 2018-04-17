package mx.smartwireless.pandit.client.application.progres;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ProgressModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenterWidget(ProgressPresenter.class, ProgressPresenter.MyView.class, ProgressView.class);
    }
}

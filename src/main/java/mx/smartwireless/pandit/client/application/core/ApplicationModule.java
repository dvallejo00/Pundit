package mx.smartwireless.pandit.client.application.core;

import mx.smartwireless.pandit.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import mx.smartwireless.pandit.client.application.menu.MenuModule;
import mx.smartwireless.pandit.client.application.progres.ProgressModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new MenuModule());
        install(new ProgressModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}

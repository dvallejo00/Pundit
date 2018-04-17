
package mx.smartwireless.pandit.client.application.menu;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MenuModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenterWidget(MenuPresenter.class, MenuPresenter.MyView.class, MenuView.class);
        bind(MenuUiHandlers.class).to(MenuPresenter.class);
    }
}

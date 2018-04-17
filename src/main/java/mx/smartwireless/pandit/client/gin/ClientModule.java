package mx.smartwireless.pandit.client.gin;


import com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule;
import com.gwtplatform.dispatch.shared.SecurityCookie;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import mx.smartwireless.pandit.client.application.core.ApplicationModule;
import mx.smartwireless.pandit.client.place.NameTokens;
import mx.smartwireless.pandit.client.resources.ResourceLoader;
import mx.smartwireless.pandit.shared.seguridad.SharedTokens;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule
                .Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());
        install(new ApplicationModule());
        install(new RpcDispatchAsyncModule());

        bind(ResourceLoader.class).asEagerSingleton();
        bindConstant().annotatedWith( SecurityCookie.class ).to(SharedTokens.securityCookieName);
    }
}

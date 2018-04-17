package mx.smartwireless.pandit.server.guice;

import com.google.inject.Singleton;
import com.googlecode.objectify.ObjectifyFilter;
import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import com.gwtplatform.dispatch.shared.SecurityCookie;
import mx.smartwireless.pandit.shared.seguridad.SharedTokens;

public class ServerModule extends HandlerModule {

    @Override
    protected void configureHandlers() {

        bind(ObjectifyFilter.class).in(Singleton.class);

        bindConstant().annotatedWith( SecurityCookie.class ).to(SharedTokens.securityCookieName);
    }
}

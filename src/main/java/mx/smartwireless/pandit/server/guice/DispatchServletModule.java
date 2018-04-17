package mx.smartwireless.pandit.server.guice;

import javax.inject.Singleton;

import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;
import com.gwtplatform.dispatch.rpc.server.guice.DispatchServiceImpl;
import com.gwtplatform.dispatch.rpc.shared.ActionImpl;

public class DispatchServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        serve("/"+ ActionImpl.DEFAULT_SERVICE_NAME+"*").with(DispatchServiceImpl.class);
        filter("/*").through(ObjectifyFilter.class);
    }
}


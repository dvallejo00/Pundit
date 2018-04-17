package mx.smartwireless.pandit.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {
    interface Normalize extends CssResource {

    }

    interface Style extends CssResource {
        String brandColor();
        String centradoSmall();
        String navbarColor();
        String centradoLeyenda();
        String logoStilo();
        String margenDerecho();
        String buttonsample();

    }

    @Source("/images/progressImage.gif")
    ImageResource progressBar();

    @Source("/images/projectManagerGi.gif")
    ImageResource pmgif();

    @Source("css/normalize.gss")
    Normalize normalize();

    @Source("css/style.gss")
    Style style();
}

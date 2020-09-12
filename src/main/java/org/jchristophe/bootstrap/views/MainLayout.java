package org.jchristophe.bootstrap.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

import java.util.HashMap;

/**
 *
 *
 * @author jcgueriaud
 */
// add the lumo theme for Vaadin component
@Theme(value = Lumo.class, variant = Lumo.LIGHT)
@PWA(name = "Bootstrap example", shortName = "Bootstrap example", enableInstallPrompt = false)
public class MainLayout extends Div implements RouterLayout, PageConfigurator {
    @Override
    public void configurePage(InitialPageSettings settings) {
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap.min.css");
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap-grid.min.css");
        addStylesheet(settings, "./bootstrap-4.5.2-dist/css/bootstrap-reboot.min.css");
        addJavascript(settings, "./assets/jquery.min.js");
        addJavascript(settings, "./assets/popper.min.js");
        addJavascript(settings, "./bootstrap-4.5.2-dist/js/bootstrap.min.js");
        addJavascript(settings, "./bootstrap-4.5.2-dist/js/bootstrap.bundle.min.js");
    }

    private void addStylesheet(InitialPageSettings settings, String stylesheet) {
        HashMap<String, String> attributes = new HashMap<>();
        attributes.put("rel", "stylesheet");
        attributes.put("type", "text/css");
        settings.addLink(stylesheet, attributes);

    }
    private void addJavascript(InitialPageSettings settings, String javascript) {
        settings.addInlineWithContents(
            "<script type=\"text/javascript\" defer=\"\" src=\"" +
                javascript +
                "\"></script>",  InitialPageSettings.WrapMode.NONE);

    }
}

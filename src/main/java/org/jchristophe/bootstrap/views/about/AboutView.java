package org.jchristophe.bootstrap.views.about;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.jchristophe.bootstrap.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.enums.BsColor;

@Route(value = "about", layout = MainLayout.class)
@PageTitle("About")
@RouteAlias(value = "", layout = MainLayout.class)
public class AboutView extends Div {

    public AboutView() {
        add(new BsButton("Primary button").withColor(BsColor.PRIMARY));
    }

}

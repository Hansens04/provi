package com.farmaciaxd.views.facturar;

import com.farmaciaxd.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Facturar")
@Route(value = "facturar", layout = MainLayout.class)
@Uses(Icon.class)
public class FacturarView extends Composite<VerticalLayout> {

    public FacturarView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}

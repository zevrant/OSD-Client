package com.zevrant.osd.client.ui.swing.event.action;

import com.zevrant.osd.client.ui.swing.components.applications.ApplicationListItem;

import javax.swing.*;

public class ApplicationListAction implements EventAction, ActionVisitor {

    private ApplicationListItem sourceComponent;

    public ApplicationListAction(ApplicationListItem sourceComponent) {
        this.sourceComponent = sourceComponent;
    }


    @Override
    public JComponent getSourceComponent() {
        return sourceComponent;
    }

}

package com.zevrant.osd.client.ui.swing.listeners;

import com.zevrant.osd.client.ui.swing.components.GlobalApplicationControls;
import com.zevrant.osd.client.ui.swing.components.MainFrame;
import com.zevrant.osd.client.ui.swing.components.applications.ApplicationListItem;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.IOException;

public class ListListener implements ListSelectionListener {

    private JList<ApplicationListItem> applicationList;

    private MainFrame mainFrame;

    public ListListener(JList<ApplicationListItem> applicationList) {
        this.applicationList = applicationList;
        this.mainFrame = mainFrame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ApplicationListItem listItem = applicationList.getSelectedValue();
        try {
            listItem.accept(listItem.getApplicationListAction());
        } catch (IOException ex) {
            GlobalApplicationControls.addErrorMessage(ex.getMessage());
        }
    }
}

package com.zevrant.osd.client.ui.swing.components;

import com.zevrant.osd.client.ui.swing.event.action.CloseDialogAction;

import javax.swing.*;

public class GlobalApplicationControls {

    public static void addErrorMessage(String message) {
        JButton closeButton = new JButton();
        JDialog errorDialog = new JDialog();

        closeButton.setText("Okay");
        closeButton.setAction(new CloseDialogAction(errorDialog));
        errorDialog.setTitle("Error");
        errorDialog.setAlwaysOnTop(true);
        errorDialog.add(new JLabel(message));
        errorDialog.add(closeButton);
    }
}

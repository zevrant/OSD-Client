package com.zevrant.osd.client.ui.swing.components;

import com.zevrant.osd.client.ui.swing.event.action.CloseDialogAction;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@Component
public class MainFrame extends JFrame {

    public MainFrame(LayoutManager layoutManager){
        setTitle("OSD System Management");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(layoutManager);
        setVisible(true);
    }


}

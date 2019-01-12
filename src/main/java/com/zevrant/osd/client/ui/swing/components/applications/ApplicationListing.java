package com.zevrant.osd.client.ui.swing.components.applications;

import com.zevrant.osd.client.ui.swing.components.MainFrame;
import com.zevrant.osd.client.ui.swing.listeners.ListListener;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ApplicationListing extends JPanel {


    private JList<ApplicationListItem> jList;

    public ApplicationListing(LayoutManager layout) {
        super(layout, true);

        jList = new JList();

        this.add(jList);

        jList.addListSelectionListener(new ListListener(jList));
    }

    public void addToList(ApplicationListItem listItem) {
        jList.add(listItem);
    }


}

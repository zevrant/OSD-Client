package com.zevrant.osd.client.ui.swing.components.applications;

import com.zevrant.osd.client.ui.application.management.Application;
import com.zevrant.osd.client.ui.application.management.ApplicationManager;
import com.zevrant.osd.client.ui.swing.event.action.ActionVisitor;
import com.zevrant.osd.client.ui.swing.event.action.ApplicationListAction;
import com.zevrant.osd.client.ui.swing.event.action.VisitedComponent;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.io.IOException;

public class ApplicationListItem extends JPanel implements VisitedComponent {

    private JButton applicationPicture;

    private JLabel applicationName;

    private ApplicationManager applicationManager;

    private ApplicationListAction applicationListAction;

    @Autowired
    public void setApplicationManager(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    public ApplicationListAction getApplicationListAction(){
        return applicationListAction;
    }

    public ApplicationListItem(Application application) {
        applicationPicture = new JButton();
        applicationPicture.setIcon(application.getImage());

        applicationName = new JLabel(application.getName());

        add(applicationPicture);
        add(applicationName);

//        setVisible(true);

        applicationListAction = new ApplicationListAction(this);
    }

    @Override
    public void accept(ActionVisitor actionVisitor) throws IOException {
        applicationManager.execute(applicationName.getText());
    }
}

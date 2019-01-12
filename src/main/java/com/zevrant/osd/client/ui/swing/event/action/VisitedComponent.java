package com.zevrant.osd.client.ui.swing.event.action;

import java.io.IOException;

public interface VisitedComponent {

    void accept(ActionVisitor actionVisitor) throws IOException;
}

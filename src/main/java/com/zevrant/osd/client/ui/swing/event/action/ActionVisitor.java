package com.zevrant.osd.client.ui.swing.event.action;

import java.io.IOException;

public interface ActionVisitor {

    default void visit(VisitedComponent visited) throws IOException {
        visited.accept(this);
    }
}

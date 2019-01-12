package com.zevrant.osd.client.ui.application.management;

import javax.swing.*;
import java.nio.file.Path;

public class Application {

    private String name;

    private Path executableLocation;

    private ImageIcon image;

    public Application(String name, Path executableLocation, ImageIcon image) {
        this.name = name;
        this.executableLocation = executableLocation;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Path getExecutableLocation() {
        return executableLocation;
    }

    public ImageIcon getImage() {
        return image;
    }
}

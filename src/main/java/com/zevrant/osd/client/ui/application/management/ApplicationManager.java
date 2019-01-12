package com.zevrant.osd.client.ui.application.management;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class ApplicationManager {

    private Map<String, Application> applicationMap;

    private ApplicationExecutor executor;

    public ApplicationManager(ApplicationExecutor executor) {
        applicationMap = new HashMap<>();
    }

    public void addApplication(Application application) {
        applicationMap.put(application.getName(), application);
    }

    public void removeApplication(String applicationName) {
        applicationMap.remove(applicationName);
    }

    public int execute(String applicationName) throws IOException {
        return executor.execute(applicationMap.get(applicationName));
    }
}

package com.zevrant.osd.client.ui.application.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationExecutor {

    private static Logger logger = LoggerFactory.getLogger(ApplicationExecutor.class);

    private ProcessBuilder processBuilder;

    public ApplicationExecutor(ProcessBuilder processBuilder){
        this.processBuilder = processBuilder;
    }

    public int execute(Application application) throws IOException {
        Process process = processBuilder.command(application.getExecutableLocation().toString()).start();
        try {
            while (process.isAlive()) {
                wait();
            }
        } catch (InterruptedException ex) {
            logger.error(ex.getMessage());
            String processError = new String(process.getErrorStream().readAllBytes());
            logger.error(processError);
            if(process.isAlive()) {
                process.destroyForcibly();
            }
        }

        return process.exitValue();
    }

}

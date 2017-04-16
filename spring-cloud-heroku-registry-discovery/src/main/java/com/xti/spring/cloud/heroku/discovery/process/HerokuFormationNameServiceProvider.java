package com.xti.spring.cloud.heroku.discovery.process;

import java.util.Collections;
import java.util.List;

public class HerokuFormationNameServiceProvider implements HerokuServiceProvider {

    public List<String> getProcesses() {
        final String herokuDnsFormationName = System.getenv("HEROKU_DNS_FORMATION_NAME");
        final String[] herokuParts = herokuDnsFormationName.split("\\.");
        final String process = herokuParts[0];
        final String app = herokuParts[1];

        return Collections.singletonList(process + "." + app);
    }
}

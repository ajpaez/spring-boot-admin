package com.apr.sb.login.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Component
public class MyPingService {
    Logger logger = LoggerFactory.getLogger(MyPingService.class);

    @Scheduled(cron = "30 * * * * ?")
    public void execute() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://google.es";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        logger.info("Response code: " + response.getStatusCode());
    }
}

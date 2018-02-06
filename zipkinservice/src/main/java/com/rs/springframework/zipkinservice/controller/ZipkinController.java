package com.rs.springframework.zipkinservice.controller;

import com.rs.springframework.zipkinservice.config.NetworkQueryconfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Log4j2
public class ZipkinController {

    private final RestTemplate restTemplate;

    private final NetworkQueryconfig networkQueryconfig;

    @Autowired
    public ZipkinController(RestTemplate restTemplate, NetworkQueryconfig networkQueryconfig) {
        this.restTemplate = restTemplate;
        this.networkQueryconfig = networkQueryconfig;
    }

    @GetMapping(value="/zipkin")
    public String zipkinService1()
    {
        log.info("Inside zipkinService");

        String response = (String) restTemplate.exchange("http://localhost:"+networkQueryconfig.getPort()+networkQueryconfig.getService(),
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();

       return response;
    }

    @GetMapping(value="/echo")
    public String echo()
    {
        log.info("Now let's create some intentional delay...");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("returning after delay..");
        return "echo";
    }
}



package com.rakib.awsses.controller;

import com.rakib.awsses.service.AmazonSesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    private final AmazonSesService amazonSesService;

    public EmailController(AmazonSesService amazonSesService) {
        this.amazonSesService = amazonSesService;
    }

    @GetMapping("sendEmail/{emailAddress}")
    public void sendEmail(@PathVariable("emailAddress") String emailAddress) {
        amazonSesService.sendEmail(List.of(emailAddress), "", "", "TEST");
    }
}

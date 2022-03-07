package com.rakib.awsses.controller;

import com.rakib.awsses.dto.ReceiverEmail;
import com.rakib.awsses.service.AmazonSesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final AmazonSesService amazonSesService;

    public EmailController(AmazonSesService amazonSesService) {
        this.amazonSesService = amazonSesService;
    }

    @PostMapping("sendEmail")
    public void sendEmail(@RequestBody ReceiverEmail emailList) {
        amazonSesService.sendEmail(emailList.getEmailList(), "", "", "TEST");
    }
}

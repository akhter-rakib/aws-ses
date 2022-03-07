package com.rakib.awsses.dto;

import java.util.List;

public class ReceiverEmail {
    private List<String> emailList;

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public List<String> getEmailList() {
        return emailList;
    }
}

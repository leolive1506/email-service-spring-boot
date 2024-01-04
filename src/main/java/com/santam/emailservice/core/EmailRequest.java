package com.santam.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}

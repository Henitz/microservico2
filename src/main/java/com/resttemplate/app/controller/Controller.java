package com.resttemplate.app.controller;

import com.resttemplate.app.model.ClienteRequest;
import com.resttemplate.app.model.ClienteResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class Controller {

    @PostMapping
    public ResponseEntity<ClienteResponse> save(@RequestBody ClienteRequest clienteRequest) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ClienteRequest> request = new HttpEntity<>(clienteRequest, headers);

        ResponseEntity<ClienteResponse> clienteResponse = restTemplate.postForEntity(url, request, ClienteResponse.class);

        return ResponseEntity.ok(clienteResponse.getBody());


    }
}


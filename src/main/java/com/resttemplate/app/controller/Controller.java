package com.resttemplate.app.controller;

import com.resttemplate.app.model.Resposta;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping
public class Controller {

    @GetMapping
    public String metodo() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080";
        ResponseEntity<Resposta> resposta = restTemplate.getForEntity(url, Resposta.class);

        return "Resposta que tivemos: "+ resposta;


    }
}


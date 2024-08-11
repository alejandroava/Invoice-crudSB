package com.app.billing.controller;

import com.app.billing.entity.Client;
import com.app.billing.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }
}

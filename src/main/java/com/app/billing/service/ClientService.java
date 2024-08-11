package com.app.billing.service;

import com.app.billing.entity.Client;

import java.util.List;

public interface ClientService {
    Client save(Client client);
    List<Client> findAll();
    Client findById(Integer id);
    void deleteById(Integer id);
    Client update(Client client);
}

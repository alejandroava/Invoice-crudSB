package com.app.billing.service;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.app.billing.entity.Client;
import com.app.billing.repository.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Integer id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if(optionalClient.isPresent()){
            return optionalClient.get();
        }else{
            throw new EntityNotFoundException("ERROR: Id no encontrado");
        }

    }

    @Override
    public void deleteById(Integer id) {
        this.clientRepository.deleteById(id);

    }

    @Override
    public Client update(Client client) {
        Optional<Client> existClient = clientRepository.findById(client.getId());
        if(existClient.isPresent()){
            return clientRepository.save(client);
        }else {
            throw new EntityNotFoundException("ERROR: Cliente no encontrado");
        }
    }
}

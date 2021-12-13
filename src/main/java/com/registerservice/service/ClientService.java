package com.registerservice.service;

import com.registerservice.model.ClientModel;
import com.registerservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ClientModel insertClient(ClientModel clientModel){
        return clientRepository.save (clientModel);
    }

    public ClientModel updateClient(ClientModel clientModel){
        Optional<ClientModel> newClient = clientRepository.findById (clientModel.getId ());
        if (newClient.isPresent ()){
            return clientRepository.save (clientModel);
        } else {
            return null;
        }
    }


}

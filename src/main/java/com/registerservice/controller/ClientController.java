package com.registerservice.controller;

import com.registerservice.model.ClientModel;
import com.registerservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/insert")
    public ResponseEntity insertClient(@RequestBody ClientModel clientModel){
        try {
            clientService.insertClient (clientModel);
            return ResponseEntity.ok(clientModel);
        } catch (Exception exception){
            return ResponseEntity.badRequest().body(exception);
        }
    }

    @PutMapping("/update")
    public ResponseEntity updateClient(@RequestParam String id, @RequestBody ClientModel clientModel){
        clientModel.setId (id);
        ClientModel updatedClient = clientService.updateClient (clientModel);

        if (updatedClient != null){
            return ResponseEntity.ok (clientModel);
        } else {
            return ResponseEntity.badRequest ().build ();
        }
    }


}

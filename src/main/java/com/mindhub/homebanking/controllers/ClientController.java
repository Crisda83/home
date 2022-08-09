package com.mindhub.homebanking.controllers;






import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController // retorna el formato JSON, indica que es un controlador
@RequestMapping("/api")
public class ClientController {



    @Autowired // voy a poder usar el clientrepository para obtener info
    private ClientRepository clientRepository;

    @RequestMapping("/clients")
    public List<ClientDTO> getClients() {
        return this.clientRepository.findAll().stream().map(ClientDTO::new).collect(toList());
    }

    @RequestMapping("/clients/{id}")
    public ClientDTO getClients(@PathVariable Long id) {
        return this.clientRepository.findById(id).map(ClientDTO::new).orElse(null);


   }
    }


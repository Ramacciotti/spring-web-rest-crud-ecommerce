package com.ramacciotti.ecommerce.adapter.inbound.rest;

import com.ramacciotti.ecommerce.domain.dto.rest.ClientResponseDTO;
import com.ramacciotti.ecommerce.domain.ports.inbound.ClientServiceUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*")
@Tag(name = "Client Controller")
public class ClientController {

    @Autowired
    ClientServiceUseCase clientServiceUseCase;

    @GetMapping(path = "/client/{id}")
    @Operation(description = "Uses an id to locate an specific client at the database")
    public ResponseEntity<ClientResponseDTO> getClientById(@PathVariable("id") Long id) {
        ClientResponseDTO result = clientServiceUseCase.getClient(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

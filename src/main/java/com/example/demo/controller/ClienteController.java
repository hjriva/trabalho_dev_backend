package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@RestController //diz ao spring que a classe responde requisições web e devolve json

@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
}


    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();

    }

    

    @GetMapping("/{id}")
    public Cliente buscarId(@PathVariable Long id) {

        return clienteRepository.findById(id).orElse(null);

        
        
    }

    @DeleteMapping("/{id}")	
    public void Apagar(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }

    

}




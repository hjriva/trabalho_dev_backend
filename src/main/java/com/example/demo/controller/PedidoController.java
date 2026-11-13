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

import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;

@RestController //diz ao spring que a classe responde requisições web e devolve json

@RequestMapping("/pedidos")

public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
    return pedidoRepository.save(pedido);
}


    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();

    }

    

    @GetMapping("/{id}")
    public Pedido buscarId(@PathVariable Long id) {

        return pedidoRepository.findById(id).orElse(null);

        
        
    }

    @DeleteMapping("/{id}")	
    public void Apagar(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }

    

}




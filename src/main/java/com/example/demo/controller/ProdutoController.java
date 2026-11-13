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

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

@RestController //diz ao spring que a classe responde requisições web e devolve json

@RequestMapping("/produtos")

public class ProdutoController {
    @Autowired
    private ProdutoRepository ProdutoRepository;

    @PostMapping
    public Produto criar(@RequestBody Produto Produto) {
    return ProdutoRepository.save(Produto);
}


    @GetMapping
    public List<Produto> listarTodos() {
        return ProdutoRepository.findAll();

    }

    

    @GetMapping("/{id}")
    public Produto buscarId(@PathVariable Long id) {

        return ProdutoRepository.findById(id).orElse(null);

        
        
    }

    @DeleteMapping("/{id}")	
    public void Apagar(@PathVariable Long id) {
        ProdutoRepository.deleteById(id);
    }

    

}




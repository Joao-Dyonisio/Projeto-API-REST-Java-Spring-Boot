package com.dev.joao.demo.controller;

import com.dev.joao.demo.entities.Departamento;
import com.dev.joao.demo.entities.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @GetMapping
    public List<Produto> getObjects() {
        Departamento d1 = new Departamento(1L , "Tech");
        Departamento d2 = new Departamento(2L, "Pet");

        Produto p1 = new Produto(1L, d1, 4000.0, "Macbook Pro");
        Produto p2 = new Produto(2L, d1, 5000.0, "PC Gamer");
        Produto p3 = new Produto(3L, d2, 4000.0, "Pet house");

        List<Produto> list = Arrays.asList(p1,p2,p3);

        return list;
    }
}

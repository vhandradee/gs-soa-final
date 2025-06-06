package com.gssoa.controller;

import com.gssoa.dto.BairroDTO;
import com.gssoa.model.Bairro;
import com.gssoa.service.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bairros")
public class BairroController {
    @Autowired
    private BairroService service;

    @GetMapping
    public List<Bairro> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Bairro criar(@RequestBody BairroDTO dto) {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public Bairro atualizar(@PathVariable Long id, @RequestBody BairroDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
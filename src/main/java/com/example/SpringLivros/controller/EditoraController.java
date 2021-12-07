package com.example.SpringLivros.controller;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.model.Editora;
import com.example.SpringLivros.service.EditoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/editoras")
public class EditoraController {
    @Autowired
    private final EditoraService editoraService;

    @PostMapping
    public ResponseEntity save(@RequestBody Editora editora) {
        editoraService.save(editora);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Editora> getCustomersAll() {
        return editoraService.getAll();
        //Iterable é uma interface que determina que uma coleção pode ter seus elementos
    }

    @GetMapping("/{id}")
    public Optional<Editora> getId(@PathVariable(required = true) long id) {
        return editoraService.getId(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        editoraService.deleteById(id);
    }

}

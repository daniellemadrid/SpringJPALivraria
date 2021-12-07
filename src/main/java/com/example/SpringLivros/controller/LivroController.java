package com.example.SpringLivros.controller;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.model.Livro;
import com.example.SpringLivros.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private final LivroService livroService;

    @PostMapping
    public ResponseEntity save(@RequestBody Livro livro) {
        livroService.save(livro);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Livro> getCustomersAll() {
        return livroService.getAll();

    }

    @GetMapping("/{id}")
    public Optional<Livro> getId(@PathVariable(required = true) long id) {
        return livroService.getId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        livroService.deleteById(id);
    }

}

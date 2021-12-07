package com.example.SpringLivros.controller;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private final AutorService autorService;

    @PostMapping
    public ResponseEntity save(@RequestBody Autor autor) {
        autorService.save(autor);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Autor> getCustomersAll() {
        return autorService.getAll();

    }

    @GetMapping("/{id}")
    public Optional<Autor> getId(@PathVariable(required = true) long id) {
        return autorService.getId(id);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        autorService.deleteById(id);
    }

}

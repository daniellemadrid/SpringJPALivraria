package com.example.SpringLivros.controller;

import com.example.SpringLivros.service.EditoraService;
import com.example.SpringLivros.service.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private final LivroService livroService;
}

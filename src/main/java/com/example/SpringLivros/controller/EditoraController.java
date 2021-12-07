package com.example.SpringLivros.controller;

import com.example.SpringLivros.service.AutorService;
import com.example.SpringLivros.service.EditoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/editoras")
public class EditoraController {
    @Autowired
    private final EditoraService editoraService;
}

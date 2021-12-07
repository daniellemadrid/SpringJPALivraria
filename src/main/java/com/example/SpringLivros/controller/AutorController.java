package com.example.SpringLivros.controller;

import com.example.SpringLivros.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private final AutorService autorService;
}

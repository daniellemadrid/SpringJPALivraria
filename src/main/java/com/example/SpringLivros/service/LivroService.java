package com.example.SpringLivros.service;

import com.example.SpringLivros.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LivroService {
    @Autowired
    private final LivroRepository livroRepository;
}

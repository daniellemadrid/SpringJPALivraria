package com.example.SpringLivros.service;

import com.example.SpringLivros.repository.EditoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EditoraService {
    @Autowired
    private final EditoraRepository editoraRepository;
}

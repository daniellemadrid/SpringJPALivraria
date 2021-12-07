package com.example.SpringLivros.service;

import com.example.SpringLivros.repository.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AutorService {
    @Autowired
    private final AutorRepository autorRepository;


}


package com.example.SpringLivros.service;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.model.Livro;
import com.example.SpringLivros.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LivroService {
    @Autowired
    private final LivroRepository livroRepository;

    public void save(Livro livro) {
       livroRepository.save(livro);
    }
    public Iterable<Livro> getAll() {
        return livroRepository.findAll();
    }
    public Optional<Livro> getId(long id) {
        return livroRepository.findById(id);
    }
    public void deleteById(Long id){
        livroRepository.deleteById(id);
    }
}

package com.example.SpringLivros.service;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.repository.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AutorService {
    @Autowired
    private final AutorRepository autorRepository;

    public void save(Autor autor) {
       autorRepository.save(autor);
    }
    public Iterable<Autor> getAll() {
        return autorRepository.findAll();
    }
    public Optional<Autor> getId(long id) {
        return autorRepository.findById(id);
    }
    public void deleteById(Long id){
        autorRepository.deleteById(id);
    }


}


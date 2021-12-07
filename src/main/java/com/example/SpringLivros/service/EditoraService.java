package com.example.SpringLivros.service;

import com.example.SpringLivros.model.Autor;
import com.example.SpringLivros.model.Editora;
import com.example.SpringLivros.repository.EditoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EditoraService {
    @Autowired
    private final EditoraRepository editoraRepository;

    public void save(Editora editora) {
         editoraRepository.save(editora);
    }
    public Iterable<Editora> getAll() {
        return editoraRepository.findAll();
    }
    public Optional<Editora> getId(long id) {
        return editoraRepository.findById(id);
    }
    public void deleteById(Long id){
        editoraRepository.deleteById(id);
    }
}

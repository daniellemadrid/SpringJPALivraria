package com.example.SpringLivros.repository;

import com.example.SpringLivros.model.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Long> {
}

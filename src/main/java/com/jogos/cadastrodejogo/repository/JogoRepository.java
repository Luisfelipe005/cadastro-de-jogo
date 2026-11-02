package com.jogos.cadastrodejogo.repository;

import com.jogos.cadastrodejogo.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    public List<Jogo> findAllByNomeContainingIgnoreCase(String nome);
    public List<Jogo> findAllByGeneroContainingIgnoreCase(String genero);
    public List<Jogo> findAllByPlataformaContainingIgnoreCase(String plataforma);
    public List<Jogo> findAllByAnoLancamento(int anoLancamento);
    public List<Jogo> findAllByGeneroAndPlataformaContainingIgnoreCase(String genero, String plataforma);
}

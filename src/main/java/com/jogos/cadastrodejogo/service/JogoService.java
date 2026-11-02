package com.jogos.cadastrodejogo.service;

import com.jogos.cadastrodejogo.exception.JogoNaoEncontradoException;
import com.jogos.cadastrodejogo.model.Jogo;
import com.jogos.cadastrodejogo.repository.JogoRepository;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class JogoService {
   private final JogoRepository jogoRepository;

    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public Jogo cadastrar(Jogo jogo){
        return jogoRepository.save(jogo);
    }

    public List<Jogo> listarJogos(){
        return jogoRepository.findAll();
    }

    public Jogo getJogoPorId(Long id){
        return jogoRepository.findById(id).orElseThrow(() -> new JogoNaoEncontradoException("Seu jogo do id: "+ id +" não foi encontrado"));
    }

    public Jogo atualizaJogo(Long id, Jogo jogo){
        Jogo jogoAux = getJogoPorId(id);
        jogoAux.setGenero(jogo.getGenero());
        jogoAux.setNome(jogo.getNome());
        jogoAux.setPlataforma(jogo.getPlataforma());
        jogoAux.setAnoLancamento(jogo.getAnoLancamento());
        return jogoRepository.save(jogoAux);
    }

    public List<Jogo> pesquisaPorNome(String nome){
        List<Jogo> jogoList = jogoRepository.findAllByNomeContainingIgnoreCase(nome);
        if (jogoList.isEmpty()){
            throw new JogoNaoEncontradoException("Não tem nenhum jogo que contenha " + nome + " no titulo");
        }
        return jogoList;
    }

    public List<Jogo> pesquisaPorGenero(String genero){
        List<Jogo> jogoList = jogoRepository.findAllByGeneroContainingIgnoreCase(genero);
        if(jogoList.isEmpty()){
            throw new JogoNaoEncontradoException("Não contém nenhum jogo com o genero: " + genero);
        }
        return jogoList;
    }

    public List<Jogo> pesquisaPorPlataforma(String plataforma){
        List<Jogo> jogoList = jogoRepository.findAllByPlataformaContainingIgnoreCase(plataforma);
        if (jogoList.isEmpty()){
            throw new JogoNaoEncontradoException("não tem jogo cujo a plataforma é "+ plataforma);
        }
        return jogoList;
    }

    public List<Jogo> pesquisaPorAnoDeLancamento(int anoLancamento){
        List<Jogo> jogoList = jogoRepository.findAllByAnoLancamento(anoLancamento);
        if(jogoList.isEmpty()){
            throw new JogoNaoEncontradoException("Nenhum jogo com o ano de lançamento de " + anoLancamento + " foi encontrado.");
        }
        return jogoList;
    }

    public List<Jogo> pesquisaPorGeneroAndPlataforma(String genero, String plataforma){
        List<Jogo> jogoList = jogoRepository.findAllByGeneroAndPlataformaContainingIgnoreCase(genero, plataforma);
        if (jogoList.isEmpty()){
            throw new JogoNaoEncontradoException("Nenhum jogo foi encontrado com genero: "+ genero + " e plataforma: " + plataforma);
        }
        return jogoList;
    }


    public void deletarJogo(Long id) {
        getJogoPorId(id);
        jogoRepository.deleteById(id);
    }
}

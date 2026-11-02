package com.jogos.cadastrodejogo.controller;

import com.jogos.cadastrodejogo.model.Jogo;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.jogos.cadastrodejogo.service.JogoService;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping()
    public List<Jogo> listaJogos(){
        return jogoService.listarJogos();
    }

    @GetMapping("/{id}")
    public Jogo getJogoPorId(@PathVariable Long id){
        return jogoService.getJogoPorId(id);
    }

    @GetMapping("/Nome")
    public List<Jogo> pesquisaPorNome(@RequestParam String nome){
        return jogoService.pesquisaPorNome(nome);
    }

    @GetMapping("/Genero")
    public List<Jogo> pesquisaPorGenero(@RequestParam String genero){
        return jogoService.pesquisaPorGenero(genero);
    }

    @GetMapping("/Plataforma")
    public List<Jogo> pesquisaPorPlataforma(@RequestParam String plataforma){
        return jogoService.pesquisaPorPlataforma(plataforma);
    }

    @GetMapping("/AnoLancamento")
    public List<Jogo> pesquisaPorAnoDeLancamento(@RequestParam int anoLancamento){
       return jogoService.pesquisaPorAnoDeLancamento(anoLancamento);
    }

    @GetMapping("/PesquisaCombinada")
    public List<Jogo> PesquisaPorGeneroAndPlataforma(@RequestParam String genero, @RequestParam String plataforma){
        return jogoService.pesquisaPorGeneroAndPlataforma(genero, plataforma);
    }

    @PostMapping()
    public Jogo cadastrar(@Valid @RequestBody Jogo jogo){
        return jogoService.cadastrar(jogo);
    }

    @PutMapping("/{id}")
    public Jogo atualiza(@Valid @RequestBody Jogo jogo, @PathVariable Long id){
        return jogoService.atualizaJogo(id, jogo);
    }

    @DeleteMapping("/{id}")
    public void deletarJogo(@PathVariable Long id){
        jogoService.deletarJogo(id);
    }
}

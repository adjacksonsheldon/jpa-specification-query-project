package com.sheldon.jpaspecificationqueryproject.controller;

import com.sheldon.jpaspecificationqueryproject.repository.UsuarioRepository;
import com.sheldon.jpaspecificationqueryproject.repository.entity.Usuario;
import com.sheldon.jpaspecificationqueryproject.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> consultarTodos(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/maior-de-idade")
    public List<Usuario> filtrar(@RequestParam(required = false) String nome){
        return usuarioService.filtrar(nome);
    }

    @PostMapping
    public Usuario incluir(@RequestBody Usuario usuario){
        return usuarioService.incluirOuAtualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        final var usuarioOptional = usuarioRepository.findById(id);

        usuarioOptional.ifPresent(usuarioRepository::delete);
    }

    @GetMapping("/{usuarioId}")
    public Usuario consultarUsuarioPorId(@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.consultarPorId(usuarioId);
    }
}
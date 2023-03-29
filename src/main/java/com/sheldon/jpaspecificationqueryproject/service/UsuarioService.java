package com.sheldon.jpaspecificationqueryproject.service;

import com.sheldon.jpaspecificationqueryproject.repository.UsuarioRepository;
import com.sheldon.jpaspecificationqueryproject.repository.entity.Usuario;
import com.sheldon.jpaspecificationqueryproject.repository.spec.MaiorDeIdade;
import com.sheldon.jpaspecificationqueryproject.repository.spec.NomeSemelhante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario incluirOuAtualizar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario consultarPorId(Long usuarioId){
        return usuarioRepository.findById(usuarioId).orElseThrow();
    }

    public List<Usuario> filtrar(String nome){

        if(isNull(nome)){
            return usuarioRepository.findAll(new MaiorDeIdade());
        }

        return usuarioRepository.findAll(new NomeSemelhante(nome).and(new MaiorDeIdade()));
    }
}
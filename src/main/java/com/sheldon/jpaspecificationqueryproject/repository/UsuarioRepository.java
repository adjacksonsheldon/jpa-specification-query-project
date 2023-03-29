package com.sheldon.jpaspecificationqueryproject.repository;

import com.sheldon.jpaspecificationqueryproject.repository.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario> {
}

package com.sheldon.jpaspecificationqueryproject.repository.spec;

import com.sheldon.jpaspecificationqueryproject.repository.entity.Usuario;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

@RequiredArgsConstructor
public class NomeSemelhante implements Specification<Usuario> {

    private final String nome;

    @Override
    public Predicate toPredicate(Root<Usuario> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.like(root.get("nome"), "%" + nome + "%");
    }
}
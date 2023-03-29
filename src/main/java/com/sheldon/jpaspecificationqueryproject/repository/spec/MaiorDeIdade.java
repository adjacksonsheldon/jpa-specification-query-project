package com.sheldon.jpaspecificationqueryproject.repository.spec;

import com.sheldon.jpaspecificationqueryproject.repository.entity.Usuario;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class MaiorDeIdade implements Specification<Usuario> {
    @Override
    public Predicate toPredicate(Root<Usuario> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.lessThanOrEqualTo(root.get("dataNascimento"), LocalDate.now().minusYears(18));
    }
}

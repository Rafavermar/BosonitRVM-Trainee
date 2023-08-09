package com.block14springsecurity.block14springsecurity.repository;



import com.block14springsecurity.block14springsecurity.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {
    Optional<PersonaEntity> findByUsuario(String usuario);

    boolean existsByName(String username);

    Optional<Object> findByName(String username);
}

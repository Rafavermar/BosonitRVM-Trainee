package com.jpacascade.jpacascade.repositories;

import com.jpacascade.jpacascade.Entities.LineasFra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineasFraRepository extends JpaRepository<LineasFra, Integer> { }
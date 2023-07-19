package com.block7crudvalidation.block7crudvalidation.Exception;

import com.block7crudvalidation.block7crudvalidation.Entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import org.springframework.http.HttpStatus;

public class PersonaNotFoundException extends ApplicationException {

    private static final String EXTERNAL_MESSAGE = "La persona con id: %s no existe.";

    public PersonaNotFoundException(int idPersona) {
        super(String.format(EXTERNAL_MESSAGE, idPersona), HttpStatus.NOT_FOUND);

    }
    public PersonaNotFoundException(String usuario) {
        super(String.format(EXTERNAL_MESSAGE, usuario), HttpStatus.NOT_FOUND);
    }
}

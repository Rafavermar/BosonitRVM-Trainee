package com.block7crudvalidation.block7crudvalidation.DTO.Input;

import com.block7crudvalidation.block7crudvalidation.Entities.PersonaEntity;
import com.block7crudvalidation.block7crudvalidation.Entities.ProfesorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Integer idStudent;
    private Integer idPersona;;
    private int numHoursWeek;
    private String comments;
    private Integer idProfesor;
    private String branch;
}

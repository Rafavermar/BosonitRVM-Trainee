package com.block14springsecurity.block14springsecurity.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentInputDto {
    private Integer idStudent;
    private Integer idPersona;;
    private int numHoursWeek;
    private String comments;
    private Integer idProfesor;
    private String branch;
}
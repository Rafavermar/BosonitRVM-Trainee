package com.block7crudvalidation.block7crudvalidation.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteSimpleDTO {
    private Integer idStudent;
    private int numHoursWeek;
    private String comments;
}
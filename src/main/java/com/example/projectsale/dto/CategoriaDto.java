package com.example.projectsale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto { //Dto = Data Transfer Object

    /*@Min(1)
    @Max(999)
    private Integer id;*/

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String description;

}

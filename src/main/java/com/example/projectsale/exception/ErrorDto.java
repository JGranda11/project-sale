package com.example.projectsale.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {
    private LocalDateTime dateTime;
    private String message;
    private String path;

}

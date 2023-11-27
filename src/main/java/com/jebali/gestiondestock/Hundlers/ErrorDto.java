package com.jebali.gestiondestock.Hundlers;

import com.jebali.gestiondestock.exception.ErrorCodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {
    private Integer httpcode;

    private ErrorCodes codes;

    private String message;

    private List<String> errors = new ArrayList<>();
}

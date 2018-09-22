package ru.artbmstu.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResultDTO {

    private String message = "";

    private Boolean success = true;
}

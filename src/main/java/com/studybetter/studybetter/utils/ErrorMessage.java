package com.studybetter.studybetter.utils;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessage {

    private String message;
    private LocalDateTime generatedAt;

}

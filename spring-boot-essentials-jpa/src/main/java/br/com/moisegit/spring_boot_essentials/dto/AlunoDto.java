package br.com.moisegit.spring_boot_essentials.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunoDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String email;
}

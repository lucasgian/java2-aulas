package com.chamada.professor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record DadosAtualizadoProfessor(
		@NotBlank @NotEmpty(message = "Precisa ter o id") String id,
		@NotBlank @NotEmpty(message = "Precisa ter o nome") String nome) {

}

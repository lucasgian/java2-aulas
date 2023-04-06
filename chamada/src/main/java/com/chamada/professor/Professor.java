package com.chamada.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "professores")
@Entity(name = "Professor")
public class Professor {

	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String nome;

	@OneToOne(mappedBy = "professor")
	private Turma turma;

	// private String disciplina;
	// private String turno;
    // private int cargaHoraria;
	//private boolean ensinoSuperior;
	
	// Construtor vazio, usado na listagem
	public Professor() {
		
	}
	
	// Construtor completo, usado na criação
	public Professor(DadosCadastroProfessor dados) {
		this.nome = dados.nome();
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Turma getTurma() {
		return turma;
	}
}

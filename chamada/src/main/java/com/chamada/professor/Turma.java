package com.chamada.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "turmas")
@Entity(name = "Turma")
public class Turma {
	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String periodo;
	private String nivel;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "professor_id")
	private Professor professor;
	

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}

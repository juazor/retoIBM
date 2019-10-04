package com.prueba.reto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pruebasumar")
public class PruebaSumar {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Integer num1;
	private Integer num2;
	private Integer resultado;
	
	@Column
	public Integer getNum1() {
		return num1;
	}
	
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	@Column
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	
	@Column
	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	

}

package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Metodos {	
	private Integer numero1;
	private Integer numero2;
	private Integer resultado;
	
	private String texto1;
	private String textoTransformado;
	
	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}	
	
	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public void somar() {
		this.resultado = this.numero1 + this.numero2;
	}
	
	public void subtrair() {
		this.resultado = this.numero1 - this.numero2;
	}
	
	public void multiplicar() {
		this.resultado = this.numero1 * this.numero2;
	}
	
	public void dividir() {
		this.resultado = this.numero1 / this.numero2;
	}

	public String getTexto1() {
		return texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public String getTextoTransformado() {
		return textoTransformado;
	}

	public void setTextoTransformado(String textoTransformado) {
		this.textoTransformado = textoTransformado;
	}
	
	public void tranformarMaiuscula() {
		this.textoTransformado = this.texto1.toUpperCase();
	}
	
	public void tranformarMinuscula() {
		this.textoTransformado = this.texto1.toLowerCase();
	}
	
	
}

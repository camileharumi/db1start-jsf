package br.com.db1.controller;

import java.text.DecimalFormat;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatarTexto {
	private String valor;
	private String valorFormatado;
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getValorFormatado() {
		return valorFormatado;
	}
	public void setValorFormatado(String valorFormatado) {
		this.valorFormatado = valorFormatado;
	}
	
	public void format() {
		Double tmp = Double.parseDouble(this.valor);
		DecimalFormat formatter = new DecimalFormat("#,###.00");

		this.valorFormatado = formatter.format(tmp);
	}
}

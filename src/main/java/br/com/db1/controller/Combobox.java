package br.com.db1.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Combobox {
	private List<String> valores;
	private String selectedValue;
	private Uf uf = Uf.RS;
	private Genero genero;

	public Uf[] getListaUf() {
		return uf.values();
	}

	public Uf getUf() {
		return uf;
	}
	
	public Genero[] getListaGeneros() {
		return genero.values();
	}

	public Genero getGenero() {
		return genero;
	}

	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

	public List<String> getValores() {
		return valores;
	}

	public void setValores(List<String> valores) {
		this.valores = valores;
	}

}

package com.organizemymoney.ris.Models;

import jakarta.persistence.*;

@Entity
public class Strosek {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	private int znesek;
	private String opomba;

	/**
	 * @param naziv
	 *
	 *
	 *
	 */
	public void dodajKategorijo(String naziv) {
		// TODO - implement Strosek.dodajKategorijo
		throw new UnsupportedOperationException();
	}

	public Long getId() {
		return id;
	}

	public int getZnesek() {
		return znesek;
	}

	public String getOpomba() {
		return opomba;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setZnesek(int znesek) {
		this.znesek = znesek;
	}

	public void setOpomba(String opomba) {
		this.opomba = opomba;
	}
}
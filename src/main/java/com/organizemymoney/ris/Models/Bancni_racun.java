package com.organizemymoney.ris.Models;
import jakarta.persistence.*;

@Entity
public class Bancni_racun {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;
	private int stanje;


	public void setId(int id) {
		this.id = id;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	public int getId() {
		return id;
	}

	public int getStanje() {
		return stanje;
	}
}
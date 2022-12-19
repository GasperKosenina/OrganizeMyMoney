package com.organizemymoney.ris.Models;
import jakarta.persistence.*;

@Entity
public class Bancni_racun {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	private int stanje;



	@OneToOne(mappedBy = "bancni_racun")



	public void setId(Long id) {
		this.id = id;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	public Long getId() {
		return id;
	}

	public int getStanje() {
		return stanje;
	}
}
package com.organizemymoney.ris.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Uporabnik {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	private String ime;
	private String priimek;
	private String telefonska_stevilka;
	private String email;

	@ElementCollection
	@OneToMany(mappedBy = "", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Strosek> uporabikoviStroski = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bancni_racun_id", referencedColumnName = "id")
	private Bancni_racun bancni_racun;

	public void setBancni_racun(Bancni_racun bancni_racun) {
		this.bancni_racun = bancni_racun;
	}

	public Bancni_racun getBancni_racun() {
		return bancni_racun;
	}

	public Long getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	public String getPriimek() {
		return priimek;
	}

	public String getTelefonska_stevilka() {
		return telefonska_stevilka;
	}

	public String getEmail() {
		return email;
	}

	public List<Strosek> getUporabikoviStroski() {
		return uporabikoviStroski;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public void setTelefonska_stevilka(String telefonska_stevilka) {
		this.telefonska_stevilka = telefonska_stevilka;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUporabikoviStroski(List<Strosek> uporabikoviStroski) {
		this.uporabikoviStroski = uporabikoviStroski;
	}

	/**
	 * 
	 * @param znesek
	 * @param naziv
	 * @param kategorija
	 */
	public void dodajStrosek(double znesek, String naziv, Kategorija kategorija) {
		// TODO - implement Uporabnik.dodajStro�ek
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param znesek
	 */
	public void nastaviProracun(double znesek) {
		// TODO - implement Uporabnik.nastaviProracun
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void dodajBancniracun(int id) {
		// TODO - implement Uporabnik.dodajBancniracun
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param znesek
	 */
	public void dodajPrihodek(double znesek) {
		// TODO - implement Uporabnik.dodajPrihodek
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param bancniRacun
	 */
	public double preglejBancniRacun(Bancni_racun bancniRacun) {
		// TODO - implement Uporabnik.preglejBancniRacun
		throw new UnsupportedOperationException();
	}

}
package com.pasvak.asevi.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "yemek_dagitim_bilgi")
public class Delivery {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private int ekmekSayisi;

	@Basic
	@Column(name = "EKMEK_SAYISI")
	public int getEkmekSayisi() {
		return ekmekSayisi;
	}

	public void setEkmekSayisi(int ekmekSayisi) {
		this.ekmekSayisi = ekmekSayisi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@OneToOne
	@MapsId

	private Needy ihtiyac_sahibi;
	@OneToOne
	@MapsId

	private LunchBoxSize boyut;
	@OneToOne
	@MapsId

	private District bolge;
	
	

}

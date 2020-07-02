package com.pasvak.asevi.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "bolge")
public class District {
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	private String bolgeAdi;
	@Basic
	@Column(name = "BOLGE_ADI")
	public String getBolgeAdi() {
		return bolgeAdi;
	}

	public void setBolgeAdi(String bolgeAdi) {
		this.bolgeAdi = bolgeAdi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;

	}
	@OneToOne(mappedBy = "bolge", cascade = CascadeType.ALL)
	private Delivery delivery;
}

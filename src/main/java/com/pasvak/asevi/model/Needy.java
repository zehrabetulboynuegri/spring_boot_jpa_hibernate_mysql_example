package com.pasvak.asevi.model;

import java.io.Serializable;

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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ihtiyac_sahibi")

public class Needy {

	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "TC")
	@NotNull
	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	@Basic
	@NotNull
	@Column(name = "ADI")
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Basic
	@NotNull
	@Column(name = "SOYADI")
	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	@Basic
	@NotNull
	@Column(name = "KISI_SAYISI")
	public int getKisiSayisi() {
		return kisiSayisi;
	}

	public void setKisiSayisi(int kisiSayisi) {
		this.kisiSayisi = kisiSayisi;
	}

	@Basic
	@NotNull
	@Column(name = "IKAMET_ADR")
	public String getIkametAdr() {
		return ikametAdr;
	}

	public void setIkametAdr(String ikametAdr) {
		this.ikametAdr = ikametAdr;
	}

	@Basic
	@NotNull
	@Column(name = "DAGITIM_ADR")
	public String getDagitimAdr() {
		return dagitimAdr;
	}

	public void setDagitimAdr(String yemekAdr) {
		this.dagitimAdr = yemekAdr;
	}

	@Basic
	@Column(name = "DAGITIM_ADR_LAT_LON")
	public String getDagitimAdrLatLon() {
		return dagitimAdrLatLon;
	}

	public void setDagitimAdrLatLon(String dagitimAdrLatLon) {
		this.dagitimAdrLatLon = dagitimAdrLatLon;
	}

	private String kimlikNo;
	private String isim;
	private String soyisim;
	private int kisiSayisi;
	private String ikametAdr;
	private String dagitimAdr; // yemekAlacagiLokasyon
	private String dagitimAdrLatLon;
private String durum;
@Basic
@Column(name = "DURUM")
	public String getDurum() {
	return durum;
}

public void setDurum(String durum) {
	this.durum = durum;
}
@OneToOne(mappedBy = "ihtiyac_sahibi", cascade = CascadeType.ALL)
private Vote vote;
	@OneToOne(mappedBy = "ihtiyac_sahibi", cascade = CascadeType.ALL)
	private Delivery delivery;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "durum_id", referencedColumnName = "id")
    private Situation durum_id;
	
	 
}

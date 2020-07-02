package com.pasvak.asevi.model;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "soru")
public class Question {
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

	public String getSoruAlanı() {
		return soruAlanı;
	}

	public void setSoruAlanı(String soruAlanı) {
		this.soruAlanı = soruAlanı;
	}

	@Basic
	@Column(name = "SORU_ALANI")
	private String soruAlanı;

	
	
	
	 @OneToMany(mappedBy="question")
	    private Set<Answer> answers;
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "durum_id", referencedColumnName = "id")
	    private Survey durum_id;
}

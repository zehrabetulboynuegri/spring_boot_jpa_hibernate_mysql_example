package com.pasvak.asevi.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cevap")
public class Answer {

	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
public Answer() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String secenekMetni;

	@Basic
	@Column(name = "SECENEK_METNİ")
	public String getSecenekMetni() {
		return secenekMetni;
	}

	public void setSecenekMetni(String secenekMetni) {
		this.secenekMetni = secenekMetni;
	}
	@OneToOne(mappedBy = "cevap", cascade = CascadeType.ALL)
	private Vote vote;
	@ManyToOne
    @JoinColumn(name="soru_id", nullable=false)
    private Question question;
	
}
package com.fadas.cadastroSpring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "td_user")
@Data
@Builder
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")

	private String name;
	@Column(name = "email")

	private String email;
	@Column(name = "senha")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "wallet_id")
	private Wallet wallet;

}

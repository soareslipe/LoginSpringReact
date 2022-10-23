package com.fadas.cadastroSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fadas.cadastroSpring.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

}


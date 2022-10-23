package com.fadas.cadastroSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fadas.cadastroSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

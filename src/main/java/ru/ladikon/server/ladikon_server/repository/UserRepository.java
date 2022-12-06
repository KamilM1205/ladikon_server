package ru.ladikon.server.ladikon_server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.ladikon.server.ladikon_server.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByPhone(String phone);
}

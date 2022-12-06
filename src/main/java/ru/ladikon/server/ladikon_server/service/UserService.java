package ru.ladikon.server.ladikon_server.service;

import ru.ladikon.server.ladikon_server.model.User;

public interface UserService {
  boolean create(User user);

  User read(int id);

  boolean exists(int id);

  boolean update(User user, int id);

  boolean delete(int id);
}

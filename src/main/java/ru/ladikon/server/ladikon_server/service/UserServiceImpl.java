package ru.ladikon.server.ladikon_server.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.ladikon.server.ladikon_server.model.User;
import ru.ladikon.server.ladikon_server.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public boolean create(User user) {
    if (userRepository.findByPhone(user.getPhone()).isEmpty()) {
      user.setRegistrationDate(new Date());

      try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        user.setPassword(
            new String(md.digest(user.getPassword().getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8));
      } catch (NoSuchAlgorithmException e) {
        System.out.println(e.toString());

        return false;
      }

      userRepository.save(user);

      return true;
    }

    return false;
  }

  @Override
  public User read(int id) {
    return userRepository.findById(id).get();
  }

  @Override
  public boolean exists(int id) {
    return userRepository.existsById(id);
  }

  @Override
  public boolean update(User user, int id) {
    if (userRepository.existsById(id)) {
      user.setId(id);
      userRepository.save(user);
      return true;
    }

    return false;
  }

  @Override
  public boolean delete(int id) {
    if (userRepository.existsById(id)) {
      userRepository.deleteById(id);
      return true;
    }

    return false;
  }
}

package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.NamesForm;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

  @Autowired
  private UsersRepository usersRepository;

  @Override
  public List<User> getUsers(String orderBy) {
    switch (orderBy) {
      case "registration_date": return usersRepository.findByOrderByRegistrationTimeDesc();
      case "id": return usersRepository.findByOrderById();
      case "name": return usersRepository.findByOrderByName();
    }
    return usersRepository.findAll();
  }
  @Override
  public User getUser(Long userId) {
    return usersRepository.findOne(userId);
  }

  @Override
  public void update(Long userId, NamesForm form) {
    User user = usersRepository.findOne(userId);
    form.update(user);
    usersRepository.save(user);
  }
}
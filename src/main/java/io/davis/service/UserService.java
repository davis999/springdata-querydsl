package io.davis.service;

import io.davis.entity.User;
import io.davis.predicate.UserPredicate;
import io.davis.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Davis on 17/1/3.
 */
@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public User createUser(User user) {
    return repository.save(user);
  }

  public User getUserByName(String name) {
    return repository.findOne(UserPredicate.getByName(name));
  }
}

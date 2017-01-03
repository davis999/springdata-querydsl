package io.davis.repository;

import io.davis.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Davis on 17/1/3.
 */
public interface UserRepository extends JpaRepository<User, Integer>,
    QueryDslPredicateExecutor<User>{
}

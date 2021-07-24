package com.lodging.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lodging.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

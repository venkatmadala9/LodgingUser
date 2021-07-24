package com.lodging.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lodging.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

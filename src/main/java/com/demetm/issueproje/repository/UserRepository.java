package com.demetm.issueproje.repository;

import com.demetm.issueproje.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


}

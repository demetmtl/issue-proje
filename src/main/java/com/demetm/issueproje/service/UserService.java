package com.demetm.issueproje.service;

import com.demetm.issueproje.entity.Issue;
import com.demetm.issueproje.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable); //sayfa göster

    User getByUsername(String username);

}

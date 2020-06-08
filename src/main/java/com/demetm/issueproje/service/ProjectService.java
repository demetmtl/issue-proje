package com.demetm.issueproje.service;

import com.demetm.issueproje.entity.Issue;
import com.demetm.issueproje.entity.Project;
import com.demetm.issueproje.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable); //sayfa göster

    Boolean delete(Project project);

}

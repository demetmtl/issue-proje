package com.demetm.issueproje.service;

import com.demetm.issueproje.dto.ProjectDto;
import com.demetm.issueproje.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable); //sayfa göster

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}

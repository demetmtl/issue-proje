package com.demetm.issueproje.service;

import com.demetm.issueproje.dto.IssueDto;
import com.demetm.issueproje.util.TPage;
import org.springframework.data.domain.Pageable;



public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable); //sayfa göster

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);
}

package com.demetm.issueproje.service;

import com.demetm.issueproje.dto.IssueDto;
import com.demetm.issueproje.util.Tpage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    Tpage<IssueDto> getAllPageable(Pageable pageable); //sayfa göster

    Boolean delete(IssueDto issue);

}

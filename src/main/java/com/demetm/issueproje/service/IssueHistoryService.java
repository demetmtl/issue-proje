package com.demetm.issueproje.service;

import com.demetm.issueproje.entity.Issue;
import com.demetm.issueproje.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable); //sayfa göster

    Boolean delete(IssueHistory issueHistory);

}

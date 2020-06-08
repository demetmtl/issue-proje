package com.demetm.issueproje.repository;

import com.demetm.issueproje.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}

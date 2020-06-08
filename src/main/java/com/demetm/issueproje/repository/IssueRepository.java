package com.demetm.issueproje.repository;

import com.demetm.issueproje.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by temelt on 3.02.2019.
 */
public interface IssueRepository extends JpaRepository<Issue, Long> {

}

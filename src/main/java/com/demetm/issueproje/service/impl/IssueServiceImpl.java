package com.demetm.issueproje.service.impl;

import com.demetm.issueproje.dto.IssueDto;
import com.demetm.issueproje.entity.Issue;
import com.demetm.issueproje.repository.IssueRepository;
import com.demetm.issueproje.service.IssueService;
import com.demetm.issueproje.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;


    public IssueServiceImpl (IssueRepository issueRepository, ModelMapper modelMapper){

        this.issueRepository = issueRepository;
        this. modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate()==null)
            throw new IllegalArgumentException("Issue Date cannot be null!");

            Issue issueDb = modelMapper.map(issue, Issue.class);


        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {

        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(Long issueId) {
        issueRepository.deleteById(issueId);

        return true;
    }

    @Override
    public IssueDto update(Long id, IssueDto project) {
        return null;
    }


}

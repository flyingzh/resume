package com.zf.resume.service.impl;

import com.zf.resume.mapper.ResumeRepository;
import com.zf.resume.pojo.Resume;
import com.zf.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;


    @Override
    public List<Resume> queryResumeList() {
        return resumeRepository.findAll();
    }

    @Override
    public Resume addResume(Resume re) {
        Resume resume = resumeRepository.save(re);
        return resume;
    }

    @Override
    public Resume updateResume(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public void deleteResume(String id) {
        resumeRepository.deleteById(Long.parseLong(id));
    }

    @Override
    public Resume findResume(String id) {
        Optional<Resume> byId = resumeRepository.findById(Long.parseLong(id));
        return byId.get();
    }
}

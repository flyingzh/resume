package com.zf.resume.service;

import com.zf.resume.pojo.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> queryResumeList();

    Resume addResume(Resume re);

    Resume updateResume(Resume resume);

    void deleteResume(String id);

    Resume findResume(String id);
}

package com.zf.resume.mapper;

import com.zf.resume.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {

}

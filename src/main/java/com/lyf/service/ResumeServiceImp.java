package com.lyf.service;

import com.lyf.mapper.ResumeMapper;
import com.lyf.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fangjiejie on 2018/6/28.
 */
@Service
public class ResumeServiceImp {
    @Autowired
    ResumeMapper resumeMapper;
    public Resume updateResume(Resume resume){
        if(resume.getRid()==null){
            resumeMapper.insert(resume);
        }else{
            resumeMapper.updateByPrimaryKey(resume);
        }
        return resume;
    }
    public Resume findResumeByUid(int uid){
       return resumeMapper.selectByUid(uid);
    }
}

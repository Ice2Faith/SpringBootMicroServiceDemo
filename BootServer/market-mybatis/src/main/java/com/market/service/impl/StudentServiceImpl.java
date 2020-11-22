package com.market.service.impl;

import com.market.dao.IStudentDao;
import com.market.model.Student;
import com.market.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAll();
    }
}

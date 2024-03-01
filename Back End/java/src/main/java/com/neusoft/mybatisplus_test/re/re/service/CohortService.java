package com.neusoft.mybatisplus_test.re.service;

import com.neusoft.mybatisplus_test.re.entity.Cohort;
import com.neusoft.mybatisplus_test.re.mapper.CohortMapper;
import com.neusoft.mybatisplus_test.re.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CohortService {
    @Autowired
    CohortMapper cohortMapper;

    public List<Cohort> selectAllCohort(){return cohortMapper.selectAllCohort();}

    public List<Cohort> selectCohortOwner(int cohort_owner){return cohortMapper.selectCohortOwner(cohort_owner);}

    public Cohort selectCohort(int cohort_id){return cohortMapper.selectCohort(cohort_id);}

    public void insertCohort(Cohort cohort){cohortMapper.insertCohort(cohort);}

    public void updateCohort(Cohort cohort){cohortMapper.updateCohort(cohort);}

    public void deteleCohort(int cohort_id){cohortMapper.deleteCohort(cohort_id);}

    public void updateCohortOwner(int cohort_id, int cohort_owner){cohortMapper.updateCohortOwner(cohort_id,cohort_owner);}
}
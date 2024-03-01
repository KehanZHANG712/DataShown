package com.neusoft.mybatisplus_test.re.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.mybatisplus_test.re.entity.Cohort;
import com.neusoft.mybatisplus_test.re.entity.User;
import com.neusoft.mybatisplus_test.re.service.CohortService;
import com.neusoft.mybatisplus_test.re.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@RestController
@RequestMapping("/re/cohort")
public class CohortController {

    @Autowired
    CohortService cohortService;

    @RequestMapping("selectAllCohort")
    @CrossOrigin
    public List<Cohort> selectAllCohort() {
        //  String userPassword = jsonObject.getString("userPassword");
        return cohortService.selectAllCohort();

    }

    @PostMapping("selectCohort")
    @CrossOrigin
    public Cohort selectCohort(@RequestBody JSONObject jsonObject) {
        int cohort_id = Integer.parseInt(jsonObject.getString("cohort_id"));
        return cohortService.selectCohort(cohort_id);

    }

    @PostMapping("insertCohort")
    @CrossOrigin
    public void insertCohort(@RequestBody JSONObject jsonObject) {
        String cohortTitle = jsonObject.getString("cohortTitle");
        String cohortTags = jsonObject.getString("cohortTags");
        String cohortWebLink = jsonObject.getString("cohortWebLink");
        String cohortIntroducton = jsonObject.getString("cohortIntroducton");
        String cohortFunding = jsonObject.getString("cohortFunding");
        String cohortKeyPublication = jsonObject.getString("cohortKeyPublication");
        String cohortParticipants1 = jsonObject.getString("cohortParticipants");
        Integer cohortParticipants = 0;
        if(cohortParticipants1 != null){
            cohortParticipants = Integer.parseInt(cohortParticipants1);
        }

        String cohortMparticipants1 = jsonObject.getString("cohortMparticipants");
        Integer cohortMparticipants = 0;
        if(cohortMparticipants1 != null){
            cohortMparticipants = Integer.parseInt(cohortMparticipants1);
        }

        String cohortFparticipants1 = jsonObject.getString("cohortFparticipants");
        Integer cohortFparticipants = 0;
        if(cohortFparticipants1 != null){
            cohortFparticipants = Integer.parseInt(cohortFparticipants1);
        }

        String cohortMean1 = jsonObject.getString("cohortMean");
        Integer cohortMean = 0;
        if(cohortMean1 != null){
            cohortMean = Integer.parseInt(cohortMean1);
        }

        String cohort201 = jsonObject.getString("cohort20");
        Integer cohort20 = 0;
        if(cohort201 != null){
            cohort20 = Integer.parseInt(cohort201);
        }

        String cohort20391 = jsonObject.getString("cohort2039");
        Integer cohort2039 = 0;
        if(cohort20391 != null){
            cohort2039 = Integer.parseInt(cohort20391);
        }

        String cohort40591 = jsonObject.getString("cohort4059");
        Integer cohort4059 = 0;
        if(cohort40591 != null){
            cohort4059 = Integer.parseInt(cohort40591);
        }

        String cohort601 = jsonObject.getString("cohort60");
        Integer cohort60 = 0;
        if(cohort601 != null){
            cohort60 = Integer.parseInt(cohort601);
        }

        String cohortSource = jsonObject.getString("cohortSource");

        String cohortStartyear1 = jsonObject.getString("cohortStartyear");
        Integer cohortStartyear = 0;
        if(cohortStartyear1 != null){
            cohortStartyear = Integer.parseInt(cohortStartyear1);
        }

        String cohortRecentyear1 = jsonObject.getString("cohortRecentyear");
        Integer cohortRecentyear = 0;
        if(cohortRecentyear1 != null){
            cohortRecentyear = Integer.parseInt(cohortRecentyear1);
        }

        String cohortAvayears = jsonObject.getString("cohortAvayears");

        String cohortNumfollow1 = jsonObject.getString("cohortNumfollow");
        Integer cohortNumfollow = 0;
        if(cohortNumfollow1 != null){
            cohortNumfollow = Integer.parseInt(cohortNumfollow1);
        }

        String cohortWithdraw1 = jsonObject.getString("cohortWithdraw");
        Integer cohortWithdraw = 0;
        if(cohortWithdraw1 != null){
            cohortWithdraw = Integer.parseInt(cohortWithdraw1);
        }

        String cohortLost1 = jsonObject.getString("cohortLost");
        Integer cohortLost = 0;
        if(cohortLost1 != null){
            cohortLost = Integer.parseInt(cohortLost1);
        }

        String cohortDecrease1 = jsonObject.getString("cohortDecrease");
        Integer cohortDecrease = 0;
        if(cohortDecrease1 != null){
            cohortDecrease = Integer.parseInt(cohortDecrease1);
        }

        String cohortComplete1 = jsonObject.getString("cohortComplete");
        Integer cohortComplete = 0;
        if(cohortComplete1 != null){
            cohortComplete = Integer.parseInt(cohortComplete1);
        }

        String cohortTimephase = jsonObject.getString("cohortTimephase");
        String cohortAnthropometrics = jsonObject.getString("cohortAnthropometrics");
        String cohortLifestyle = jsonObject.getString("cohortLifestyle");
        String cohortHealth = jsonObject.getString("cohortHealth");

        String cohortOwner1 = jsonObject.getString("cohortOwner");
        Integer cohortOwner = 0;
        if(cohortOwner1 != null){
            cohortOwner = Integer.parseInt(cohortOwner1);
        }
        Cohort cohort =  new Cohort(cohortTitle,cohortTags,cohortWebLink,cohortIntroducton,cohortFunding,cohortKeyPublication,cohortParticipants,cohortMparticipants,cohortFparticipants,cohortMean,cohort20,cohort2039,cohort4059,cohort60,cohortSource,cohortStartyear,cohortRecentyear,cohortAvayears,cohortNumfollow,cohortWithdraw,cohortLost,cohortDecrease,cohortComplete,cohortTimephase,cohortAnthropometrics,cohortLifestyle,cohortHealth,cohortOwner);
        System.out.println(cohortTitle);
        System.out.println(cohort);
        cohortService.insertCohort(cohort);

    }

    @PostMapping("updateCohort")
    @CrossOrigin
    public void updateCohort(@RequestBody JSONObject jsonObject) {
        Integer cohortId = Integer.parseInt(jsonObject.getString("cohortId"));
        String cohortTitle = jsonObject.getString("cohortTitle");
        String cohortTags = jsonObject.getString("cohortTags");
        String cohortWebLink = jsonObject.getString("cohortWebLink");
        String cohortIntroducton = jsonObject.getString("cohortIntroducton");
        String cohortFunding = jsonObject.getString("cohortFunding");
        String cohortKeyPublication = jsonObject.getString("cohortKeyPublication");
        String cohortParticipants1 = jsonObject.getString("cohortParticipants");
        Integer cohortParticipants = 0;
        if(cohortParticipants1 != null){
            cohortParticipants = Integer.parseInt(cohortParticipants1);
        }

        String cohortMparticipants1 = jsonObject.getString("cohortMparticipants");
        Integer cohortMparticipants = 0;
        if(cohortMparticipants1 != null){
            cohortMparticipants = Integer.parseInt(cohortMparticipants1);
        }

        String cohortFparticipants1 = jsonObject.getString("cohortFparticipants");
        Integer cohortFparticipants = 0;
        if(cohortFparticipants1 != null){
            cohortFparticipants = Integer.parseInt(cohortFparticipants1);
        }

        String cohortMean1 = jsonObject.getString("cohortMean");
        Integer cohortMean = 0;
        if(cohortMean1 != null){
            cohortMean = Integer.parseInt(cohortMean1);
        }

        String cohort201 = jsonObject.getString("cohort20");
        Integer cohort20 = 0;
        if(cohort201 != null){
            cohort20 = Integer.parseInt(cohort201);
        }

        String cohort20391 = jsonObject.getString("cohort2039");
        Integer cohort2039 = 0;
        if(cohort20391 != null){
            cohort2039 = Integer.parseInt(cohort20391);
        }

        String cohort40591 = jsonObject.getString("cohort4059");
        Integer cohort4059 = 0;
        if(cohort40591 != null){
            cohort4059 = Integer.parseInt(cohort40591);
        }

        String cohort601 = jsonObject.getString("cohort60");
        Integer cohort60 = 0;
        if(cohort601 != null){
            cohort60 = Integer.parseInt(cohort601);
        }

        String cohortSource = jsonObject.getString("cohortSource");

        String cohortStartyear1 = jsonObject.getString("cohortStartyear");
        Integer cohortStartyear = 0;
        if(cohortStartyear1 != null){
            cohortStartyear = Integer.parseInt(cohortStartyear1);
        }

        String cohortRecentyear1 = jsonObject.getString("cohortRecentyear");
        Integer cohortRecentyear = 0;
        if(cohortRecentyear1 != null){
            cohortRecentyear = Integer.parseInt(cohortRecentyear1);
        }

        String cohortAvayears = jsonObject.getString("cohortAvayears");

        String cohortNumfollow1 = jsonObject.getString("cohortNumfollow");
        Integer cohortNumfollow = 0;
        if(cohortNumfollow1 != null){
            cohortNumfollow = Integer.parseInt(cohortNumfollow1);
        }

        String cohortWithdraw1 = jsonObject.getString("cohortWithdraw");
        Integer cohortWithdraw = 0;
        if(cohortWithdraw1 != null){
            cohortWithdraw = Integer.parseInt(cohortWithdraw1);
        }

        String cohortLost1 = jsonObject.getString("cohortLost");
        Integer cohortLost = 0;
        if(cohortLost1 != null){
            cohortLost = Integer.parseInt(cohortLost1);
        }

        String cohortDecrease1 = jsonObject.getString("cohortDecrease");
        Integer cohortDecrease = 0;
        if(cohortDecrease1 != null){
            cohortDecrease = Integer.parseInt(cohortDecrease1);
        }

        String cohortComplete1 = jsonObject.getString("cohortComplete");
        Integer cohortComplete = 0;
        if(cohortComplete1 != null){
            cohortComplete = Integer.parseInt(cohortComplete1);
        }

        String cohortTimephase = jsonObject.getString("cohortTimephase");
        String cohortAnthropometrics = jsonObject.getString("cohortAnthropometrics");
        String cohortLifestyle = jsonObject.getString("cohortLifestyle");
        String cohortHealth = jsonObject.getString("cohortHealth");

        String cohortOwner1 = jsonObject.getString("cohortOwner");
        Integer cohortOwner = 0;
        if(cohortOwner1 != null){
            cohortOwner = Integer.parseInt(cohortOwner1);
        }
        Cohort cohort = new Cohort(cohortId,cohortTitle,cohortTags,cohortWebLink,cohortIntroducton,cohortFunding,cohortKeyPublication,cohortParticipants,cohortMparticipants,cohortFparticipants,cohortMean,cohort20,cohort2039,cohort4059,cohort60,cohortSource,cohortStartyear,cohortRecentyear,cohortAvayears,cohortNumfollow,cohortWithdraw,cohortLost,cohortDecrease,cohortComplete,cohortTimephase,cohortAnthropometrics,cohortLifestyle,cohortHealth,cohortOwner);
        System.out.println(cohort);
        cohortService.updateCohort(cohort);

    }

    @PostMapping("deleteCohort")
    @CrossOrigin
    public void deleteCohort(@RequestBody JSONObject jsonObject) {
        Integer cohortId = Integer.parseInt(jsonObject.getString("cohortId"));
        cohortService.deteleCohort(cohortId);

    }

    @PostMapping("updateCohortOwner")
    @CrossOrigin
    public void updateCohortOwner(@RequestBody JSONObject jsonObject) {
        Integer cohortOwner = Integer.parseInt(jsonObject.getString("cohortOwner"));
        Integer cohortId = Integer.parseInt(jsonObject.getString("cohortId"));
        cohortService.updateCohortOwner(cohortId,cohortOwner);

    }

    @PostMapping("selectCohortOwner")
    @CrossOrigin
    public List<Cohort> selectCohortOwner(@RequestBody JSONObject jsonObject) {
        Integer cohortOwner = Integer.parseInt(jsonObject.getString("cohortOwner"));
        return cohortService.selectCohortOwner(cohortOwner);

    }



}

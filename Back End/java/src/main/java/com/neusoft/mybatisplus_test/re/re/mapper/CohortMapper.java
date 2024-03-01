package com.neusoft.mybatisplus_test.re.mapper;

import com.neusoft.mybatisplus_test.re.entity.Cohort;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neusoft.mybatisplus_test.re.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.neusoft.mybatisplus_test.re.entity.Cohort;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whh
 * @since 2022-09-12
 */
@Mapper
@Repository("CohortMapper")
public interface CohortMapper  {
    @Update("update cohort set cohort_title=#{cohortTitle}, cohort_tags=#{cohortTags}, cohort_web_link=#{cohortWebLink}, cohort_introducton=#{cohortIntroducton}, cohort_funding=#{cohortFunding}, cohort_key_publication=#{cohortKeyPublication}, cohort_participants=#{cohortParticipants}, cohort_mparticipants=#{cohortMparticipants}, cohort_fparticipants=#{cohortFparticipants}, cohort_mean=#{cohortMean}, cohort_20=#{cohort20}, cohort_2039=#{cohort2039}, cohort_4059=#{cohort4059}, cohort_60=#{cohort60}, cohort_source=#{cohortSource}, cohort_startyear=#{cohortStartyear}, cohort_recentyear=#{cohortRecentyear}, cohort_numfollow=#{cohortNumfollow}, cohort_avayears=#{cohortAvayears}, cohort_withdraw=#{cohortWithdraw}, cohort_lost=#{cohortLost}, cohort_decrease=#{cohortDecrease}, cohort_complete=#{cohortComplete}, cohort_timephase=#{cohortTimephase}, cohort_anthropometrics=#{cohortAnthropometrics}, cohort_lifestyle=#{cohortLifestyle}, cohort_health=#{cohortHealth}, cohort_owner=#{cohortOwner} " +
            "where cohort_id=#{cohortId}")
    void updateCohort(Cohort cohort);

    @Update("update cohort set cohort_owner=#{cohortOwner} " +
            "where cohort_id=#{cohortId}")
    void updateCohortOwner(int cohort_id, int cohort_owner);


    @Select("select * from cohort")
    List<Cohort> selectAllCohort();

    @Select("select * from cohort where cohort_id=#{cohortId}")
    Cohort selectCohort(int cohort_id);

    @Select("select * from cohort where cohort_owner=#{cohortOwner}")
    List<Cohort> selectCohortOwner(int cohort_owner);

    @Insert("insert into cohort(cohort_title,cohort_tags,cohort_web_link,cohort_introducton,cohort_funding,cohort_key_publication,cohort_participants,cohort_mparticipants,cohort_fparticipants,cohort_mean,cohort_20,cohort_2039,cohort_4059,cohort_60,cohort_source,cohort_startyear,cohort_recentyear,cohort_avayears,cohort_numfollow,cohort_withdraw,cohort_lost,cohort_decrease,cohort_complete,cohort_timephase,cohort_anthropometrics,cohort_lifestyle,cohort_health,cohort_owner)" +
            "values(#{cohortTitle},#{cohortTags},#{cohortWebLink},#{cohortIntroducton},#{cohortFunding},#{cohortKeyPublication},#{cohortParticipants},#{cohortMparticipants},#{cohortFparticipants},#{cohortMean},#{cohort20},#{cohort2039},#{cohort4059},#{cohort60},#{cohortSource},#{cohortStartyear},#{cohortRecentyear},#{cohortAvayears},#{cohortNumfollow},#{cohortWithdraw},#{cohortLost},#{cohortDecrease},#{cohortComplete},#{cohortTimephase},#{cohortAnthropometrics},#{cohortLifestyle},#{cohortHealth},#{cohortOwner})")
    void insertCohort(Cohort cohort);

    @Delete("delete from cohort where cohort_id = #{cohortId}")
    void deleteCohort(int cohort_id);

}
package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.GradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    long countByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int deleteByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int insert(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int insertSelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    List<Grade> selectByExampleWithBLOBs(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    List<Grade> selectByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    Grade selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Grade record, @Param("example") GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByPrimaryKeySelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade
     *
     * @mbg.generated Mon Jun 25 16:38:06 CST 2018
     */
    int updateByPrimaryKey(Grade record);
}
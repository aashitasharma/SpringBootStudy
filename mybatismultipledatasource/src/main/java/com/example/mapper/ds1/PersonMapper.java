package com.example.mapper.ds1;

import com.example.pojo.Person;
import org.springframework.stereotype.Component;

@Component("personMapper")
public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    Person selectByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Person record);
}
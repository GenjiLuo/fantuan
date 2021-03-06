package com.eeeya.fantuan.server.mapper;

import com.eeeya.fantuan.server.domain.YfTableJoin;
import com.eeeya.fantuan.server.domain.YfTableJoinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YfTableJoinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int countByExample(YfTableJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int deleteByExample(YfTableJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int insert(YfTableJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int insertSelective(YfTableJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    List<YfTableJoin> selectByExample(YfTableJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    YfTableJoin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YfTableJoin record, @Param("example") YfTableJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YfTableJoin record, @Param("example") YfTableJoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YfTableJoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_join
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YfTableJoin record);
}
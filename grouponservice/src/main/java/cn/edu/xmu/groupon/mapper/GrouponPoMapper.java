package cn.edu.xmu.groupon.mapper;

import cn.edu.xmu.groupon.model.po.GrouponPo;
import cn.edu.xmu.groupon.model.po.GrouponPoExample;
import java.util.List;

public interface GrouponPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    int insert(GrouponPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    int insertSelective(GrouponPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    List<GrouponPo> selectByExample(GrouponPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    GrouponPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GrouponPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GrouponPo record);
}
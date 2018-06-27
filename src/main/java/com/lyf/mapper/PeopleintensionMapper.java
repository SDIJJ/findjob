package com.lyf.mapper;

import com.lyf.model.Peopleintension;
import com.lyf.model.PeopleintensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PeopleintensionMapper {
    @SelectProvider(type=PeopleintensionSqlProvider.class, method="countByExample")
    int countByExample(PeopleintensionExample example);

    @DeleteProvider(type=PeopleintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(PeopleintensionExample example);

    @Delete({
        "delete from peopleintension",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    @Insert({
        "insert into peopleintension (pid, xueliWeight, ",
        "workexpWeight, aid, ",
        "username)",
        "values (#{pid,jdbcType=INTEGER}, #{xueliweight,jdbcType=INTEGER}, ",
        "#{workexpweight,jdbcType=INTEGER}, #{aid,jdbcType=INTEGER}, ",
        "#{username,jdbcType=VARCHAR})"
    })
    int insert(Peopleintension record);

    @InsertProvider(type=PeopleintensionSqlProvider.class, method="insertSelective")
    int insertSelective(Peopleintension record);

    @SelectProvider(type=PeopleintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliWeight", property="xueliweight", jdbcType=JdbcType.INTEGER),
        @Result(column="workexpWeight", property="workexpweight", jdbcType=JdbcType.INTEGER),
        @Result(column="aid", property="aid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Peopleintension> selectByExample(PeopleintensionExample example);

    @Select({
        "select",
        "pid, xueliWeight, workexpWeight, aid, username",
        "from peopleintension",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliWeight", property="xueliweight", jdbcType=JdbcType.INTEGER),
        @Result(column="workexpWeight", property="workexpweight", jdbcType=JdbcType.INTEGER),
        @Result(column="aid", property="aid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Peopleintension selectByPrimaryKey(Integer pid);

    @UpdateProvider(type=PeopleintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Peopleintension record, @Param("example") PeopleintensionExample example);

    @UpdateProvider(type=PeopleintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Peopleintension record, @Param("example") PeopleintensionExample example);

    @UpdateProvider(type=PeopleintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Peopleintension record);

    @Update({
        "update peopleintension",
        "set xueliWeight = #{xueliweight,jdbcType=INTEGER},",
          "workexpWeight = #{workexpweight,jdbcType=INTEGER},",
          "aid = #{aid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Peopleintension record);
}
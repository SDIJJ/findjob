package com.lyf.mapper;

import com.lyf.model.xuelipeopleintension;
import com.lyf.model.xuelipeopleintensionExample;
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

public interface xuelipeopleintensionMapper {
    @SelectProvider(type=xuelipeopleintensionSqlProvider.class, method="countByExample")
    int countByExample(xuelipeopleintensionExample example);

    @DeleteProvider(type=xuelipeopleintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(xuelipeopleintensionExample example);

    @Delete({
        "delete from xuelipeopleintension",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer xueliid);

    @Insert({
        "insert into xuelipeopleintension (xueliid, xueliname, ",
        "xueliscore, pid)",
        "values (#{xueliid,jdbcType=INTEGER}, #{xueliname,jdbcType=VARCHAR}, ",
        "#{xueliscore,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER})"
    })
    int insert(xuelipeopleintension record);

    @InsertProvider(type=xuelipeopleintensionSqlProvider.class, method="insertSelective")
    int insertSelective(xuelipeopleintension record);

    @SelectProvider(type=xuelipeopleintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="xueliid", property="xueliid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliname", property="xueliname", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueliscore", property="xueliscore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<xuelipeopleintension> selectByExample(xuelipeopleintensionExample example);

    @Select({
        "select",
        "xueliid, xueliname, xueliscore, pid",
        "from xuelipeopleintension",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="xueliid", property="xueliid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="xueliname", property="xueliname", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueliscore", property="xueliscore", jdbcType=JdbcType.INTEGER),
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER)
    })
    xuelipeopleintension selectByPrimaryKey(Integer xueliid);

    @UpdateProvider(type=xuelipeopleintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") xuelipeopleintension record, @Param("example") xuelipeopleintensionExample example);

    @UpdateProvider(type=xuelipeopleintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") xuelipeopleintension record, @Param("example") xuelipeopleintensionExample example);

    @UpdateProvider(type=xuelipeopleintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(xuelipeopleintension record);

    @Update({
        "update xuelipeopleintension",
        "set xueliname = #{xueliname,jdbcType=VARCHAR},",
          "xueliscore = #{xueliscore,jdbcType=INTEGER},",
          "pid = #{pid,jdbcType=INTEGER}",
        "where xueliid = #{xueliid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(xuelipeopleintension record);
}
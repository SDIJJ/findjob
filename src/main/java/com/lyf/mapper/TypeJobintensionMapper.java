package com.lyf.mapper;

import com.lyf.model.TypeJobintension;
import com.lyf.model.TypeJobintensionExample;
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

public interface TypeJobintensionMapper {
    @SelectProvider(type=TypeJobintensionSqlProvider.class, method="countByExample")
    int countByExample(TypeJobintensionExample example);

    @DeleteProvider(type=TypeJobintensionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TypeJobintensionExample example);

    @Delete({
        "delete from typejobintension",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeid);

    @Insert({
        "insert into typejobintension (typeid, typename, ",
        "typescore, jid)",
        "values (#{typeid,jdbcType=INTEGER}, #{typename,jdbcType=VARCHAR}, ",
        "#{typescore,jdbcType=INTEGER}, #{jid,jdbcType=INTEGER})"
    })
    int insert(TypeJobintension record);

    @InsertProvider(type=TypeJobintensionSqlProvider.class, method="insertSelective")
    int insertSelective(TypeJobintension record);

    @SelectProvider(type=TypeJobintensionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="typeid", property="typeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="typescore", property="typescore", jdbcType=JdbcType.INTEGER),
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    List<TypeJobintension> selectByExample(TypeJobintensionExample example);

    @Select({
        "select",
        "typeid, typename, typescore, jid",
        "from typejobintension",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="typeid", property="typeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="typescore", property="typescore", jdbcType=JdbcType.INTEGER),
        @Result(column="jid", property="jid", jdbcType=JdbcType.INTEGER)
    })
    TypeJobintension selectByPrimaryKey(Integer typeid);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TypeJobintension record, @Param("example") TypeJobintensionExample example);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TypeJobintension record, @Param("example") TypeJobintensionExample example);

    @UpdateProvider(type=TypeJobintensionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TypeJobintension record);

    @Update({
        "update typejobintension",
        "set typename = #{typename,jdbcType=VARCHAR},",
          "typescore = #{typescore,jdbcType=INTEGER},",
          "jid = #{jid,jdbcType=INTEGER}",
        "where typeid = #{typeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TypeJobintension record);
}
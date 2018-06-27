package com.lyf.mapper;

import com.lyf.model.Company;
import com.lyf.model.CompanyExample;
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

public interface CompanyMapper {
    @SelectProvider(type=CompanySqlProvider.class, method="countByExample")
    int countByExample(CompanyExample example);

    @DeleteProvider(type=CompanySqlProvider.class, method="deleteByExample")
    int deleteByExample(CompanyExample example);

    @Delete({
        "delete from company",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cid);

    @Insert({
        "insert into company (cid, cname, ",
        "typename, cintroduce, ",
        "cphotopath, position, ",
        "place, skillNeed, ",
        "others, uid, username)",
        "values (#{cid,jdbcType=INTEGER}, #{cname,jdbcType=VARCHAR}, ",
        "#{typename,jdbcType=VARCHAR}, #{cintroduce,jdbcType=VARCHAR}, ",
        "#{cphotopath,jdbcType=VARCHAR}, #{position,jdbcType=VARCHAR}, ",
        "#{place,jdbcType=VARCHAR}, #{skillneed,jdbcType=VARCHAR}, ",
        "#{others,jdbcType=VARCHAR}, #{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR})"
    })
    int insert(Company record);

    @InsertProvider(type=CompanySqlProvider.class, method="insertSelective")
    int insertSelective(Company record);

    @SelectProvider(type=CompanySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="cintroduce", property="cintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="cphotopath", property="cphotopath", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="place", property="place", jdbcType=JdbcType.VARCHAR),
        @Result(column="skillNeed", property="skillneed", jdbcType=JdbcType.VARCHAR),
        @Result(column="others", property="others", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Company> selectByExample(CompanyExample example);

    @Select({
        "select",
        "cid, cname, typename, cintroduce, cphotopath, position, place, skillNeed, others, ",
        "uid, username",
        "from company",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cid", property="cid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cname", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="typename", property="typename", jdbcType=JdbcType.VARCHAR),
        @Result(column="cintroduce", property="cintroduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="cphotopath", property="cphotopath", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="place", property="place", jdbcType=JdbcType.VARCHAR),
        @Result(column="skillNeed", property="skillneed", jdbcType=JdbcType.VARCHAR),
        @Result(column="others", property="others", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Company selectByPrimaryKey(Integer cid);

    @UpdateProvider(type=CompanySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    @UpdateProvider(type=CompanySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    @UpdateProvider(type=CompanySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Company record);

    @Update({
        "update company",
        "set cname = #{cname,jdbcType=VARCHAR},",
          "typename = #{typename,jdbcType=VARCHAR},",
          "cintroduce = #{cintroduce,jdbcType=VARCHAR},",
          "cphotopath = #{cphotopath,jdbcType=VARCHAR},",
          "position = #{position,jdbcType=VARCHAR},",
          "place = #{place,jdbcType=VARCHAR},",
          "skillNeed = #{skillneed,jdbcType=VARCHAR},",
          "others = #{others,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR}",
        "where cid = #{cid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Company record);
}
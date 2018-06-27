package com.lyf.mapper;

import com.lyf.model.Resume;
import com.lyf.model.ResumeExample;
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

public interface ResumeMapper {
    @SelectProvider(type=ResumeSqlProvider.class, method="countByExample")
    int countByExample(ResumeExample example);

    @DeleteProvider(type=ResumeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ResumeExample example);

    @Delete({
        "delete from resume",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rid);

    @Insert({
        "insert into resume (rid, position, ",
        "name, age, sex, ",
        "email, address, ",
        "phone, huji, xueli, ",
        "school, major, majorpm, ",
        "certificate, level, ",
        "workexp, ppath, ",
        "rpath, uid, username, ",
        "role)",
        "values (#{rid,jdbcType=INTEGER}, #{position,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER}, #{sex,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{huji,jdbcType=VARCHAR}, #{xueli,jdbcType=VARCHAR}, ",
        "#{school,jdbcType=VARCHAR}, #{major,jdbcType=VARCHAR}, #{majorpm,jdbcType=INTEGER}, ",
        "#{certificate,jdbcType=VARCHAR}, #{level,jdbcType=VARCHAR}, ",
        "#{workexp,jdbcType=VARCHAR}, #{ppath,jdbcType=VARCHAR}, ",
        "#{rpath,jdbcType=VARCHAR}, #{uid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{role,jdbcType=VARCHAR})"
    })
    int insert(Resume record);

    @InsertProvider(type=ResumeSqlProvider.class, method="insertSelective")
    int insertSelective(Resume record);

    @SelectProvider(type=ResumeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="rid", property="rid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="huji", property="huji", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueli", property="xueli", jdbcType=JdbcType.VARCHAR),
        @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="major", property="major", jdbcType=JdbcType.VARCHAR),
        @Result(column="majorpm", property="majorpm", jdbcType=JdbcType.INTEGER),
        @Result(column="certificate", property="certificate", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="workexp", property="workexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppath", property="ppath", jdbcType=JdbcType.VARCHAR),
        @Result(column="rpath", property="rpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR)
    })
    List<Resume> selectByExample(ResumeExample example);

    @Select({
        "select",
        "rid, position, name, age, sex, email, address, phone, huji, xueli, school, major, ",
        "majorpm, certificate, level, workexp, ppath, rpath, uid, username, role",
        "from resume",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="rid", property="rid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="huji", property="huji", jdbcType=JdbcType.VARCHAR),
        @Result(column="xueli", property="xueli", jdbcType=JdbcType.VARCHAR),
        @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="major", property="major", jdbcType=JdbcType.VARCHAR),
        @Result(column="majorpm", property="majorpm", jdbcType=JdbcType.INTEGER),
        @Result(column="certificate", property="certificate", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="workexp", property="workexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="ppath", property="ppath", jdbcType=JdbcType.VARCHAR),
        @Result(column="rpath", property="rpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.VARCHAR)
    })
    Resume selectByPrimaryKey(Integer rid);

    @UpdateProvider(type=ResumeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    @UpdateProvider(type=ResumeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    @UpdateProvider(type=ResumeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Resume record);

    @Update({
        "update resume",
        "set position = #{position,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "huji = #{huji,jdbcType=VARCHAR},",
          "xueli = #{xueli,jdbcType=VARCHAR},",
          "school = #{school,jdbcType=VARCHAR},",
          "major = #{major,jdbcType=VARCHAR},",
          "majorpm = #{majorpm,jdbcType=INTEGER},",
          "certificate = #{certificate,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=VARCHAR},",
          "workexp = #{workexp,jdbcType=VARCHAR},",
          "ppath = #{ppath,jdbcType=VARCHAR},",
          "rpath = #{rpath,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=VARCHAR}",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Resume record);
}
package com.HycJack.user.dao;

import com.HycJack.user.entity.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p></p>
 * @author huangyicao 2017/7/31 14:52
 * @param
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/7/31
 * @modify by reason:{原因}
 */
@Repository("roleDao")
public interface RoleDao {

    /**
     * 添加角色
     *
     * @author huangyicao 2017/7/31 14:55
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    @Insert({
        "<script>",
            "insert into upm_role (i_id, ",
            "c_role_name, c_role_desc, ",
            "i_role_type, c_begin_time, ",
            "c_end_time ",
            "values (#{id,jdbcType=INTEGER},",
            "#{roleName,jdbcType=VARCHAR}, #{roleDesc,jdbcType=VARCHAR}, ",
            "#{roleType,jdbcType=INTEGER}, #{beginTime,jdbcType=VARCHAR}, ",
            "#{endTime,jdbcType=VARCHAR}, ",
        "</script>"
    })
    int insert(Role record);

    /**
     * 按字段添加角色
     *
     * @author huangyicao 2017/7/31 14:55
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    /**
     * 根据id查询角色信息
     *
     * @author huangyicao 2017/7/31 14:56
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    @Select({
        "select",
        "i_id, c_role_name, c_role_desc, i_role_type, c_begin_time, c_end_time, ",
        "from upm_role",
        "where i_id = #{id,jdbcType=INTEGER} and i_status = 0"
    })
    @Results({
        @Result(column="i_id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="c_role_name", property="roleName", jdbcType= JdbcType.VARCHAR),
        @Result(column="c_role_desc", property="roleDesc", jdbcType= JdbcType.VARCHAR),
        @Result(column="i_role_type", property="roleType", jdbcType= JdbcType.INTEGER),
        @Result(column="c_begin_time", property="beginTime", jdbcType= JdbcType.VARCHAR),
        @Result(column="c_end_time", property="endTime", jdbcType= JdbcType.VARCHAR)
    })
    Role selectByPrimaryKey(Integer id);

    /**
     * 根据名称查询角色信息
     *
     * @author huangyicao 2017/7/31 14:56
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    @Select({
            "select",
            "i_id, c_role_name, c_role_desc, i_role_type, c_begin_time, c_end_time, ",
            "from upm_role",
            "where c_role_name = #{name,jdbcType=VARCHAR} and i_status = 0"
    })
    @Results({
            @Result(column="i_id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="c_role_name", property="roleName", jdbcType= JdbcType.VARCHAR),
            @Result(column="c_role_desc", property="roleDesc", jdbcType= JdbcType.VARCHAR),
            @Result(column="i_role_type", property="roleType", jdbcType= JdbcType.INTEGER),
            @Result(column="c_begin_time", property="beginTime", jdbcType= JdbcType.VARCHAR),
            @Result(column="c_end_time", property="endTime", jdbcType= JdbcType.VARCHAR)
    })
    List<Role> selectByRoleName(String name);

    /**
     * 分页查询角色信息
     *
     * @author huangyicao 2017/7/31 14:58
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    @Select({
            "select * from upm_role where i_status = 0"
    })
    @Results({
            @Result(column="i_id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="c_role_name", property="roleName", jdbcType= JdbcType.VARCHAR),
            @Result(column="c_role_desc", property="roleDesc", jdbcType= JdbcType.VARCHAR),
            @Result(column="i_role_type", property="roleType", jdbcType= JdbcType.INTEGER),
            @Result(column="c_end_time", property="endTime", jdbcType= JdbcType.VARCHAR)
    })
    List<Role> list();
}

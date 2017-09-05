
package com.HycJack.user.dao;

import com.HycJack.user.entity.Role;
import org.apache.ibatis.jdbc.SQL;

/**
 * <p></p>
 * @author huangyicao 2017/7/31 15:00
 * @param
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/7/31
 * @modify by reason:{原因}
 */
public class RoleSqlProvider {

    /**
     * 组织插入语句
     *
     * @author huangyicao 2017/7/31 15:00
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    public String insertSelective(Role record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("upm_role");
        
        if (record.getId() != null) {
            sql.VALUES("i_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getRoleName() != null) {
            sql.VALUES("c_role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleDesc() != null) {
            sql.VALUES("c_role_desc", "#{roleDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleType() != null) {
            sql.VALUES("i_role_type", "#{roleType,jdbcType=INTEGER}");
        }
        
        if (record.getBeginTime() != null) {
            sql.VALUES("c_begin_time", "#{beginTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("c_end_time", "#{endTime,jdbcType=VARCHAR}");
        }

        return sql.toString();
    }

    /**
     * 修改语句组织
     * @author huangyicao 2017/7/31 15:04
     * @param
     * @return
     * @modificationHistory=========================逻辑或功能性重大变更记录
     * @modify by user: {修改人} 2017/7/31
     * @modify by reason:{原因}
     */
    public String updateByPrimaryKeySelective(Role record) {
        SQL sql = new SQL();
        sql.UPDATE("upm_role");

        if (record.getRoleName() != null) {
            sql.SET("c_role_name = #{roleName,jdbcType=VARCHAR}");
        }

        if (record.getRoleDesc() != null) {
            sql.SET("c_role_desc = #{roleDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleType() != null) {
            sql.SET("i_role_type = #{roleType,jdbcType=INTEGER}");
        }
        
        if (record.getBeginTime() != null) {
            sql.SET("c_begin_time = #{beginTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("c_end_time = #{endTime,jdbcType=VARCHAR}");
        }

        
        sql.WHERE("i_id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

}

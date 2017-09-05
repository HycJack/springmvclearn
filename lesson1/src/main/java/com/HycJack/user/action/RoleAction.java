package com.HycJack.user.action;

import com.HycJack.user.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @param
 * @author huangyicao 2017/9/5 11:21
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/9/5
 * @modify by reason:{原因}
 */
@RestController
public class RoleAction {
    @Autowired
    private RoleDao roleDao;

    @RequestMapping("/role/list")
    public String roleList(String param) {
        return roleDao.list().toString();
    }

}

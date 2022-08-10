package com.zxp.blogapi.service.impl;

import com.zxp.blogapi.dto.blog.UserInfoDTO;
import com.zxp.blogapi.entity.UserAuth;
import com.zxp.blogapi.dao.UserAuthDao;
import com.zxp.blogapi.service.UserAuthService;
import com.zxp.blogapi.vo.UserLoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UserAuth)表服务实现类
 *
 * @author zxp
 * @since 2022-08-06 11:42:23
 */
@Service("userAuthService")
@Slf4j
public class UserAuthServiceImpl implements UserAuthService {
    @Resource
    private UserAuthDao userAuthDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAuth queryById(Integer id) {
        return this.userAuthDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userAuth    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<UserAuth> queryByPage(UserAuth userAuth, PageRequest pageRequest) {
        long total = this.userAuthDao.count(userAuth);
        return new PageImpl<>(this.userAuthDao.queryAllByLimit(userAuth, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param userAuth 实例对象
     * @return 实例对象
     */
    @Override
    public UserAuth insert(UserAuth userAuth) {
        this.userAuthDao.insert(userAuth);
        return userAuth;
    }

    /**
     * 修改数据
     *
     * @param userAuth 实例对象
     * @return 实例对象
     */
    @Override
    public UserAuth update(UserAuth userAuth) {
        this.userAuthDao.update(userAuth);
        return this.queryById(userAuth.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAuthDao.deleteById(id) > 0;
    }

    /**
     * @param userLoginVo
     * @return
     */
    @Override
    public UserInfoDTO login(UserLoginVo userLoginVo) {
        String username = userLoginVo.getUsername();
        String password = userLoginVo.getPassword();
        log.info("username:{},password:{}",username,password);
        return null;
    }
}

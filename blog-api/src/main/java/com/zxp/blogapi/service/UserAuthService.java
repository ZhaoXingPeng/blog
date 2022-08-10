package com.zxp.blogapi.service;

import com.zxp.blogapi.dto.blog.UserInfoDTO;
import com.zxp.blogapi.entity.UserAuth;
import com.zxp.blogapi.vo.UserLoginVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * (UserAuth)表服务接口
 *
 * @author zxp
 * @since 2022-08-06 11:42:23
 */
public interface UserAuthService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAuth queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userAuth    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<UserAuth> queryByPage(UserAuth userAuth, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param userAuth 实例对象
     * @return 实例对象
     */
    UserAuth insert(UserAuth userAuth);

    /**
     * 修改数据
     *
     * @param userAuth 实例对象
     * @return 实例对象
     */
    UserAuth update(UserAuth userAuth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    UserInfoDTO login(UserLoginVo userLoginVo);
}

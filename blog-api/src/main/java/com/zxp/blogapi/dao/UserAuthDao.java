package com.zxp.blogapi.dao;

import com.zxp.blogapi.entity.UserAuth;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (UserAuth)表数据库访问层
 *
 * @author zxp
 * @since 2022-08-06 11:42:23
 */
public interface UserAuthDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAuth queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userAuth 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<UserAuth> queryAllByLimit(UserAuth userAuth, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param userAuth 查询条件
     * @return 总行数
     */
    long count(UserAuth userAuth);

    /**
     * 新增数据
     *
     * @param userAuth 实例对象
     * @return 影响行数
     */
    int insert(UserAuth userAuth);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAuth> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAuth> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAuth> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAuth> entities);

    /**
     * 修改数据
     *
     * @param userAuth 实例对象
     * @return 影响行数
     */
    int update(UserAuth userAuth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}


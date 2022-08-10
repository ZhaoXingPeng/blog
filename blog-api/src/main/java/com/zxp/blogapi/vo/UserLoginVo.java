package com.zxp.blogapi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright: Copyright (c) 2022 Asiainfo
 *
 * @ClassName: com.zxp.example.vo.UserLoginVo
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: 炫沙糖桔的鹏仔
 * @date: 2022/8/5 19:09
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2022/8/5      炫沙糖桔的鹏仔          v1.0.0               修改原因
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVo {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}

package com.zxp.blogapi.controller.api;

import com.zxp.blogapi.dto.blog.UserInfoDTO;
import com.zxp.blogapi.service.UserAuthService;
import com.zxp.blogapi.vo.Result;
import com.zxp.blogapi.vo.UserLoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Copyright: Copyright (c) 2022 Asiainfo
 *
 * @ClassName: com.zxp.blogapi.controller.api.UserApiController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: 炫沙糖桔的鹏仔
 * @date: 2022/8/6 11:43
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2022/8/6      炫沙糖桔的鹏仔          v1.0.0               修改原因
 */
@RestController
@Slf4j
public class UserApiController {
    @Autowired
    UserAuthService userAuthService;
    @PostMapping("/login")
        public Result login(String username, String password) {
                UserLoginVo userLoginVo = new UserLoginVo(username, password);
                log.info("login userLoginVo:{}", userLoginVo);
                UserInfoDTO loginUserInfo = userAuthService.login(userLoginVo);
                return Result.ok(loginUserInfo);
            }

}

package com.hwrky.shop.controller.fore;

import com.alibaba.fastjson.JSONObject;
import com.hwrky.shop.controller.BaseController;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 前台易优购-登陆页
 */
@Controller
public class ForeLoginController extends BaseController {
    @Resource(name = "userService")
    private UserService userService;

    //转到前台易优购-登录页
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToPage(HttpSession session, Map<String, Object> map) {
        logger.info("转到前台易优购-登录页");
        return "fore/loginPage";
    }

    //登陆验证-ajax
    @ResponseBody
    @RequestMapping(value = "login/doLogin", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String checkLogin() {
    	
        return "登录你得自己写";
    }

    //退出当前账号
    @RequestMapping(value = "login/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        Object o = session.getAttribute("userId");
        if (o != null) {
            session.removeAttribute("userId");
            session.invalidate();
            logger.info("登录信息已清除，返回用户登录页");
        }
        return "redirect:/login";
    }
}

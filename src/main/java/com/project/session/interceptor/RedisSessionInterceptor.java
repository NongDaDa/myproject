package com.project.session.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RedisSessionInterceptor implements HandlerInterceptor {


    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        //无论访问的地址是不是正确的，都进行登录验证，登录成功后的访问再进行分发，404的访问自然会进入到错误控制器中
        HttpSession session = request.getSession();
        Cookie[] cookie=request.getCookies();
        if (session.getAttribute(session.getId()) != null)
        {
            try
            {
                //验证当前请求的session是否是已登录的session
                String loginSessionId =  session.getAttribute(session.getId()).toString();
                if (loginSessionId != null)
                {
                    return true;
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        response401(response);
        return false;
    }

    private void response401(HttpServletResponse response)
    {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");

        System.out.println("用户未登录！！！！！！！！！！！！！！！！！！！！！！！！");


        try
        {
            response.getWriter().print( "用户未登录！");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {

    }

}

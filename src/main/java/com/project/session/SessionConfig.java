package com.project.session;

import com.project.session.bean.BaseResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.alibaba.fastjson.JSON;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Configuration
public class SessionConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SecurityInterceptor())
                //排除拦截


                //拦截路径
                .addPathPatterns("/showUserHtml.action").addPathPatterns("/showAdminHtml.action");
    }


    @Configuration
    public class SecurityInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
            HttpSession session = request.getSession();
            request.getSession().setAttribute("k","v");
            System.out.println(session.getId());


            if (session.getAttribute(session.getId()) != null){
                return true;
            }
            response.getWriter().write(JSON.toJSONString(
                    new BaseResponse(){{
                        setOk(false);
                        setMessage("please login first");
                    }}
            ));
            return false;
        }
    }
}

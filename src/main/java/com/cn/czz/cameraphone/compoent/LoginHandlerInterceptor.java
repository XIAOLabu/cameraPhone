//package com.cn.czz.cameraphone.compoent;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @ClassName LoginHandlerInterceptor
// * @Description TODO
// * @Author Czz
// * @Date 2023/6/25 11:25
// * @Version 1.0
// **/
//public class LoginHandlerInterceptor  implements HandlerInterceptor {
//    //目标方法执行之前
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object user = request.getSession().getAttribute("loginUser");
//        System.out.println(user);
//        if (user!=null){
//            //用户登录后，放行请求
//            return true;
//        }else {
//            //用户未登录时，返回登录页
//            request.setAttribute("msa","没有权限，请先登录");
//            request.getRequestDispatcher("/login").forward(request, response);
//            return false;
//        }
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}

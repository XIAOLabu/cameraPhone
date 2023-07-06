//package com.cn.czz.cameraphone.config;
//
//import com.cn.czz.cameraphone.compoent.LoginHandlerInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import com.cn.czz.cameraphone.compoent.MyLocaleResolver;
//
///**
// * @ClassName MyMvcConfig
// * @Description TODO
// * @Author Czz
// * @Date 2023/6/25 11:19
// * @Version 1.0
// **/
//public class MyMvcConfig  implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // 第一个参数：请求参数    第二个参数：跳转的页面参数
////        registry.addViewController("/").setViewName("cn/czz");
//        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/main").setViewName("dashboard");
//        registry.addViewController("/emps").setViewName("list");
//        registry.addViewController("/emp").setViewName("add");
//        registry.addViewController("/emp").setViewName("edit");
//    }
//
//    //注册拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/login","/","/user/login","/asserts/**","/webjars/**");
//    }
//
//    //@Bean  把该配置 注册到springBoot容器中
//    @Bean
//    public LocaleResolver localeResolver(){
//        return new MyLocaleResolver();
//    }
//}

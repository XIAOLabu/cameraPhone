//package com.cn.czz.cameraphone.compoent;
//
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.LocaleResolver;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Locale;
//
///**
// * @ClassName MyLocaleResolver
// * @Description TODO
// * @Author Czz
// * @Date 2023/6/25 11:22
// * @Version 1.0
// **/
//public class MyLocaleResolver  implements LocaleResolver {
//
//    @Override
//    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//        //获取请求参数中的语言 前端点击后 传回来的值
////        String language = httpServletRequest.getParameter("l");
//        String language = httpServletRequest.getParameter("l");
//        //没带区域信息参数就用系统默认的
//        Locale locale =Locale.getDefault();
//        if (!StringUtils.isEmpty(language)){
//            //提交的参数是zh_CN （语言代码_国家代码）
//            String[] s = language.split("_");
//            locale = new Locale(s[0],s[1]);
//        }
//        return locale;
//    }
//
//    @Override
//    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
//    }
//}

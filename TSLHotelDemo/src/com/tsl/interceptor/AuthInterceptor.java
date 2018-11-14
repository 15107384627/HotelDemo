package com.tsl.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
private  List<String> allowUrls;
	
	
	public List<String> getAllowUrls() {
		return allowUrls;
	}


	@Resource
	public void setAllowUrls(List<String> allowUrls) {
		this.allowUrls = allowUrls;
	}
	
	/**
	 * 是否可以放行
	 * @param request
	 */
	public boolean isAllow(HttpServletRequest request){
		String contextPath = request.getContextPath();
		String uri = request.getRequestURI().substring(contextPath.length());
		System.out.println(request.getRequestURI()+"/n"+uri);
		for (String allowUrl : allowUrls) {
			if(uri.startsWith(allowUrl)){
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(isAllow(request)){
			return super.preHandle(request, response, handler);
		}
		if(request.getSession().getAttribute("username")==null){
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
		    
		return super.preHandle(request, response, handler);
	}

}

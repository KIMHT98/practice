package com.ssafy.ws.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

/* 맛집 등록요청이나 상세보기 요청이 들어온 경우 세션에 로그인 정보가 있는지 확인
 * 로그인 정보가 있다면 그대로 진행하고, 없다면 메인 화면으로 돌려보낸다.
 */
public class SessionInterceptor implements HandlerInterceptor {
	
	// 컨트롤러 호출전에 실행되어야 하므로 preHandle
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		// 세션에 로그인 정보가 있다면 그대로 진행한다.
		if(session.getAttribute("loginUser") != null) {
			return true;
		}
		
		// 세션에 로그인 정보가 있다면 진행을 멈추고 메인화면으로 리다이렉트시킨다.
		response.sendRedirect(request.getContextPath() + "/index");
		return false;
	}
	
}

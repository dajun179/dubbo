package com.lb.controller.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthFilter implements Filter{
	
		// 不拦截的资源类型
		private String[] ignoreTypes;

		@Override
		public void destroy() {

		}

		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
//			// 基于http协议的servlet
//			// 如果没有登录.
//			String uri = req.getRequestURI().substring(req.getRequestURI().indexOf("/", 1), req.getRequestURI().length());
//			// css js img 过滤标识
//			boolean isIgnoreType = true;
//
//			if (ignoreTypes != null) {
//				// 过滤css js 资源文件
//				for (int i = 0; i < ignoreTypes.length; i++) {
//					if (uri.endsWith("." + ignoreTypes[i])) {
//						isIgnoreType = false;
//						break;
//					}
//				}
//			} else {
//				chain.doFilter(request, response);
//			}

			chain.doFilter(req, res);
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			String ignoreTypes = arg0.getInitParameter("ignoreTypes");
			if (ignoreTypes != null && !ignoreTypes.trim().equals("")) {
				this.ignoreTypes = ignoreTypes.split(",");
			}
		}
	
}

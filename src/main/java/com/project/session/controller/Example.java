package com.project.session.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Example {

	@RequestMapping("/user/set")
	String set(HttpServletRequest req) {
		req.getSession().setAttribute("sessionId", req.getSession().getId());
		return "设置session:sessionId="+req.getSession().getId();
	}

	@RequestMapping("/user/query")
	String query(HttpServletRequest req) {
		Object value = req.getSession().getAttribute("sessionId");
		return "查询Session：\"sessionId\"=" + value;
	}

}
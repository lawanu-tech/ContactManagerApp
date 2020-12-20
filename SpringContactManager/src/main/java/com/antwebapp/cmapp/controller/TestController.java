/**
 * 
 */
package com.antwebapp.cmapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lawanu Borthakur
 *
 */

@Controller
public class TestController {
@RequestMapping("/test/hello")
	public String helloWorld() {
	return "hello";
}
}

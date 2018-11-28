/**
 * 
 */
package xsis.extend.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Awiyanto Ajisasongko
 *
 */
@Controller // Harus diberi anotasi @Controller agar bisa di-load oleh spring
public class HelloController {
	
	@RequestMapping("/hello.html") // ini seperti anotasi @WebServlet pada servlet
	public String hello() {
		return "hello";
	}
}

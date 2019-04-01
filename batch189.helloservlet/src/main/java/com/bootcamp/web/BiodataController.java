package com.bootcamp.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bootcamp.model.Biodata;

@Controller
@RequestMapping("/biodata")
public class BiodataController {
	
	@RequestMapping("index.html")
	public String home() {
		return "index";
	}
	
	@RequestMapping("biodata.html")
	public String biodata() {
		return "biodata";
	}
	
	@RequestMapping("biodata-reset.html")
	public String resetBiodata(HttpServletRequest req) {
		Collection<Biodata> biodataList = null;
		HttpSession session = req.getSession(true);
		if (session.getAttribute("list")!=null) {
			biodataList = (Collection<Biodata>) session.getAttribute("list");
			biodataList.clear();
		}
		return "biodata";
	}
	
	@RequestMapping(value="biodata-save.html",method=RequestMethod.POST)
	public String biodataSave(Model model, @ModelAttribute Biodata biodata, HttpServletRequest req) {
		Collection<Biodata> biodataList = null;
		HttpSession session = req.getSession(true);
		if (session.getAttribute("list")!=null) {
			biodataList = (Collection<Biodata>) session.getAttribute("list");
		} else {
			biodataList = new ArrayList<>();
			session.setAttribute("list", biodataList);
		}
		
		biodataList.add(biodata);
		
		model.addAttribute("list", biodataList);
		return "biodata";
	}
}

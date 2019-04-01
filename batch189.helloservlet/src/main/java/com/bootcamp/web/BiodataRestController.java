package com.bootcamp.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.model.Biodata;

@RestController
@RequestMapping("/biodata-rest")
public class BiodataRestController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<Collection<Biodata>> list(HttpServletRequest req) {
		HttpSession session = req.getSession();
		Collection<Biodata> list = null;
		if (session.getAttribute("list")!=null) {
			list = (Collection<Biodata>) session.getAttribute("list");
		} else {
			list = new ArrayList<>();
			session.setAttribute("list", list);
		}
		ResponseEntity<Collection<Biodata>> result = new ResponseEntity<>(list, HttpStatus.OK);
		return result;
	}

	@RequestMapping(value="/", method=RequestMethod.POST)
	public ResponseEntity<Collection<Biodata>> simpanBiodata(@ModelAttribute Biodata biodata, HttpServletRequest req) {
		HttpSession session = req.getSession();
		Collection<Biodata> list = null;
		if (session.getAttribute("list")!=null) {
			list = (Collection<Biodata>) session.getAttribute("list");
		} else {
			list = new ArrayList<>();
			session.setAttribute("list", list);
		}
		list.add(biodata);
		
		ResponseEntity<Collection<Biodata>> result = new ResponseEntity<>(list, HttpStatus.OK);
		return result;
	}
}

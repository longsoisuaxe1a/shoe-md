package com.springframework.vn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.vn.entity.NguoiDung;
import com.springframework.vn.service.NguoiDungService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private NguoiDungService nguoiDungService;
	@PostMapping("/add-nguoidung")
	public String addNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		nguoiDungService.add(nguoiDung);
		return "redirect:/index";
	}
}

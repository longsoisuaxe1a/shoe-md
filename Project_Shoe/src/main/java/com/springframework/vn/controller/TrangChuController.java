package com.springframework.vn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springframework.vn.entity.Giay;
import com.springframework.vn.entity.NguoiDung;
import com.springframework.vn.service.GiayService;
import com.springframework.vn.service.NguoiDungService;

@Controller
public class TrangChuController {
	@Autowired
	private GiayService giayService;
	@Autowired
	private NguoiDungService nguoiDungService;
	@RequestMapping("/")
	public String index(Model model) {
		List<Giay> giays = giayService.getAllList();
		model.addAttribute("giays", giays);
		System.out.println(giays);
		return "index";
	}
	@GetMapping("/index")
	public String listGiay(Model model) {
		List<Giay> giays = giayService.getAllList();
		model.addAttribute("giays", giays);
		return "index";
	}
	@GetMapping("/form-register")
	public String formRegister(Model model) {
		NguoiDung nguoiDung = new NguoiDung();
		model.addAttribute("nguoiDung", nguoiDung);
		return "form-register";
	}
	@GetMapping("/form-login")
	public String formLogin(Model model) {
		NguoiDung nguoiDung = new NguoiDung();
		model.addAttribute("nguoiDung", nguoiDung);
		return "form-login";
	}
	@GetMapping("/admin-home-manager")
	public String adminHomeManager(Model model) {
		NguoiDung nguoiDung = new NguoiDung();
		model.addAttribute("nguoiDung", nguoiDung);
		return "admin-home-manager";
	}
	@PostMapping("/check-login")
	public String checkLogin(@RequestParam("tenNguoiDung") String tenNguoiDung, @RequestParam("matKhau") String mauKhau) {
		NguoiDung nguoiDung = nguoiDungService.getNguoiDungByTenDangNhapAndMatKhau(tenNguoiDung, mauKhau);
		if(nguoiDung != null) {
			if(nguoiDung.getRole().equals("user")) {
//				List<Giay> giays = service.getListGiays();
//				ModelAndView modelAndView = new ModelAndView("home-user-registered");
//				modelAndView.addObject("giays", giays);
//				modelAndView.addObject("nguoiDung", nguoiDung);
				return "user-home";
			}else {
				return "redirect:/form-login";
			}
		}else {
			return "redirect:/admin-home-manager";
		}
	}
	@PostMapping("/add-nguoidung")
	public String addNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		nguoiDungService.add(nguoiDung);
		return "redirect:/index";
	}
	@GetMapping("/logout")
	public String logout() {
		return "redirect:/index";
	}
}

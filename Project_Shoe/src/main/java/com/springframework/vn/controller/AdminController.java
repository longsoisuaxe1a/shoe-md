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
import com.springframework.vn.entity.LoaiGiay;
import com.springframework.vn.entity.NguoiDung;
import com.springframework.vn.entity.ThuongHieu;
import com.springframework.vn.service.GiayService;
import com.springframework.vn.service.LoaiGiayService;
import com.springframework.vn.service.NguoiDungService;
import com.springframework.vn.service.ThuongHieuService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private ThuongHieuService thuongHieuService;
	@Autowired
	private LoaiGiayService loaiGiayService;
	@Autowired
	private GiayService giayService;
	@Autowired
	private NguoiDungService nguoiDungService;
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	thương hiệu
//	@RequestMapping("/")
//	public String homeThuongHieu(Model model) {
//		List<ThuongHieu> thuongHieus = service.getAllList(); 
//		model.addAttribute("thuongHieus", thuongHieus);
//		return "admin-thuonghieu-manager";
//	}
	@GetMapping("/list-thuonghieu")
	public String listThuongHieu(Model model) {
		List<ThuongHieu> thuongHieus = thuongHieuService.getAllList(); 
		model.addAttribute("thuongHieus", thuongHieus);
		return "admin-thuonghieu-manager";
	}
	@GetMapping("/admin-form-add-thuonghieu")
	public String formAddThuongHieu(Model model) {
		ThuongHieu thuongHieu = new ThuongHieu();
		model.addAttribute("thuongHieu", thuongHieu);
		return "admin-form-add-thuonghieu";
	}
	@PostMapping("/submit-thuonghieu")
	public String addThuongHieu(@ModelAttribute("thuongHieu") ThuongHieu thuongHieu) {
		thuongHieuService.add(thuongHieu);
		return "redirect:/admin/list-thuonghieu";
	}
	@GetMapping("/deleteThuongHieu")
	public String deleteThuongHieu(@RequestParam("maThuongHieu") int id) {
		thuongHieuService.delete(id);
		return "redirect:/admin/list-thuonghieu";
	}
	@GetMapping("/admin-form-update-thuonghieu")
	public String formUpdateThuongHieu(@RequestParam("maThuongHieu") int id, Model model) {
		ThuongHieu thuongHieu = thuongHieuService.getThuongHieuById(id);
		model.addAttribute("thuongHieu", thuongHieu);
		return "admin-form-update-thuonghieu";
	}
	@PostMapping("/admin-form-update-thuonghieu")
	public String updateThuongHieu(@ModelAttribute("thuongHieu") ThuongHieu thuongHieu) {
		thuongHieuService.update(thuongHieu);
		return "redirect:/admin/list-thuonghieu";
	}
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	loại giày
	@GetMapping("/list-loaigiay")
	public String listLoaiGiay(Model model) {
		List<LoaiGiay> loaiGiays = loaiGiayService.getAllList(); 
		model.addAttribute("loaiGiays", loaiGiays);
		return "admin-loaigiay-manager";
	}
	@GetMapping("/admin-form-add-loaigiay")
	public String formAddLoaiGiay(Model model) {
		LoaiGiay loaiGiay = new LoaiGiay();
		model.addAttribute("loaiGiay", loaiGiay);
		return "admin-form-add-loaigiay";
	}
	@PostMapping("/submit-loaigiay")
	public String addLoaiGiay(@ModelAttribute("loaiGiay") LoaiGiay loaiGiay) {
		loaiGiayService.add(loaiGiay);
		return "redirect:/admin/list-loaigiay";
	}
	@GetMapping("/deleteLoaiGiay")
	public String deleteLoaiGiay(@RequestParam("maLoai") int id) {
		loaiGiayService.delete(id);
		return "redirect:/admin/list-loaigiay";
	}
	@GetMapping("/admin-form-update-loaigiay")
	public String formUpdateLoaiGiay(@RequestParam("maLoai") int id, Model model) {
		LoaiGiay loaiGiay = loaiGiayService.getLoaiGiayById(id);
		model.addAttribute("loaiGiay", loaiGiay);
		return "admin-form-update-loaigiay";
	}
	@PostMapping("/update-submit-loaigiay")
	public String updateLoaiGiay(@ModelAttribute("loaiGiay") LoaiGiay loaiGiay) {
		loaiGiayService.update(loaiGiay);
		return "redirect:/admin/list-loaigiay";
	}
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	giày
	@GetMapping("/list-giay")
	public String listGiay(Model model) {
		List<Giay> giays = giayService.getAllList(); 
		model.addAttribute("giays", giays);
		return "admin-giay-manager";
	}
	@GetMapping("/admin-form-add-giay")
	public String formAddGiay(Model model) {
		Giay giay = new Giay();
		model.addAttribute("giay", giay);
		return "admin-form-add-giay";
	}
	@PostMapping("/submit-giay")
	public String addGiay(@ModelAttribute("giay") Giay giay) {
		giayService.add(giay);
		return "redirect:/admin/list-giay";
	}
	@GetMapping("/deleteGiay")
	public String deleteGiay(@RequestParam("maGiay") int id) {
		giayService.delete(id);
		return "redirect:/admin/list-giay";
	}
	@GetMapping("/admin-form-update-giay")
	public String formUpdateGiay(@RequestParam("maGiay") int id, Model model) {
		Giay giay = giayService.getGiayById(id);
		model.addAttribute("giay", giay);
		return "admin-form-update-giay";
	}
	@PostMapping("/update-submit-giay")
	public String updateGiay(@ModelAttribute("giay") Giay giay) {
		giayService.update(giay);
		return "redirect:/admin/list-giay";
	}
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------
//	nguoi dung
	@GetMapping("/list-nguoidung")
	public String listNguoiDung(Model model) {
		List<NguoiDung> nguoiDungs = nguoiDungService.getAllList(); 
		model.addAttribute("nguoiDungs", nguoiDungs);
		return "admin-nguoidung-manager";
	}
	@GetMapping("/admin-form-add-nguoidung")
	public String formAddNguoiDung(Model model) {
		NguoiDung nguoiDung = new NguoiDung();
		model.addAttribute("nguoiDung", nguoiDung);
		return "admin-form-add-nguoidung";
	}
	@PostMapping("/submit-nguoidung")
	public String addNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		nguoiDungService.add(nguoiDung);
		return "redirect:/admin/list-nguoidung";
	}
	@GetMapping("/deleteNguoiDung")
	public String deleteNguoiDung(@RequestParam("maNguoiDung") int id) {
		nguoiDungService.delete(id);
		return "redirect:/admin/list-nguoidung";
	}
	@GetMapping("/admin-form-update-nguoidung")
	public String formUpdateNguoiDung(@RequestParam("maNguoiDung") int id, Model model) {
		NguoiDung nguoiDung = nguoiDungService.getNguoiDungById(id);
		model.addAttribute("nguoiDung", nguoiDung);
		return "admin-form-update-nguoidung";
	}
	@PostMapping("/update-submit-nguoidung")
	public String updateNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		nguoiDungService.update(nguoiDung);
		return "redirect:/admin/list-nguoidung";
	}
}

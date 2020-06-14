package com.ankit.vendorweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ankit.vendorweb.entities.Vendor;
import com.ankit.vendorweb.service.VendorService;

@Controller
public class VendorController {

	@Autowired
	VendorService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}

	@RequestMapping("/savevendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorData = service.saveVendor(vendor);
		modelMap.addAttribute("msg", "Vendor added with id " + vendorData.getId());
		return "createVendor";

	}

	@RequestMapping("/displayVendors")
	public String displayVendors(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		List<Vendor> vendorList = service.getAllVendors();
		modelMap.addAttribute("vendorList", vendorList);
		return "displayVendors";
	}

	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
		List<Vendor> vendorList = service.getAllVendors();
		modelMap.addAttribute("vendorList", vendorList);
		return "displayVendors";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";

	}

	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		service.updateVendor(vendor);
		List<Vendor> vendorList = service.getAllVendors();
		modelMap.addAttribute("vendorList", vendorList);
		return "displayVendors";
	}

}

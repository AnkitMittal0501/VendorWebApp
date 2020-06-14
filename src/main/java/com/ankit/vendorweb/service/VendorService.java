package com.ankit.vendorweb.service;

import java.util.List;

import com.ankit.vendorweb.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();
	void deleteVendor(Vendor vendor);

}

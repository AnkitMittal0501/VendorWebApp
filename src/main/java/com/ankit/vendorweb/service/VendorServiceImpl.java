package com.ankit.vendorweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ankit.vendorweb.entities.Vendor;
import com.ankit.vendorweb.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
	VendorRepository repository;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		Optional<Vendor> vendor=repository.findById(id);
		return vendor.get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		List<Vendor> vendor=repository.findAll();
		return vendor;
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}
	public VendorRepository getVendorRepository() {
		return repository;
	}

	public void setVendorRepository(VendorRepository repository) {
		this.repository = repository;
	}


}

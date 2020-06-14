package com.ankit.vendorweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.vendorweb.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}

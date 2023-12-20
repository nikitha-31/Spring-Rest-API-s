package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/details")
public class CloudVendorAPIService {
	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public  CloudVendor getCloudVendorDetails(String vendorId){
		return cloudVendor;
	}
	@PostMapping
	public String postCloudvendordetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "Cloud Vendor Updated Sucessfully";
	}
	@PutMapping
	public String putVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "Vendor details updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(String vendorId)
	{
		this.cloudVendor=null;
		return "Vendor details deleted successfully";
	}

}

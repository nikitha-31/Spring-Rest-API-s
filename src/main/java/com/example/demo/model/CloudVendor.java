package com.example.demo.model;

public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorAdress;
    private String vendorPhno;
	public CloudVendor() {
		super();
	}
	public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorPhno) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAdress = vendorAdress;
		this.vendorPhno = vendorPhno;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAdress() {
		return vendorAdress;
	}
	public void setVendorAdress(String vendorAdress) {
		this.vendorAdress = vendorAdress;
	}
	public String getVendorPhno() {
		return vendorPhno;
	}
	public void setVendorPhno(String vendorPhno) {
		this.vendorPhno = vendorPhno;
	}
    
}

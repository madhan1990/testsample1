package org.company;

public class CompanyInfo {
public void companyName() {
	System.out.println("Company Name: TCS");
}
public void companyId() {
	System.out.println("Company id: 1011");
}

public void companyAddress() {
	System.out.println("Chennai: Tidel Park");
}

public static void main(String[] args) {
	CompanyInfo ci= new CompanyInfo();
	ci.companyId();
	ci.companyAddress();
	ci.companyName();
}
}

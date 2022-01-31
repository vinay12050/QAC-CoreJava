package com.qac.coreJava.exceptions.customException;

public class MallTester {

	public static void main(String[] args) throws VaccineCertificateNotAvailableException {
		
		Mall mall=new Mall();
		boolean vaccinationCertificate=true;
		mall.Entrance(vaccinationCertificate);

	}

}

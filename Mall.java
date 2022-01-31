package com.qac.coreJava.exceptions.customException;

public class Mall {
	
	boolean vaccinatonCertificate=false;
	
	public void Entrance(boolean vaccinationCertificate)throws VaccineCertificateNotAvailableException {
		if(vaccinationCertificate) {
			System.out.println("Allow inside..");
		}
		else {
			throw new VaccineCertificateNotAvailableException();
		}
	}

}

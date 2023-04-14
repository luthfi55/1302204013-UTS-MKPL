package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Profile{
           	
	public LocalDate joined;
	private int monthWorkingInYear;	
	public boolean isForeigner;
		
	
	public Employee(Profile profile, LocalDate joined, boolean isForeigner, Family family) {
                this.setEmployeeId(profile.getEmployeeId());
                this.setFirstName(profile.getFirstName());
                this.setLastName(profile.getLastName());
                this.setIdNumber(profile.getIdNumber());
                this.setAddress(profile.getAddress());
		this.joined = joined;
		this.isForeigner = isForeigner;		
                this.setGender(profile.getGender());
		
                this.setChildNames(family.getChildNames());
                this.setChildIdNumbers(family.getChildIdNumbers());
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}
	
	
	public int getAnnualIncomeTax() {		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
                boolean haveSpouse = spouseIdNumber != 0;              
		
		if (date.getYear() == joined.getYear()) {
			monthWorkingInYear = date.getMonthValue() - joined.getMonthValue();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, haveSpouse, childIdNumbers.size());
	}
}

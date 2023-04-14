package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Profile{
           	
	public LocalDate joined;
	private int monthWorkingInYear;	
	public boolean isForeigner;
		
	
	public Employee(int employeeId, String firstName, String lastName, int idNumber, String address, LocalDate joined, boolean isForeigner, genderType gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.joined = joined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
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

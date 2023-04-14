package lib;

import java.time.LocalDate;

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
	}
	
	
	public int getAnnualIncomeTax(Salary salary) {				
                boolean haveSpouse = spouseIdNumber != 0;              
		monthWorkingInYear = getMonthWorking();
		return TaxFunction.calculateTax(salary, monthWorkingInYear, haveSpouse, childIdNumbers.size());
	}
        
        public int getMonthWorking(){
                LocalDate date = LocalDate.now();
                if (date.getYear() == joined.getYear()) {
			return date.getMonthValue() - joined.getMonthValue();
		}else {
			return 12;
		}
        }
}

package lib;

public class TaxFunction {
	
        public static int employeeType(Salary salary, int numberOfMonthWorking, int numberOfChildren, boolean isMarried){
                int totalSalary = (salary.getMonthlySalary() + salary.getOtherMonthlyIncome()) * numberOfMonthWorking;
                int totalAfterDeduction = totalSalary - salary.getAnnualDeductible();
                if (isMarried) {
			return (int) Math.round(0.05 * (totalAfterDeduction  - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}   else {
			return (int) Math.round(0.05 * (totalAfterDeduction - 54000000));
		}
        }
    
	public static int calculateTax(Salary salary, int numberOfMonthWorking, boolean isMarried, int numberOfChildren) {		
		int tax = 0;
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}

                tax = employeeType(salary, numberOfMonthWorking, numberOfChildren, isMarried);
		
		if (tax < 0) {
                    return 0;
		}else {
                    return tax;
		}			 
	}            
	
}

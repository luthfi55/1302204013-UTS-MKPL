/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author luthfisiregar5
 */
public class Salary{

    public int monthlySalary;
    public int otherMonthlyIncome;
    public int annualDeductible;
    
    /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
    
        public void setMonthlySalary(boolean isForeigner) {	
                int grade = 0;
                int salaryInMonth = setSalaryInMonth(grade);
                monthlySalary = setSalaryisForeigner(isForeigner, salaryInMonth);
	}
        
        public int setSalaryInMonth(int grade){            
                if (grade == 1) {
                    return 3000000;			
		}else if (grade == 2) {
                    return 5000000;			
		}else if (grade == 3) {
                    return 7000000;
		} else {
                    return 0;
                }                
        }
        
        public int setSalaryisForeigner(boolean isForeigner, int salaryInMonth){
            if (isForeigner){
                return (int) (salaryInMonth * 1.5);			
            } else {
                return salaryInMonth;		
            }
        }
        
        
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
        
        public int getMonthlySalary() {
            return monthlySalary;
        }

        public int getOtherMonthlyIncome() {
            return otherMonthlyIncome;
        }

        public int getAnnualDeductible() {
            return annualDeductible;
        }
}

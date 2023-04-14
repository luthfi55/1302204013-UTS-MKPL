/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.List;

/**
 *
 * @author luthfisiregar5
 */
public class Family extends Salary{
        public String spouseName;
	public int spouseIdNumber;

	public List<String> childNames;
	public List<String> childIdNumbers;       
	
	
	public void setSpouse(String spouseName, int spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}

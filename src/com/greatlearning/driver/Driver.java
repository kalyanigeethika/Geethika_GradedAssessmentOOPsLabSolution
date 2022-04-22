package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.SuperDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		// Super Department
		
System.out.println("--------------Super Department--------------");
		SuperDepartment superdept = new SuperDepartment();
		System.out.println(superdept.departmentName());
		System.out.println(superdept.getTodaysWork());
		System.out.println(superdept.getWorkDeadline());
		System.out.println(superdept.isTodayAHoliday());
		
		// AdminDepartment	
		
System.out.println("--------------Admin Department--------------");	
		AdminDepartment admindept = new AdminDepartment();
		System.out.println(admindept.departmentName());
		System.out.println(admindept.getTodaysWork());
		System.out.println(admindept.getWorkDeadline());
		System.out.println(admindept.isTodayAHoliday());
		
		// HR Department
		
System.out.println("--------------HR Department--------------");
		HrDepartment hrdept = new HrDepartment();
		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.isTodayAHoliday());
		
		// Tech Department
		
System.out.println("--------------Tech Department--------------");
		TechDepartment techdept = new TechDepartment();
		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}
}

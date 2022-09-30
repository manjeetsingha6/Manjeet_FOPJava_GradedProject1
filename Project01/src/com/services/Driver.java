package com.services;

import com.model.AdminDepartment;
import com.model.HrDepartment;
import com.model.SuperDepartment;
import com.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment a1=new AdminDepartment();
		
		System.out.println("Welcome to "+ a1.departmentName());
		System.out.println(a1.getTodaysWork());
		System.out.println(a1.getWorkDeadline());
		System.out.println(a1.isTodayAHoliday());
		System.out.println();
		
		HrDepartment a2=new HrDepartment();
		System.out.println("Welcome to "+ a2.departmentName());
		System.out.println(a2.doactivity());
		System.out.println(a2.getTodaysWork());
		System.out.println(a2.getWorkDeadline());
		System.out.println(a2.isTodayAHoliday());
		System.out.println();
		
		TechDepartment a3=new TechDepartment();
		System.out.println("Welcome to "+ a3.departmentName());
		System.out.println(a3.getTodaysWork());
		System.out.println(a3.getWorkDeadline());
		System.out.println(a3.getStackInformantion());
		System.out.println(a3.isTodayAHoliday());
	}

}
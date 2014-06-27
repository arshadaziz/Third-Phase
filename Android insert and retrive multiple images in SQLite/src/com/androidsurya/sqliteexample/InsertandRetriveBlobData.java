package com.androidsurya.sqliteexample;

import java.util.ArrayList;

import com.androidsurya.sqliteexample.R;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.GridView;

public class InsertandRetriveBlobData extends Activity {
	private DBhelper DbHelper;
	public static final String EMP_ID = "id";
	public static final String EMP_NAME = "name";
	public static final String EMP_AGE = "age";
	public static final String EMP_PHOTO = "photo";
	ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridview_layout);
		DbHelper = new DBhelper(this);
		Employee employee_One = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.arshad), "Surya", 25);
		Employee employee_Two = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.arshad2), "Bondada", 26);
		Employee employee_One1 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.arshad4), "bcd", 27);
		Employee employee_One2 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.arshad10), "eee", 27);
		Employee employee_One3 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.express), "fff", 27);
		Employee employee_One4 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.days), "ggg", 27);
		Employee employee_One5 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.sachin), "hhh", 27);
		Employee employee_One6 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.eco), "iii", 27);
		Employee employee_One7 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.life), "jjj", 27);
		Employee employee_One8 = new Employee(BitmapFactory.decodeResource(
				getResources(), R.drawable.ghy), "jjj", 27);
		
		
		
		

		DbHelper.open();
		// insert first employee one details
		DbHelper.insertEmpDetails(employee_One);
		// insert first employee two details
		DbHelper.insertEmpDetails(employee_Two);
		DbHelper.insertEmpDetails(employee_One1);
		DbHelper.insertEmpDetails(employee_One2);
	    DbHelper.insertEmpDetails(employee_One3);
		DbHelper.insertEmpDetails(employee_One4);
		DbHelper.insertEmpDetails(employee_One5);
		DbHelper.insertEmpDetails(employee_One6);
		DbHelper.insertEmpDetails(employee_One7);
		DbHelper.insertEmpDetails(employee_One8);
		employeeList = DbHelper.retriveallEmpDetails();
		DbHelper.close();
		GridView gridView = (GridView) findViewById(R.id.grid_view);
		// Instance of ImageAdapter Class
		gridView.setAdapter(new ImageAdapter(this, employeeList));

	}
}

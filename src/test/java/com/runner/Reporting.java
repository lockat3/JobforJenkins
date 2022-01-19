package com.runner;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void generateReporting(String jsonfile) {
	
		File reportDirectory = new File("C:\\Users\\ADMIN\\eclipse-workspace\\App\\src\\test\\resources\\Reports");
		
		Configuration  configuration = new Configuration(reportDirectory, "Adactin Hotel");
		 configuration.addClassifications("OS","Windows 10");
		 configuration.addClassifications("Browser","Chrome");
		 configuration.addClassifications("Browser version","97");
		 configuration.addClassifications("Sprint","23");

		 ArrayList<String > jsonfiles =  new ArrayList<String>();
		 jsonfiles.add(jsonfile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonfiles, configuration);
		
		reportBuilder.generateReports();
	}

}

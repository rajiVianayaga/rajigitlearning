package org.reporting;

	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

	public class Reporting {
		public static void generateJvmReport(String jsonfile)
		{
			File reportDirectory=new File("C:\\Users\\pc\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\Reports");
			Configuration configuration = new Configuration(reportDirectory,"Adactin Automation;");
			configuration.addClassifications("OS","Windows 10");
			configuration.addClassifications("Browser","Chrome");
			configuration.addClassifications("Version","a4");			
			configuration.addClassifications("Sprint","24");
		

			List<String> jsonFiles = new ArrayList<String>();
			jsonFiles.add(jsonfile);
			ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
			builder.generateReports();
		}
		}
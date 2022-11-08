package ioproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;


public class OpenCSVReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CSVReader reader = null;
		try {
			reader = new CSVReaderBuilder(new FileReader("C:\\Users\\sameer\\eclipse-workspace\\ioproject\\src\\main\\resources\\numbers.csv")).build();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     String [] nextLine;
	     try {
			while ((nextLine = reader.readNext()) != null) {
				
			    // nextLine[] is an array of values from the line
			   System.out.println(Arrays.toString(nextLine));
			 }
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	        String[] items1 = {"d", "coin"};
	        String[] items2 = {"e", "chair"};
	        String[] items3 = {"f", "bowl"};

	        File file = new File("C:\\Users\\sameer\\eclipse-workspace\\ioproject\\src\\main\\resources\\numbers.csv");   
	     // create FileWriter object with file as parameter
	        FileWriter outputfile = null;
			try {
				outputfile = new FileWriter(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	        try (// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile)) {
				writer.writeNext(items1);
				writer.writeNext(items2);
				writer.writeNext(items3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

}

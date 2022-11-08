package ioproject;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class pdfreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating PDF document object 
	      PDDocument document = new PDDocument();    
	       
	      //Saving the document
	      try {
			
			 for (int i=0; i<5; i++) {
		         //Creating a blank page 
		         PDPage blankPage = new PDPage();

		         //Adding the blank page to the document
		         document.addPage( blankPage );
		         document.save("C:/PdfBox_Examples/my_doc.pdf");
		      } 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	      System.out.println("PDF created");  
	      document.addPage(new PDPage()); 
	      try {
			document.save("C:/PdfBox_Examples/my_doc.pdf");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      System.out.println("new page added to PDF"); 
	      
	      int noOfPages= document.getNumberOfPages();
	      System.out.print(noOfPages);
	      
	      document.removePage(2);
	      document.removePage(2);
	      try {
			document.save("C:/PdfBox_Examples/my_doc.pdf");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      System.out.println("page deleted from PDF");
	      int noOfPages2= document.getNumberOfPages();
	      System.out.print(noOfPages2);
	      //Closing the document  
	      
	      PDDocumentInformation pdd = document.getDocumentInformation();
	      pdd.setAuthor("gsk");
	      pdd.setTitle("Sample document"); 
	      pdd.setCreator("PDF Examples");
	      pdd.setSubject("Example document"); 
	      try {
			document.save("C:/PdfBox_Examples/my_doc.pdf");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      
	      System.out.println("Author of the document is :"+ pdd.getAuthor());
	      System.out.println("Title of the document is :"+ pdd.getTitle());
	      System.out.println("Subject of the document is :"+ pdd.getSubject());

	      System.out.println("Creator of the document is :"+ pdd.getCreator());      
	      
	      try {
			document.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

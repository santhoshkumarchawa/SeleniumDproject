package StepDefintions;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Common_Library{


		public static Hashtable<String, String> ImportDataFromXmltoHashTable(String FileName) throws ParserConfigurationException, SAXException, IOException
		{
			Hashtable<String, String> hashtable= new Hashtable<String, String>();
			File file=new File(FileName);
			boolean flg=file.exists();
						
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document document=db.parse(file);
			String Expression="//Browser/Page/WebEdit";
			return hashtable;
			
		}

}

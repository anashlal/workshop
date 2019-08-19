package workshop1;

import java.io.IOException;
import java.util.List;

import workshop.data.NameService;
import workshop.domain.Person;
import workshop2.CSVReader_Writer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();

        List <String> lastNames = CSVReader_Writer.getLastNames();


        NameService nameService = new NameService(maleFirstNames, femaleFirstNames,lastNames);


        Person test = nameService.getNewRandomPerson();
        System.out.println(test);

	}

}

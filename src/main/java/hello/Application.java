package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import hello.fileservice.FileService;
import hello.usercore.User;
import hello.userservice.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by rmedini on 27/09/2019.
 */
@SpringBootApplication
public class Application {

    private static Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);


        System.out.println("Please enter the xml file path");
        Scanner userInput = new Scanner( System.in );
        String fileName = userInput.next( );


        //From xml to java object
        XmlMapper xmlMapper = new XmlMapper();
        InputStream stream = UserService.Default.INSTANCE.getStreamFromXml(fileName);

        if(stream != null) {
            User user = xmlMapper.readValue(stream, User.class);

            //from java object to JSON
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(user);

            // create a new text file and append json values into it
            FileService.Default.INSTANCE.appendValuesToFile(fileName, json);
            System.out.println("This is the user in JSON format"  + json);
            LOGGER.warning("This is the user in JSON format"  + json);

        }else{
            System.out.println("Please check again your xml file!");
            LOGGER.warning("Please check again your xml file!");

        }




    }
}

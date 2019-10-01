package hello.fileservice;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by rmedini on 27/09/2019.
 */
public class FileService {

    private static Logger LOGGER = Logger.getLogger(FileService.class.getName());

    public static class Default {
        public static final FileService INSTANCE = getInstance();

        private static FileService getInstance() {
            return new FileService();
        }
    }

    public void appendValuesToFile(String filePath, String values) throws IOException {

        FileWriter fw = null;
        File file = new File (filePath);
        try {
            fw = new FileWriter(file, true);
            fw.write(values);
        }catch(IOException e){
            System.out.println("Cannot write values to file!");
            LOGGER.warning("Cannot write values to file!");
        }finally {
            fw.close();

        }
    }
}

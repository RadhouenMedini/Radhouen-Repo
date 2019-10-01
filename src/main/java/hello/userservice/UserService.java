package hello.userservice;

import java.io.InputStream;

/**
 * Created by rmedini on 27/09/2019.
 */
public class UserService {

    public static class Default {
        public static final UserService INSTANCE = getInstance();

        private static UserService getInstance() {
            return new UserService();
        }
    }

    /**
     *
     * @param fileName the name of the xml file.
     * @return a stream containing serialization of the xml.
     */
    public InputStream getStreamFromXml(String fileName) {

        if(fileName != null && !fileName.isEmpty()) {
            return UserService.class.getResourceAsStream("/" + fileName);
        }

        return null;

    }
}

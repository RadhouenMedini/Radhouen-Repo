package hello.usercore;

/**
 * Created by rmedini on 27/09/2019.
 */
public interface IUser {

    String getUserName() ;

    void setUserName(String userName);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName() ;

    void setLastName(String lastName) ;

    String getEmail() ;

    void setEmail(String email) ;

    String getAddress();

    void setAddress(String address) ;

    String getId() ;

    void setId(String id) ;
}
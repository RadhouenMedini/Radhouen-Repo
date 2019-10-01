package hello.usercore;

/**
 * Created by rmedini on 27/09/2019.
 */
public class User implements IUser{


    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int age;

    /**
     * Constructor
     */
    public User(){

    }
    /**
     * Constructor
     *
     * @param userName
     * @param firstName
     * @param lastName
     * @param email
     * @param address
     */
    public User(String userName, String firstName, String lastName, String email, String address) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    /**
     *
     * @return current userName.
     */
    @Override
    public String getUserName() {
        return this.userName;
    }

    /**
     * Sets current userName.
     * @param userName userName to set.
     */
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets first name from the current user.
     * @return
     */
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets first name to the current user.
     * @param firstName
     */
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name from the current user.
     * @return
     */
    @Override
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets last name to the current user.
     * @param lastName
     */
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets email from the current user.
     * @return
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Sets email to the current user.
     * @param email
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets address from teh current user.
     * @return
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets address to the current user.
     * @param address
     */
    @Override
    public void setAddress(String address) {
        this.address =address;
    }

    /**
     * Gets id from the current user.
     * @return
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Sets id for the current user.
     * @param id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the age from the current user.
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age to the current user.
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * String representation of a User firstName and lastName.
     * @return
     */
    @Override
    public String toString() {
        return String.format(
                "User[firstName='%s', lastName='%s']",
                firstName, lastName);
    }
}

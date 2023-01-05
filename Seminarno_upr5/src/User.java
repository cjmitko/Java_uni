public class User implements ValidatePhone{
    String username;
    String password;
    int phoneNumber;

    public User(String username, String password, int phoneNumber)
    {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String newusername)
    {
        this.username= newusername;
    }


    public String getPassword()
    {
        return password;
    }

    public void setPassword(String newpassword)
    {
        this.password= newpassword;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int newphoneNumber)
    {
        this.phoneNumber= newphoneNumber;
    }


}

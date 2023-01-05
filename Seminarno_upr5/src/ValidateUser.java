public class ValidateUser extends User{

    public ValidateUser(String username,String password,int phoneNumber)
    {
        super(username,password,phoneNumber);
    }

    public boolean Validate() throws WrongUserException
    {
        String user = "[a-z][0-9]{3,15}$";
        if(this.username.equals(user))
        {
            return true;
        }
        else
        {
            throw new WrongUserException();
        }
    }
}

public interface ValidatePhone {



    public static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {

      if(phoneNumber.contains("[a-z@!.-]"))
      {
          throw new WrongPhoneNumberException();
      }
      else
      {
          return true;
      }
    }
}

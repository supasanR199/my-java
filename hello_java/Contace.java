/**
 * Contace
 */
public class Contace {

    private String firstName, listName, phoneNumber;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }

    /**
     * @return the listName
     */
    public String getListName() {
        return listName;
    }

    /**
     * @param listName the listName to set
     */
    public void setListName(String listName) {
        this.listName = listName.substring(0,1).toUpperCase()+listName.substring(1).toLowerCase();
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.replaceAll("[//D]", " ");
    }

    public String FomatPhoneNumber() {
        return phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");

    }

    public Contace(String firstName, String listName, String phoneNumber) {
        setFirstName(firstName);
        setListName(listName);
        setPhoneNumber(phoneNumber);

    }
    public Contace()
    {
        
    }
    public String toString() {
        return "Contace{"+
        "fistName='"+firstName+'\''+
        ",listName='"+listName+'\''+
        ",phoneNumber'"+FomatPhoneNumber()+'\''+'}';
        
    }
}
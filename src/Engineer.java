public class Engineer {

    private String name;
    private int phone_number;


    public Engineer(String name, int phone_no){
        setName(name);
        setPhoneNo(phone_no);
    }
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNo( int phone_no){
        this.phone_number = phone_no;
    }

    public String getName() {
        return name;
    }

    public int getContactNo()
    {
        return phone_number;
    }

    public String toString() {
        return "Name: " + getName() + " Phone Number: " + getContactNo();
    }


}


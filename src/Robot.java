public class Robot {

    private String name;
    private int age;
    private boolean working = false;

    public Robot(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking(){
        return working;
    }

    public void talkToRobot(){
        working = true;
    }

    public String getWorkingMessage(){
        if(!working){
            throw new IllegalStateException();
        }

        return "I am in working mode";
    }

    public void waitTillWorking(){
        while(!working){
            //do nothing
        }

    }



    public void sendAgeMsg() throws IllegalArgumentException {
        try {
            if (age > 25) {
                throw new IllegalArgumentException("Age too old");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println( "Age ok");
    }

    public double checkCost(){
        if (age <= 5 ){
            return 10000.00;
        }
        else if(age <= 10){
            return  7500.00;
        }
        else return 5000.00;
    }

    public double recordOwnerAndMonthlyPayments(String name) {

        double cost = checkCost();
        System.out.println ( name + cost);
        Owner myOwner = new Owner(name, cost);
        return myOwner.getMonthlyPayments();
    }

    public int recordEngineer(String name, int phone_no){

        Engineer creator = new Engineer(name, phone_no);
        return creator.getContactNo();
    }


}

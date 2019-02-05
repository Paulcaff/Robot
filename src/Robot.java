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
}

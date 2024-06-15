package ImpJava.NewProject;

public class Encapsulation {

   private Integer myAges;
    private String myName;

    public String getMyName () {
        return myName ;
    }
    public  Integer getMyAges(){
        return myAges;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public  void setMyAges(Integer myAges){
        this.myAges = myAges;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();

        encapsulation.setMyName("Hello Mr");
        encapsulation.setMyAges(49);
        System.out.println(encapsulation.getMyName()+ "\n" + encapsulation.getMyAges());

    }

}

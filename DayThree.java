class Gaurav{
    private int salary,age,pincode;
    private String profession,hobey,position;

    public void setDetails(int salary,int age,int pincode){
        this.salary=salary;
        this.age=age;
        this.pincode=pincode;
    }

    public void setDetails(String profession,String hobey,String position){
        this.profession=profession;
        this.hobey=hobey;
        this.position=position;
    }

    public void setDetails(){
        System.out.println(salary+" "+ age+" "+ " "+pincode+" "+profession+" "+hobey+" "+position);
    }
}

public class DayThree {
    public static void main(String[] args) {
        Gaurav Details=new Gaurav();
        Details.setDetails(2000,23,221218);
        Details.setDetails("Developer","Teaching","Tech Mentor");
        Details.setDetails();
    }
}

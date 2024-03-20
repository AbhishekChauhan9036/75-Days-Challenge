class Employee {
    // Data Member
    private String name, JobTittle, Qualification, city, company, gender;
    private int sallary, age;
    private double yearofExperience;

    // Constructor in Java
    /**
     * public Employee(int n,int m){
     * //
     * }
     */

    // Member Function or Method
    public void setName(String name, String JobTittle, String Qualification, String city, String company,
            String gender) {
        this.name = name;
        this.JobTittle = JobTittle;
        this.Qualification = Qualification;
        this.city = city;
        this.company = company;
        this.gender = gender;
    }

    public void setDetails(int sallary, double yearofExperience, int age) {
        this.sallary = sallary;
        this.yearofExperience = yearofExperience;
        this.age = age;
    }

    public void printDetails() {
        System.out.println(name + " " + JobTittle + " " + city + " " + company + " " + gender + " " + sallary);
    }
}

class DayTwo {
    public static void main(String... args) {
        Employee Himanshu = new Employee();
        Himanshu.setName("Himanshu Prajapti", "SDE Intern", "B-Tech 1st Year", "Kanpur", "FunctionUp", "Male");
        Himanshu.setDetails(200000, 1.4, 19);
        Himanshu.printDetails();

        System.out.println();

        Employee Chandan = new Employee();
        Chandan.setName("Chandan Kumar", "Presidence of FunctionUp", "B-Tech 1st Year", "Motihari", "FunctionUp",
                "Male");
        Chandan.setDetails(1000000, 1.4, 19);
        Chandan.printDetails();
    }
}

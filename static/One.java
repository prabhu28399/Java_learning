class Hire{
    static String name;
    int marks;
    String section;

    public void school(){
        System.out.println("without static method " + name  + marks + section);
    }
    public static void college (Hire hr){
        System.out.println("static method " + name + hr.marks + hr.section);
    }
}

class One{
    public static void main(String args[]){
        Hire hr = new Hire();
        Hire.name = "prabha  :";
        hr.marks = 9990;
        hr.section = ":  A";

        Hire hr1 = new Hire();
        hr1.name = "varsha :";
        hr1.marks = 3550;
        hr1.section = ":  AG";

        Hire hr2 = new Hire();
        hr2.name = "karthik :";
        hr2.marks = 4440;
        hr2.section = ":  DE";

        hr.school();
        hr1.school();
        hr2.school();

        hr.college(Hire hr);
        hr.college(Hire hr1);
        hr.college(Hire hr2);

        
    }
}
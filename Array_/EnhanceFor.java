// enhanced for loop 

class Students{
    String name;
    int marks;
}

public class EnhanceFor {
    public static void main (String args[]){
        Students s1 = new Students();
        s1.name = "prabha";
        s1.marks = 55;

        Students s2 = new Students();
        s2.name = "varsha";
        s2.marks = 66;

        Students s3 = new Students();
        s3.name = "charnn";
        s3.marks = 77;

        Students students[] = new Students[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Students stud : students){
            System.out.println(stud.name +  ":"+ stud.marks );
        }
    }
}

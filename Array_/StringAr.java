// adding of objects in one array
class Students{
    String name;
    String grade;
    int marks;
}

public class StringAr {
public static void main (String args[]){
    Students s1 = new Students();
    s1.name = "prabha";
    s1.grade = "B";
    s1.marks = 68;

    Students s2 = new Students();
    s2.name = "karthik";
    s2.grade = "A";
    s2.marks = 95;

    Students s3 = new Students();
    s3.name = "varsha";
    s3.grade = "A+";
    s3.marks = 98;

    Students students[] = new Students[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(int i=0; i<students.length; i++){
        System.out.println(students[i].name + " "+ students[i].grade +" "+ students[i].marks);
    }
}
        

  

    
}


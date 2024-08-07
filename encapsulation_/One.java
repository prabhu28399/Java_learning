class Human {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    void setName(String N){
        name = N;
    }
    public int getAge(){
        return age;
    }
    void setAge(int A){
        age = A;
    }
}
class One{
public static void main (String args[]){
    Human h1 = new Human();
    h1.setAge(45);
    h1.setName("prabha");

    System.out.print(h1.getAge());
    System.out.println(h1.getName());
}
}
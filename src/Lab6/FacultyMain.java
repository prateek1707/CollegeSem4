package Lab6;

class Faculty
{
    int id;
    String name;
    String gender;
    static String college="KIIT";

    Faculty(int i, String nm, String gd)
    {
        id=i;
        name=nm;
        gender=gd;
    }

    static void change()
    {
        college="KIIT-SCE";
    }

    void display()
    {
        System.out.println("Id = "+id+"   Name = "+name+"    Gender = "+gender+"    College = "+college);
    }
}
public class FacultyMain
{
    public static void main(String[] args) {
        Faculty f1=new Faculty(101,"Prateek","Male");
        f1.display();

        Faculty.change();

        Faculty f2=new Faculty(102,"Soumya","Female");
        f2.display();

        Faculty f3=new Faculty(103,"Vinayak","Male");
        f3.display();
    }
}
package Collection;
import java.util.*;

class Student{
    int age;
    String name;
        Student(int age , String name){
            this.age = age;
            this.name = name;
        }
    
}
class customSorting{


    public static void main(String[] args) {

        Comparator<String> cpm = new Comparator<String>() {
            public int compare(String s1 , String s2){
                if(s1.length() < s2.length()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };


        List<String> list = new ArrayList<>();
        list.add("abqwerty");
        list.add("ab");
        list.add("abc");
        list.add("abcd");

        Collections.sort(list , cpm);
        System.out.println(list);



        List<Student> student = new ArrayList<>();

        student.add(new Student(21,"Harish"));
        student.add(new Student(20,"Rohit"));
        student.add(new Student(22,"Suresh"));
        student.add(new Student(19,"Amit"));
        student.add(new Student(19,"Rahul"));


        Comparator<Student> cmp = new Comparator<Student> () {
            public int compare(Student s1, Student s2){
                if(s1.age < s2.age){
                    return -1;
                }
                else if(s1.age > s2.age){
                    return 1;
                }
                else if(s1.age == s2.age){
                    if(s1.name.length() < s2.name.length()){
                        return -1;
                    }
                    else if(s1.name.length() > s2.name.length()){
                        return 1;
                    }
                    else{
                        return 0;
                }
                }
                else{
                    return 0;
                }
            }
        };

        Collections.sort(student , cmp);
        for(Student s : student){
            System.out.println(s.name + " " + s.age);
        }
    }
}
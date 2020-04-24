package soal4;

public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Jales", "Febri", "014");
       
       TextBook myTextBook = new TextBook("matahariku ternyata bulanku", "mama tercinta", "keluarga cemara");
       
       Course myCourse = new Course("bahagia selalu", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}



public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Mehmet hoca","05374955239","HISTORY");
        Teacher t2=new Teacher("Kadir hoca", "05374440010","PHYSIC");
        Teacher t3=new Teacher("Can hoca","05377810749","MUSIC");

        Course history= new Course("History","101","HISTORY",t1);
        Course physic= new Course("Physic","102","PHYSIC",t2);
        Course music= new Course("Music","103","MUSIC",t3);

        history.addTeacher(t1);
        physic.addTeacher(t2);
        music.addTeacher(t3);



        Student student1= new Student("Osman","151220172105","b102",history,physic,music);
        Student student2= new Student("Burcu","151220172106","b102",history,physic,music);
        Student student3= new Student("Buket","151220172107","b102",history,physic,music);

        student1.addBulkExamNote(35,72,80,30,90,100);
        student1.isPass();
        student2.addBulkExamNote(30,10,50,20,100,100);
        student2.isPass();
        student3.addBulkExamNote(20,30,98,100,100,100);
        student3.isPass();





    }
}
public class Course {

    String name;
    String code;
    String prefix;
    Teacher teacher;
    int note;
    int sozluNote;


    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=0;
        this.sozluNote=0;
    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Bu derse yanlış branştan hoca ataması yapıldı.");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }





}

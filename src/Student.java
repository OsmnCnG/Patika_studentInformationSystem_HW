public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1,int note2,int note3,int sozlu1,int sozlu2,int sozlu3){

        if(note1>=0 && note1<=100){
            this.c1.note=note1;
            this.c1.sozluNote=sozlu1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
            this.c2.sozluNote=sozlu2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
            this.c3.sozluNote=sozlu3;
        }

    }



    void isPass(){
        this.average= ((this.c1.note*0.8+ c1.sozluNote*0.2)
                +(this.c2.note)*0.6+ this.c2.sozluNote*0.4+
                (this.c3.note)*0.7+ c3.sozluNote*0.3) / 3.0;
        if ((this.average)>=55){
            System.out.println("------------------------");
            System.out.println("Success.");
            this.isPass=true;
        }else {
            System.out.println("------------------------");
            System.out.println("Fail.");
            this.isPass=false;
        }
        printNote();
    }
    void printNote(){

        System.out.println(this.name+"\n");
        System.out.println(this.c1.name+"Grade\t:"+this.c1.note+"\t\t"+c1.name+"sözlüNotu\t:"+c1.sozluNote);
        System.out.println(this.c2.name+"Grade\t\t:"+this.c2.note+"\t\t"+c2.name+"sözlüNotu\t\t:"+c2.sozluNote);
        System.out.println(this.c3.name+"Grade\t\t:"+this.c3.note+"\t\t"+c3.name+"sözlüNotu\t\t:"+c3.sozluNote);
        System.out.println("Ortalama\t\t:"+this.average);
        System.out.println("------------------------");
    }

}

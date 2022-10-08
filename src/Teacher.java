public class Teacher {

    String name;
    String mpno;
    String branch;


    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }


    void print(){
        System.out.println("Ad:\t\t\t:"+this.name);
        System.out.println("Telefon No\t:"+this.mpno);
        System.out.println("Bölüm:\t\t:"+this.branch);
    }

}

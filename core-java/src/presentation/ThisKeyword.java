package presentation;

public class ThisKeyword {
    int l;
    int b;

    public static void main(String[] args) {
        ThisKeyword t1 = new ThisKeyword();
        System.out.println(t1.l +"\t" +t1.b);

    }
    ThisKeyword(){
        this(3,10);
    }
    ThisKeyword(int l, int b){
    this.l=l;
    this.b=b;


    }















}

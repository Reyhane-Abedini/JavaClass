public class Lecture3 {
    public static void main(String[] args) {
        String myname="reyhane";
        int age=33;
        String S1=String.format("My name is %s and I'm %s years old",myname,age);

        System.out.println(S1);
        System.out.println(S1.toUpperCase());
        String S2=S1.replace(myname,"fanap");
        System.out.println(S2);
        String S3=S2.substring(0,S2.indexOf("and"));
        System.out.println(S3);
        System.out.println(S3.toLowerCase());



    }


}




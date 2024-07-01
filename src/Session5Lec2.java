// متدی بنویسید که جمله ای را به عنوان ورودی بگیرد و طول آخرین کلمه را برگرداند

public class Session5Lec2 {


    public static void main(String[] args) {
        String s = "Hello to my colleagues";
        String[] s2=s.split(" ");
        String last=s2[s2.length-1];
        int count=last.length();
        System.out.println(count);
    }
    public static String[] count(String s){
        String[] word = s.split(" ");
        return word;

    }
}


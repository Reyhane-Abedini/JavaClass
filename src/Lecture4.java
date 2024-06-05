import java.sql.SQLOutput;

public class Lecture4 {
    public static void main(String[] args) {
        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;
        int total=0;
        String T="XLIIMC";

        for(int i=0;i<T.length();i++){
            String P=String.valueOf(T.charAt(i));

            switch (P){
                case "I":
                    total=total+1;
                    break;

                case "V":
                    total=total+5;
                    break;

                case "X":
                    total=total+10;
                    break;

                case "L":
                    total=total+50;
                    break;

                case "C":
                    total=total+100;
                    break;

                case "D":
                    total=total+500;
                    break;

                case "M":
                    total=total+1000;
                    break;

                default:
                    System.out.println("Incorrect Data");

            }
        }
        System.out.println(total);
        }
}


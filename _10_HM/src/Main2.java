import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        String s1 = "Hello world I like Java";
//
//        String[] split = s1.split(" ");
//        for (String sF : split
//        ) {
//            System.out.println(sF.trim());
//        }
//
//        String ch1 = split[0];
//        for (int i = 0; i < split.length; i++) {
//            if (ch1.length() < split[i].length())
//                ch1 = split[i];
//        }
//        System.out.println();
//        System.out.println(ch1 + "-" + ch1.length());
//
//
//        String ch = split[0];
//        for (int i = 0; i < split.length; i++) {
//            if (ch.length() > split[i].length())
//                ch = split[i];
//        }
//        System.out.println();
//        System.out.println(ch + "-" + ch.length());

        String s10 = "Hello Anna I like Java";
        String[] split = s10.toLowerCase().split(" ");
        for (String sF : split
        ) {

        }

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n> split.length){
            System.out.println("Такого слова нет");
        }
        String pl = split[n];


        String s=pl+"";
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        System.out.println(s1);
        boolean equals=s1.equals(s);
        System.out.println(equals);


        String HH = "Hello";
        String replace0=HH.replace("H", "HH");
        String replace1=replace0.replace("e", "ee");
        String replace2=replace1.replace("l", "ll");
        String replace3=replace2.replace("o", "oo");
        System.out.println(replace3);
    }
}

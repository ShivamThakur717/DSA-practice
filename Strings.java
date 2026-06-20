package Code;

public class Strings {
    public static void main(String[]args){
//        String name ="Shivam Thakur";
//        String name2="Thakur Shivam";
//        System.out.println(name2);
//        System.out.println(name);
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.printf(builder.toString());
        builder.reverse();
    }
}

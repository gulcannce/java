package day21_varargs_stringBuilder;

public class C07_StringBuilder_EklemeSilme {

    public static void main(String[] args) {


        StringBuilder sb =new StringBuilder("Java Candır");

        sb.append(".");

        System.out.println(sb); //java candır

        String str ="Hava cok guzel";

        sb.append(str,5,8);

        System.out.println(sb); //java candır.cok

        sb.insert(5,"cok ");

        System.out.println(sb); //java cok candır.cok

        sb.insert(19,str,8,14);
        System.out.println(sb);

        sb.delete(16,25);
        System.out.println(sb); //java cok candır

        //sondaki karakteri silin
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        //index saymadan "cok" silin

        int indexCok = sb.indexOf("cok");
        sb.delete(indexCok,indexCok+4);

        System.out.println(sb); // java candır



    }
}

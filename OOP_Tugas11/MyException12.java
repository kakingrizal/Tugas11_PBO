package PBOTugas11;

import java.lang.Exception;

public class MyException12 extends Exception{
    private String Teks;
    MyException12(String s)
    {
        Teks="Exception generated by: "+s;
        System.out.println(Teks);
    }
}

class Eksepsi{
    static void tampil(String s)throws Exception{
        System.out.println("Tampil");
        if(s.equals("amir"))
        {
        throw new MyException12(s);
        }
        System.out.println("OK!");
    }
    public static void main(String[] args)throws Exception{
        try
        {
            tampil("ali");
            tampil("amir");
        }
        catch(MyException ex)
        {
            System.out.println("Tangkap:"+ex);
        }
    }
}

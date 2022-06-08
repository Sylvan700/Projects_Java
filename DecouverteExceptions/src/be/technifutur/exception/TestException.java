package be.technifutur.exception;

import java.util.SortedMap;

public class TestException
{

    public static void main(String[] args)
    {
        System.out.println("TestException.main Début");
        fct1(29);
        System.out.println("TestException.main Fin");
    }

    private static void fct1(int val)
    {
        System.out.println("TestException.fct1 Début");
        try
        {
            System.out.println("TestException.fct1 avant appel");
            fct2(val);
            System.out.println("TestException.fct1 après appel");
        }
        catch (MyException e)
        {
            //System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

        System.out.println("TestException.fct1 Fin");
    }

    private static void fct2(int val) throws MyException
    {
        System.out.println("TestException.fct2 Début");
        fct3(val);
        System.out.println("TestException.fct2 Fin");
    }

    private static void fct3(int val)throws MyException
    {
        System.out.println("TestException.fct3 Début");
        if(val < 10)
        {
            throw new IllegalArgumentException(val + " est plus petit que 10");
        }
        else if ( val < 20)
        {
            throw new MyException(val + " est entre 10 et 20");
        }
        else if(val < 30)
        {
            throw new MyRuntimeException("runtime");
        }
        System.out.println("TestException.fct3 Fin");
    }

}

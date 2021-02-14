package test;

import model.BaseballGame;

public class BaseballGameTest 
{
    public static void main(String[] args)
    {
        final int MAX = 5000;

        for (int i = 0 ; i < MAX ; i++)
        {
            BaseballGame b = new BaseballGame();
            assert checkKey(b.getKey());
        }
    }    

    private static boolean checkKey(int[] key)
    {
        if(key[0] == key[1] || key[0] == key[2] || key[1] == key[2])
            return false;
        else    
            return true;
    }
}

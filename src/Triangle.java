/*
Mason Fisher
09/13/2019
First Program: Triangle
V1
*/


public class Triangle {
public static final int COUNT=10;
    public static void main(String [] args)
    {
        for(int line=1; line <=COUNT; line++)
        {
            for(int space = 0; space < -line+COUNT; space ++){
                System.out.print(" ");
            }
        for (int counter = 0; counter < line; counter++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

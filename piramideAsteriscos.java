public class piramideAsteriscos{

    public static void main(String [] args){
        for(int i = 0; i < 11; i++){//pisos que tendra la piramide
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

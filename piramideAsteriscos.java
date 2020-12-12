public class piramideAsteriscos{

    public static void main(String [] args){
        for(int i = 0; i < 11; i++){//pisos que tendra la piramide
            for(int j = 0; j < i; j++){//aumentando en cada ciclo
                System.out.print("*");//asteriscos que tendra cada piso
            }
            System.out.println("");
        }

    }
}

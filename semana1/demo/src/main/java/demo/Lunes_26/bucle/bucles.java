package demo.Lunes_26.bucle;
public class bucles {
    public static void main(String[] args) {
    int [] array = {2,4,2,4,1,2,9,10};

        for(int i : array){
            if(i % 2 != 0){
                System.out.println("numero impar" + " " + i );
            }else{
                System.out.println("numero par" + " " + i );
            }
        }
    }
}

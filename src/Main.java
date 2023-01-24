import java.lang.Math;

public class Main {

    public static int func(){
        int rand=(int)Math.floor((Math.random()*8)-1);
        return rand;
    }
    public static void main(String[] args) {
        int team=1;
        int score=0;
        int wickets=0;
        while(team<=2){
            int run=func();
            if(run==-1) {
                //System.out.println("wicket");
                wickets++;
                if (wickets == 10) {
                    team++;
                    wickets=0;
                    System.out.print(score);
                    System.out.println("/10");
                    score=0;
                }
            }else{
                score+=run;
                /*System.out.print(run);
                System.out.println(" runs"); */
            }
        }
    }
}
public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker ();
    }
    public PatternMaker (){
        pattern5();

    }

    public void pattern1(){
        for(int x = 0; x<6; x++){
       //     for(int y = 0; y<1; y++){
                System.out.println(x*5);

      //      }
        }
    }
    public void pattern2(){
        for(int x = 0; x<6; x++){
            System.out.println(x*5+2);
        }
    }

    public void pattern3(){
        for(int x = 21; x>0; x=x-4){
            System.out.print(x + "\t");
        }
    }

    public void pattern5(){
        for(int x = 0; x<4; x++){
            for(int z = 1; z<5; z++){

                System.out.print(z+ "\t");

            }
            System.out.println();
        }
    }
}



public class App {
    public static void main(String args[]) {

        int flag=0;
        int primeCounter=0;
        int start=2;
        System.out.println("First 100 Prime Numbers:");
        while(primeCounter<100) {
// execute until j is greater than math.sqrt start
            for(int j=2; j<= Math.sqrt(start);j++) {

                if((start%j)==0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(primeCounter+1+": "+start + " ");
                primeCounter++;
            }
            start++;
            flag=0;
        }
    }
}

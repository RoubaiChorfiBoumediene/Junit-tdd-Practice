public class MathUtils {

    public double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double nFirstNumber(int n) {
        if (n>0)
        return n * (n + 1) / 2;
        else return 0 ;
    }
    public int simpleArraySum(int[] ar) {
        int result =0;
        for (int i=0 ; i<ar.length; i++ ){
            result = result + ar[i] ;
        }
        return result;
    }
}


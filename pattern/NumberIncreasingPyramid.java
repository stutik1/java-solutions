package pattern;

public class NumberIncreasingPyramid {
    public static void numberIncreasing(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        numberIncreasing(n);
    }
}

package Week01Theory.DIPBefore;

public class Test {
    static void main() {
       int numbers[]={1,5,2,9,4,6};
       arrayFilter(numbers,"Even");
    }
    static void arrayFilter(int[] array,String filterType){
        for (int i:array){
            if (filterType.equals("Odd") && i%2!=0 )
                System.out.println(i);
            if (filterType.equals("Even") && i%2==0 )
                System.out.println(i);
        }
    }
}

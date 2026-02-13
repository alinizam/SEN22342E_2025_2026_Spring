package Week01Theory.DIPAfter.DIPBefore;

public class Test {
    static void main() {
       int numbers[]={1,5,2,9,4,6,10};
       IFilter evenFilter=(i)->(i%2==0);
       arrayFilter(numbers,evenFilter);
       System.out.println("-----------------");
       IFilter oddFilter=(i)->{return i%2==1;};
       arrayFilter(numbers,oddFilter);
       System.out.println("-----------------");
       arrayFilter(numbers,(i)->(i%5==0));
    }
    static void arrayFilter(int[] array,IFilter filter){
        for (int i:array){
            if (filter.check(i) ) {
                System.out.println(i);
            }
        }
    }
}

//package DS.stack;

import java.util.Arrays;
import java.util.List;

public class mergeInter {
    public static void main(String ar[]){
        List<Interval> in = Arrays.asList(
                new Interval(1, 5), new Interval(2, 3),
                new Interval(4, 6), new Interval(7, 8),
                new Interval(8, 10), new Interval(12, 15)
        );

        mergeIntervals(in);
    }
}

class Interval{
    int begin,end;
    Interval(int b,int e){
        begin=b;
        end=e;
    }
    
}

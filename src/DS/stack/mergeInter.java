//package DS.stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    static void mergeIntervals(List<Interval> in){
        Collections.sort(in,new sortInt());
    }
}

class sortInt implements Comparator<Interval>{
    public int compare(Interval a, Interval b){
        return  a.begin-b.begin;
    }
}
class Interval {
    int begin, end;

    Interval(int b, int e) {
        begin = b;
        end = e;
    }

    @Override
    String toString() {
        return "(" + begin + " , " + end + ")";
    }
}

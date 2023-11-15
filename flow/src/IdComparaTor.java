import java.util.Comparator;

public class IdComparaTor implements Comparator<StreamComparator> {


    @Override
    public int compare(StreamComparator str1, StreamComparator str2) {
        if (str1.id == str2.id) return 0;
        else if (str1.id < str2.id) {
            return -1;

        } else {
            return 1;
        }
    }

}

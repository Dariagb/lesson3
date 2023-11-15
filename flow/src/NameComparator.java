import java.util.Comparator;


    class NameComporator implements Comparator<StreamComparator> {
        @Override
        public int compare(StreamComparator str1, StreamComparator str2) {
            return str1.name.compareTo(str2.name);
        }
    }


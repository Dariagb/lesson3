import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<String> {
    @Override
    public Iterator<String> iterator() {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Olga");
        arrayList.add("Lev");
        arrayList.add("Elena");
        arrayList.add("Artem");
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<StreamComparator> list = new ArrayList<>();
        StreamComparator str1= new StreamComparator(12,"filosof");
        StreamComparator str2= new StreamComparator(13,"it");
        StreamComparator str3= new StreamComparator(14,"teacher");
        list.add(str1);
        list.add(str2);
        list.add(str3);
        System.out.println(list);
        Collections.sort(list, new NameComporator() );
        System.out.println(list);
    }
}
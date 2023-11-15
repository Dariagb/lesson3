
//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
public class StreamComparator {
    int id;
    String name;
    String surname;

    public StreamComparator( int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "StreamComparator{"+
                "id="+ id+
                ", name='"+name+

                '}';
    }
}

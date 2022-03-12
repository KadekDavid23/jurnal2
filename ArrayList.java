import java.util.ArrayList;
import java.util.Collections;

public class ArrayList <S extends Comparable<? super S>> {
    private final ArrayList<S> list;

    public ArrayList(int capacity) {
        int testCapacity = capacity > 0? capacity:0;
        list = new ArrayList<>(testCapacity);
    }

    public void addData(S values){
        list.add(values);
    }

    public void display(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }
        System.out.println();
    }

    public void displaySort(){
               Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }
        System.out.println();
    }

    public  void removeData(S entry){
        list.remove(entry);
    }

    public void editData(S oldData, S newData){
        int data = list.indexOf(oldData);
        list.set(data,newData);
    }
}
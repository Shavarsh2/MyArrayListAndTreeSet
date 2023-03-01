import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        MyArray<User> myArray = new MyArray<>();
        myArray.add(new User(5,"aa"));
        myArray.add(new User(6,"bb"));
        myArray.add(new User(8,"cc"));
        myArray.add(new User(5,"dd"));
        System.out.println(myArray.get(2));
        myArray.print();
        System.out.println("-------------");
        Set<User> treeSet = new TreeSet<>();
        treeSet.add(new User(15,"a"));
        treeSet.add(new User(65,"b"));
        treeSet.add(new User(16,"c"));
        treeSet.add(new User(65,"d"));
        treeSet.add(new User(75,"e"));
        System.out.println(treeSet);
        System.out.println("--------------");
        TreeSet<User> treeSet1 = new TreeSet<>(new UserComparator());
        treeSet1.add(new User(23,"a"));
        treeSet1.add(new User(73,"B"));
        treeSet1.add(new User(51,"c"));
        treeSet1.add(new User(10,"d"));
        System.out.println(treeSet1);
    }
}
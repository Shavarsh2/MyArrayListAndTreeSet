import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1.getName().compareToIgnoreCase(o2.getName()) > 0){
            return 1;
        } else if (o1.getName().compareToIgnoreCase(o2.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}

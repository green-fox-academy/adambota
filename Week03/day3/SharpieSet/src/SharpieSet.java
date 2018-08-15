import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> set = new ArrayList<>();

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : set) {
            if (sharpie.inkAmount > 0) count++;
        }
        return count;
    }

    public void removeTrash() {
        for (Sharpie sharpie : set) {
            if (sharpie.inkAmount == 0) set.remove(sharpie);
        }
    }
}

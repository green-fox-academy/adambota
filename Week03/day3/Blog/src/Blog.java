import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> posts = new ArrayList<>();

    public void add(BlogPost post) {
        this.posts.add(post);
    }

    public void delete(int index) {
        posts.remove(index);
    }

    public void update(int index, BlogPost post) {
        posts.add(index, post);
    }
}

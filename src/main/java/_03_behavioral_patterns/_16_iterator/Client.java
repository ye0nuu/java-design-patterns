package _03_behavioral_patterns._16_iterator;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Board board = new Board();
        board.addPost("");
        board.addPost("");
        board.addPost("");

        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i=0; i<posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }

    }
}

import java.util.LinkedList;

public class Account implements Comparable<Account> {
    private String name;
    private String description;
    private LinkedList<Post> posts;

    // list of posts
    public Account(String n, String d) {
        name = n;
        description = d;
        posts = new LinkedList<Post>();

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void getPosts() {

        for (int x=0; x<= posts.size(); x++){

            System.out.println( posts.get(x).title);
            System.out.println( "_______________________");
            System.out.println( posts.get(x).video);
            System.out.println( "_______________________");
            System.out.println( posts.get(x).likes);
        }
        
    }

    public int compareTo(Account another) {
        return name.toLowerCase().compareTo(another.name.toLowerCase());
    }

    public String toString() {
        return name + " " + description;

    }

    public void addPost(String title, String video, int likes) {

        posts.add(new Post(title, video, likes));
    }

}

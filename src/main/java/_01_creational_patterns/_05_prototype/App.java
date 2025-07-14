package _01_creational_patterns._05_prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        GithubRepository repo = new GithubRepository();
        repo.setUser("Whiteship");
        repo.setName("live-study");

        GithubIssue gi = new GithubIssue(repo);
        gi.setId(1);
        gi.setTitle("프로토타입");

        String url = gi.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) gi.clone();
        System.out.println(clone.getUrl());

        repo.setUser("yeonwoo");

        System.out.println(clone != gi);
        System.out.println(clone.equals(gi));
        System.out.println(clone.getClass() == gi.getClass());
        System.out.println(clone.getRepository() == gi.getRepository());

        System.out.println(clone.getUrl());
    }
}

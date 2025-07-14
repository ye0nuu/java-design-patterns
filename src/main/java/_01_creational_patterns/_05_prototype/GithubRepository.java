package _01_creational_patterns._05_prototype;

public class GithubRepository {
    // 저장소 정보(유저, 이름)

    private String user, name;  // github 정보

    public String getUser()             { return user; }
    public void setUser(String user)    { this.user = user; }

    public String getName()             { return name; }
    public void setName(String name)    { this.name = name; }
}

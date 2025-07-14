package _01_creational_patterns._05_prototype;

import java.util.Objects;

public class GithubIssue implements Cloneable {

    // 이슈 정보 (id, 제목, 위 저장소 객체)

    private int id;
    private String title;
    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId()          { return id; }
    public void setId(int id)   { this.id = id; }

    public String getTitle()            { return title; }
    public void setTitle(String title)  { this.title = title; }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    // clone() 오버라이드
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // repository 새로 만들어서 값 복사 -> 깊은 복사하기 위해 레포 생성
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        // 기존 저장소 정보 새 저장소에 복사
        GithubIssue gi = new GithubIssue(repository);
        gi.setId(this.id);
        gi.setTitle(this.title);

        return gi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) &&
                Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        // 값 조합해서 고유 숫자 생성
        return Objects.hash(id, title, repository);
    }
}

package _03_behavioral_patterns._20_state;

public class Client {
    public static void main(String[] args) {

        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student yeonwoo = new Student("yeonwoo");
        yeonwoo.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(yeonwoo);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());

    }
}

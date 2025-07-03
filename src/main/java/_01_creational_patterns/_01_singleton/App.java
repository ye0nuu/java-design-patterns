package _01_creational_patterns._01_singleton;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Settings5 settings = Settings5.INSTANCE;    // 인스턴스 생성

        Settings5 settings1 = null;

        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        // 역직렬화
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println(settings == settings1);

    }
}

package Habr2;

import java.io.IOException;

   class App1 {
        public static void main(String[] args) {
            throw new Exception();
        }
    }

   class App2 {
        public static void main(String[] args) throws IOException {
            throw new Exception();
        }
    }

class App6 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws Exception {
    }
}

class App14 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {

        }
    }
}

class App15 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }
}

class App16 {
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Exception e) {
            // ...
        }
    }
}

class App17 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Error e) {

        }
    }
}

class App19 {

    public static void main(String[] args) throws Exception {
        Throwable t = new Exception();
        throw t;
    }
}

class App20 {
    public static void main(String[] args) throws Exception {
        Object ref = "Hello!";
        char c = ref.charAt(0);
    }
}

class App21 {
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

class Parent2 {
    public void f() throws IOException, InterruptedException {}
}

class Child2 extends Parent2 {
    @Override
    public void f() throws Exception {}
}













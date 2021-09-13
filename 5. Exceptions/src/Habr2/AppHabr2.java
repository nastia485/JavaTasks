package Habr2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class App3 {
        public static void main(String[] args) throws Exception {
            throw new Exception();
        }
    }

class App4 {
    public static void main(String[] args) throws Throwable {
        throw new Exception();
    }
}

class App5 {
    public static void main(String[] args) throws Exception {

    }
}

class App7 {
    public static void main(String[] args) throws Throwable {
        f();
    }
    public static void f() throws Exception {
    }
}

class App8 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }
}

class App9 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App10 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
}

class App11 {
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App12 {
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
}

class App13 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }
    public static void f0() throws EOFException {...}
    public static void f1() throws FileNotFoundException {...}
    public static void f2() throws InterruptedException {...}
}

class App18 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }
}

class App22 {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

class Parent {

    public void f() throws IOException, InterruptedException {}
}

class Child extends Parent {

    @Override
    public void f() throws FileNotFoundException {}
}





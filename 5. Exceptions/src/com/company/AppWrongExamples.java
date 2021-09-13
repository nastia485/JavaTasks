package com.company;


class App2 {
    public static void main(String[] args) throws String {}
}


class App4 {
    public static void main(String[] args) {
        try {
        } catch (String s) {}
    }
}


class App6 {
    public static void main(String[] args) {
        throw new String("Hello!");
    }
}


class App7 {
    public static void main(String[] args) {
        throw null;
    }
}

class App8 {
    public static void main(String[] args) {
        Error ref = new Error();
        throw ref;
    }
}

class App9 {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}

class App10 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

 

class App14 {
    public static double sqr(double arg) {
        return "hello!";
    }
}

class App15 {
    public static double sqr(double arg) {
    }
}

class App16 {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        }
    }
}

class App17 {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }
    public static double sqr(double arg) {
    }
}

class App19 {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }
    public static double sqr(double arg) {
        while (true) ;
    }
}

class App20 {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        } else {
            while (true);
        }
    }
}

class App23 {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}

class App24 {
    public static int area(int width, int height) {
        return width * height;
    }

    public static int area2(int width, int height) {
        if (width < 0 || height < 0) {

        } else {
            return width * height;
        }
    }

    public static int area3(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Bad ...");
        }
        return width * height;
    }

    public static int area4(int width, int height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static int area5(int width, int height) {
        if (width < 0 || height < 0) {
            System.exit(0);
        }
        return width * height;
    }

}

class App51 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}












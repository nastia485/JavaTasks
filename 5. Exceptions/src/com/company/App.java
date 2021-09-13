package com.company;


class App1 {
        public static void main(String[] args) throws Throwable {}
    }


class App3 {
    public static void main(String[] args) {
        try {
        } catch (Throwable t) {}
    }
}


class App5 {
    public static void main(String[] args) {
        throw new Error();
    }
}


class App11 {
    public double sqr(double arg) {
        return arg * arg;
    }
}

class App12 {
    public double sqr(double arg) {
        int k = 1;
        return k;
    }
}

 class App13 {
    public double sqr(double arg) {
        int k = 1;
        return (double) k;
    }
}

class App18 {
    public static double sqr(double arg) {
        while (true);
    }
}

class App21 {
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}

class App22 {
    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
        } else if (time % 2 == 1) {
            {
                while (true) ;
            } else {
                throw new RuntimeException();
            }
        }
    }
}

class App25 {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}


class App26 {
    public static void main(String[] args) {
        int x = 42;
        int y = x * x;
        x = x * y;
    }
}

class App27 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }
    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }
    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return;
        }
        System.err.println(".   .   .   #4.out");
    }
}

class App28 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}

class App29 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}

class App30 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        try {
            f();
        } catch (Error e) {
            System.err.println("#1.CATCH");
        }
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}

class App31 {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        try {
            h();
        } catch (Error e) {
            System.err.println(".   .   #3.CATCH");
        }
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out");
    }
}

class App32 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
}

class App33 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }
}

class App34 {
    public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
        try {
            System.err.print(" 0");
            if (true) {throw new Exception();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}

class App35 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new Error();}
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}

class App36 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {throw new Error();}
        }
        System.err.println(" 3");
    }
}

class App37 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {throw e;}
        }
        System.err.println(" 3");
    }
}

class App38 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
            if (true) {throw new Error();}
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}

class App39 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {throw new Error();}
                System.err.print(" 2.3");
            } catch (Throwable t) {
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) {
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}

class App40 {
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
        } catch (RuntimeException e) {
        }
    }
}

class App41 {
    public static void main(String[] args) {
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
}

class App42 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}

class App43 {
    public static void main(String[] args) {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}

class App44 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
}

class App45 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}

class App46 {
    public static void main(String[] args) {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }
}

class App47 {
    public static void main(String[] args) {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}

class App48 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }
    }
}

class App49 {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }
}

class App50 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {throw new RuntimeException();}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}

class App52 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}

class App53 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}


class App54 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }
}

class App55 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}

class App56 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}

class App57 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    public static int f() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {
                // nothing
            }
            finished = true;
        } finally {
            if (finished) {

            } else {

            }
        }
    }
}

class App58 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");

            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}

class App59 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new Error();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}

class App60 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}

class App61 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new RuntimeException();
                } catch (Exception e) {
                } finally {}
            } catch (Exception e) {
            } finally {}
        } catch (Exception e) {
        } finally {}
    }
}


class App62 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");

                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }
}

class App63 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new RuntimeException();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }
}

class App64 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }
}

class App65 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");
        } finally {
            System.err.print(" 7");
        }
        System.err.print(" 8");
    }
}


























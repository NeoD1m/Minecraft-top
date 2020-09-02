package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        HashMap<String, EmptySymbol> lettersMap  = new HashMap<>() {{
            put("p", new P());
            put("t", new T());
            put("f", new F());
            put("a", new A());
            put("c", new C());
            put("r", new R());
            put("n", new N());
            put("i", new I());
            put("m", new M());
            put("l", new L());
            put("o", new O());
            put("k", new K());
            put("e", new E());
            put(" ", new Space());
        }};

        EmptySymbol[] objects = new EmptySymbol[name.length()];
        for (int i = 0;i<name.length();++i) {
            EmptySymbol temp = lettersMap.get(String.valueOf(name.charAt(i)));
            objects[i] = temp != null ? temp : new Space();
        }

        for (int i=0;i<5;++i) {
            for (int j = 0; j < name.length(); ++j)
                System.out.print(objects[j].getString(i));
            System.out.println();
        }
    }
}

abstract class EmptySymbol{
    String[] arr = new String[5];

    public String getString(int row_num) {
        StringBuilder result = new StringBuilder();
        for (int i=0;i<5;++i)
            result.append(arr[row_num].charAt(i));
        return result.toString()+" ";
    }
}
class M extends EmptySymbol{
    M(){
        arr = new String[]{
                "#   #",
                "## ##",
                "# # #",
                "#   #",
                "#   #"
        };
    }
}
class I extends EmptySymbol{
    I(){
        arr = new String[]{
                "#####",
                "  #  ",
                "  #  ",
                "  #  ",
                "#####"
        };
    }
}class T extends EmptySymbol{
    T(){
        arr = new String[]{
                "#####",
                "  #  ",
                "  #  ",
                "  #  ",
                "  #  "
        };
    }
}
class N extends EmptySymbol{
    N(){
        arr = new String[]{
                "#   #",
                "##  #",
                "# # #",
                "#  ##",
                "#   #"
        };
    }
}
class C extends EmptySymbol{
    C(){
        arr = new String[]{
                "#####",
                "#    ",
                "#    ",
                "#    ",
                "#####"
        };
    }
}
class R extends EmptySymbol{
    R(){
        arr = new String[]{
                "#### ",
                "#   #",
                "#### ",
                "#  # ",
                "#   #"
        };
    }
}
class A extends EmptySymbol{
    A(){
        arr = new String[]{
                "  #   ",
                "#   #",
                "#####",
                "#   #",
                "#   #"
        };
    }
}
class L extends EmptySymbol{
    L(){
        arr = new String[]{
                "#    ",
                "#    ",
                "#    ",
                "#    ",
                "#####"
        };
    }
}
class F extends EmptySymbol{
    F(){
        arr = new String[]{
                "#####",
                "#    ",
                "#### ",
                "#    ",
                "#    "
        };
    }
}
class P extends EmptySymbol{
    P(){
        arr = new String[]{
                "#### ",
                "#   #",
                "#### ",
                "#    ",
                "#    "
        };
    }
}
class O extends EmptySymbol{
    O(){
        arr = new String[]{
                "#####",
                "#   #",
                "#   #",
                "#   #",
                "#####"
        };
    }
}

class K extends EmptySymbol{
    K(){
        arr = new String[]{
                "#   #",
                "#  # ",
                "# #  ",
                "# #  ",
                "#  # "
        };
    }
}

class E extends EmptySymbol{
    E(){
        arr = new String[]{
                " ### ",
                " #   ",
                " ### ",
                " #   ",
                " ### "
        };
    }
}

class Space extends EmptySymbol{
    Space(){
        arr = new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };
    }
}
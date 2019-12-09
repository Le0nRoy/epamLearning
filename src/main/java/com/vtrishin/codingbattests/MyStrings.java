package com.vtrishin.codingbattests;

public class MyStrings {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        int half = out.length ( ) / 2;
        return out.substring ( 0, half ) + word + out.substring ( half, out.length ( ) );
    }

    public String extraEnd(String str) {
        String res = str.substring ( str.length ( ) - 2, str.length ( ) );
        return res + res + res;
    }

    public String firstTwo(String str) {
        if ( str.length ( ) < 2 ) {
            return str;
        }
        String res = str.substring ( 0, 2 );
        return res;
    }

    public String firstHalf(String str) {
        return str.substring ( 0, str.length ( ) / 2 );
    }

    public String withoutEnd(String str) {
        if ( str.length ( ) < 2 ) {
            return "";
        }
        return str.substring ( 1, str.length ( ) - 1 );
    }

    public String comboString(String a, String b) {
        if ( b.length ( ) > a.length ( ) ) {
            return a + b + a;
        }
        return b + a + b;
    }

    public String nonStart(String a, String b) {
        return a.substring ( 1, a.length ( ) ) + b.substring ( 1, b.length ( ) );
    }
}

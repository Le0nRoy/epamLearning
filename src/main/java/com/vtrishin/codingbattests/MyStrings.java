package com.vtrishin.codingbattests;

public class MyStrings {
    public String helloName( String name ) {
        String result = "";
        if ( name == null || name.equals( "" ) ) {
            return result;
        }
        result = "Hello " + name + "!";
        return result;
    }

    public String makeAbba( String a, String b ) {
        String result = "";
        if ( a == null || b == null ) {
            return result;
        }
        result = a + b + b + a;
        return result;
    }

    public String makeTags( String tag, String word ) {
        String result = "";
        if ( word == null ) {
            return result;
        }
        if ( tag == null ) {
            tag = "";
        }
        result = "<" + tag + ">" + word + "</" + tag + ">";
        return result;
    }

    public String makeOutWord( String out, String word ) {
        String result = "";
        if ( out == null && word == null ) {
            return result;
        } else if ( out == null ) {
            result = word;
            return result;
        } else if ( word == null ) {
            result = out;
            return result;
        }
        int half = out.length() / 2;
        return out.substring( 0, half ) + word + out.substring( half, out.length() );
    }

    public String extraEnd( String str ) {
        String result = "";
        if ( str == null || str.equals( "" ) ) {
            return result;
        }
        result = str.substring( str.length() - 2, str.length() );
        return result + result + result;
    }

    public String firstTwo( String str ) {
        String result = "";
        if ( str == null ) {
            return result;
        }
        if ( str.length() < 2 ) {
            result = str;
            return result;
        }
        result = str.substring( 0, 2 );
        return result;
    }

    public String firstHalf( String str ) {
        String result = "";
        if ( str == null ) {
            return result;
        }
        result = str.substring( 0, str.length() / 2 );
        return result;
    }

    public String withoutEnd( String str ) {
        String result = "";
        if ( str == null ) {
            return result;
        }
        if ( str.length() < 2 ) {
            return result;
        }
        result = str.substring( 1, str.length() - 1 );
        return result;
    }

    public String comboString( String a, String b ) {
        String result = "";
        if ( a == null || b == null ) {
            return result;
        }
        if ( b.length() > a.length() ) {
            result = a + b + a;
            return result;
        }
        result = b + a + b;
        return result;
    }

    public String nonStart( String a, String b ) {
        String result = "";
        if ( a == null || b == null ) {
            return result;
        }
        result = a.substring( 1, a.length() ) + b.substring( 1, b.length() );
        return result;
    }
}

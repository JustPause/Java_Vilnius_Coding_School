package Justinas.corp;

abstract class Data {
    static String p_InputText;
    static String p_OutputText = "";
    static String p_InputKey;
    static String p_Key;
    static long p_Key_For_Text;
 
    public static String getP_Key() {
        return p_Key;
    }

    public static long getP_Key_For_Text() {
        return p_Key_For_Text;
    }
}

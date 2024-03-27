package com.example.rmp777.Data;
public class Data {
    private String string12;
    private String string13;
    private String string21;
    private String string23;
    private String string31;
    private String string32;
    public Data(){
        this.string12="Данные из первого фрагмента во второй";
        this.string13="Данные из первого фрагмента в третий";
        this.string21="Данные из второго фрагмента в первый";
        this.string23="Данные из второго фрагмента в третий";
        this.string31="Данные из третьего фрагмента в первый";
        this.string32="Данные из третьего фрагмента во второй";
    }
    public Data(String s12,String s13,String s21,String s23,String s31,String s32){
        this.string12=s12;
        this.string13=s13;
        this.string21=s21;
        this.string23=s23;
        this.string31=s31;
        this.string32=s32;
    }

    public void setString12(String string12) {
        this.string12 = string12;
    }

    public void setString13(String string13) {
        this.string13 = string13;
    }

    public void setString21(String string21) {
        this.string21 = string21;
    }

    public void setString23(String string23) {
        this.string23 = string23;
    }

    public void setString31(String string31) {
        this.string31 = string31;
    }

    public void setString32(String string32) {
        this.string32 = string32;
    }

    public String getString12() {
        return string12;
    }

    public String getString13() {
        return string13;
    }

    public String getString21() {
        return string21;
    }

    public String getString23() {
        return string23;
    }

    public String getString31() {
        return string31;
    }

    public String getString32() {
        return string32;
    }
}

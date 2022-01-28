package com.mobiluygulama.hesapmakinesi;

public class Hesapla {

    private int gelenSayi1, gelenSayi2;

    public Hesapla(int gelenSayi1, int gelenSayi2) { //constractor oluşturduk
        this.gelenSayi1 = gelenSayi1;
        this.gelenSayi2 = gelenSayi2;
    }

    //1. yol

    public int toplama(){ //toplama işlemi içim method oluşturduk
        return gelenSayi1 + gelenSayi2;
    }

    public int cikarma(){ //çıkarma işlemi içim method oluşturduk
        return gelenSayi1 - gelenSayi2;
    }

    public int carpma(){ //çarpma işlemi içim method oluşturduk
        return gelenSayi1 * gelenSayi2;
    }

    public int bolme(){ //bölme işlemi içim method oluşturduk
        return gelenSayi1 / gelenSayi2;

    }

    //2. yol

    /* public int sonucuGonder(String islemTuru) {
        switch (islemTuru) {
            case "+":
                return gelenSayi1 + gelenSayi2;

            case "-":
                return gelenSayi1 - gelenSayi2;

            case "*":
                return gelenSayi1 * gelenSayi2;

            case "/":
                return gelenSayi1 / gelenSayi2;


            default:
                return 0;
        }
    } */

}

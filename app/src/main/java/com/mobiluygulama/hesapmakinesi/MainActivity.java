package com.mobiluygulama.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textBirinciSayi, textIkinciSayi; //EditText'i scope olarak tanımladık
    private TextView textSonuc; //TextView'ı scope olarak tanımladık
    private String birinciSayi, ikinciSayi; //işlem yapmak için 2 tane değişken tanımladık
    private int s1, s2, sonuc; //aldığımız değerleri integer'a çevirmek için s1 ve s2 değişkenlerini oluşturduk, s1 ve s2 üzerinde işlem yapmak için sonuc değişkenini oluşturduk
    private Hesapla hesapla; //hesapla class'ını tanımladık

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBirinciSayi = (EditText) findViewById(R.id.editBirinciSayi); //1. EditText'i ID'ye bağladık
        textIkinciSayi = (EditText) findViewById(R.id.editIkinciSayi); //2. EditText'i ID'ye bağladık
        textSonuc = (TextView) findViewById(R.id.textSonuc);

    }

    public void sonucClick(View view) { //tıklanma methodunu tanımladık, bütün buttonların OnClick'i aynı
        birinciSayi = textBirinciSayi.getText().toString(); //kullanıcıdan 1. değeri aldık
        ikinciSayi = textIkinciSayi.getText().toString(); //kullanıcıdan 2. değeri aldık

        if (!TextUtils.isEmpty(birinciSayi) && (!TextUtils.isEmpty(ikinciSayi))) { //kullanıcıdan alınan değerlerin boş olup olmadığını kontrol ettik
            ;
            s1 = Integer.valueOf(birinciSayi); //kullanıcıdan aldığımız ilk değeri integer'a çevirip s1'in içine attık
            s2 = Integer.valueOf(ikinciSayi); //kullanıcıdan aldığımız ikinci değeri integer'a çevirip s2'in içine attık
            hesapla = new Hesapla(s1,s2); //hesapla class'ını oluşturduk

            switch (view.getId()) { //tıklanan buttonu algıladık
                case R.id.toplaButton: //tıklanan buttonun ID'si toplaButton'sa
                    sonuc = hesapla.toplama(); //toplama işlemi yap
                    //sonuc = hesapla.sonucuGonder("+");
                    break;

                case R.id.cikarButton:
                    sonuc = hesapla.cikarma();
                    //sonuc = hesapla.sonucuGonder("-");
                    break;

                case R.id.carpButton:
                    sonuc = hesapla.carpma();
                    //sonuc = hesapla.sonucuGonder("*");
                    break;

                case R.id.bolButton:
                    sonuc = hesapla.bolme();
                    //sonuc = hesapla.sonucuGonder("/");
                    break;
            }

            textSonuc.setText("Sonuç:" + sonuc); //sonucu TextView'a gönderdik

        } else
            textSonuc.setText("Girilen Değerler Boş Olamaz."); //Girilen değerler boşsa hata mesajı gönderdik

    }

}
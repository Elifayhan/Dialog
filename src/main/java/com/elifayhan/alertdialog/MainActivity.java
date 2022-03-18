package com.elifayhan.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Toast Message",Toast.LENGTH_LONG).show();
    }
    public void save (View view){
        AlertDialog.Builder alert =new AlertDialog.Builder(this); //burayı bir obje oluşturma gibi düşünebilirsin.
        alert.setTitle("save"); //başlığın adını belirledik.
        alert.setMessage("Are you sure?"); //mesaj içeriğini belirledik.
        //2 tane butonumuz olacak yes ve no şeklinde.
        //bunun için hazır oluşturulmuş methodlar mevcut:
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //save
                //Listener bir şeye tıklandığında veya bir olay olduğunda ne olduğunu, ne yazacağımızı gösterir.
                //küçük bir mesaj göstereceğiz bunu alert dialog ile yapmayacağız toast dediğimiz küçük bir pop up mesaj olacak.
                //toastı on create methodu içerisinde ne olduğunu daha iyi anlamak için gösteriminin nasıl old. gördük
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
            }
        }) ;
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();

            }
        }) ;
        alert.show();
    }
}
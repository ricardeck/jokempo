package com.example.jogopedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolhaUsuarioPedra(View view){
        ImageView imageView = findViewById(R.id.imageViewEscolhaUsuario);
        imageView.setImageResource(R.drawable.pedra);
        int n = this.escolhaApp();

        TextView textView = findViewById(R.id.TextViewSituacao);
        TextView textViewDerrotas = findViewById(R.id.textViewNumerosDerrotas);
        TextView textViewEmpates = findViewById(R.id.textViewNumerosEmpates);
        TextView textViewVitorias = findViewById(R.id.textViewNumerosVitorias);
        int d = 0;
        if(n==2) {
            textView.setText(R.string.Ganhou);
            d = Integer.parseInt(textViewVitorias.getText().toString());
            d++;
            Integer.toString(d);
            textViewVitorias.setText(Integer.toString(d));
        }
        else if (n==0) {
            textView.setText(R.string.Empate);
            d = Integer.parseInt(textViewEmpates.getText().toString());
            d++;
            Integer.toString(d);
            textViewEmpates.setText(Integer.toString(d));
        }
        else {
            textView.setText(R.string.Perdeu);
            d = Integer.parseInt(textViewDerrotas.getText().toString());
            d++;
            Integer.toString(d);
            textViewDerrotas.setText(Integer.toString(d));
        }
    }

    public void escolhaUsuarioPapel(View view){
        ImageView imageView = findViewById(R.id.imageViewEscolhaUsuario);
        imageView.setImageResource(R.drawable.papel);
        int n = this.escolhaApp();

        TextView textView = findViewById(R.id.TextViewSituacao);
        TextView textViewDerrotas = findViewById(R.id.textViewNumerosDerrotas);
        TextView textViewEmpates = findViewById(R.id.textViewNumerosEmpates);
        TextView textViewVitorias = findViewById(R.id.textViewNumerosVitorias);
        int d = 0;
        if(n==0) {
            textView.setText(R.string.Ganhou);
            d = Integer.parseInt(textViewVitorias.getText().toString());
            d++;
            Integer.toString(d);
            textViewVitorias.setText(Integer.toString(d));
        }
        else if (n==1) {
            textView.setText(R.string.Empate);
            d = Integer.parseInt(textViewEmpates.getText().toString());
            d++;
            Integer.toString(d);
            textViewEmpates.setText(Integer.toString(d));
        }
        else {
            textView.setText(R.string.Perdeu);
            d = Integer.parseInt(textViewDerrotas.getText().toString());
            d++;
            Integer.toString(d);
            textViewDerrotas.setText(Integer.toString(d));
        }
    }

    public void escolhaUsuarioTesoura(View view){
        ImageView imageView = findViewById(R.id.imageViewEscolhaUsuario);
        imageView.setImageResource(R.drawable.tesoura);
        int n = this.escolhaApp();

        TextView textView = findViewById(R.id.TextViewSituacao);
        TextView textViewDerrotas = findViewById(R.id.textViewNumerosDerrotas);
        TextView textViewEmpates = findViewById(R.id.textViewNumerosEmpates);
        TextView textViewVitorias = findViewById(R.id.textViewNumerosVitorias);
        int d = 0;
        if(n==1) {
            textView.setText(R.string.Ganhou);
            d = Integer.parseInt(textViewVitorias.getText().toString());
            d++;
            Integer.toString(d);
            textViewVitorias.setText(Integer.toString(d));
        }
        else if (n==2) {
            textView.setText(R.string.Empate);
            d = Integer.parseInt(textViewEmpates.getText().toString());
            d++;
            Integer.toString(d);
            textViewEmpates.setText(Integer.toString(d));
        }
        else {
            textView.setText(R.string.Perdeu);
            d = Integer.parseInt(textViewDerrotas.getText().toString());
            d++;
            Integer.toString(d);
            textViewDerrotas.setText(Integer.toString(d));
        }
    }

    private int escolhaApp(){
        ImageView imageViewResult = findViewById(R.id.imageViewEscolhaApp);
        int num = new Random().nextInt(3);
        switch (num){
            case 0 : imageViewResult.setImageResource(R.drawable.pedra);
            break;
            case 1 : imageViewResult.setImageResource(R.drawable.papel);
            break;
            case 2 : imageViewResult.setImageResource(R.drawable.tesoura);
            break;
        }
        return num;
    }


}

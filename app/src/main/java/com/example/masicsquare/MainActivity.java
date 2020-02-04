package com.example.masicsquare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    int ma[][]=new int[5][5];
    int row, col; //행과 열 변수
    int num=1; //마방진에 들어갈 값
    String result="";//출력할변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult= (TextView)findViewById(R.id.tvResult);
        col=ma[0].length/2; //첫행의 중간열
        ma[row][col]=num; //첫행의 중간열에 1을 넣는다
        for(int num=2; num<=ma[0].length*ma[0].length; num++) {
            row--;//대각선 위로 이동한다.
            col++;


            if(row<0 && col ==ma[0]. length) { //행이 존재하지 않는다.
                row+=2;
                col--;

            }else if(row<0) {
                row = ma[0].length - 1;

            }else if(col==ma[0].length){
                col=0;

            }else if(ma[row][col]!=0){
                row+=2;
                col--;

        }
                ma[row][col]=num;

        }
        for(int i=0; i<ma[0].length; i++){
            for(int j=0; j<ma[0].length; j++){
                result+=Integer.toString(ma[i][j])+" ";
            }
            result+="\n";
        }
            tvResult.setText(result);
        }

}


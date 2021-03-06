  package es.ulpgc.eite.da.lhdez.quizlab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


  private Button cheatButton, nextButton, trueButton, falseButton;
  private TextView questionText, replyText;
  private String[] questionArray;
  private int[] replyArray;
  private int i = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    initLayoutData();
    linkLayoutComponents();
    initLayoutContent();
    enableLayoutButtons();


  }

  private void enableLayoutButtons() {

    trueButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {

        trueButtonCliecked( view);
      }
    });

    falseButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        falseButtonCliecked( view);
      }
    });


    cheatButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        cheatButtonCliecked( view);
      }
    });

    nextButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        nextButtonCliecked( view);
      }
    });
  }

  private void initLayoutContent() {
    questionText.setText(questionArray[i]);

  }

  private void linkLayoutComponents() {

    replyText=findViewById(R.id.replyText);
    questionText=findViewById(R.id.questionText);

    cheatButton=findViewById(R.id.cheatButton);
    nextButton=findViewById(R.id.nextButton);
    trueButton=findViewById(R.id.yesButton);
    falseButton=findViewById(R.id.noButton);

  }

  private void initLayoutData() {
    questionArray = getResources().getStringArray(R.array.question_array);
    replyArray= getResources().getIntArray(R.array.reply_array);
  }

  public void trueButtonCliecked(View view) {
    if(replyArray[i] == 1) {
      replyText.setText(R.string.correct_text);
    } else {
      replyText.setText(R.string.incorrect_text);
    }
  }

  public void falseButtonCliecked(View view) {

    if(replyArray[i] == 0) {
      replyText.setText(R.string.correct_text);
    } else {
      replyText.setText(R.string.incorrect_text);
    }
  }



  public void cheatButtonCliecked(View view) {
    Intent siguiente = new Intent(this,Cheat.class);
    startActivity(siguiente);

  }

  public void nextButtonCliecked(View view) {
        if (i != questionArray.length-1){
          i ++;
          questionText.setText(questionArray[i]);
        }else{
          i = 0;
          questionText.setText(questionArray[i]);
        }



      }
  }

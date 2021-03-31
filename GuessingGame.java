import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;

public class GuessingGame implements ActionListener{

JTextField userGuess;
JButton guess;
JButton playAgain;

JLabel enter;
JLabel hiLo;
JLabel lastGuess;

GuessingGame(){
  Random r = new Random();
  int random = r.nextInt(100) + 1;

  JFrame frame = new JFrame("Guessing Game");
  frame.setLayout(new FlowLayout());
  frame.setSize(240, 120);

  userGuess = new JTextField(10);
  userGuess.setActionCommand("myTF");

  guess = new JButton("Guess");
  playAgain = new JButton("Play Again");

  userGuess.addActionListener(this);
  guess.addActionListener(this);
  playAgain.addActionListener(this);

  enter = new JLabel("Enter your guess: ");
  hiLo = new JLabel("");
  lastGuess = new JLabel("");

  frame.add(enter);
  frame.add(userGuess);
  frame.add(guess);
  frame.add(hiLo);
  frame.add(lastGuess);
  frame.add(playAgain);
  frame.setVisible(true);

}

public void actionPerformed(ActionEvent ae){
  if(ae.getActionCommand().equals("Guess")){
    Random r = new Random();
    int random = r.nextInt(100) + 1;
    int guess = Integer.parseInt(userGuess.getText());

    if(guess < random) {
      hiLo.setText("Too low!");
      lastGuess.setText("Last guess was: " + guess);

    }
    else if(guess > random){
      hiLo.setText("Too high!");
      lastGuess.setText("Last guess was: " + guess);
    }
    else{
      hiLo.setText("You got it!");
    }}

    else if(ae.getActionCommand().equals("Play Again")){
    Random r = new Random();
    int random = r.nextInt(100) + 1;
    enter.setText("Enter your guess:");
    hiLo.setText("");
    lastGuess.setText("");
    userGuess.setText("");
  }
  else{
    hiLo.setText("You pressed Enter. Please press the Guess button.");
    }}}
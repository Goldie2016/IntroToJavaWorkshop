package Day4;

//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random=new Random().nextInt(4);

	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("enter your question");
	// 5. If the random number is 0
if(random==0){
	// -- tell the user "Yes"
JOptionPane.showConfirmDialog(null, "Yes");}
	// 6. If the random number is 1
if(random==1){
	// -- tell the user "No"
JOptionPane.showConfirmDialog(null, "No");}
	// 7. If the random number is 2
if(random==2){
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showConfirmDialog(null, "Maybe You Should Ask Google");}
	// 8. If the random number is 3
if(random==3){
	// -- write your own answer
JOptionPane.showConfirmDialog(null, "What Do You Think?");}
}}
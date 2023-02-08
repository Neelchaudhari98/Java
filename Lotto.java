package exercise2;
	import java.util.Random;
	import javax.swing.JOptionPane;

	public class Lotto {
	   int[] numbers;

	  public Lotto() {
	    numbers = new int[3];
	    Random any = new Random();
	    for (int i = 0; i < 3; i++) {
	      numbers[i] = any.nextInt(9) + 1;
	    }
	  }

	  public int getSum() {
	    int sum = 0;
	    for (int i = 0; i < 3; i++) {
	      sum =sum + numbers[i];
	    }
	    return sum;
	  }

	  public static void main(String[] args) {
		    int count = 0;
		    Lotto lotto = new Lotto();
		    while (count < 5) {
		      int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27"));
		      int sum = lotto.getSum();
		      if (sum == choice) {
		        JOptionPane.showMessageDialog(null, "You win!");
		        break;
		      } else {
		    	  JOptionPane.showMessageDialog(null, "You lose! The correct number was " + lotto.getSum());
		    	  count++;
		        
		      }
		    }  
	  }
	  }



 import javax.swing.JOptionPane;


 public class MonthsOfTheYear {
	 
  enum MonthsList { January, February, March, April, May, June, July, August, September, October, November, December} 

		public static void main(String[] args) {
			MonthsList selection;

			MonthsList choices[] = { MonthsList.January, MonthsList.February, MonthsList.March, MonthsList.April, MonthsList.May, MonthsList.June, 
					          MonthsList.July, MonthsList.August, MonthsList.September, MonthsList.October, MonthsList.November, MonthsList.December };
			
			do
			{selection = (MonthsList)JOptionPane.showInputDialog(null, "Select one month.", "Month Selection",
						JOptionPane.PLAIN_MESSAGE, null, choices, choices[4]); 
			
			
			switch(selection)
            {
             case January:
            	 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
            	 break;
              case February:
            	 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
            	 break;
              case March:
            	 JOptionPane.showMessageDialog(null, "Happy Spring days!");
            	 break;
              case April:
            	 JOptionPane.showMessageDialog(null, "Happy Spring days!");
                 break;
              case May:
            	 JOptionPane.showMessageDialog(null, "Happy Spring days!");
            	 break;
              case June:
            	 JOptionPane.showMessageDialog(null, "It’s a summer time.");
            	 break;
              case July:
             	 JOptionPane.showMessageDialog(null, "It’s a summer time.");
             	 break;
              case August: 
             	 JOptionPane.showMessageDialog(null, "It’s a summer time.");
             	 break;
              case September:
             	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
             	 break;
              case October:
              	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
              	 break;
              case November:
              	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
              	 break;	 
              case December:
            	 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
             }  
			
			}while (selection.equals(selection));	
			
	}
			
  }

import javax.swing.JOptionPane;

public class Project0 {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Please enter a sentence");
		
		char identifier1 = 'e';
		char identifier2 = 'E';
		
		// identifier char variables to check string and isolate given character both uppercase E && lowercase e
		
		int count = 0;
		for(int i=0; i<userInput.length(); i++) 
		{
			if(userInput.charAt(i) == identifier1)
				count++;
					
		};
		int count2 = 0;
		for(int i=0; i<userInput.length(); i++) 
		{
			if(userInput.charAt(i) == identifier2)
				count2++;
					
		};
		
		// 2 loops to traverse given user string to find identifiers
		
		String userOutput = "Number of lowercase e in string = "+count+"\n"+"Number of Upperclass E in string = "+count2+" ";
		JOptionPane.showMessageDialog(null, userOutput);
		
		// userOutput stored in String var. which is later referenced in JOptionPane output message dialog box	
		// Name: TASNEEM HASANAT
		// EMPLID: 23683901
		// LAB SEC: CSCI 212 11D [25444]
	};

};

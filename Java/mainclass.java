import javax.swing.*;


public class mainclass {

	public static void main(String[] args) {
	
		
		// define JFrame object
		 JFrame obje=new JFrame();
		 //setting bounds 
		 obje.setBounds(15,15,710,600);
		// to give name to game 
		 obje.setTitle("JAVA Brick Game "); 
		 play gameply=new play(); 
		 //
		//connecting each other
		obje.add(gameply); 
		 obje.setResizable(false);
		 //
		// to make panel visit
		 obje.setVisible(true); 
		//program will close when user click close button
		 obje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}

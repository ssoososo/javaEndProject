
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;

public class ImagePanelTest
{
	public static void main( String[] args )
	{
		int q,w,e,r,t;
		Scanner scanner = new Scanner( System.in );
		// create JFrame
		JFrame application = new JFrame( "A simple paint program" );

		ImagePanel imagePanel = new ImagePanel();
		application.add( imagePanel, BorderLayout.CENTER );

		// create a label and place it in SOUTH of BorderLayout
		application.add( new JLabel( "say something or not" ),
		                 BorderLayout.SOUTH );

		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 1000, 1000 );
		application.setVisible( true );
		
		imagePanel.setImage( 0,100,100,1000,35 );
		imagePanel.setImage( 1,200,200,300,300 );
		imagePanel.reDraw();
		
		while( true )
		{
			System.out.println("begin");
			q=scanner.nextInt();
			if(q==-1){imagePanel.reDraw();continue;}
			w=scanner.nextInt();
			e=scanner.nextInt();
			r=scanner.nextInt();
			t=scanner.nextInt();

			imagePanel.setImage( q,w,e,r,t );

		}
	}
} // end class 


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
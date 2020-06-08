
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Image;

public class ImagePanel extends JPanel
{
	
	//private final ArrayList<Point> points = new ArrayList<>();
	
	Image img[];
	int imageSizeX[];
	int imageSizeY[];
	int imagePositionX[];
	int imagePositionY[];
	// set up GUI and register mouse event handler
	public ImagePanel()
	{
		int i;
		img = new Image[100];
		imageSizeX = new int[100];
		imageSizeY = new int[100];
		imagePositionX = new int[100];
		imagePositionY = new int[100];
		for( i = 0; i < 100; i++ ) {
			img[i] = Toolkit.getDefaultToolkit().getImage( i + ".jpg" );
		}
		// handle frame mouse motion event
		/*addMouseMotionListener(
		                new MouseMotionAdapter() // anonymous inner class
		{
			// store drag coordinates and repaint
			@Override
			public void mouseDragged( MouseEvent event )
			{
				points.add( event.getPoint() );
				p1.move( event.getPoint().x, event.getPoint().y );
				repaint(); // repaint JFrame
			}
		}
		);*/
	}
	public void setImage( int i, int x, int y, int sizeX, int sizeY )//(imgeNumber,xPosition,yPosition,xSize,ySize)
	{
		imagePositionX[i] = x;
		imagePositionY[i] = y;
		imageSizeX[i] = sizeX;
		imageSizeY[i] = sizeY;

	}
	public void closeImage( int i )
	{
		imageSizeX[i] = 0;
		imageSizeY[i] = 0;
	}
	public void reDraw()
	{
		repaint();
	}

	// draw ovals in a 4-by-4 bounding box at specified locations on window
	@Override
	public void paintComponent( Graphics g )
	{
		int i;
		super.paintComponent( g ); // clears drawing area

		/*for( Point point : points )
			g.fillOval( point.x, point.y, 4, 4 );*/
		for( i = 0; i < 100; i++ )
			g.drawImage( img[i], imagePositionX[i], imagePositionY[i], imageSizeX[i], imageSizeY[i], this );

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
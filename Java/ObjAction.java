import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class ObjAction {

	public int WidthBrick;
	public int HeightBrick;
	public int map[][];
	
	public ObjAction(int row,int col)
	{ 
		map=new int[row][col];
		for(int i=0;i<map.length;i++)
		{ 
			for(int j=0;j<map[0].length;j++)
			{
				map[i][j]=1;
			}
		}
		WidthBrick=570/col;
		HeightBrick=170/row;
		
	}
	public void draw(Graphics2D g)
	{ 
		for(int i=0;i<map.length;i++)
		{ 
			for(int j=0;j<map[0].length;j++)
			{ 	
				if(map[i][j]>0) {
				g.setColor(Color.yellow);
				g.fillRect(j*WidthBrick+80,i*HeightBrick+50 , WidthBrick, HeightBrick);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.red);
				g.drawRect(j*WidthBrick+80, i*HeightBrick+50, WidthBrick, HeightBrick);
				}}
} 
	}
public void setBrickValue(int value,int row,int col)
{ 
	map[row][col]=value;
	
}
}




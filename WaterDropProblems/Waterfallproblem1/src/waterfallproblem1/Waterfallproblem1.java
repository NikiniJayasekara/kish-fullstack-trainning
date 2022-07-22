
package waterfallproblem1;

import java.util.LinkedList;
import java.util.Queue;


public class Waterfallproblem1 {
    
  
public	static float[] waterfallalgorithm(int[][] input, int pos)
	{
	int height = input[0].length;
	int width = input[1].length;

	float[] result = new float[width];
		
	Queue<wtr> wtrQueue = new LinkedList<>();

	wtrQueue.add(new wtr(0,pos,100));
                
        while(wtrQueue.size()!=0)
		{
	 wtr tmp = wtrQueue.remove();

            if(input[tmp.height][tmp.width] == 0){
		  if(tmp.height+1 < height)
		            wtrQueue.add(new wtr(tmp.height+1, tmp.width,tmp.water));
		        else
		           result[tmp.width] += tmp.water;
		    }
		    else
		    {
		        if(tmp.height+1 < height)
		        {
		            if(tmp.width > 0)
		                wtrQueue.add(new wtr(tmp.height+1, tmp.width-1, tmp.water/2));
		            if(tmp.width+1 < width)
		                wtrQueue.add(new wtr(tmp.height+1, tmp.width+1, tmp.water/2));
		        }
		        else
		        {
		            if(tmp.width > 0)
		                result[tmp.width-1] += tmp.water/2;
		            if(tmp.width+1 < width)
		                result[tmp.width+1] += tmp.water/2;
		        }
		    }
		}
               return result;
}

 public static void main(String[] args) {
        
          int [][] input = new int[][]{
			{0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0},
			{0,0,1,1,1,0,0},
			{0,0,0,0,0,0,0},
			{1,1,1,0,0,1,0},
			{0,0,0,0,0,0,1},
                        {0,0,0,0,0,0,0}
		};

     int pos = 3;

 for(float x: waterfallalgorithm(input, pos)){
			
	  System.out.println(x);
			
		}
     
    }}


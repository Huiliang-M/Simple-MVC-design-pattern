package Balls;
import java.util.*;
import java.util.ArrayList;

public class Model {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
    int radius;
    int px;
    int py;
    int velX;
    int velY;
  
    
    private ArrayList<initial> list;
  
    
    Model() {
	// instantiate list of particles
        list = new ArrayList<initial>();
  
    }
    
    
    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
       
        radius = rad;
        px = x;
        py = y;
        velX = vx;
        velY = vy;
        initial psm = new initial(radius,px,py,velX,velY);
        list.add(psm);
        
        System.out.println("Added: " + radius + " " + px + " " + py);
    }
    
    public ArrayList<initial> getList(){
        return list;
    }

    // update state of each particle in list
    void update(int bw, int bh) {
        
        for(int i =0; i <list.size(); i++){
 
        list.get(i).px += list.get(i).velX;
        list.get(i).py += list.get(i).velY;
        
        if(list.get(i).px >= bw - list.get(i).radius && list.get(i).velX > 0){
            list.get(i).velX = - list.get(i).velX;
        }
        else if(list.get(i).px < list.get(i).radius && list.get(i).velX < 0){
            list.get(i).velX = - list.get(i).velX;
        }
        
        if(list.get(i).py >= bh - list.get(i).radius && list.get(i).velY > 0){
            list.get(i).velY = - list.get(i).velY;
        }
            
        else if(list.get(i).py < list.get(i).radius && list.get(i).velY < 0){
            list.get(i).velY = - list.get(i).velY;
        }
       
        }
    }
}

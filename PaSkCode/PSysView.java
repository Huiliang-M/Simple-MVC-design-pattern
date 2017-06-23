package PaSkCode;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class PSysView {
    
    PSysView() {
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        ArrayList<Particle> list = psm.getList();
        
        for(int i = 0; i < 5; i++){
            g2d.setColor(Color.RED);

            g2d.fillOval(list.get(i).px - list.get(i).radius, list.get(i).py - list.get(i).radius,
                         list.get(i).radius*2, list.get(i).radius*2);
        }
    }
    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {
        
        ArrayList<Particle> list = psm.getList();
        
        System.out.println("Frame " + lc);
        if( lc == 1000){
            for(int i = 0; i < list.size(); i++){
        System.out.println(list.get(i).radius + " " + list.get(i).px + " " + list.get(i).py + " " +
                           list.get(i).velX + " " + list.get(i).velY);
            }
    }
    
    }
}

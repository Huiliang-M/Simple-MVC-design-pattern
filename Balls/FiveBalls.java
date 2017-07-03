package Balls;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;

public class FiveBalls extends JFrame {

    static int BD_WIDTH = 800;
    static int BD_HEIGHT = 600;

    static ArrayList <String> pList; // strings from input file

    public FiveBalls() {
        
        initUI();
    }
    
    private void initUI() {

	// add a JPanel to ParticleSkeleton
	// -22 accounts for Mac OS X window decoration
        add(new Board(BD_WIDTH, BD_HEIGHT-22, pList));

	// BD_WIDTH x BD_HEIGHT pixels, not resizable
        setSize(BD_WIDTH, BD_HEIGHT);
        setResizable(false);
        
        setTitle("FiveBalls");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception{
	// get initial particle system state from input file
	Scanner input = new Scanner(new java.io.File(args[0]));
	pList = new ArrayList <String>();
	while (input.hasNext()) {
	    pList.add(input.nextLine());
	}

	System.out.println("Input file: ");
	for (int i=0; i<pList.size(); i++) {
	    System.out.println(pList.get(i));
	}
	
	FiveBalls ex = new FiveBalls();
	ex.setVisible(true);
    }
}

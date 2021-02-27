package Laba2;


import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class Loading implements ActionListener {
	
	static ArrayList<String> list = new ArrayList<>();
	static String[] array;
	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
		
		JFileChooser fileopen = new JFileChooser();             
        int ret = fileopen.showDialog(null, "Открыть файл");                
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            try {
            	
            	
            	
            	String encoding = System.getProperty("console.encoding", "utf-8");
				Scanner sc = new Scanner(file, encoding);
                int i = 0;
				while (sc.hasNextLine()) {
					
					list.add(sc.nextLine());
				    i++;
				    
				}
				
				
				array = list.toArray(new String[0]);
				
			
				for (int i1 = 0; i1 < Loading.list.size(); i1++) {
					information.x+=20;		    
				    JLabel text = new JLabel (Loading.array[i1]);
				    information.Inf_panel.add(text);
				    text.setBounds(20,information.x,400,40);
					}
				
				list.clear();
				array = null;
				sc.close();
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block/
				e1.printStackTrace();
			}
            
	}
	}
}
	



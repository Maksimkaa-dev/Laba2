package Laba2; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя


import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,550);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null); 
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_information = new JButton("Информация"); // добавляем кнопку
	button_information.setBounds(15,200,120,40);
	ActionListener Information = new InfButton(); //создаем слушатель
	button_information.addActionListener(Information); // добавляем слушатель к кнопке
	main_panel.add(button_information);
	
	
	JTextField firSt = new JTextField();
	firSt.setBounds(10, 300, 150, 30);
	main_panel.add(firSt);
	
	JLabel Storona = new JLabel("введите сторону ромба");
	Storona.setBounds(10, 250, 150,30);
	main_panel.add(Storona);
	
	

	JTextField BbIB = new JTextField();
	BbIB.setBounds(170, 300, 150, 30);
	BbIB.setEditable(false); 
	main_panel.add(BbIB);
	
	JLabel akter = new JLabel("Периметр Равен");
	akter.setBounds(170, 250, 150,30);
	main_panel.add(akter);
	
	ActionListener actionlistener = new ActionListener() {
		

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double a=Double.parseDouble(firSt.getText());
				
				if(a<=0 ) 
					BbIB.setText("числа должны быть >0");
				
				else {
					double result= a*4;
					BbIB.setText("" + result);
				
				
				}}
				catch(NumberFormatException e1) {
					BbIB.setText("Ошибка,введите число");
				
				}
		}
	}
	;
			
	JButton button1 = new JButton("рассчитать"); // добавляем кнопку
	button1.setBounds(15,330,120,40);
	button1.addActionListener(actionlistener); // добавляем слушатель к кнопке
	main_panel.add(button1);

	 
	
	JMenuBar vve = new JMenuBar();
	main_GUI.setJMenuBar(vve);
	
	JMenu menu = new JMenu("Меню");
	vve.add(menu);
	
	JMenuItem logo = new JMenuItem("Показать логотип УГАТУ");
	
	JMenuItem upl = new JMenuItem("загрузить файл в проект14");
	
	ActionListener Load = new Loading();
	
	upl.addActionListener(Load);
	
			 
		
	
	
	MyDrawPanel panel = new MyDrawPanel();
    main_panel.add(panel);
    panel.setBounds(50, 40, 300, 300);
    panel.setVisible(false);
	
	logo.addActionListener(new ActionListener() {

       

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			if (panel.isVisible()==false) {
				panel.setVisible(true);
			}
			
            
		}
   }
); 
	menu.add(logo);
	menu.add(upl);
	

	
	
	JMenuItem ex = new JMenuItem("Выход");
	menu.add(ex);
	
	ActionListener exit = new ListenerButton(); //создаем слушатель
	ex.addActionListener(exit); // добавляем слушатель к кнопке

	
	String[] items = {
            "Переместить логотип УГАТУ в правый верхний угол",
            "Переместить логотип УГАТУ в середину",
            "Переместить логотип УГАТУ в левый верхний угол",
            "Отсортировать данные в проекте14"
            };
           JComboBox combo=new JComboBox(items);
           combo.setBounds(30,165,350,30);
           //ActionLister logo_items= new items;
           //panel.addActionListener(logo_items);
           combo.addActionListener(new ActionListener() {


        	   JLabel ma = new JLabel();
               JLabel ma1 = new JLabel();
        	   
              public void actionPerformed(ActionEvent arg0) {
                  if (arg0.getSource()==combo) {
                  JComboBox cb=(JComboBox)arg0.getSource();
                  String msg=(String)cb.getSelectedItem();
                  switch(msg) {
                  case "Переместить логотип УГАТУ в правый верхний угол":panel.setBounds(230, 40, 300, 300);
                  break;
                  case "Переместить логотип УГАТУ в середину":panel.setBounds(120, 40, 300, 300);
                  break;
                  case "Переместить логотип УГАТУ в левый верхний угол":panel.setBounds(10, 40, 300, 300);
                  break;
                  case "Отсортировать данные в проекте14":

                      Mass n = new Mass();
                      int[] m = new int[n.massiv.length];
                        for (int i = 0; i < n.massiv.length; i++) {
                            m[i] = n.massiv[i];
                        }
                        Sort.sort(m);
                        
                        String mass = "до сортировки: ";
                        String mass1 = "после: ";
                        
                        for (int i = 0; i < n.massiv.length; i++) {
                        	mass = mass + n.massiv[i] + " ";
                        	mass1 = mass1 + m[i] + " ";                       
                        	}
                        
                        
                        
                        ma.setBounds(10, 370, 450, 50);
                        ma1.setBounds(10, 400, 450, 50);
                        
                        ma.setText(mass);
                        ma1.setText(mass1);
                        
                        main_panel.add(ma);
                        main_panel.add(ma1);
                        
                        main_GUI.repaint();
                        
                        break;
                        
                      
                  }


                  }


              }
         }
      );
     
           main_panel.add(combo);
	
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	
	}
	
}


package Laba2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class information {
	
	static JFrame Inf_GUI;
	static JPanel Inf_panel;
	
	static int x = 220;
	public information() {
			
		Inf_GUI = new JFrame("information");	// создание графического окна
		Inf_GUI.setTitle ("Информация о студентах");
		Inf_GUI.setBounds(300,200,750,600);
		Inf_GUI.setResizable(false); // фиксированный размер окна;
		Inf_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		Inf_panel.setLayout(null);
		JLabel FIO = new JLabel("Здесь указаны ФИО студентов выполнивших работу");
		FIO.setBounds(20,20,600,30);
		Inf_panel.add(FIO);
		Inf_GUI.add(Inf_panel);
		JLabel User1 = new JLabel("Янушевич Максим Викторович № зачетной книжки:19130171"); // Отображение текста или изображения
		User1.setBounds(20,60,600,30);
		Inf_panel.add(User1);
		JLabel User2 = new JLabel("Андриянов Максим Владимирович № зачетной книжки:19130344   19.03.2021"); 
		User2.setBounds(20,100,700,30);
		Inf_panel.add(User2);
		JLabel User3 = new JLabel("Сайдуганов Руслан Анатольевич № зачетной книжки:19130636   19.03.2021"); 
		User3.setBounds(20,140,700,30);
		Inf_panel.add(User3);
		JLabel User4 = new JLabel("Хуснуриялов Булат Фагитович № зачетной книжки:19130608   19.03.2021"); 
		User4.setBounds(20,180,700,30);
		Inf_panel.add(User4);
		JLabel data = new JLabel("Данные из загруженного файла:");
		data.setBounds(20,220,300,30);
		Inf_panel.add(data);
		Inf_GUI.setVisible(false);
		
}
}

package Laba2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class information {
	
	static JFrame Inf_GUI;
	static JPanel Inf_panel;
	
	static int x = 220;
	public information() {
			
		Inf_GUI = new JFrame("information");	// �������� ������������ ����
		Inf_GUI.setTitle ("���������� � ���������");
		Inf_GUI.setBounds(300,200,750,600);
		Inf_GUI.setResizable(false); // ������������� ������ ����;
		Inf_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		Inf_panel.setLayout(null);
		JLabel FIO = new JLabel("����� ������� ��� ��������� ����������� ������");
		FIO.setBounds(20,20,600,30);
		Inf_panel.add(FIO);
		Inf_GUI.add(Inf_panel);
		JLabel User1 = new JLabel("�������� ������ ���������� � �������� ������:19130171"); // ����������� ������ ��� �����������
		User1.setBounds(20,60,600,30);
		Inf_panel.add(User1);
		JLabel User2 = new JLabel("��������� ������ ������������ � �������� ������:19130344   19.03.2021"); 
		User2.setBounds(20,100,700,30);
		Inf_panel.add(User2);
		JLabel User3 = new JLabel("���������� ������ ����������� � �������� ������:19130636   19.03.2021"); 
		User3.setBounds(20,140,700,30);
		Inf_panel.add(User3);
		JLabel User4 = new JLabel("����������� ����� ��������� � �������� ������:19130608   19.03.2021"); 
		User4.setBounds(20,180,700,30);
		Inf_panel.add(User4);
		JLabel data = new JLabel("������ �� ������������ �����:");
		data.setBounds(20,220,300,30);
		Inf_panel.add(data);
		Inf_GUI.setVisible(false);
		
}
}

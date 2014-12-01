import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Component;

import javax.swing.border.BevelBorder;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.SystemColor;

import javax.swing.JComboBox;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 


import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
 


public class New_GUI implements ActionListener {

	private JFrame frame;
	private JTextField textUserName;
	private JPanel EnterPanel;
	private JPanel UserPanel;
	private JPanel DifficultyPanel;
	private JPanel EasyPuzzlePanel;
	private JTextField textUser;
	private JTextField textPUser;
	//private JPanel MediumPuzzlePanel;
	//private JPanel HardPuzzlePanel;
	//private JPanel EvilPuzzlePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_GUI window = new New_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public New_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel EnterPanel = new JPanel();
		EnterPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(EnterPanel, "name_371237336903701");
		EnterPanel.setLayout(null);
		EnterPanel.setVisible(true);
		
		final JPanel UserPanel = new JPanel();
		frame.getContentPane().add(UserPanel, "name_371239693946302");
		UserPanel.setLayout(null);
		UserPanel.setVisible(false);
		
		final JPanel DifficultyPanel = new JPanel();
		frame.getContentPane().add(DifficultyPanel, "name_371241815534654");
		DifficultyPanel.setLayout(null);
		DifficultyPanel.setVisible(false);
		
		final JPanel EasyPuzzlePanel = new JPanel();
		frame.getContentPane().add(EasyPuzzlePanel, "name_371243849815857");
		EasyPuzzlePanel.setLayout(null);
		EasyPuzzlePanel.setVisible(false);
		
		final JPanel GamePanel = new JPanel();
		frame.getContentPane().add(GamePanel, "name_371246022116004");
		GamePanel.setVisible(false);
		
		final JPanel SolutionPanel = new JPanel();
		frame.getContentPane().add(SolutionPanel, "name_371247993800605");
		SolutionPanel.setVisible(false);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPanel.setVisible(true);
				EnterPanel.setVisible(false);
			}
		});
		btnEnter.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEnter.setBounds(153, 137, 128, 47);
		EnterPanel.add(btnEnter);
		
		JLabel lblSudoku = new JLabel("SUDOKU");
		lblSudoku.setForeground(Color.ORANGE);
		lblSudoku.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudoku.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lblSudoku.setBounds(53, 11, 328, 47);
		EnterPanel.add(lblSudoku);
		
		JLabel label = new JLabel("SUDOKU");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 54));
		label.setBounds(53, 11, 328, 47);
		UserPanel.add(label);
		
		JButton UPBackbutton = new JButton("<-Back");
		UPBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		UPBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterPanel.setVisible(true);
				UserPanel.setVisible(false);
			}
		});
		UPBackbutton.setBounds(0, 0, 89, 23);
		UserPanel.add(UPBackbutton);
		
		JButton btnRegisterUser = new JButton("Register");
		btnRegisterUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newUserName = textUserName.getText();
				newUserName = newUserName.trim();
				try {
					saveUsername(newUserName);
				} catch (SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textUser.setText(newUserName);
				textUser.setEditable(false);
				textPUser.setText(newUserName);
				textPUser.setEditable(false);
				DifficultyPanel.setVisible(true);
				UserPanel.setVisible(false);
			}
		});
		btnRegisterUser.setBounds(160, 129, 89, 23);
		UserPanel.add(btnRegisterUser);
		
		textUserName = new JTextField(15);
		textUserName.setBounds(160, 98, 138, 20);
		UserPanel.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblNewUser = new JLabel("New User? Enter Username");
		lblNewUser.setBounds(160, 76, 177, 23);
		UserPanel.add(lblNewUser);
		
		JLabel lblChooseName = new JLabel("Already Registered?");
		lblChooseName.setBounds(160, 163, 138, 14);
		UserPanel.add(lblChooseName);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Username");
		lblNewLabel_1.setBounds(160, 177, 138, 14);
		UserPanel.add(lblNewLabel_1);
		
		String[] users = {"Han Solo", "Darth Vader"};
		JComboBox comboRegUsers = new JComboBox(users);
		comboRegUsers.setEditable(false);
		comboRegUsers.setBounds(160, 202, 138, 20);
		UserPanel.add(comboRegUsers);
		
		JLabel label_1 = new JLabel("SUDOKU");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.ORANGE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		label_1.setBounds(53, 11, 328, 47);
		DifficultyPanel.add(label_1);
		
		JButton DifficultyBackbutton = new JButton("<-Back");
		DifficultyBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		DifficultyBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPanel.setVisible(true);
				DifficultyPanel.setVisible(false);
			}
		});
		DifficultyBackbutton.setBounds(0, 0, 89, 23);
		DifficultyPanel.add(DifficultyBackbutton);
		
		JLabel lblWelcome = new JLabel("Welcome:");
		lblWelcome.setBounds(145, 60, 64, 14);
		DifficultyPanel.add(lblWelcome);
		
		JLabel lblChooseDifficulty = new JLabel("Choose Difficulty");
		lblChooseDifficulty.setBounds(145, 76, 103, 14);
		DifficultyPanel.add(lblChooseDifficulty);
		
		JButton btnEasy = new JButton("Easy");
		btnEasy.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEasy.setBackground(Color.GREEN);
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EasyPuzzlePanel.setVisible(true);
				DifficultyPanel.setVisible(false);
			}
		});
		btnEasy.setBounds(155, 92, 114, 31);
		DifficultyPanel.add(btnEasy);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnMedium.setBackground(Color.YELLOW);
		btnMedium.setBounds(154, 134, 114, 31);
		DifficultyPanel.add(btnMedium);
		
		JButton btnHard = new JButton("Hard");
		btnHard.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnHard.setBackground(new Color(255, 153, 0));
		btnHard.setBounds(154, 177, 114, 31);
		DifficultyPanel.add(btnHard);
		
		JButton btnEvil = new JButton("EVIL!!");
		btnEvil.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEvil.setBackground(new Color(255, 0, 0));
		btnEvil.setBounds(154, 219, 114, 31);
		DifficultyPanel.add(btnEvil);
		
		textUser = new JTextField();
		textUser.setBorder(null);
		textUser.setBackground(SystemColor.menu);
		textUser.setBounds(205, 57, 103, 20);
		DifficultyPanel.add(textUser);
		textUser.setColumns(10);
		
		JLabel label_2 = new JLabel("SUDOKU");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.ORANGE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 54));
		label_2.setBounds(53, 11, 328, 47);
		EasyPuzzlePanel.add(label_2);
		
		JButton PuzzleBackbutton = new JButton("<-Back");
		PuzzleBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		PuzzleBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DifficultyPanel.setVisible(true);
				EasyPuzzlePanel.setVisible(false);
			}
		});
		PuzzleBackbutton.setBounds(0, 0, 89, 23);
		EasyPuzzlePanel.add(PuzzleBackbutton);
		
		JLabel label_3 = new JLabel("Welcome:");
		label_3.setBounds(141, 60, 72, 14);
		EasyPuzzlePanel.add(label_3);
		
		JLabel lblChooseSudokuPuzzle = new JLabel("Choose Sudoku Puzzle");
		lblChooseSudokuPuzzle.setBounds(141, 76, 168, 14);
		EasyPuzzlePanel.add(lblChooseSudokuPuzzle);
		
		JButton btnEasy_1 = new JButton("Easy 1");
		btnEasy_1.setBounds(53, 90, 328, 23);
		EasyPuzzlePanel.add(btnEasy_1);
		
		JButton btnEasy_5 = new JButton("Easy 5");
		btnEasy_5.setBounds(53, 227, 328, 23);
		EasyPuzzlePanel.add(btnEasy_5);
		
		JButton btnEasy_2 = new JButton("Easy 2");
		btnEasy_2.setBounds(53, 125, 328, 23);
		EasyPuzzlePanel.add(btnEasy_2);
		
		JButton btnEasy_4 = new JButton("Easy 4");
		btnEasy_4.setBounds(53, 193, 328, 23);
		EasyPuzzlePanel.add(btnEasy_4);
		
		JButton btnEasy_3 = new JButton("Easy 3");
		btnEasy_3.setBounds(53, 159, 328, 23);
		EasyPuzzlePanel.add(btnEasy_3);
		
		textPUser = new JTextField();
		textPUser.setColumns(10);
		textPUser.setBorder(null);
		textPUser.setBackground(SystemColor.menu);
		textPUser.setBounds(206, 57, 103, 20);
		EasyPuzzlePanel.add(textPUser);
	}

	private JMenuItem makeMenuItem(String name) {
		JMenuItem m = new JMenuItem(name);
		m.addActionListener(this);
		return m;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void saveUsername(String username) throws SAXException, IOException
	{
		try {
			 
			File f= new File("src/file.xml");
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			Document doc = docBuilder.parse(f);
			Element rootElement = doc.createElement("Names");
			doc.appendChild(rootElement);
	 
			Element username1 = doc.createElement("username");
			rootElement.appendChild(username1);
			
	 
			Attr name = doc.createAttribute("name");
			name.setValue(username);
			username1.setAttributeNode(name);
	 
			
			Attr score = doc.createAttribute("score");
			score.setValue("150"); //random score value
			username1.setAttributeNode(score);
	  
			 
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(f);
	 
		
			transformer.transform(source, result);
	 
	
	 
		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
	}
}

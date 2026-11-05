package com.bytecode.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory;

import com.bytecode.main.entity.Student;
import com.bytecode.main.service.StudentService;
import com.bytecode.main.service.impl.StudentServiceImpl;
import com.bytecode.main.bo.StudentBO;
import com.bytecode.main.db.DB;

public class MainApp extends JFrame {

    private JTextField nameField;
    private JTextField rnoField;
    private JTextField ageField;
    private JTextField m1Field;
    private JTextField m2Field;
    private JTextField m3Field;
    private JTextField m4Field;
    private JTextField m5Field;
    private JTextArea resultArea;

    private StudentService service;
    private DB db;

    public MainApp() {
        super("Student Result Management System");

        service = new StudentServiceImpl();
        db = new DB();

        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Roll No:"));
        rnoField = new JTextField();
        inputPanel.add(rnoField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Marks 1:"));
        m1Field = new JTextField();
        inputPanel.add(m1Field);

        inputPanel.add(new JLabel("Marks 2:"));
        m2Field = new JTextField();
        inputPanel.add(m2Field);

        inputPanel.add(new JLabel("Marks 3:"));
        m3Field = new JTextField();
        inputPanel.add(m3Field);

        inputPanel.add(new JLabel("Marks 4:"));
        m4Field = new JTextField();
        inputPanel.add(m4Field);

        inputPanel.add(new JLabel("Marks 5:"));
        m5Field = new JTextField();
        inputPanel.add(m5Field);

        add(inputPanel, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton calcButton = new JButton("Calculate Result");
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
        buttonPanel.add(calcButton);
        add(buttonPanel, BorderLayout.CENTER);

        // Result Area
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Result"));
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void calculateResult() {
        try {
            String name = nameField.getText().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Student Name", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int rno = Integer.parseInt(rnoField.getText().trim());
            int age = Integer.parseInt(ageField.getText().trim());
            int m1 = Integer.parseInt(m1Field.getText().trim());
            int m2 = Integer.parseInt(m2Field.getText().trim());
            int m3 = Integer.parseInt(m3Field.getText().trim());
            int m4 = Integer.parseInt(m4Field.getText().trim());
            int m5 = Integer.parseInt(m5Field.getText().trim());

            Student student = new Student(name, rno, age, m1, m2, m3, m4, m5);
            StudentBO bo = service.calculateResult(student);

            String resultText = db.getStudentResultString(bo);
            resultArea.setText(resultText);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Roll No, Age, and Marks.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }
}

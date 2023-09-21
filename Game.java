import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.*;

public class Game extends JFrame implements ActionListener {

    // creating the labels for images
    JLabel background;
    JLabel hair, shirt, pants, shoes;
    Label name, age;

    // creating buttons
    Button btnShirt1, btnShirt2, btnShirt3;
    Button btnPants1, btnPants2, btnPants3;
    Button btnShoes1, btnShoes2, btnShoes3;
    Button btnHair1, btnHair2, btnHair3;
    JButton btnName, btnAge;

    EditText editName;
    EditText editAge;

    // getting the images
    ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/wallpaper.png")));

    ImageIcon hair1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/hair1.png")));
    ImageIcon hair2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/hair2.png")));
    ImageIcon hair3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/hair3.png")));

    ImageIcon pants1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/pants1.png")));
    ImageIcon pants2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/pants2.png")));
    ImageIcon pants3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/pants3.png")));

    ImageIcon shirt1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shirt1.png")));
    ImageIcon shirt2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shirt2.png")));
    ImageIcon shirt3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shirt3.png")));

    ImageIcon shoes1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shoes1.png")));
    ImageIcon shoes2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shoes2.png")));
    ImageIcon shoes3 = new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/shoes3.png")));

    public Game() {
        super("Nostalgia Game");

        Container frame = getContentPane();
        frame.setLayout(null);
        frame.setBackground(new Color(28,28,28));

        // ----> Change the shirt

        btnShirt1 = new Button();
        btnShirt1.setLocation(704, 250);
        frame.add(btnShirt1);

        btnShirt2 = new Button();
        btnShirt2.setLocation(804, 250);
        frame.add(btnShirt2);

        btnShirt3 = new Button();
        btnShirt3.setLocation(904, 250);
        frame.add(btnShirt3);

        // ----> Change the pants

        btnPants1 = new Button();
        btnPants1.setLocation(704, 350);
        frame.add(btnPants1);

        btnPants2 = new Button();
        btnPants2.setLocation(804, 350);
        frame.add(btnPants2);

        btnPants3 = new Button();
        btnPants3.setLocation(904, 350);
        frame.add(btnPants3);

        // ----> Change the shoes

        btnShoes1 = new Button();
        btnShoes1.setLocation(704, 450);
        frame.add(btnShoes1);

        btnShoes2 = new Button();
        btnShoes2.setLocation(804, 450);
        frame.add(btnShoes2);

        btnShoes3 = new Button();
        btnShoes3.setLocation(904, 450);
        frame.add(btnShoes3);

        // ----> Change the hair

        btnHair1 = new Button();
        btnHair1.setLocation(704, 550);
        frame.add(btnHair1);

        btnHair2 = new Button();
        btnHair2.setLocation(804, 550);
        frame.add(btnHair2);

        btnHair3 = new Button();
        btnHair3.setLocation(904, 550);
        frame.add(btnHair3);

        // ----> label that will receive the name - ps.: max lentgh = 20
        name = new Label();
        name.setBounds(161, 77, 450, 50);
        name.setFont(new Font("Century Gothic", Font.BOLD, 44));
        name.setText("Name");
        frame.add(name);

        // ----> edit the name - obs.: limitar a entrada dos caracteres
        editName = new EditText();
        editName.setLocation(704, 144);
        frame.add(editName);

        btnName = new JButton();
        btnName.setBounds(899, 144, 95, 30);
        btnName.setText("NAME");
        btnName.setForeground(Color.WHITE);
        btnName.setBackground(new Color(97, 58, 160));
        frame.add(btnName);

        // ----> label that will receive the age - obs.: arrumar a limitação da entrada da idade
        Label txtAge = new Label();
        txtAge.setBounds(195, 136, 95, 23);
        txtAge.setFont(new Font("Century Gothic", Font.BOLD, 20));
        txtAge.setText("years old");
        frame.add(txtAge);

        age = new Label();
        age.setBounds(163, 136, 23, 23);
        age.setFont(new Font("Century Gothic", Font.BOLD, 20));
        age.setText("10");
        frame.add(age);

        // ----> edit the age - obs.: limitar a entrada de caracteres
        editAge = new EditText();
        editAge.setLocation(704, 180);
        frame.add(editAge);

        btnAge = new JButton();
        btnAge.setBounds(899, 180, 95, 30);
        btnAge.setText("AGE");
        btnAge.setForeground(Color.WHITE);
        btnAge.setBackground(new Color(97, 58, 160));
        frame.add(btnAge);

        shirt = new JLabel();
        shirt.setBounds(265, 349, 252, 160);
        frame.add(shirt);

        pants = new JLabel();
        pants.setBounds(313, 477, 158, 137);
        frame.add(pants);

        shoes = new JLabel();
        shoes.setBounds(269, 588, 243, 52);
        frame.add(shoes);

        hair = new JLabel();
        hair.setBounds(274, 154, 230, 212);
        frame.add(hair);

        // this is the label we are using to place the wallpaper
        background = new JLabel(wallpaper);
        background.setBounds(-10, -30, 1030, 700);
        frame.add(background);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1030, 700);
        this.setLocation(0, 0);
        this.setLayout(null);
        this.setVisible(true);

        btnShirt1.addActionListener(this);
        btnShirt2.addActionListener(this);
        btnShirt3.addActionListener(this);

        btnPants1.addActionListener(this);
        btnPants2.addActionListener(this);
        btnPants3.addActionListener(this);

        btnShoes1.addActionListener(this);
        btnShoes2.addActionListener(this);
        btnShoes3.addActionListener(this);

        btnHair1.addActionListener(this);
        btnHair2.addActionListener(this);
        btnHair3.addActionListener(this);

        btnName.addActionListener(e -> name.setText(editName.getText()));
        btnAge.addActionListener(e -> age.setText(editAge.getText()));
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.btnShirt1) { shirt.setIcon(shirt1); }
        else if (e.getSource() == this.btnShirt2) { shirt.setIcon(shirt2); }
        else if (e.getSource() == this.btnShirt3) { shirt.setIcon(shirt3); }
        else System.out.println("Error! Object not found.");

        if (e.getSource() == this.btnPants1) { pants.setIcon(pants1); }
        else if (e.getSource() == this.btnPants2) { pants.setIcon(pants2); }
        else if (e.getSource() == this.btnPants3) { pants.setIcon(pants3); }
        else System.out.println("Error! Object not found.");

        if (e.getSource() == this.btnShoes1) { shoes.setIcon(shoes1); }
        else if (e.getSource() == this.btnShoes2) { shoes.setIcon(shoes2); }
        else if (e.getSource() == this.btnShoes3) { shoes.setIcon(shoes3); }
        else System.out.println("Error! Object not found.");

        if (e.getSource() == this.btnHair1) { hair.setIcon(hair1); }
        else if (e.getSource() == this.btnHair2) { hair.setIcon(hair2); }
        else if (e.getSource() == this.btnHair3) { hair.setIcon(hair3); }
        else System.out.println("Error! Object not found.");
    }

    public static void main(String[] args) {
        new Game();
    }
}

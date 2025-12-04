package projekat4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;

public class GameGUI extends JFrame {

    JTextField nameField = new JTextField(15);
    JTextField healthField = new JTextField(5);
    JTextField xField = new JTextField(5);
    JTextField yField = new JTextField(5);

    JRadioButton rectRadio = new JRadioButton("Rectangle");
    JRadioButton circleRadio = new JRadioButton("Circle");

    
    JButton btnStart = new JButton("Start Game");

    JTextArea output = new JTextArea(20, 50);

    File csvFile;

    public GameGUI() {
        super("Game Input");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Name
        JPanel r1 = new JPanel();
        r1.add(new JLabel("Name:"));
        r1.add(nameField);
        panel.add(r1);

        // Health
        JPanel r2 = new JPanel();
        healthField.setText("100");
        r2.add(new JLabel("Health:"));
        r2.add(healthField);
        panel.add(r2);

        // X
        JPanel r3 = new JPanel();
        xField.setText("50");
        r3.add(new JLabel("X:"));
        r3.add(xField);
        panel.add(r3);

        // Y
        JPanel r4 = new JPanel();
        yField.setText("50");
        r4.add(new JLabel("Y:"));
        r4.add(yField);
        panel.add(r4);

        
        JPanel r5 = new JPanel();
        ButtonGroup g = new ButtonGroup();
        g.add(rectRadio);
        g.add(circleRadio);
        rectRadio.setSelected(true);
        r5.add(new JLabel("Collider:"));
        r5.add(rectRadio);
        r5.add(circleRadio);
        panel.add(r5);

        // Buttons
        JPanel r6 = new JPanel();
        r6.add(btnStart);
        panel.add(r6);

        // Output
        output.setEditable(false);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(output), BorderLayout.CENTER);

       
        btnStart.addActionListener(this::startGame);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   

    private void startGame(ActionEvent e) {
       

            String name = nameField.getText().trim();
            int hp = Integer.parseInt(healthField.getText().trim());
            int x = Integer.parseInt(xField.getText().trim());
            int y = Integer.parseInt(yField.getText().trim());

            
            Collidable collider;
            if (rectRadio.isSelected()) {
                collider = new RectangleCollider(x, y, 32, 32);
            } else {
                collider = new CircleCollider(x, y, 16);
            }

            Player player = new Player(name, hp, x, y, collider);

            Game game = new Game(player);
            game.setPlayer(player);

           
            output.append("\n--- GAME START ---\n");
            output.append("Player: " + player + "\n");
            

            
            try {
                game.resolveCollisions();
            } catch (Exception ignore) {
                output.append("(resolveCollisions not implemented)\n");
            }

            JOptionPane.showMessageDialog(this,
                    "Game finished! Player HP: " + player.getHealth());

        } 
    }



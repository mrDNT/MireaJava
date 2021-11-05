package GUI;

import javax.swing.*;

public class Layout extends JFrame{
    int milan;
    int madrid;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel result;
    private JLabel last;
    private JLabel winner;
    private JPanel rootPanel;

    public void labelTick(){
        result.setText("Result: " + milan + " x " + madrid);
        if (milan > madrid){
            winner.setText("Winner: AC Milan");
        }
        else if (milan == madrid){
            winner.setText("Winner: Draw");
        }
        else{
            winner.setText("Winner: Real Madrid");
        }
    }
    public Layout() {
        setContentPane(rootPanel);
        setVisible(true);
        setSize(600, 600);
        realMadridButton.addActionListener((event) -> {
                madrid++;
                labelTick();
                last.setText("Last scorer: Real Madrid");
        });
        ACMilanButton.addActionListener((event) -> {
                milan++;
                labelTick();
                last.setText("Last scorer: AC Milan");
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

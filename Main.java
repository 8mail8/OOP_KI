package lab34;
import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame Windows = new JFrame("Windows");//Название окна
        Windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel primary = new JPanel();
        primary.setBackground(Color.yellow); //Фон
        primary.setPreferredSize(new Dimension(2500,750)); //Размерность
        JButton bt=new JButton("Ckick");
        bt.setLocation(290, 250);
        bt.setPreferredSize(new Dimension(100, 20));
        bt.setVisible(true);
        JLabel label1 = new JLabel("How are you?"); //Надпись
        primary.add(label1);
        JLabel label2 = new JLabel("It's I");
        primary.add(label2);
        Windows.getContentPane().add(primary);
        Windows.pack();
        Windows.setVisible(true);
    }
}

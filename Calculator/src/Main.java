import javax.swing.*;
public class Main extends JFrame  {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->{ new Main();}
        );
    }
    public Main(){
        super("Graphical Calculator");

        ImageIcon icon =new ImageIcon("C:\\Users\\aysen\\IdeaProjects\\Calculator\\src\\icon.png");
        ImageIcon icon1 =new ImageIcon("C:\\Users\\aysen\\IdeaProjects\\Calculator\\src\\chart.png");
        GraphicalCalculator graph =new GraphicalCalculator();
        SimpleCalculator simple = new SimpleCalculator();
        JTabbedPane tab= new JTabbedPane();
        tab.addTab("Simple Calculator",icon,simple);
        tab.addTab("Graphical Calculator",icon1,graph);

        add(tab);
        repaint();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);



    }

}

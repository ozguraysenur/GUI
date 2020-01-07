


import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;

public class GraphicalCalculator extends JPanel  {



    static JList<String> list;


    Storage model;
    JButton color;
    Color ff;
    String s;
    JCheckBox check;
    Graphics2D g2;
    int i ;



    int a = 1, b = 0, c = 0;
    int range = 60;
    int[] array = new int[2 * range];



    public GraphicalCalculator() {

        //************************************MainPanel***********************************

        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600, 630));
        //revalidate();

        //***********************************Inside***************************************

        JPanel pan = new JPanel();

        pan.setPreferredSize(new Dimension(600, 235));

        pan.setBorder(new LineBorder(new Color(241,156,187), 10));
        pan.setLayout(new BorderLayout());
        pan.setBackground(Color.BLACK);

        //model =new DefaultListModel<>();
        //gg.model.addElement("ali");
        //gg.model.addElement("ayse");
        //gg.model.addElement("fatma");
        //gg.model.addElement("hakan");
        //gg.list = new JList<>(gg.model);

        //********************************TopInside**************************************

        JPanel top = new JPanel();
        top.setBackground(Color.BLACK);
        top.setPreferredSize(new Dimension(100, 90));
        top.setLayout(new GridLayout(1, 3, 20, 20));
        model = new Storage(this);

        list = new JList<>(model);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //list.setSelectedIndex(model.getSize() - 1);

        list.setFont(new Font("Serif", Font.BOLD, 16));


        JScrollPane scroll = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        check = new JCheckBox("Visibility :  ");
        check.setFont(new Font("Serif", Font.BOLD, 18));
        check.setForeground(Color.WHITE);
        check.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        check.setBackground(Color.BLACK);
        check.setSelected(true);




        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check.isSelected()){
                    repaint();
                }
            }
        });

        i = list.getSelectedIndex();

        color = new JButton("Color");
        color.setPreferredSize(new Dimension(75, 50));
        color.addActionListener((e) ->
        {
            ff = JColorChooser.showDialog(
                    GraphicalCalculator.this,
                    "",
                    null
            );

        });
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (check.isSelected()) {
                    s = list.getSelectedValue();
                }
            }
        });

        top.add(check);
        top.add(scroll);
        top.add(color);



        //************************************BOTTOM*********************************
        JPanel bottom = new JPanel();


        bottom.setBackground(Color.BLACK);
        bottom.setLayout(new FlowLayout());
        ImageIcon adding = new ImageIcon("C:\\Users\\aysen\\IdeaProjects\\Calculator\\src\\plus.png");
        ImageIcon delete = new ImageIcon("C:\\Users\\aysen\\IdeaProjects\\Calculator\\src\\minus.png");
        JButton addbutton = new JButton(adding);
        JButton deletebutton = new JButton(delete);

        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = JOptionPane.showInputDialog(pan, "enter polynomial",
                        "polynomial", JOptionPane.QUESTION_MESSAGE);
                 if(s.contains("^-")){
                     JOptionPane.showMessageDialog(pan,s+" is not a polynomial",
                             "ERROR",JOptionPane.ERROR_MESSAGE);
                    return;
                  }else {
                    model.add(s);
                 }
                 repaint();


            }
        });
        addbutton.setBackground(new Color(212,53,132));

        deletebutton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.isSelectionEmpty()) return;
                    String i = list.getSelectedValue();
                    model.remove(i);

                s="";
                //ff=Color.WHITE;
                //s="";
                repaint();
            }
        });
        deletebutton.setBackground(new Color(212,53,132));

        bottom.add(deletebutton);
        bottom.add(addbutton);

        pan.add(top, BorderLayout.NORTH);
        pan.add(bottom, BorderLayout.SOUTH);

        add(pan, BorderLayout.SOUTH);

        s="x^2";

    }


    public void paintComponent(Graphics g) {
        //setBackground(Color.white);


        g2 = (Graphics2D) g;
        g2.setRenderingHint(
                RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        super.paintComponent(g);

        g2.setColor(Color.WHITE);

        g2.setStroke(new BasicStroke(4));
        g2.drawLine(getWidth() / 2, 20, getWidth() / 2, getHeight() - 260);// 300 ,300 , y ekseni
        g2.setFont(new Font("SansSerif", Font.BOLD, 17));
        g2.drawString("Y", getWidth() / 2 + 8, 30);

        g2.drawLine(40, getHeight() / 2 - 120, getWidth() - 40, getHeight() / 2 - 120);//x ekseni
        g2.drawString("X", getWidth() - 50, getHeight()/2-135);
        g2.setFont(new Font("SansSerif", Font.BOLD, 25));
        g2.drawString("^", getWidth() / 2 - 7, 32);
        g2.drawString("v", getWidth() / 2 - 8, getHeight() - 255);
        g2.drawString(">", getWidth() - 49, getHeight() / 2 - 111);
        g2.drawString("<", 36, getHeight() / 2 - 111);
        int index = 0;

       if(s.contains("^-") || s.equals("")){
            range =0;
        }else{

        for (int x = -range; x < range; x++) {

            int res = function(x);
            array[index] = res;
            index++;
        }
    }
                if(check.isSelected()){
                    for (int i = -range; i < range; i++) {
                        if (i + range + 1 < 2 * range) {
                            g2.setColor(new Color(212,53,132));


                            g2.setColor(ff);
                            g2.draw(new Line2D.Double(getWidth() / 2 + i,
                                                      getHeight() / 2 - array[i + range] - 120,
                                                      getWidth() / 2 + i + 1,
                                                      getHeight() / 2 - array[i + range + 1] - 120));

                            repaint();
                            // g2.dispose();
                        } else {
                            repaint();
                        }

                    }
                }
    }


    public int fonksiyon(int a, int b, int c, int x) {
        return a * x * x + b * x * x + c * x;
    }
    public int function(int x){

        int us=0;
        int coeff=0;

        s = s.replace("-", "+-");
        String term[] = s.split("\\+");
        int value[] = new int[term.length];
        int y= 0;
            for (int t = 0; t < term.length; t++) {
                if(term[t]!= ""){

                    if (!term[t].contains("x")) {
                        us = 0;
                        try {
                            coeff = Integer.parseInt(term[t]);
                        }catch (Exception e){
                            coeff=0;
                        }
                    } else if (!term[t].contains("^")) {
                        us = 1;
                        try {
                            coeff = Integer.parseInt(term[t].substring(0, term[t].indexOf("x")));


                        }catch (Exception e) {
                            if (term[t].substring(0, term[t].indexOf("x")).contains("-")) {
                                coeff = -1;
                            } else {
                                coeff = 1;
                            }
                        }

                    } else {

                        try {
                            coeff = Integer.parseInt(term[t].substring(0, term[t].indexOf("x")));


                        }catch (Exception e){
                            String a = term[t].substring(0, term[t].indexOf("x"));
                            if(a.contains("-")){
                                coeff=-1;
                            }else {
                                coeff =1;
                            }
                        }finally {
                            us = Integer.parseInt(term[t].substring(term[t].indexOf("^") + 1));
                        }

                    }
                }
                value[t] = coeff;
                for (int i = 0; i < us; i++) {
                    value[t] *= x;
                }
            }

                for(int a= 0; a <value.length ;a++){
                    y+=value[a];
                }

            return y;
    }


}


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JPanel {
    public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 35);
    public static final LineBorder line = new LineBorder(Color.BLACK, 3);
    public static final Color dark = new Color(212,53,132);
    public static final Color light =new Color(241,156,187);
    int number1 =0 ,number2=0;
    String oper="";
    int radix =10;
    double d1=0,d2=0;
    JToggleButton hex,dec,bin,oct;

    public SimpleCalculator(){

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension( 600, 630));
        setLayout(new BorderLayout());
        setForeground(Color.WHITE);

        JPanel var = new JPanel();
        var.setLayout(new GridLayout(1,5,15,15));

        JTextField tf= new JTextField("0");

        tf.setFont(new Font("Sans_Serif",Font.PLAIN,80));
        tf.setBorder(new LineBorder(Color.BLACK, 6));
        tf.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tf.setEditable(false);
        //tf.setSize(300,100);




        add(tf,BorderLayout.NORTH);
        JPanel btnpnl=new JPanel(new GridLayout(5,6,8,8));
        btnpnl.setBackground(Color.WHITE);


        JButton a =new JButton("A");
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "A");
                tf.requestFocus();
            }
        });
        a.setBorder(line);
        a.setFont(BTN_FONT);
        a.setForeground(Color.WHITE);
        a.setBackground(light);
        btnpnl.add(a);


        JButton b = new JButton("B");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "B");
                tf.requestFocus();
            }
        });
        b.setBorder(line);
        b.setFont(BTN_FONT);
        b.setForeground(Color.WHITE);
        b.setBackground(light);
        btnpnl.add(b);




        JButton add = new JButton("+");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oper = "+";
                if(radix==10){
                    d1= Double.parseDouble(tf.getText());
                }else{
                    number1 = Integer.parseInt(tf.getText(),radix);
                }


                tf.setText("");
            }
        });
        add.setBorder(line);
        add.setFont(BTN_FONT);
        add.setBackground(dark);
        add.setForeground(Color.WHITE);
        btnpnl.add(add);

        JButton sub = new JButton("-");
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oper="-";

                if(radix==10){
                    d1= Double.parseDouble(tf.getText());
                }else{
                    number1 = Integer.parseInt(tf.getText(),radix);
                }
                tf.setText("");
            }
        });
        sub.setBorder(line);
        sub.setFont(BTN_FONT);
        sub.setBackground(dark);
        sub.setForeground(Color.WHITE);
        btnpnl.add(sub);

        JButton mult = new JButton("x");
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oper="*";
                if(radix==10){
                    d1= Double.parseDouble(tf.getText());
                }else{
                    number1 = Integer.parseInt(tf.getText(),radix);
                }
                tf.setText("");
            }
        });
        mult.setBorder(line);
        mult.setFont(BTN_FONT);
        mult.setBackground(dark);
        mult.setForeground(Color.WHITE);
        btnpnl.add(mult);

        JButton div = new JButton("÷");
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oper="/";
                if(radix==10){
                    d1= Double.parseDouble(tf.getText());
                }else{
                    number1 = Integer.parseInt(tf.getText(),radix);
                }
                tf.setText("");
            }
        });
        div.setBorder(line);
        div.setFont(BTN_FONT);
        div.setBackground(dark);
        div.setForeground(Color.WHITE);
        btnpnl.add(div);

        JButton c = new JButton("C");
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "C");
                tf.requestFocus();
            }
        });
        c.setBorder(line);
        c.setFont(BTN_FONT);
        c.setForeground(Color.WHITE);
        c.setBackground(light);
        btnpnl.add(c);


        JButton d = new JButton("D");
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "D");
                tf.requestFocus();
            }
        });
        d.setBorder(line);
        d.setFont(BTN_FONT);
        d.setForeground(Color.WHITE);
        d.setBackground(light);
        btnpnl.add(d);






        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if(!oper.equals("")){
//                    tf.setText("");
//                }
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"7");
                tf.requestFocus();
            }
        });
        btn7.setBorder(line);
        btn7.setFont(BTN_FONT);
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(light);
        btnpnl.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "8");
                tf.requestFocus();

            }
        });
        btn8.setBorder(line);
        btn8.setFont(BTN_FONT);
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(light);
        btnpnl.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"9");
                tf.requestFocus();
            }
        });
        btn9.setBorder(line);
        btn9.setFont(BTN_FONT);
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(light);
        btnpnl.add(btn9);

        JButton sqrt  = new JButton("√");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double square =Double.parseDouble(tf.getText());
                if(square > 0) {
                    double newsq = Math.sqrt(square);
                    tf.setText(""+newsq);
                    tf.requestFocus();


                }else {
                    tf.setText("error!");
                    tf.requestFocus();
                }
            }
        });
        sqrt.setBorder(line);
        sqrt.setFont(BTN_FONT);
        sqrt.setForeground(Color.WHITE);
        sqrt.setBackground(dark);
        btnpnl.add(sqrt);

        JButton e = new JButton("E");
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "E");
                tf.requestFocus();
            }
        });
        e.setBorder(line);
        e.setFont(BTN_FONT);
        e.setForeground(Color.WHITE);
        e.setBackground(light);
        btnpnl.add(e);


        JButton f = new JButton("F");
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText() + "F");
                tf.requestFocus();
            }
        });
        f.setBorder(line);
        f.setFont(BTN_FONT);
        f.setForeground(Color.WHITE);
        f.setBackground(light);
        btnpnl.add(f);




        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"4");
                tf.requestFocus();
            }
        });
        btn4.setBorder(line);
        btn4.setFont(BTN_FONT);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(light);
        btnpnl.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"5");
                tf.requestFocus();
            }
        });
        btn5.setBorder(line);
        btn5.setFont(BTN_FONT);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(light);
        btnpnl.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"6");
                tf.requestFocus();
            }
        });
        btn6.setBorder(line);
        btn6.setFont(BTN_FONT);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(light);
        btnpnl.add(btn6);

        JButton prcnt = new JButton("%");
        prcnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oper="%";
                if(radix==10){
                    d1= Double.parseDouble(tf.getText());
                }else{
                    number1 = Integer.parseInt(tf.getText(),radix);
                }
                tf.setText("");
            }
        });
        prcnt.setBorder(line);
        prcnt.setFont(BTN_FONT);
        prcnt.setForeground(Color.WHITE);
        prcnt.setBackground(dark);
        btnpnl.add(prcnt);

        bin =new JToggleButton("BIN",false);
        /*
        bin.addItemListener((e)->{
            radix=2;

        });
        */
        bin.setBorder(line);
        bin.setFont(BTN_FONT);
        bin.setForeground(Color.WHITE);
        bin.setBackground(dark);
        btnpnl.add(bin);


        oct =new JToggleButton("OCT",false);
        /*
        oct.addItemListener((e)->{
            radix=8;

        });
        */
        oct.setBorder(line);
        oct.setFont(BTN_FONT);
        oct.setForeground(Color.WHITE);
        oct.setBackground(dark);
        btnpnl.add(oct);




        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"1");
                tf.requestFocus();
            }
        });
        btn1.setBorder(line);
        btn1.setFont(BTN_FONT);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(light);
        btnpnl.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"2");
                tf.requestFocus();
            }
        });
        btn2.setBorder(line);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(light);
        btn2.setFont(BTN_FONT);

        btnpnl.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"3");
                tf.requestFocus();
            }
        });
        btn3.setBorder(line);
        btn3.setFont(BTN_FONT);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(light);
        btnpnl.add(btn3);

        JButton btnC = new JButton("AC");
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
                tf.requestFocus();
            }
        });
        btnC.setBorder(line);
        btnC.setFont(BTN_FONT);
        btnC.setForeground(Color.WHITE);
        btnC.setBackground(dark);
        btnpnl.add(btnC);

        dec =new JToggleButton("DEC",true);
        /*
        dec.addItemListener((e)->{
            radix=10;

        });
        */
        dec.setBorder(line);
        dec.setFont(BTN_FONT);
        dec.setForeground(Color.WHITE);
        dec.setBackground(dark);
        btnpnl.add(dec);


        hex =new JToggleButton("HEX",false);
        /*
        hex.addItemListener((e)->{
            radix=16;

        });
*/
        hex.setBorder(line);
        hex.setFont(BTN_FONT);
        hex.setForeground(Color.WHITE);
        hex.setBackground(dark);
        btnpnl.add(hex);



        JButton del = new JButton("del");
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = tf.getText();
                    String delast = text.substring(0, text.length() - 1);
                    tf.setText(delast);
                    tf.requestFocus();
                }catch (Exception ex){
                    tf.setText("0");
                }
            }
        });
        del.setBorder(line);
        del.setFont(BTN_FONT);
        del.setForeground(Color.WHITE);
        del.setBackground(dark);
        btnpnl.add(del);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=tf.getText();
                if (text != null&& !text.isEmpty()) {
                    if (text.charAt(0) == '0') {
                        String newchr = text.substring(1);
                        tf.setText(newchr);
                    }
                }
                tf.setText(tf.getText()+"0");
                tf.requestFocus();
            }
        });
        btn0.setBorder(line);
        btn0.setFont(BTN_FONT);
        btn0.setForeground(Color.WHITE);
        btn0.setBackground(light);
        btnpnl.add(btn0);

        JButton dot = new JButton(".");
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               try {
//                   String text = tf.getText();
//                   int index = text.indexOf(".");
//                   if (text.charAt(index + 1) == '.') {
//                       String news = text.substring(0, index);
//                       tf.setText(news);
//                       tf.requestFocus();
//                   }
//               }catch (Exception ex){
//                   tf.setText(".");
//               }
                tf.setText(tf.getText()+".");
                tf.requestFocus();
            }
        });
        dot.setBorder(line);
        dot.setFont(BTN_FONT);
        dot.setForeground(Color.WHITE);
        dot.setBackground(dark);
        btnpnl.add(dot);

        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);
        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(dec.isSelected()){
                    hex.setSelected(false);
                    bin.setSelected(false);
                    oct.setSelected(false);
                    a.setEnabled(false);
                    b.setEnabled(false);
                    c.setEnabled(false);
                    d.setEnabled(false);
                    e.setEnabled(false);
                    f.setEnabled(false);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    btn7.setEnabled(true);
                    btn6.setEnabled(true);
                    btn5.setEnabled(true);
                    btn4.setEnabled(true);
                    btn3.setEnabled(true);
                    btn2.setEnabled(true);
                    prcnt.setEnabled(true);
                    sqrt.setEnabled(true);
                    dot.setEnabled(true);
                    tf.setText("0");
                    tf.requestFocus();
                    radix=10;

                }else{
                    a.setEnabled(true);
                    b.setEnabled(true);
                    c.setEnabled(true);
                    d.setEnabled(true);
                    e.setEnabled(true);
                    f.setEnabled(true);

                }
            }
        });

        hex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(hex.isSelected()){
                    a.setEnabled(true);
                    b.setEnabled(true);
                    c.setEnabled(true);
                    d.setEnabled(true);
                    e.setEnabled(true);
                    f.setEnabled(true);

                    dec.setSelected(false);
                    bin.setSelected(false);
                    oct.setSelected(false);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    btn7.setEnabled(true);
                    btn6.setEnabled(true);
                    btn5.setEnabled(true);
                    btn4.setEnabled(true);
                    btn3.setEnabled(true);
                    btn2.setEnabled(true);
                    prcnt.setEnabled(false);
                    sqrt.setEnabled(false);
                    dot.setEnabled(false);
                    tf.setText("0");
                    tf.requestFocus();
                    radix=16;

                }else{
                    prcnt.setEnabled(true);
                    sqrt.setEnabled(true);
                    dot.setEnabled(true);

                }
            }
        });
        oct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(oct.isSelected()){
                    hex.setSelected(false);
                    bin.setSelected(false);
                    dec.setSelected(false);
                    a.setEnabled(false);
                    b.setEnabled(false);
                    c.setEnabled(false);
                    d.setEnabled(false);
                    e.setEnabled(false);
                    f.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btn7.setEnabled(true);
                    btn6.setEnabled(true);
                    btn5.setEnabled(true);
                    btn4.setEnabled(true);
                    btn3.setEnabled(true);
                    btn2.setEnabled(true);
                    prcnt.setEnabled(false);
                    sqrt.setEnabled(false);
                    dot.setEnabled(false);
                    tf.setText("0");
                    tf.requestFocus();
                    radix= 8;


                }else{
                    a.setEnabled(true);
                    b.setEnabled(true);
                    c.setEnabled(true);
                    d.setEnabled(true);
                    e.setEnabled(true);
                    f.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    prcnt.setEnabled(true);
                    sqrt.setEnabled(true);
                    dot.setEnabled(true);
                }
            }
        });
        bin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(bin.isSelected()){
                    hex.setSelected(false);
                    oct.setSelected(false);
                    dec.setSelected(false);
                    a.setEnabled(false);
                    b.setEnabled(false);
                    c.setEnabled(false);
                    d.setEnabled(false);
                    e.setEnabled(false);
                    f.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btn7.setEnabled(false);
                    btn6.setEnabled(false);
                    btn5.setEnabled(false);
                    btn4.setEnabled(false);
                    btn3.setEnabled(false);
                    btn2.setEnabled(false);
                    prcnt.setEnabled(false);
                    sqrt.setEnabled(false);
                    dot.setEnabled(false);
                    tf.setText("0");
                    tf.requestFocus();
                    radix=2;



                }else{
                    a.setEnabled(true);
                    b.setEnabled(true);
                    c.setEnabled(true);
                    d.setEnabled(true);
                    e.setEnabled(true);
                    f.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                    btn7.setEnabled(true);
                    btn6.setEnabled(true);
                    btn5.setEnabled(true);
                    btn4.setEnabled(true);
                    btn3.setEnabled(true);
                    btn2.setEnabled(true);
                    prcnt.setEnabled(true);
                    sqrt.setEnabled(true);
                    dot.setEnabled(true);
                }
            }
        });




        JButton result = new JButton("=");
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(radix==10){
                    d2= Double.parseDouble(tf.getText());
                }else{
                    number2 = Integer.parseInt(tf.getText(),radix);
                }
                double res=0;
                switch (oper){
                    case "*":
                        if(radix==2)
                            tf.setText(Integer.toBinaryString(number1*number2));
                        else if(radix==8)
                            tf.setText(Integer.toOctalString(number1*number2));
                        else if(radix==16)
                            tf.setText(Integer.toHexString(number1*number2));
                        else
                            tf.setText(Double.toString(d1*d2));
                        break;
                    case "/":
                        if(radix==2)
                            tf.setText(Integer.toBinaryString(number1/number2));
                        else if(radix==8)
                            tf.setText(Integer.toOctalString(number1/number2));
                        else if(radix==16)
                            tf.setText(Integer.toHexString(number1/number2));
                        else
                            tf.setText(Double.toString(d1/d2));
                        break;
                    case "+":
                        if(radix==2)
                            tf.setText(Integer.toBinaryString(number1+number2));
                        else if(radix==8)
                            tf.setText(Integer.toOctalString(number1+number2));
                        else if(radix==16)
                            tf.setText(Integer.toHexString(number1+number2));
                        else
                            tf.setText(Double.toString(d1+d2));
                        break;
                    case "-":
                        if(radix==2)
                            tf.setText(Integer.toBinaryString(number1-number2));
                        else if(radix==8)
                            tf.setText(Integer.toOctalString(number1-number2));
                        else if(radix==16)
                            tf.setText(Integer.toHexString(number1-number2));
                        else
                            tf.setText(Double.toString(d1-d2));
                        break;
                    case "%":
                        tf.setText(Double.toString(d1*(d2/100)));
                    default:
                        break;

                }

                tf.requestFocus();
                oper="";
            }
        });
        result.setBorder(line);
        result.setFont(BTN_FONT);
        result.setForeground(Color.WHITE);
        result.setBackground(Color.BLACK);
        btnpnl.add(result);

        add(btnpnl,BorderLayout.CENTER);
        tf.requestFocus();

    }

}

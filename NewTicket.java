import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.util.Arrays;

public class NewTicket extends JFrame {
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton21;
    private JButton jButton22;
    private JButton jButton23;
    private JButton jButton24;
    private JButton jButton25;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;


    public static String loggedUser;
    private int totalBill = 0;
    public NewTicket() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jButton20 = new JButton();
        jButton21 = new JButton();
        jButton22 = new JButton();
        jButton23 = new JButton();
        jButton24 = new JButton();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jButton25 = new JButton();

        

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon image;
        image = new ImageIcon("big-tour-bus-vector-illustration.jpg");
        jLabel1 = new JLabel("",image,JLabel.CENTER);

        List<String> routeList = new ArrayList<String>();
        try{
            String routes = "./routes.txt";

            FileReader fr = new FileReader(routes);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                routeList.add(line);
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }


        String[] routeListX = routeList.toArray(new String[]{});
        jLabel2.setText("Route");

        jComboBox1.setModel(new DefaultComboBoxModel<>(routeListX));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle combobox change event
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedOption = (String) combo.getSelectedItem();
                System.out.println("Selected option: " + selectedOption);

                try{
                    String bookings = "./bookings.txt";

                    FileReader fr = new FileReader(bookings);
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while ((line = br.readLine()) != null) {
                        // routeList.add(line);
                        String existRoute = line.split("~")[1];
                        for (Component component : jPanel1.getComponents()) {
                            if (component instanceof JButton) {
                                JButton button = (JButton) component;
                                if(Arrays.asList(line.split("~")[2].split(" ")).contains(button.getText())){
                                    if(existRoute.equals(selectedOption)){
                                        button.setEnabled(false);
                                    }else{
                                        System.out.println("Not matching");
                                        button.setEnabled(true);
                                    }
                                    
                                }
                            }
                        }
                    }
                    fr.close();
                }catch(Exception f){
                    f.printStackTrace();
                }
            }
        });
        jButton1.setText("A1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("A2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("A3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("A4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("B1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("B2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("B3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton8.setText("B4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("C1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("C2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("C3");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("C4");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("D1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("D2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("D3");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("D4");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("E1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("E2");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jButton19.setText("E3");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("E4");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("F1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("F2");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("F3");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("F4");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel3.setText("Selected Seats");

        jLabel4.setText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("-");

        jButton25.setText("Confirm");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        try{
            String bookings = "./bookings.txt";

            FileReader fr = new FileReader(bookings);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                // routeList.add(line);
                System.out.println(line);
                for (Component component : jPanel1.getComponents()) {
                    if (component instanceof JButton) {
                        JButton button = (JButton) component;
                        System.out.println();
                        if(Arrays.asList(line.split("~")[2].split(" ")).contains(button.getText())){
                            button.setEnabled(false);
                        }
                    }
                }
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        pack();
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            FileWriter fileWriter = new FileWriter("bookings.txt", true);
            String username = loggedUser;
            String route = jComboBox1.getSelectedItem().toString();
            String seats = jLabel4.getText();
            String bill = jLabel6.getText();
            fileWriter.write(username+"~"+route+"~"+seats+"~"+bill+"\n");

            // Close the file
            fileWriter.close();

            JOptionPane.showMessageDialog(null, "Booking Successful", "Success", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton1.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton1.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton1.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton2.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton2.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton2.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton3.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton3.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton3.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton4.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton4.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton4.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton5.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton5.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton5.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton6.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton6.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton6.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton7.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton7.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton7.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton8.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton8.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton8.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton9.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton9.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton9.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton10.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton10.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton10.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton11.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton11.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton11.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton12.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton12.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton12.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton13.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton13.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton13.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton14.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton14.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton14.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton15.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton15.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton15.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton16.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton16.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton16.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton17.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton17.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton17.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton18.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton18.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton18.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton19.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton19.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton19.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton20.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton20.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton20.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton21.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton21.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton21.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton22.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton22.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton22.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton23.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton23.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton23.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jButton2.getBackground()!=Color.GREEN){
            jButton24.setBackground(Color.GREEN);
            if(jLabel4.getText()==""){
                jLabel4.setText(jButton24.getText());
            }else{
                jLabel4.setText(jLabel4.getText()+" "+jButton24.getText());
            }
            totalBill+=300;
            jLabel6.setText(Integer.toString(totalBill));
        }
    }
    public static void main(String args[]) {
        new NewTicket().setVisible(true);
    }
}

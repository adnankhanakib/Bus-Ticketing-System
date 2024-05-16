import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Login extends JFrame {
    private JButton jButton1;
    private JButton registerBtn;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField usernameTxt;
    private JPasswordField passwordTxt;

    public Login() {
        initComponents();
    }
    
    private void initComponents() {

        jPanel1 = new JPanel();
        
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        usernameTxt = new JTextField();
        passwordTxt = new JPasswordField();
        jButton1 = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        registerBtn = new JButton();
        ImageIcon image;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        image = new ImageIcon("big-tour-bus-vector-illustration.jpg");
        jLabel1 = new JLabel("",image,JLabel.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("Rose Travels");

        jLabel5.setText("Don't have an account? ");

        registerBtn.setText("Register Now");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordTxt)
                                    .addComponent(usernameTxt, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerBtn)))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(registerBtn))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 703, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // JFrame register = new Register();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // JOptionPane.showMessageDialog(null,"Test");
        try{
            String userDB = "./users.txt";
            String username = usernameTxt.getText();
            String password = passwordTxt.getText();
            int admin; 
            FileReader fr = new FileReader(userDB);
            BufferedReader br = new BufferedReader(fr);
            String line, user, pass;
            boolean isLoginSuccess = false;
            while ((line = br.readLine()) != null) {
                user = line.split("~")[0].toLowerCase();
                pass = line.split("~")[1].toLowerCase();
                admin = Integer.parseInt(line.split("~")[4]);

                if (user.equals(username) && pass.equals(password)) {
                    isLoginSuccess = true;
                    this.dispose();
                    UserDashboard mm = new UserDashboard();
                    mm.setLocationRelativeTo(null);
                    mm.setVisible(true);
                    NewTicket.loggedUser = username;
                    ticketHistory.loggedUser = username;
                    ticketHistory.isAdmin = admin;
                    break;
                }else{

                }
            }
            if (!isLoginSuccess) {
                JOptionPane.showMessageDialog(null, "USERNAME/PASSWORD WRONG", "WARNING!!", JOptionPane.WARNING_MESSAGE);
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        this.dispose();
        Register mm = new Register();
        mm.setLocationRelativeTo(null);
        mm.setVisible(true);

    }
    public static void main(String args[]) {
        new Login().setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
public class ticketHistory extends JFrame {

    private JLabel jLabel1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

    public static int isAdmin;
    public static String loggedUser;

    public ticketHistory() {
        initComponents();
    }
    private DefaultTableModel model;
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon image;
        image = new ImageIcon("big-tour-bus-vector-illustration.jpg");
        jLabel1 = new JLabel("",image,JLabel.CENTER);

        model = new DefaultTableModel(new String[]{"Username", "Route", "Seats", "Bill"}, 0);
        jTable1 = new JTable(model);
        try (BufferedReader reader = new BufferedReader(new FileReader("bookings.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by comma (assuming comma-separated values)
                String[] rowData = line.split("~");
                // Add the data to the table model
                if((rowData[0]==loggedUser) || (isAdmin==1)){
                    model.addRow(rowData);    
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        jScrollPane1.setViewportView(jTable1);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    public static void main(String args[]) {
        
         new ticketHistory().setVisible(true);
    }
}

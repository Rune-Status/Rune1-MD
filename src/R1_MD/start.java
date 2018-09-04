package R1_MD;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import R1_MD.CalculatorButton;
import org.eclipse.jdt.internal.jarinjarloader.JarRsrcLoader;

import com.R1.Client;
import com.R1.Main;

public class start extends com.R1.Main {
    private static final JButton ActionEvent = null;
    private static Client c = null;
    private static Method[] methods = null;
    private static Field[] fields = null;
  //private static Player player = null;
    private static String command = null;
  //private static Stream Stream = null;
    private static Field interfaces = null;

    public static void main(String[] args) {

        try {
            System.out.println("Found Main is running!");
            Class<Client> clazz = (Class<Client>) Client.class;

            //START----JFRAME----
            JFrame frame = new JFrame("Rune1 Utilities");
            
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JLabel label = new JLabel("");
            
            JButton CalculatorButton = new JButton();
            
            CalculatorButton.setText("Calculator");
            CalculatorButton.addActionListener(new CalculatorButton());
            
            panel.add(label);
            panel.add(CalculatorButton);
            
            frame.add(panel);
            frame.setSize(300, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            //----JFRAME----END
            //LOADS RUNE 1 CLIENT
            methods = clazz.getDeclaredMethods();
            fields = clazz.getDeclaredFields();
            Client.main(new String[]{"10", "0", "lowmem", "members", "32"});

            for (int i = 0; i < fields.length; i++) {
            	
                fields[i].setAccessible(true);
                
            }for (int i = 0; i < methods.length; i++) {
            	
                methods[i].setAccessible(true);
                
            }for (Method mthd1 : methods) {

                //System.out.println("method :"+mthd1.getName());
                //System.out.println("parametes :"+mthd1.getReturnType());
            	
            }for (Field fld1 : fields) {
            	
                fld1.setAccessible(true);
                
                //System.out.println("field :"+fld1.getName());
                //System.out.println("type :"+fld1.getType());
                
                if (fld1.getType().toString().contains("com.R1.a.c.d")) {
                	
                    interfaces = fld1;
                    
                }
                
            }

            System.out.println("Found " + methods.length + " methods in client and " + fields.length + " fields");

        } catch (Exception e) {
        	
            e.printStackTrace();
            
        }

    }

}

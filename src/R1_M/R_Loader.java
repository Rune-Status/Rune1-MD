package R1_M;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JFrame;

import R1_MD.CalculatorButton;
import org.eclipse.jdt.internal.jarinjarloader.JarRsrcLoader;
import com.R1.Client;
import com.R1.Main;
import R1_M.Version;


public class R_Loader extends com.R1.Main {

    private static Client c = null;
    private static Method[] methods = null;
    private static Field[] fields = null;
  //private static Player player = null;
    private static String command = null;
  //private static Stream Stream = null;
    private static Field interfaces = null;

    public static void R_Loader(String[]args) {

        try {
        	System.out.println("Found Main is running!");
        	
        	
        	Version VersionObject = new Version();
        	Client ClientObject = new Client();
        	Main MainObject = new Main();
        	
        	System.out.println(Client.class.getName());
        	System.out.println(Client.class.getSimpleName());
        	System.out.println(Client.class.getClassLoader());
        	System.out.println(Client.class.getModifiers());
        	System.out.println(Client.class.getClass());

        	System.out.println(VersionObject.R1_MD + VersionObject.R1_MD_version);
        	System.out.println(VersionObject.R1 + VersionObject.R1_version);
        	System.out.println("");
        
            Class<Client> clazz = (Class<Client>) Client.class;

            methods = clazz.getDeclaredMethods();
            fields = clazz.getDeclaredFields();
        

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
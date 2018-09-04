package R1_MD;
import javax.swing.JFrame;

import com.R1.Client;

import R1_M.R_Loader;
public class R1_MainClass {

	public static void main(String[]args) {
		
		R_Loader.R_Loader(new String[]{"10", "0", "lowmem", "members", "32"});
		
	}
}

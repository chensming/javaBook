//p443
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class J_Url{
	public static void main(String args[]) {
		try {
			URL u = new URL("https://chensming.github.io/");
			BufferedReader r = new BufferedReader(
					new InputStreamReader(u.openStream()));
			String s;
			if((s = r.readLine()) == null) {
				System.out.println(s + "������Ϊ��");
			}
			while((s = r.readLine()) != null) {
				System.out.println(s);
			}
			
			r.close();
		} catch (Exception e) {
			System.err.println("�����쳣: " + e);
			e.printStackTrace();
		}
	}
}
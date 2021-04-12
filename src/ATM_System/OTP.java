package ATM_System;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import javax.swing.JOptionPane;
public class OTP {
    public static void main(String[] args) {
        Test t = new Test();
        t.sendSms();
    }
    
}
class Test{
    int otp;
    public  void sendSms() {
		try {
			// Construct data
			String apiKey = "apikey=" + "";
                        
                        Random rand = new Random();
                        otp = rand.nextInt(999999);
			String message = "&message=" + otp+ " is your one time password. It is valid fro 10 minutes. Do not share your OTP with anyone";
			String sender = "&sender=" + "VIT Bank";
			String numbers = "&numbers=" + "";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			//return stringBuffer.toString();
                        JOptionPane.showMessageDialog(null,"OTP send successfully");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error SMS "+e);
			JOptionPane.showMessageDialog(null,"Error "+e);
		}
    }
}

package TugasModul1no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanIP {
   
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        String pingResult = "";

        String pingCmd = "ping " + ip;
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(pingCmd);

            BufferedReader in = new BufferedReader(new
            InputStreamReader(p.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                pingResult += inputLine;
            }
            in.close();

        } catch (IOException e) {
            System.out.print(e);
        }

    }
}
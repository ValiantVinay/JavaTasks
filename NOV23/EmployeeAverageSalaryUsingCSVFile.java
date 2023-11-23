package NOV23;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeAverageSalaryUsingCSVFile {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> result_Map = new HashMap<> ();
        File csv_file = new File ("C:/Users/av229/Documents/Java Files/EmployeesData.csv");
        File employee_Result = new File ("C:/Users/av229/Documents/Java Files/EmployeesResult.txt");
        BufferedReader br = new BufferedReader (new FileReader (csv_file));
        BufferedWriter bw = new BufferedWriter (new FileWriter (employee_Result));
        br.readLine ();//Skipping headings because we eont use them for the operations
        String line;
        while((line=br.readLine ())!=null){
            String temp[] = line.split (",");
            String al = temp[2];
            if(result_Map.containsKey (temp[1])){
                result_Map.put(temp[1],(result_Map.get(temp[1])+Integer.parseInt (temp[2]))/2);
            }else{
                result_Map.put(temp[1],Integer.parseInt (temp[2]));
            }
        }

        result_Map.entrySet().stream()
                .forEach(element -> {
                    try {
                        bw.write("Dept Name      -- >" + element.getKey()
                                + "\nAverage Salary -- >" + element.getValue());
                        bw.write ("\n");
                    } catch (IOException e) {
                        throw new RuntimeException (e);
                    }
                });
        bw.flush ();
        bw.close ();
        br.close ();

    }
}

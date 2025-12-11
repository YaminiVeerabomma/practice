package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MicroLogs {

	

	    public static void main(String[] args) {
	    	String serviceID[] = {"search","auth","search","auth","search"};
	    	String status[]    = {"DOWN","DOWN","UP","UP","DOWN"};
	    	int timestamp[]    = {100, 50, 200, 100, 300};


//	        String serviceID[] = {"search","search","search"};
//	        String status[]    = {"DOWN","UP","UP"};
//	        int timestamp[]    = {2036,784,3648};

	        // STEP 1: Find unique services
	        String unique[] = new String[serviceID.length];
	        int uCount = 0;

	        for (int i = 0; i < serviceID.length; i++) {
	            boolean found = false;
	            for (int j = 0; j < uCount; j++) {
	                if (unique[j].equals(serviceID[i])) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                unique[uCount] = serviceID[i];
	                uCount++;
	            }
	        }

	        int invalidCount = 0;

	        // STEP 2: Process each service (one by one)
	        for (int u = 0; u < uCount; u++) {

	            String service = unique[u];

	            // Collect logs for this service
	            int count = 0;
	            int tempTime[] = new int[serviceID.length];
	            String tempStatus[] = new String[serviceID.length];

	            for (int i = 0; i < serviceID.length; i++) {
	                if (serviceID[i].equals(service)) {
	                    tempTime[count] = timestamp[i];
	                    tempStatus[count] = status[i];
	                    count++;
	                }
	            }

	            // STEP 3: Bubble Sort logs by timestamp
	            for (int i = 0; i < count - 1; i++) {
	                for (int j = 0; j < count - i - 1; j++) {
	                    if (tempTime[j] > tempTime[j + 1]) {

	                        int t = tempTime[j];
	                        tempTime[j] = tempTime[j + 1];
	                        tempTime[j + 1] = t;

	                        String s = tempStatus[j];
	                        tempStatus[j] = tempStatus[j + 1];
	                        tempStatus[j + 1] = s;
	                    }
	                }
	            }

	            // STEP 4: Validate

	            boolean isValid = true;

	            // first must be DOWN
	            if (!tempStatus[0].equals("DOWN")) {
	                isValid = false;
	            }

	            // alternating rule using previous & current
	            for (int i = 1; i < count; i++) {
	                if (tempStatus[i].equals(tempStatus[i - 1])) {
	                    isValid = false;
	                    break;
	                }
	            }

	            // last must be UP
	            if (!tempStatus[count - 1].equals("UP")) {
	                isValid = false;
	            }

	            if (!isValid) {
	                invalidCount++;
	            }

	            System.out.println("Service " + service + " → " + (isValid ? "VALID" : "INVALID"));
	        }

	        System.out.println("\nTotal invalid services = " + invalidCount);
	    }
	}

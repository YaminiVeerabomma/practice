package Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class MicroLogsOpp {

    static class Log {
        int time;
        String status;

        Log(int time, String status) {
            this.time = time;
            this.status = status;
        }
    }

    public static void main(String[] args) {

        String serviceID[] = {"search","auth","search","auth","search"};
        String status[]    = {"DOWN","DOWN","UP","UP","DOWN"};
        int timestamp[]    = {100, 50, 200, 100, 300};

        Map<String, List<Log>> map = new HashMap<>();

        // 1. Group logs by service
        for (int i = 0; i < serviceID.length; i++) {
            map.putIfAbsent(serviceID[i], new ArrayList<>());
            map.get(serviceID[i]).add(new Log(timestamp[i], status[i]));
        }

        int invalid = 0;

        // 2. Convert keySet → array and loop using normal for loop
        String[] services = map.keySet().toArray(new String[0]);

        for (int i = 0; i < services.length; i++) {

            String service = services[i];
            List<Log> logs = map.get(service);

            // Sort by timestamp
            logs.sort(Comparator.comparingInt(l -> l.time));

            boolean valid = true;

            // First log must be DOWN
            if (!logs.get(0).status.equals("DOWN")) {
                valid = false;
            }

            // Check alternating UP/DOWN
            for (int j = 1; j < logs.size(); j++) {
                if (logs.get(j).status.equals(logs.get(j - 1).status)) {
                    valid = false;
                    break;
                }
            }

            // Last log must be UP
            if (!logs.get(logs.size() - 1).status.equals("UP")) {
                valid = false;
            }

            // Print service validation result
            System.out.println("Service " + service + " → " + (valid ? "VALID" : "INVALID"));

            if (!valid) {
                invalid++;
            }
        }

        System.out.println("\nTotal Invalid Services = " + invalid);
    }
}

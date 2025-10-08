package DAY_5;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int count = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; 
            }
            j--; 
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        BoatsToSavePeople obj = new BoatsToSavePeople();

        int[] people = {3, 5, 3, 4};
        int limit3 = 5;
        System.out.println(obj.numRescueBoats(people, limit3));
    }
}

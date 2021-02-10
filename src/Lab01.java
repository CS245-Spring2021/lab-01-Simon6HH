public class Lab01 {
    public static int highestAltitude(int[] gain) {
        int maxALT = 0; /** the highest altitude will be in this variable at the end of the "for loop" **/
        int currALT = 0; /** currALT helps run through "for loop" adding or subtracting previous altitudes **/

        for (int i = 0; i < gain.length; i++) { /** "for loop" running through gain.length or n **/
            currALT = currALT + gain[i];
            if (currALT > maxALT) {
                maxALT = currALT;
            }
        }
        return maxALT; /** returns highest altitude after the "for loop" ran **/
    }

    public static void main (String[] args) {
        int[] gain = {-5, 1, 5, 0, -7}; /** initializes array with integers to find the highest altitude **/
        System.out.println("HIGHEST ALTITUDE: " + highestAltitude(gain));
    }
}
package Team17;

/**
 *
 * @author Youssef Khaled
 */
public class ShiftArray {
    public void ShiftArray(int []arr, char []arrC)
    {
        int tmp = arr[0];
        char tmpC= arrC[0];
        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
            arrC[i] = arrC[i+1];
        }
        arr[arr.length-1] = tmp;
        arrC[arr.length-1] = tmpC;
    }
    
}

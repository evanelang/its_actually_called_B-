//Screen 2

import java.io.*;

public class Enter_Budget
{
    public static void main(String[]args)
    {
        //Sample value to use until we get interface code:
        int budget = 500;
        //

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Users/gordo/Documents/App/budgetFile.txt")));
        out.writeInt(1);
    }
}
/**  
* Title: pascalTriII.java
* Description:   
* Copyright: Copyright (c) 2018  
* @author Jiede1  
* @date 2019年1月13日  
* @version 1.0  
*/  


package easy;
import java.util.*;

//II 是为I 的做法节省了List<List<Integer>>的存储空间
public class pascalTriII {
	public void printRow(List<Integer> List) {
		for(int i=0;i<List.size();i++) {
			System.out.print(List.get(i)+"  ");
		}
		System.out.println();
	}
	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        System.out.println(row.size());
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
            //printRow(row);
            //System.out.println(row.size());
            for (int j = i - 1; j >= 1; j--) { // From end to start
                row.set(j, row.get(j) + row.get(j - 1));
                printRow(row);
                //System.out.println(j);
            }
        }
        return row;
    }
	public static void main(String[] args) {
		pascalTriII aIi =new pascalTriII();
		System.out.println(aIi.getRow(4));
	}
}

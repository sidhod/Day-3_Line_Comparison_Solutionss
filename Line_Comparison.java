/* Welcome Line Comparison Problems*/
/*Calculate lenght of line AB and CD*/
/*Check Equality using Equal method*/
package line_comparison_problem;

public class UC_2_Check_Equality_Of_Two_Lines {
	public static void main(String[] args) {
		int x1 = (int) Math.floor(Math.random()*10);
		int x2 = (int) Math.floor(Math.random()*10);
		int y1 = (int) Math.floor(Math.random()*10);
		int y2 = (int) Math.floor(Math.random()*10);
		int x_1 = (int) Math.floor(Math.random()*10);
		int x_2 = (int) Math.floor(Math.random()*10);
		int y_1 = (int) Math.floor(Math.random()*10);
		int y_2 = (int) Math.floor(Math.random()*10);
    	System.out.println("point A is"+" "+"("+x1 +","+y1 +") "+ "point B is"+ "(" +x2 +","+ y2 +")");
    	double len1 =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    	System.out.println("lenght of line AB "+ len1);
    	System.out.println("point C is"+" "+"("+x_1 +","+y_1 +") "+ "point D is"+ "(" +x_2 +","+ y_2 +")");
    	double len2 =Math.sqrt(Math.pow(x_2-x_1,2)+Math.pow(y_2-y_1,2));
    	System.out.println("lenght of line CD "+ len2);
    	String str1 = Double.toString(len1);
    	String str2 = Double.toString(len2);
    	if(str1.equals(str2)) {
    		System.out.println("line AB and line CD are equal");
    	}
    	else {
    		System.out.println("line AB and line CD  are not equal");
    	}
    }

}



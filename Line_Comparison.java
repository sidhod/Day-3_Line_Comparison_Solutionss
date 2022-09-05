/* Welcome Line Comparison Problems*/
/*Calculate lenght of line AB and CD*/
/*Compare two lines usind compareTo Method*/
package line_comparison_problem;

public class UC_3_Compare_Two_Lines {
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
    	Double ab = new Double(len1);
    	Double cd = new Double(len2);
    	int compare=ab.compareTo(cd);
    	if(compare > 0) {
    		System.out.println("line AB is greater than line CD");
    	}
    	else if(compare < 0 ) {
    		System.out.println("line AB is less than line CD ");
    	}
    	else {
    		System.out.println("line AB equal to line CD");
    	}
    }

}



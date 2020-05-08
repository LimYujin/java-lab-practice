package week8;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String total = scanner.nextLine();
		String[] PlusWord = total.split("\\+");

		if(PlusWord.length == 1) //-�϶�
		{
			String[] MinusWord = total.split("-");
			int a = Integer.parseInt(MinusWord[0]);
			int b = Integer.parseInt(MinusWord[1]);
			try {
				if(a==0 | b==0)
				{
					throw new SubtractZeroException();
				}
				if(a <0 | a >1000)
				{
					throw new OutOfRangeException();
				}
				else if(b<0 | b>1000)
				{
					throw new OutOfRangeException();
				}
				int result = a + b;
				if(result <0 | result >1000)
				{
					throw new OutOfRangeException();
				}				
				System.out.println(result);
			}
			catch(SubtractZeroException e1) {
				System.out.println(e1.getMessage());
			}
			catch(OutOfRangeException e2) {
				System.out.println(e2.getMessage());
			}
			finally {
				scanner.close();
				System.exit(0);
			}
		}//if��
		else //+�϶�
		{
			int a = Integer.parseInt(PlusWord[0]);
			int b = Integer.parseInt(PlusWord[1]);
			try {
				if(a==0 | b==0)
				{
					throw new AddZeroException();
				}
				if(a <0 | a >1000)
				{
					throw new OutOfRangeException();
				}
				else if(b<0 | b>1000)
				{
					throw new OutOfRangeException();
				}
				int result = a + b;
				if(result <0 | result >1000)
				{
					throw new OutOfRangeException();
				}
				System.out.println(result);
			}
			catch(AddZeroException e1) {
				System.out.println(e1.getMessage());
			}
			catch(OutOfRangeException e2) {
				System.out.println(e2.getMessage());
			}
			finally {
				scanner.close();
				System.exit(0);
			}
		}// else��
		
	}//main��
}
@SuppressWarnings("serial")
class OutOfRangeException  extends Exception{
	//input, output�� 0~1000 ���� �ۿ� ���� ��
	public String getMessage()	{ return "OutOfRangeException"; }
}
@SuppressWarnings("serial")
class AddZeroException extends Exception{
	//0�� ���� ��
	public String getMessage()	{ return "AddZeroException"; }
}
@SuppressWarnings("serial")
class SubtractZeroException extends Exception{
	//0�� �� ��
	public String getMessage()	{ return "SubtractZeroException"; }
}
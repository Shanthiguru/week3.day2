package week3.day2.AbstractInterface;

public class Assgmt_FindIntersection {

	public static void main(String[] args) 
	{
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		for (int i =0;i<a.length;i++)
		{
			for (int j =0;j<b.length;j++)
			{
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}

	  }

	}










//Another method Using Set
//Integer[] a1 = {3,2,11,4,6,7};
//Integer[] a2 = {1,2,8,4,9,7};
//Integer[] rep = {};
//HashSet<Integer> a = new HashSet<Integer>(); 
//a.addAll(Arrays.asList(a1)); 
//a.retainAll(Arrays.asList(a2)); 
//rep = a.toArray(rep);
//System.out.println(Arrays.toString(rep));



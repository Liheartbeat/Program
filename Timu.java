package suanshuti;

import java.util.Scanner;

public class Timu {

	static double re[]=new double[1000];
	static int num()
	{
		int num;
		Scanner in =  new Scanner(System.in);
		System.out.print("��������Ŀ��������");
		num = in.nextInt();
		return num;
	}
	static String fun(int r)
	{
		String fu ="";
		String shizi="";
		int a=(int)(Math.random()*(r+1));
		int b=(int)(Math.random()*(r+1));
		int c=(int)(Math.random()*(r+1));
		int d=(int)(Math.random()*(r+1));
		int e=(int)(Math.random()*4);
		if(e==0)
		{
			fu="+";
			while(a>b||c>d||b==0||d==0)
			{
				 a=(int)(Math.random()*(r+1));
				 b=(int)(Math.random()*(r+1));
				 c=(int)(Math.random()*(r+1));
				 d=(int)(Math.random()*(r+1));
			}
			shizi=a+"/"+b+" "+fu+" "+c+"/"+d+" = ?";
		}
		if(e==1)
		{
			fu="-";
			while(a>b||c>d||b==0||d==0)
			{
				 a=(int)(Math.random()*(r+1));
				 b=(int)(Math.random()*(r+1));
				 c=(int)(Math.random()*(r+1));
				 d=(int)(Math.random()*(r+1));
			}
			shizi=a+"/"+b+" "+fu+" "+c+"/"+d+" = ?";
		}
		if(e==2)
		{
			fu="*";
			while(a>b||c>d||b==0||d==0)
			{
				 a=(int)(Math.random()*(r+1));
				 b=(int)(Math.random()*(r+1));
				 c=(int)(Math.random()*(r+1));
				 d=(int)(Math.random()*(r+1));
			}
			shizi=a+"/"+b+" "+fu+" "+c+"/"+d+" = ?";
		}
		if(e==3)
		{
			fu="/";
			while(a>b||c>d||b==0||d==0)
			{
				 a=(int)(Math.random()*(r+1));
				 b=(int)(Math.random()*(r+1));
				 c=(int)(Math.random()*(r+1));
				 d=(int)(Math.random()*(r+1));
			}
			shizi=a+"/"+b+" "+fu+" "+c+"/"+d+" = ?";
		}
		return shizi;
	}
	static String function(int r)
	{
		String fu ="";
		String shizi="";
		int a=(int)(Math.random()*(r+1));
		int b=(int)(Math.random()*(r+1));
		int c=(int)(Math.random()*4);
		if(c==0)
		{
			fu="+";
			shizi=a+" "+fu+" "+b+" = ?";
		}
		if(c==1)
		{
			fu="-";
			//�ų�����������
			while(a-b<0)
			{
				 a=(int)(Math.random()*(r+1));
				 b=(int)(Math.random()*(r+1));
			}
			shizi=a+" "+fu+" "+b+" = ?";
		}
		if(c==2)
		{
			fu="*";
			shizi=a+" "+fu+" "+b+" = ?";
		}
		if(c==3)
		{
			fu="/";
			//�ų���ĸΪ0�Ŀ�����
			while(b==0)
			{
				b=(int)(Math.random()*(r+1));
			}	
			shizi=a+" "+fu+" "+b+" = ?";
		}
		return shizi;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num1,r,r1,m=0;
		num1=num();
		String Array[]=new String[num1];
		String Array1[]=new String[num1];
		while(m==0)
		{
		System.out.print("1:����� 2���������� 3:�˳� �����룺");
		Scanner in2 =  new Scanner(System.in);
		r1 = in2.nextInt();
		if(r1==1)
		{
			System.out.print("�������������г��ֵ��������ֵ��");
			Scanner in1 =  new Scanner(System.in);
			r = in1.nextInt();
			for(int i=0;i<num1;i++)
			{
				Array1[i]=fun(r);
				//����
				for(int z=0;z<i;z++)
				{
					if(Array1[z].equals(Array1[i]))
					{
						Array1[i]=fun(r);
						z=0;
					}
				}
				System.out.println(Array1[i]);
			}
		}
		if(r1==2)
		{
		System.out.print("�������������г��ֵ��������ֵ��");
		Scanner in1 =  new Scanner(System.in);
		r = in1.nextInt();
		for(int i=0;i<num1;i++)
		{
			Array[i]=function(r);
			//����
			for(int z=0;z<i;z++)
			{
				if(Array[z].equals(Array[i]))
				{
					Array[i]=function(r);
					z=0;
				}
			}
			System.out.println(Array[i]);
		}
		}
		if(r1==3)
		{
			m=1;
			System.out.print("ллʹ�ã�");
		}
		}
	}
}

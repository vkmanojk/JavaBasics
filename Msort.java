package dS;

import java.util.*;
//import java.math.*;
public class Msort {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size:  ");
		int n=in.nextInt();
		int i;
		int[] a=new int[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;++i)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;++i)
		{
			System.out.print(" "+a[i]);
		}
		mergesort(a,0,n-1);
		System.out.println("\nThe sorted array is: ");
		for(i=0;i<n;++i)
		{
			System.out.print(" "+a[i]);
		}
	}
	static void mergesort(int[] a,int l,int r)
	{
		int m;
		if(l<r)
		{
			m=(l+r)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	
	static void merge(int[] a,int l,int m, int r)
	{
		int i,j,k;
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(i=0;i<n1;++i)
		{
			L[i]=a[l+i];
		}
		for(i=0;i<n2;++i)
		{
			R[i]=a[m+1+i];
		}
		i=0;j=0;k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k++]=L[i++];
			}
			else
			{
				a[k++]=R[j++];
			}
		}
		while(i<n1)
		{
			a[k++]=L[i++];
		}
		while(j<n2)
		{
			a[k++]=R[j++];
		}
	}

}

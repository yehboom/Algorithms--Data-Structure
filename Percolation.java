package algs15.perc;

import stdlib.*;
import algs15.*;

public class Percolation {
	 int N;
	 boolean[] open;
	 QuickUnionUF U;
	 QuickUnionUF U2;
	 private int top;
	 private int bottom;
	 
	 public Percolation(int N) {		 
		if (N <= 0) {throw new IllegalArgumentException("length is error");}
		this.N=N;		 
		bottom=N*N+1;
		top=N*N;		
		U =new QuickUnionUF(this.N*this.N + 2);
		U2 =new QuickUnionUF(this.N*this.N + 1);//avoid backwash		
		this.open = new boolean[top+2];	
		for(int i=0;i<(this.N*this.N);i++) {this.open[i]=false;}
		this.open[N*N]=true;
	 }

	 public void open(int i, int j) {
		int num =(i*N)+j;
		 if(i==0) {
			 U.union(num, top);
			 U2.union(num, top);
		 }		 
		 if(i==N-1) {U.union(num, bottom);}
	 	 
		if (this.isOpen(i, j)!=true) {
			this.open[num]=true;
			 
			if (j > 0 && isOpen(i, j - 1)) {
				 U.union(num, (i*N)+j-1);
				 U2.union(num, (i*N)+j-1);
			}
			if (j < N-1 && isOpen(i, j + 1)) {
				 U.union(num, (i*N)+j+1);
				 U2.union(num, (i*N)+j+1);
			}
			if (i > 0 && isOpen(i - 1, j)) {
				 U.union(num, ((i-1)*N)+j);
				 U2.union(num, ((i-1)*N)+j);
			}				 
			if (i < N-1 && isOpen(i + 1, j)) {
				 U.union(num, ((i+1)*N)+j);
				 U2.union(num, ((i+1)*N)+j);
			}			  
		 }
	 }
	 
	 public boolean isOpen(int i, int j) {		 
		 return open[i*N+j];
	 }
	 
	 public boolean isFull(int i, int j) {
		 if(U2.connected((i*N)+j, top)) {return true;}
		 return false;
	 }
	 public boolean percolates() {
		if(U.connected(N*N,N*N+1)) {return true;}
		return false;
 }
}
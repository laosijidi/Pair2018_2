package Exam1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MathExam {
	 public static void main(String[] args1) throws ScriptException, IOException{
		 //String [] args1= {"-n","10","-grade","3"};
         int n=0;		 
		 int grade=0;
		 if(args1[0].equals("-n")) {
			 n=Integer.parseInt(args1[1]);
			 grade = Integer.parseInt(args1[3]);
		 }
		 if(args1[0].equals("-grade")){
			 n=Integer.parseInt(args1[3]);
			 grade = Integer.parseInt(args1[1]);
		 }
		 Mathexam6324(n,grade);
	 } 
	 public static void Mathexam6324(int num,int g) throws ScriptException, IOException
	 {   System.out.print("请输入年级");
		 Scanner input = new Scanner(System.in); 
       if(g==1)
	    grade1(num);
       if(g==2)
    	 grade2(num);
       if(g==3)
		grade3(num);
		
	 }
	    	
	 static void grade1(int num) throws ScriptException {
		// TODO Auto-generated method stub
		boolean flag=true;
		
		ArrayList<String> arithList = new ArrayList<String>();//����ʽ
		for(int i=0;i<num;i++)
		{
			//����3~5��������
			int num_number = 0;
			Random n = new Random();
			num_number =2;
			
			String arr = "";
			for(int j=0;j<num_number;j++){
				int number = getNumber();
				String operator1 = String.valueOf(getOperator1());
				arr += number + operator1;
			}
			arr =arr.substring(0,arr.length()-1);
			//��arrת��Ϊ����
			char[] arr_str = arr.toCharArray();
			String arrString = "";
			ArrayList<String> arrslist1 = new ArrayList<String>();
			ArrayList<String> arrslist2 = new ArrayList<String>();
			ArrayList<String> arrslist = new ArrayList<String>();
			//�洢�����
			for(int j=0;j<arr_str.length;j++) {
				if(arr_str[j]=='+'||arr_str[j]=='-'||arr_str[j]=='*'||arr_str[j]=='/') {	
					arrString=String.valueOf(arr_str[j]);
					arr_str[j]=',';
					arrslist1.add(arrString);
				}
			}
			//�洢������
			String s = new String(arr_str);
			String[] ss = s.split(",");
			for(int k=0;k<ss.length;k++) {
				arrslist2.add(ss[k]);
			}
			//��������ʽ
			String[] arrs1 = arrslist1.toArray(new String[arrslist1.size()]);//�����
			String[] arrs2 = arrslist2.toArray(new String[arrslist2.size()]);//������
			
			for(int m=0;m<arrs1.length;m++){
				arrslist.add(arrs2[m]);//������
				arrslist.add(arrs1[m]);//�����
			}
			arrslist.add(arrs2[arrs2.length-1]);
			String[] arrs = arrslist.toArray(new String[arrslist2.size()]);//����ʽ
			arr="";//��ʼ��Ϊ��
			check_arith(arrs);
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			check_arith_question(arrs,arr);
			arr="";
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			arithList.add(arr);
			
		}
		//�������ʽ
		for(String arr: arithList){
			try {System.out.println(arr);
				System.out.println(arr+"="+js.eval(arr));
			} catch (ScriptException e) {
				e.printStackTrace();
			} 	
			
		}
		filewriter(arithList);
	}

	static void grade2(int num) throws ScriptException {
		// TODO Auto-generated method stub
		boolean flag=true;
		ArrayList<String> arithList = new ArrayList<String>();//����ʽ
		for(int i=0;i<num;i++)
		{
			//����3~5��������
			int num_number = 0;
			Random n = new Random();
			num_number =2;
			
			String arr = "";
			for(int j=0;j<num_number;j++){
				int number = getNumber();
				String operator2 = String.valueOf(getOperator2());
				arr += number + operator2;
			}
			arr =arr.substring(0,arr.length()-1);
			//��arrת��Ϊ����
			char[] arr_str = arr.toCharArray();
			String arrString = "";
			ArrayList<String> arrslist1 = new ArrayList<String>();
			ArrayList<String> arrslist2 = new ArrayList<String>();
			ArrayList<String> arrslist = new ArrayList<String>();
			//�洢�����
			for(int j=0;j<arr_str.length;j++) {
				if(arr_str[j]=='+'||arr_str[j]=='-'||arr_str[j]=='*'||arr_str[j]=='/') {	
					arrString=String.valueOf(arr_str[j]);
					arr_str[j]=',';
					arrslist1.add(arrString);
				}
			}
			//�洢������
			String s = new String(arr_str);
			String[] ss = s.split(",");
			for(int k=0;k<ss.length;k++) {
				arrslist2.add(ss[k]);
			}
			//��������ʽ
			String[] arrs1 = arrslist1.toArray(new String[arrslist1.size()]);//�����
			String[] arrs2 = arrslist2.toArray(new String[arrslist2.size()]);//������
			
			for(int m=0;m<arrs1.length;m++){
				arrslist.add(arrs2[m]);//������
				arrslist.add(arrs1[m]);//�����
			}
			arrslist.add(arrs2[arrs2.length-1]);
			String[] arrs = arrslist.toArray(new String[arrslist2.size()]);//����ʽ
			arr="";
			check_arith(arrs);
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			check_arith_question(arrs,arr);
			arr="";
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			arithList.add(arr);
			
		}
		
		for(String arr: arithList){
			try {System.out.println(arr);
				System.out.println(arr+"="+js.eval(arr));
			} catch (ScriptException e) {
				e.printStackTrace();
			} 	
			
		}
		filewriter(arithList);
	}
	public static int getNumber(){  
	        int number = 0;  
	        Random num = new Random();  
	        number = num.nextInt(100+1);  
	        return number;  
	} 
	
	public static char getOperator(){  
     char operator = 0;  
     Random ran = new Random();  
     int i = ran.nextInt(4);  
     switch(i){  
         case 0:  
             operator = '+';  
             break;  
         case 1:  
             operator = '-';  
             break;  
         case 2:  
             operator = '*';  
             break;  
         case 3:  
             operator = '/';  
             break;  
     }  
     return operator;  
  } 
	public static char getOperator1(){  
	     char operator = 0;  
	     Random ran = new Random();  
	     int i = ran.nextInt(2);  
	     switch(i){  
	         case 0:  
	             operator = '+';  
	             break;  
	         case 1:  
	             operator = '-';  
	             break;  
	         
	     }  
	     return operator;  
	  } 
	public static char getOperator2(){  
	     char operator = 0;  
	     Random ran = new Random();  
	     int i = ran.nextInt(2);  
	     switch(i){  
	         
	         case 0:  
	             operator = '*';  
	             break;  
	         case 1:  
	             operator = '/';  
	             break;  
	     }  
	     return operator;  
	  } 
	
	static ScriptEngine js = new ScriptEngineManager().getEngineByName("JavaScript");
	public static void grade3(int num) throws ScriptException, IOException{
		boolean flag=true;
		
		ArrayList<String> arithList = new ArrayList<String>();
		for(int i=0;i<num;i++)
		{
			
			int num_number = 0;
			Random n = new Random();
			num_number =n.nextInt(3)+3;
			
			String arr = "";
			for(int j=0;j<num_number;j++){
				int number = getNumber();
				String operator = String.valueOf(getOperator());
				arr += number + operator;
			}
			arr =arr.substring(0,arr.length()-1);
		
			char[] arr_str = arr.toCharArray();
			String arrString = "";
			ArrayList<String> arrslist1 = new ArrayList<String>();
			ArrayList<String> arrslist2 = new ArrayList<String>();
			ArrayList<String> arrslist = new ArrayList<String>();
			
			for(int j=0;j<arr_str.length;j++) {
				if(arr_str[j]=='+'||arr_str[j]=='-'||arr_str[j]=='*'||arr_str[j]=='/') {	
					arrString=String.valueOf(arr_str[j]);
					arr_str[j]=',';
					arrslist1.add(arrString);
				}
			}
			
			String s = new String(arr_str);
			String[] ss = s.split(",");
			for(int k=0;k<ss.length;k++) {
				arrslist2.add(ss[k]);
			}
			
			String[] arrs1 = arrslist1.toArray(new String[arrslist1.size()]);
			String[] arrs2 = arrslist2.toArray(new String[arrslist2.size()]);
			
			for(int m=0;m<arrs1.length;m++){
				arrslist.add(arrs2[m]);
				arrslist.add(arrs1[m]);
			}
			arrslist.add(arrs2[arrs2.length-1]);
			String[] arrs = arrslist.toArray(new String[arrslist2.size()]);
			arr="";
			check_arith(arrs);
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			check_arith_question(arrs,arr);
			arr="";
			for(int t=0;t<arrs.length;t++) {
				arr+=arrs[t];
			}
			arithList.add(arr);
			
		}
		
		for(String arr: arithList){
			try {System.out.println(arr);
				System.out.println(arr+"="+js.eval(arr));
			} catch (ScriptException e) {
				e.printStackTrace();
			} 	
			
		}
		filewriter(arithList);
	}
	private static void filewriter(ArrayList<String> arithList) {
		// TODO Auto-generated method stub
		
	}
	public static void  check_arith(String arr[]){
		for(int i=0;i<arr.length;i++){
				
			if(arr[i].contains("-")){
				if(Integer.valueOf(arr[i-1])<Integer.valueOf(arr[i+1])){
					arr[i]="+";
				}
			}
			
			if(arr[i].contains("/")){
				int a = Integer.valueOf(arr[i-1]);
				int b = Integer.valueOf(arr[i+1]);
				int x = a%b;
				if(x!=0){
					arr[i]="+";
				}
			}
		}
	}
	
	public static void  check_arith_question(String arr[],String arrString) throws ScriptException{
			for(int i=0;i<arr.length;i++){
				String str = js.eval(arrString).toString();
				if(Integer.valueOf(str)<0) {
					if(arr[i].contains("-")){
						arr[i]="+";
					}
				}				
			}
	}
	
    
}

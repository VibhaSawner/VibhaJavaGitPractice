package SecondPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Assignment22 {

	
	
	
	
	public int[] m1() {
		int [] arr={10,20,30,22,44,21,92,89};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1] && arr[i]!=0) {
				arr[i]=0;
			}
		}
		return arr;
	}
	
	//String input = "Good morning friends this is technocredits";
		//output : technocredits
		  
		String m2(String input) {
			String[] arr=input.split(" ");
			int maxlength=0;
			
		    String maxword="";
		    
			for(int i=0;i<arr.length;i++) {
				if(maxlength <=arr[i].length()) {
					maxlength=arr[i].length();
					maxword=arr[i];
				}
			}
			//System.out.println("maxlength in string is => "+maxword);
			return maxword;
		}
		
		/*
		 Program 2: Write a method to print all the words having atleast one digit.
         String input = "Good mor9ning fr3iends t2hi2s is technocredits";
         output : mor9ning
         fr3iends
          t2hi2s
		 */
		void m3() {
			String input = "Good mor9ning fr3iends t2hi2s is technocredits";
			String[] arr=input.split(" ");
			
			
			for(int i=0;i<arr.length;i++) {
				Boolean isdigit=m4(arr[i]);
				if(isdigit) {
					System.out.println(arr[i]);
				}
			}
		}
		
		Boolean m4(String str) {
			for(int j=0;j<str.length();j++) {
				char ch=str.charAt(j);
				if(Character.isDigit(ch)) {
					return true;
				}
			}
			return false;
		}
		
		/*
		 Program 3: Write a method to return word having maximum uppercase.
         String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
         output : FR3ienDs
		 */
	  void m5(){
			String input="Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
			String maxuppercase=" ";
			int maxcount=0;
			String[] arr=input.split(" ");
			for(int i=0;i<arr.length;i++) {
				int count=m6(arr[i]);
				if(maxcount<count) {
					maxcount=count;
					maxuppercase=arr[i];
				}	
			}
			System.out.println(maxuppercase+" = maxuppercase ");
     }
	int m6(String str) {
		  int count=0;
		  for(int i=0;i<str.length();i++) {
			 char ch= str.charAt(i);
			  if(Character.isUpperCase(ch)) {
				  count++;
			  }
		  }
		//  System.out.println(count+" count "+str);
		  return count;
		 
	  }
	
	/*
	 Program 4: Write a method to print all the words having no digits and uppercase.
     String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
     output : techno
     is
	 */
	
	void m7() {
		String input="Good Mor9niNg techno FR3ienDs t2hi2s is tEchnocredits";
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			int countDigitOrUpper=m8(arr[i]);
			//System.out.println(countDigitOrUpper);
			if(countDigitOrUpper<=0) {
				System.out.println(arr[i]+" = have no Digit or Uppercase = "+countDigitOrUpper);
			}
		}
	}
	
	int m8(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch) || Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 Write a method to replace element with sum of other elements.
     input : {12,2,11,17}
     output : {30,40,31,25}
	 */
	
int[] m9() {
		int[] arr= {12,2,11,17};
		int[] output= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum=sum+arr[j];
				}
				output[i]=sum;
			}
		}
		return output;
	}
	
	/*
	 Program 1: Print all the repeated word in given string.
     String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
     output : Hindavi
     Shubham
	 */

    void  m10() {
    	String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
    	String []arr=str.split(" ");
    	for(int i=0;i<arr.length;i++) {
    		//Boolean isDuplicate=false;
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i].equals(arr[j])) {
    				System.out.println(arr[i]+ " is a duplicate");
    			}
    		}
    	}
    }
	
    /*
     Program 2: Print all the non repeated word in given string.
    String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
     output : Maulik
    Puja
    Titiksha
    Swati
     */
   
    
    void m11() {
    	String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
    	String []arr=str.split(" ");
    	for(int i=0;i<arr.length;i++) {
    	  boolean	flag=true;
    	  
    			  for(int j=0;j<arr.length;j++) {
    				  if(arr[i].equals(arr[j]) && i!=j)
    					 flag=false;
    				  }
    			 
    			 if(flag) {
    				  System.out.println(arr[i]);
    			 }
    			  }
               }
    
    /*
         find out frequency of each characte from given input using single while loop.
         String  str = "technocreditst";
     */
        void m12() {
        	
    	   String str="technocreditst";
    	   
        	while(str.length()>0) {
        		
        	}
        }
        /*
             1. Write a program to print unique character of each name in given string array.
               String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
               Name is Maulik :
					M
					a
					u
					l
					i
					k
					----------------------
					Name is Kanani :
					K
					I
         */
        void m13() {
        	String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
        	for(int i=0;i<arr.length;i++) {
        		String str=m14(arr[i]);
        		System.out.println(str);
        	}
        }
    
      String m14(String str) {
        	String newstr=" ";
        	for(int i=0;i<str.length();i++) {
        		char ch=str.charAt(i);
        		int count=0;
        		for(int j=0;j<str.length();j++) {
            		char ch1=str.charAt(j);
            		if(ch==ch1 && i!=j) {
            			count++;
            			
            		}
        		}
        		if(count==0) {
        			newstr=newstr+ch;
        		}
        	}
        	return newstr;
        }
        
      /*
          2. Write a program to print 1st unique character of each name in given string array.
				String[] arr = {"Maulik", "KananiK", "akanksha"};
				Name is Maulik : M
				-------------------
				Name is KananiK : i
				-------------------
				Name is akanksha : n

       */
        void m14() {
        	String[] arr={"Maulik", "KananiK", "akanksha"};
        	for(int i=0;i<arr.length;i++) {
        		char ch=m15(arr[i]);
        		System.out.println(ch);
        	}
        }
        
        
       char m15(String str) {
        	char uniquechar=' ';
        	for(int i=0;i<str.length();i++) {
        		char ch=str.charAt(i);
        		if(str.indexOf(ch)==str.lastIndexOf(ch)) {
        			uniquechar=ch;
        			break;
        		}
        	}
        	return uniquechar;
        }
        
       /*
        Program 1 : [10 mins - 13 mins]
		Return count of vowels in a given String using switch case.
		input : TechnOcredits
		output : 4 
        */
       void m16() {
    	   int  count=0;
    	   String str="TechnOcredits";
    	   for(int i=0;i<str.length();i++) {
    		  char ch= str.charAt(i);
    		   switch(Character.toLowerCase(ch)) {
    			   case  'a':
    				   count++;
    				   break;
    			   case 'e'  :
    				   count++;
    				   break;
    			   case 'i'  :
    				   count++;
    				   break;
    			   case 'o'  :
    				   count++;
    				   break;
    			   case 'u'  :
    				   count++;
    				   break;
    		   }
    	   }
    	   System.out.println(count+ " => "+str);
       }
       
       
       /*
        		Program 3: [15 mins]
				Print count of each vowels in a given String using switch case.
				input : technocredits
				output : e -> 2
				o -> 1
				i -> 1
				
        */
       
       void m17() {
    	   int acount=0;
    	   int ecount=0;
    	   int icount=0;
    	   int ocount=0;
    	   int ucount=0;
    	   
    	   String str="technocredits";
    	   
    	   for(int i=0;i<str.length();i++) {
    		 
    	    switch(str.charAt(i)) {
    	   	case 'a':
    		   acount++;
    		   break;
    		   
    	   	case 'e':
    		   ecount++;
    		   break;
    		   
    	   	case 'i':
    		   icount++;
    		   break;
    		   
    	   	case 'o':
    		   ocount++;
    		   break;
    		   
    	   	case 'u':
    		   ucount++;
    		   	break;
    	   }
       }
    	   
    	   System.out.println("acount = "+acount);
    	   System.out.println("ecount = "+ecount);
    	   System.out.println("icount = "+icount);
    	   System.out.println("ocount = "+ocount);
    	   System.out.println("ucount = "+ucount);
    }
       /*
        		Program 1 :
               Shift all Zero's at the end of an array.
               input : {10,0,0,3,4,5,0,9}
               output : {10,3,4,5,9,0,0,0}
        */
       
       void m18() {
    	   int count=0;
    	  int input[] = {10,0,0,3,4,5,0,9};
    	  int output[]=new int[input.length];
    	  for(int i=0;i<input.length;i++) {
    		  if(input[i]>0) {
    		    output[count]=input[i] ;
    		    count++;
    		 }  
    	  }
    	 System.out.println(Arrays.toString(output));
       }
       
       /*
             Program 2 :
				Shift all zero's at the beginning of the an array.
				input : {10,0,0,3,4,5,0,9}
				output : {0,0,0,10,3,4,5,9}
				
        */
       void m19() {
    	   int count=0;
    	   int[] input= {10,0,0,3,4,5,0,9};
    	   int[] output=  new int[input.length];
    	   for(int i=0;i<input.length;i++) {
    		   if(input[i]<=0) {
    			   output[count]=input[i];
    			   count++;
    		   }
    	   }
    	   for(int j=0;j<input.length;j++) {
    		   if(input[j]>0) {
    			   output[count]=input[j];
    			   count++;
    		   }
    	   }
    	   
    	   System.out.println(Arrays.toString(output));
       }
       
       /*
        		Find duplicate numbers from given array.
				input : {10,12,44,12,77,67,12,44};
				output : 12
				44
        */
       
       void m20() {
    	   
    	  int[] input = {10,12,44,12,77,67,12,44};	  
    	   for(int i=0;i<input.length;i++) { 		  
    		   	 for(int j=i+1;j<input.length;j++) {		   		
    		   		 if(input[i] == input[j] && input[j]!=0){  
    		   			  input[j]=0; 		   			 	    
    		   		       System.out.println(input[i]+ " is a duplicate");		
    		   		       break;
    		   		 }	 
    		   	}      		   
    	   }   
    	   System.out.println(Arrays.toString(input));
       }
       
       /*
        		Program 1 :
					Write a method to find whether given String is pallindrome.
					input : radar
					output : radar is pallindrom
        */
      boolean  m21() {
    	   String str="radar";
    	   boolean ispallindrome=false;
    	   for(int i=0;i<str.length();i++) {
    		  char ch= str.charAt(i);
    		
    		   for(int j=str.length()-1;i<=j;j--) {
    			   char ch1= str.charAt(j);
    			   if(ch==ch1) {
    				   ispallindrome=true;
    			   }
    		   }
    	   }
    	   System.out.println(ispallindrome);
    	   return ispallindrome;
       }
       /*
        	Program 1 :
					Program 1 :
Write a method to verify number is Armstrong or not.
input : 153
output : 153 is an Armstrong number
        */
      
     boolean m22() {
    	  int num=153;
    	  int original=num;
    	  int rem;
    	  int sum=0;
    	  while(num>0) {
    		  rem=num%10;
    		  sum=sum+(rem*rem*rem);
    		  num=num/10;
    	  }
    	  System.out.println(sum+" ");
    	  
      
    	  if(sum==original) {
     		return true;
     	  } 
     		  return false;
       
      }
      /*
               Program 2 :
				Write a method to return reverse number.
				input : 123
				output : 321
       */
     void m23() {
    	 int num=123;
    	 int rem;
    	 int rev=0;
    	 while(num>0) {
    		 rem=num%10;
    		 rev=rev*10+rem;
    		 num=num/10;
    	 }
    	 System.out.println(rev+" = reverse number");
     }
     
     /*
      				Program 1: print duplicate numbers from given array.
					input : {10,20,10,44,33,55,33};
					output : 10
					33
      */
     void m24() {
    	 int input[]= {10,20,10,44,33,55,33,33};
    	 
    	 for(int i=0;i<input.length;i++) {
    		 for(int j=i+1;j<input.length;j++) {
    			 
    			 if(input[i]==input[j] && input[j]!=0) {
    				 input[j]=0;
    				 System.out.println(input[i]+ " is a duplicate");
    				break;
    			 }
    		 }
    	 }
     }
     /*
      				Program 2 : print unique numbers from given array (having freq 1).
					input : {10,20,10,44,33,55,33};
					output : 20
					44
					55
      */
     
     void m25() {
    	 int arr[]= {10,20,10,44,33,55,33};
    	 for(int i=0;i<arr.length;i++) {
    		int  count=0;
    		 for(int j=0;j<arr.length;j++) {
    			 if(arr[i]==arr[j]&& i!=j) {
    				 count++;
    			 } 			
    		 }
    		 if(count==0) {
    			 System.out.println(arr[i]+" = having frequnecy 1");
    		 }
    	 }
     }
     /*
      		 program 3 : print missing numbers from given array from range 1 to 10.
				input : {1,3,9,5,6,10}
				output : 2
				4
				7
				8
      */
      void m26() {
    	  int input[]= {1,3,9,5,6,10};
    	  int num=1;
    	  int endnum=10;
    	  for(int i=num;i<=endnum;i++) {
    		  boolean ismissiing=true;
    		  
    		  for(int j=0;j<input.length;j++) {
    			  if(i==input[j]) {
    				  ismissiing=false;
    			
    			  }
    		  }
    		  if(ismissiing) {
    	 	  System.out.println(i+" => is a missing number"); 
    	 	}
    	  }	  
      }
     /*
      			program 4: print duplicate names from given array (do not consider case
				sensitivity).
				input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
				output : hello
				ptc
      */
      
      void m27() {
    	String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
    	  for(int i=0;i<input.length;i++) {
    		  boolean isduplicate=false;
    		  for(int j=i+1;j<input.length;j++) {
    			  if(input[i].equalsIgnoreCase(input[j])) {
    				  isduplicate=true;
    			  }
    		  }
    		  if(isduplicate) {
    			System.out.println(input[i]+" = is a duplicate");  
    		  }
    	  }
      }
      /*
       program 5 : print unique names from given array.
			input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};	
			output : Hi
					Hello
					Techno
					Credits
       */
      void m29() {
    	  String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
    	  for(int i=0;i<input.length;i++) {
    		 int count=1;
    		  for(int j=i+1;j<input.length;j++) {
    			 if(input[i].equalsIgnoreCase(input[j]) ) {
    				 count++; 
    			 }
    			
    		  }
    		  if(count==1) {
	    			System.out.println(input[i]+" "+count);
	    		}
    		  }
      }
     /*
      		input : {10,20,10,44,33,55,33};
			output : 10
			20
			44
			33
			55
      */
      void m30() {
    	 int []input = {10,20,10,44,33,55,33};
    	  for(int i=0;i<input.length;i++) {
    		  int count=1;
    		  for(int j=i+1;j<input.length;j++) {
    			  if(input[i]==input[j]) {
    				  count++;
    			  }
    		  }
    		  if(count==1) {
    			  System.out.println(input[i]+" is a missing number");
    		  }
    	  }
    	  
    	  
    	  
      }
             /*
       			program 7 : print each number with its frequency.
					input : {10,11,11,10,5,6,5,6,5,5,4}
					output : 10 -> 2
					11 -> 2
					5 -> 4
					6 -> 2
					4 -> 1
               */
       void m31() {
    	   int[] arr= {10,11,11,10,5,6,5,6,5,5,4};
    	   for(int i=0;i<arr.length;i++) {
    		   int count=1;
    		   for(int j=i+1;j<arr.length;j++) {
    			   if(arr[i]==arr[j] && arr[j]!=0 ) {
    				   count++;
    				   arr[j]=0;
    			   }
    		   }
    		   if(count>=1 && arr[i]!=0) {
    			   System.out.println(arr[i]+" "+count);
    		   }
    		
    	   }
       }
      
       /*
        			Program 1 : How to check if two given String is the anagram of each other (using
				scanner class)?
				Input1: catc
				Input2: actc
			
        */
       void m32() {
    	   String str="catc";
    	   String str1="actc";
    	   
    	    char[] arr1= str.toCharArray();
    	    char[] arr2= str1.toCharArray();
    	    Arrays.sort(arr1);
    	    Arrays.sort(arr2);
    	    boolean isanagram=true;
    	    
    	    for(int i=0;i<arr1.length;i++) {
    	    	if(arr1[i]!=arr2[i]) {
    	    		isanagram=false;
    	    		
    	    	}
    	    }
    	    if(isanagram) {
    	    	System.out.println(" anagram");
    	    }else {
    	    	System.out.println(" not anagram");
    	    }
       }
       /*
        Program 2 : Write a method to return factorial of user defined given number (using
			scanner class).
			input : 5
			output : 120
        */
       
       void m33() {
    	   int flag=1;
    	   for(int i=1;i<=5;i++) {
    		 flag=flag*i;
    	   }
    	   System.out.println(flag);
       }
       /*
        		Program 3 : Print fibonacci series till Nth number.
						input : 8
						output : 0 1 1 2 3 5 8 13

        */
       
       void m34() {
    	   int num=0;
    	   int num2=1;
    	  int num3=0;//1
    	   System.out.println(num);
    	   System.out.println(num2);
    	   for(int i=0;i<6;i++) {
    		   num3=num+num2;
    		   	num=num2;
    		   	num2=num3;
    		   System.out.println(num3);
    	   }
       }
       /*
        		Program 1 :
				WAP to return String by encrypting all characters from given string by its next
				character.
				input : apdz
				output : bqea
        */
       void m35() {
    	   String str="apdz";
    	   String newstr="";
    	   for(int i=0;i<str.length();i++) {
    		   char ch=str.charAt(i);
    		 char  newch;
    		       if(ch=='z') {
    			   newstr=newstr+'a';
    		   }else {   
    	    	   ch++;
    	    	   newstr=newstr+ch;
    		   }
    	   }
    	   System.out.println(newstr);
       }
       /*
        	Remove given name from ArrayList.
			Hint : contains, remove
			input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] &
			"Sagar"
			output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"]
        */
       void m36() {
    	  String input[] = {"Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
    	  ArrayList<String> ls=new ArrayList<String>(Arrays.asList(input));
    	  
    	  while(ls.contains("Sagar")) {
    		  ls.remove("Sagar");
    		
    	  }
    	  System.out.println(ls);
       }
       
       /*
        		Program 2 :
				Remove multiple occurance of given name from ArrayList.
				input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"]
				& "Sagar"
				output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"]
        */
       
       void m37() {
    	String	input[] = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
    	 ArrayList<String> ls=new ArrayList<String>(Arrays.asList(input));
    	ArrayList<String> hm= new  ArrayList<String>();
    	 
    	 
    	 for(String str:ls) {
    		 if(!hm.contains(str)) {
    			 hm.add(str);
    		 }
    	 }
    	System.out.println(hm);
       }
       
       
       void m38() {
    	   String	input[] = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
      	 	ArrayList<String> ls=new ArrayList<String>(Arrays.asList(input));
      	 	
      	 	for(int i=0;i<ls.size();i++) {
      	 		String name=ls.get(i);
      	 		int index=ls.indexOf(name);
      	 		int lastindex=ls.lastIndexOf(name);
      	 	
      	 		if(index!=lastindex) {
      	 			ls.remove(lastindex);
      	 		}
      	 	}
      	 	System.out.println(ls);
       }
       
       /*
        		Program 1 :
					Replace all Deepak with Shivani.
					input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak",
					"Deepak"}
					output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani",
					"Shivani"}
					Hint : use set, indexOf, contains
        */
       
       void m39() {
    	   String[] str= {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak","Deepak"};
    	   ArrayList<String> ls=new ArrayList<String>(Arrays.asList(str));
    	   while(ls.contains("Deepak")) {
    		  int index=ls.indexOf("Deepak");
    		   ls.set(index, "shivani");
    	   }
    	   System.out.println(ls);
       }
       /*
        Program 2:
		Increse student marks by 10 if marks is less than 35.
		input : [23,55,34,88,58,81]
		output : [33,55,44,88,58,81]
        */
       
       void m40() {
    	   int []input= {23,55,34,88,58,81};
    	   for(int i=0;i<input.length;i++) {
    		   if(input[i]<35) {
    			  input[i]= input[i]+10;
    		   }
    	   }
    	   System.out.println(Arrays.toString(input));
       }
       
       /*
        	Program 3 :
				Return list of Middle character from given name if length of the name is more than
				6 characters.
				input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak",
				"Deepak"}
				output : ['j','n']
        */
       
       
       void m41() {
    	  String[] arr= {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak","Deepak"};
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i].length()>6) {
    			 m42(arr[i]);
    		 }
    		
    	 }
       }
       void m42(String str) {	  
    	int index=0;
    	if(str.length()%2==0) {
    		index=str.length()/2-1;
    	}else {
    		index=str.length()/2;
    	}
    	char ch=str.charAt(index);
    	System.out.println(ch+ " "+str);
       }
       /*
        	Program 1: Print all duplicate names from given Array.
			input : {"Maulik", "Umesh", "Saroj", "Umesh"};
			output : ["Umesh"]
        */
       void m43() {
    	String []input = {"Maulik", "Umesh", "Saroj", "Umesh"};
    	ArrayList<String> ls=new ArrayList<String>();
    	 for(int i=0;i<input.length;i++) {
    		 
    		 if(!ls.contains(input[i])) {
    			 ls.add(input[i]);
    		 }else if(ls.contains(input[i])){
    			 System.out.println(input[i]+" is a duplicate");
    		 }
    	 }
       }
       /*
        		Program 2 : Return unique names from given Array.
				String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
				output : ["Maulik", "Umesh", "Saroj"]
        */
       void m44() {
    	   String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
    	   
    	   for(int i=0;i<arr.length;i++) {
    		   int count=1;
    		   for(int j=i+1;j<arr.length;j++) {
    			   if(arr[i].equals(arr[j]) && arr[j]!="") {
    				   count++;
    				   arr[j]="";
    			   }
    		   }
    		   if(count>=1) {
    			   System.out.println(arr[i]);
    		   }
    	   }
       }
      
       /*
         		Program 3 : Write a program to return unique characters from given name.
				input : technocredits
				output : [t,e,c,h,n,o,r,d,i,s]

        */
       
      /*
       		Program 4 : Remove duplicates from array containing numbers [insertion order].
				input : {10,10,13,12,12,10,55,66,55,11}
				output : [10,13,12,55,66,11]

       */
    		  
       void m45() {
    	  Integer input[]= {10,10,13,12,12,10,55,66,55,11};
    	  
    	    LinkedList<Integer> ls = new LinkedList<Integer>();
             for(int i=0;i<input.length;i++) {
            	 for(int j=0;j<input.length;j++) {
            		 if(!ls.contains(input[i]) && i!=j) {
            			 ls.add(input[i]);
            		 }
            	 }
            	 
             }
             System.out.println(ls);
       }
       
       /*
        		Program 5 : Remove duplicates from array containing numbers [natural order].
				input : {10,10,13,12,12,10,55,66,55,11}
				output : [10,11,12,13,55,66]

        */
       
       void m46() {
    	   Integer[] arr= {10,10,13,12,12,10,55,66,55,11};
    	   TreeSet<Integer> ls=new TreeSet<Integer>(Arrays.asList(arr));
    	   System.out.println(ls);
       }
       
       /*
	  		Program 7 : Remove duplicates from array containing numbers using List.
			input : {10,10,13,12,12,10,55,66,55,11,11}
			output : [10,12,55,11]
        */
       
     void m47() {
    	  Integer input[] = {10,10,13,12,12,10,55,66,55,11,11};
    	  ArrayList<Integer> ls=new ArrayList<Integer>(Arrays.asList(input));
    	  ArrayList<Integer> newls=new ArrayList<Integer>();
    	 for(Integer num:ls) {
    		 if(ls.indexOf(num)!=ls.lastIndexOf(num) ) {
    			 newls.add(ls.indexOf(num));
    		 }
    	 }  
    	System.out.println(newls);
       }
       
       
       /*
        	Program 1 : Find frequency of each number using array and single while loop.
				input : {3,5,33,3,55,3,11,11}
				output : 3--->3
				5--->1
				33--->1
				55--->1
				11--->2
        */
       
      void m48() {
    	   int arr[]= {3,5,33,3,55,3,11,11};
    	   
    	   HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    	   
    	   for(int i=0;i<arr.length;i++) {
    		   if(hm.containsKey(arr[i])) {
    			  
    			  int num= hm.get(arr[i]);
    			  hm.put(arr[i], num+1);
    		   }else {
    			   hm.put(arr[i], 1);
    		   }
    	   }
    	   System.out.println(hm);
    	   
     }
      
      /*
       		Assignment - 43
				Java Program To Find Maximum Number Out of Three Numbers
				A = 40, B = 10, C = 120
       */
      
      /*
       	 Java Program To Print Square Pattern
       	 1234
       	 1234
       	 1234
       	 1234
       	 
       */
       void m49() {
    		      for(int i=1;i<=4;i++) {
    		    	  for(int j=1;j<=4;j++) {
    		    		  System.out.print(j);
    		    	  }
    		    	  System.out.println();
    		      } 		     
          }
    	 
      /*
       		Assignment - 48
			Java Program To Print Square Pattern
			11111
			22222
			33333
			44444
			55555
       */
       
       void m50() {
		       for(int i=1;i<=5;i++) {
		    	   for(int j=1;j<=5;j++) {
		    		   System.out.print(i);
		    	   }
		    	   System.out.println();
		       }
     }
       
       /*
        	Assignment - 49
			Java Program To Print Left Side Triangle
			1
			12
			123
			1234
			12345
        */
       
       void m51() {
    	   for(int i=1;i<=5;i++) {
    		   for(int j=1;j<=i;j++) {
    			   System.out.print("*");
    		   }
    		   System.out.println();
    	   }
       }
       
       /*
           Java Program To Print Left Side Triangle
			1
			22
			333
			4444
			55555
        */
       
       void m52() {
    	   
    	   for(int i=1;i<=5;i++) {
    		   
    		   for(int j=1;j<=i;j++) {
    			   System.out.print(i);
    		   }
    		   System.out.println();
    	   }
       }
       
       /*
        			Java Program To Print Right Side Triangle
        			 1
        		    22
        		   333
        		  4444
        	     55555
        			
        */
       
       void m53() {
    	 
    	   
       }
       
	public static void main(String[] args) {
		Assignment22 assignment22 =new Assignment22();
		//int[] output=assignment22.m1();
	//	System.out.println(Arrays.toString(output));
		//for(int i=0;i<output.length;i++) {
		//	System.out.println(output[i]);
	//	}
		//String input = "Good morning friends this is technocredits";
		//String str=assignment22.m2(input);
		//System.out.println(str);
	//	assignment22.m3();
		//assignment22.m5();
		//assignment22.m7();
		//int[] output=assignment22.m9();
		//System.out.println(Arrays.toString(output));
		//assignment22.m10();
		//assignment22.m11();
		//assignment22.m12();
		//assignment22.m13();
		//assignment22.m16();
		//assignment22.m17();
	//	assignment22.m18();
	//	assignment22.m19();
	   //assignment22.m20();
		/*Boolean ispallindrome=assignment22.m21();
		if(ispallindrome) {
			System.out.println("pallindrome");
		}else  {
			System.out.println("not pallindrome");
		}*/
		/*boolean isarmstrome=assignment22.m22();
		if(isarmstrome) {
			System.out.println("armstrome");
		}else {
			System.out.println("not armstrome");
		}*/
		//assignment22.m23();
		//assignment22.m24();
		//assignment22.m25();
		//assignment22.m26();
		//assignment22.m27();
	//assignment22.m29();
		//assignment22.m30();
	//	assignment22.m31();
		//assignment22.m32();
		//assignment22.m33();
		//assignment22.m34();
		//assignment22.m35();
		//assignment22.m36();
		//assignment22.m37();
		//assignment22.m38();
		//assignment22.m39();
		//assignment22.m40();
		//assignment22.m41();
		//assignment22.m43();
		//assignment22.m45();
		//assignment22.m47();
		//assignment22.m49();
	//	assignment22.m50();
		//assignment22.m51();
		//assignment22.m52();
		assignment22.m53();
	}
}

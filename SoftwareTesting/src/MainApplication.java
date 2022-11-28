import java.util.*;

import Methods.Algorithm.Anagram;
import Methods.Algorithm.BinarySearch;
import Methods.Algorithm.SelectionSort;
import Methods.Datastructure.ListNode;
import Methods.Datastructure.RemoveLinkedListElement;
import Methods.Mathematical.*;
import Methods.Mathematical.romantoInt.*;
import static  org.junit.Assert.assertEquals;
public class MainApplication
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0 ;
        int ch = 0 ;
        boolean exit = false;
        while(!exit)
        {
            System.out.println("Enter Your choice:\n1) Computer Algorithms \n2) Mathematical Algorithms \n3) Datastructure Algorithms \n4) Exit");
            choice = sc.nextInt() ;
            ch = 0 ;
            int n ;

            switch(choice)
            {
                case 1: System.out.println(" Enter choice :\n1.) Binary Search \n2.) Selection Sort \n3.) Anagram \n4.) Exit");
                    ch = sc.nextInt();
                    switch(ch)
                    {
                         case 1: //Binary Search

                                 System.out.println("Enter your array size(1-1000): \n");
                                 n = sc.nextInt() ;
                                 int[] arr  = new int[n];
                                 for(int i = 0 ; i < n ; i++)
                                 {
                                     arr[i] = sc.nextInt() ;
                                 }
                                 System.out.println("Enter the target number :");
                                 int target ;
                                 target = sc.nextInt() ;
                                 int res = -1;
                                 res = BinarySearch.binarysearch(arr,target);
                                 if(res == -1)
                                 {
                                     System.out.println("Not Found \n");
                                 }
                                 else
                                {
                                    System.out.println("Found");
                                }
                                break ;
                        case 2 : //Selection sort
                                System.out.println("Enter your array size(1-1000): \n");
                                n = sc.nextInt() ;
                                int[] arrr  = new int[n];
                                for(int i = 0 ; i < n ; i++)
                                {
                                    arrr[i] = sc.nextInt() ;
                                }
                                arr = SelectionSort.selectionSort(arrr , n);
                                for(int i = 0 ; i < n ; i++)
                                {
                                    System.out.println(" " + arrr[i]);
                                }
                                break;
                        case 3:
                                System.out.println("Enter 1st String :");
                                String str1 = sc.next() ;
                                System.out.println("Enter 2nd String ");
                                String str2 = sc.next() ;
                                boolean check = Anagram.anagram(str1,str2) ;
                                if(check)
                                {
                                    System.out.println("Anagram");
                                }
                                else
                                {
                                    System.out.println("Not Anagram");
                                }
                        case 4 :break;
                        default:break;

                    }
                    break;
                case 2: System.out.println(" Enter choice :\n 1.) Square Root \n 2.) Pythagorean Triplet \n 3.) Convert into 2D \n 4.)roman to int \n 5.) Area  \n 6.)Exit \n");
                        ch = sc.nextInt() ;
                        switch (ch)
                        {
                            case 1: System.out.println("Enter the number :\n");
                                    int value = sc.nextInt() ;
                                    value = SquareRoot.squareroot(value);
                                    System.out.println(value);
                                    break;
                            case 2: System.out.println("Enter the numbers :\n");
                                    int value1 = sc.nextInt();
                                    int value2 = sc.nextInt();
                                    int value3 = sc.nextInt();
                                    boolean res = PythagoreanTriple.pythagoreantriple(value1,value2,value3);
                                    if(res)
                                    {
                                        System.out.println("True");
                                    }
                                    else
                                    {
                                        System.out.println("False");
                                    }
                                    break;
                            case 3: System.out.println("Enter the size of array you want to convert :");
                                    n = sc.nextInt() ;
                                    int[] arr = new int[n] ;
                                    System.out.println("Enter the array you want to convert :");
                                    for(int i = 0 ; i < n ;i++)
                                    {
                                        arr[i] = sc.nextInt();
                                    }
                                    System.out.println("Enter the m and n value") ;
                                    int p ;
                                    int q ;
                                    p = sc.nextInt() ;
                                    q = sc.nextInt() ;
                                    int [][] ress = Construct2D.construct2DArray(arr,p,q);
                                    for(int i = 0 ; i < ress.length ; i++)
                                    {
                                        for(int j = 0 ; j < ress[i].length ; j++)
                                        {
                                            System.out.println(ress[i][j] + " ");
                                        }
                                        System.out.println("\n");
                                    }
                                    break;
                            case 4:System.out.println("Enter the String :\n");
                                    String str = sc.next();
                                    int ans = romantoInt.romanToInt(str);
                                    System.out.println("Ans is :"+ans+"\n");
                                    break;
                            case 5:// Area;
                            System.out.println("Enter choice to calculate surface area:\n1. Cube"+
                                    "\n2. Sphere \n3. Cone \n4. Hemisphere \n5. Cylinder\n");

                            ch = sc.nextInt();
                            System.out.println("Enter dimensions:");

                            String st[] = sc.next().split("\\s+");
                            double a = Double.parseDouble(st[0]);
                            double b=0;
                            if(st.length>1){
                                b = Double.parseDouble(st[1]);
                            }

                            Area area = new Area();

                            if(ch==1){
                                area.area(1,a,0);
                            }
                            else if(ch==2){
                                area.area(2,a,0);
                            }
                            else if(ch==3){
                                area.area(3,a,b);
                            }
                            else if(ch==4){
                                area.area(4,a,0);
                            }
                            else if(ch==5){
                                area.area(5,a,b);
                            }
                            break;
                            case 6: exit = true;
                        }
                        break;
                case 3:System.out.println("Enter the your option \n 1.) Remove from linked list \n");
                        ch = sc.nextInt();
                        switch(ch)
                        {
                            case 1 : System.out.println("Enter size of the linked list :\n");
                                n = sc.nextInt();
                                ListNode head = new ListNode(0);
                                ListNode temp = head;
                                for(int i = 0 ; i < n ; i++)
                                {
                                    temp.next = new ListNode(sc.nextInt());
                                    temp = temp.next;
                                }
                                System.out.println("Enter the value :\n");
                                int value = sc.nextInt();
                                head = RemoveLinkedListElement.removeElements(head.next,value);
                                while(head!=null)
                                {
                                    System.out.println(head.val);
                                    head = head.next;
                                }
                                break;
                        }
                case 4: System.out.println("Thank You!");
                        exit = true;
                default:break;
            }

        }

    }
}

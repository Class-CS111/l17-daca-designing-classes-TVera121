/********************************************
*	DEVELOPER:	Tony Vera
* COLLABORATORS: N/A
*	LAST MODIFIED:	5/4/2025
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();
    DACArecipient test3 = new DACArecipient();
    System.out.println(test1);

    
    test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
    test3.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test2.equals(test3));

    System.out.println(test2.printCard());
    
    

  }
}
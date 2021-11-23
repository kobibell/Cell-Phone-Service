/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphoneservice;

/**
 *
 * @author kobibell
 */
import java.util.Scanner;
public class CellPhoneService
{
   public static void main (String args[])
   {
      Scanner input = new Scanner (System.in);
      int minutes;
      int text;
      int data;

      System.out.print("Enter number of minutes used: ");
      minutes = input.nextInt();

      System.out.print("Enter number of texts sent: ");
      text = input.nextInt();

      System.out.print("Enter amount of data used: ");
      data = input.nextInt();

      if (minutes < 500 && text == 0 && data == 0)
      {
          System.out.print("Use our Plan A option!");
      }
      else if (minutes < 500 && text >= 0 && data >= 0)
      {
          System.out.print("Use our Plan B option!");
      }
      else if (minutes >= 500 && text <= 100 && data == 0)
      {
          System.out.print("Use our Plan C option!");
      }
      else if (minutes >= 500 && text >= 0 && data == 0)
      {
          System.out.print("Use our Plan D option!");
      }
      else if (minutes >= 500 && text >= 0 && data <= 2)
      {
          System.out.print("Use our Plan E option!");
      }
      else
      {
          System.out.print("Use our Plan F option!");
      }

      // output recommended plan here
   }
}
